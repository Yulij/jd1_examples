package lecture21_design_patterns.design.command.commands;


import lecture21_design_patterns.design.command.Account;
import lecture21_design_patterns.design.command.Command;

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
