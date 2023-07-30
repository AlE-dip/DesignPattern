package com.ale.designpattern.bihavioral.command;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        BankApp bankApp = new BankApp(
                new OpenAccountCommand(account),
                new CloseAccountCommand(account)
        );

        bankApp.openAccount();
        bankApp.closeAccount();
    }
}
