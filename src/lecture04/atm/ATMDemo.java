package lecture04.atm;

public class ATMDemo {
    public static void main(String[] args) {
        ATM atm = new ATM(10, 10, 10);
        atm.getCache(110);
        atm.getCache(20);
        atm.getCache(50);
        atm.getCache(70);
        atm.getCache(230);
        atm.getCache(1000);

    }
}
