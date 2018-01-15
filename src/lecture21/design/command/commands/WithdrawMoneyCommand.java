package lecture21.design.command.commands;


import lecture21.design.command.Account;
import lecture21.design.command.Command;

public class WithdrawMoneyCommand implements Command {
    private Account account;
    private int amount;

    public WithdrawMoneyCommand(Account account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void execute() {
        account.decreaseBalance(amount);
    }
}
