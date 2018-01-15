package lecture21.design.command;


public class Main {
    public static void main(String[] args) {
        Account account1 = new Account(1);
        account1.increaseBalance(250);
        Account account2 = new Account(2);
        account2.increaseBalance(100);
        AccountManager accountManager = new AccountManager();
        printAccounts(account1, account2);
        accountManager.transferMoney(account1, account2, 100);
        accountManager.transferMoney(account1, account2, 40);
        accountManager.withdrawMoney(account2, 50);
        accountManager.transferMoney(account1, account2, 20);
        accountManager.depositMoney(account1, 1000);
        accountManager.withdrawMoney(account1, 250);
        printAccounts(account1, account2);
        accountManager.undo();
        printAccounts(account1, account2);
        accountManager.undo();
        printAccounts(account1, account2);
        accountManager.undo();
        printAccounts(account1, account2);
        accountManager.undo();
        printAccounts(account1, account2);
        accountManager.undo();
        printAccounts(account1, account2);
        accountManager.undo();
        printAccounts(account1, account2);
    }

    private static void printAccounts(Account account1, Account account2) {
        System.out.print(account1 + " ");
        System.out.println(account2);
    }
}
