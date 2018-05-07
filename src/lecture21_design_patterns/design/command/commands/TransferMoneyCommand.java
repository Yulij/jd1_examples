package lecture21_design_patterns.design.command.commands;


import lecture21_design_patterns.design.command.Account;
import lecture21_design_patterns.design.command.Command;

public class TransferMoneyCommand implements Command {
    private Account accountFrom;
    private Account accountTo;
    private int amount;

    public TransferMoneyCommand(Account accountFrom, Account accountTo, int amount) {
        this.accountFrom = accountFrom;
        this.accountTo = accountTo;
        this.amount = amount;
    }

    @Override
    public void execute() {
        accountFrom.decreaseBalance(amount);
        accountTo.increaseBalance(amount);
    }
}
