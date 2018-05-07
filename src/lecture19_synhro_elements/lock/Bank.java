package lecture19_synhro_elements.lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Class Bank
 *
 * Created by yslabko on 01/10/2018.
 */
public class Bank {
    // ReentrantLock implements the Lock interface
    private double[] accounts = new double[200];
    private Lock bankLock = new ReentrantLock();
    private Condition sufficientFunds = bankLock.newCondition();

    public void transferWithCondition(int from, int to, int amount) throws InterruptedException {
        bankLock.lock();
        try {
            while (accounts[from] < amount)
                sufficientFunds.await();
            System.out.print(Thread.currentThread());
            accounts[from] -= amount;
            System.out.printf(" %10.2f from %d to %d", amount, from, to);
            accounts[to] += amount;
            System.out.printf(" Total Balance: %10.2f%n", accounts[from]);
            sufficientFunds.signalAll();
        } finally {
            bankLock.unlock();
        }
    }

    public void transfer(int from, int to, int amount) {
        bankLock.lock();
        try {
            if (accounts[from] < amount) return;
            System.out.print(Thread.currentThread());
            accounts[from] -= amount;
            System.out.printf(" %10.2f from %d to %d", amount, from, to);
            accounts[to] += amount;
            System.out.printf(" Total Balance: %10.2f%n", accounts[from]);
        } finally {
            bankLock.unlock();
        }
    }

}

