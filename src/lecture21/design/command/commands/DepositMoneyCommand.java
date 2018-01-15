package lecture21.design.command.commands;


import lecture21.design.command.Account;
import lecture21.design.command.Command;

public class DepositMoneyCommand implements Command {
    private Account account;
    private int amount;

    public DepositMoneyCommand(Account account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void execute() {
        account.increaseBalance(amount);
    }
}
