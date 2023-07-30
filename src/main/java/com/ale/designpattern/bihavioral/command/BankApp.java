package com.ale.designpattern.bihavioral.command;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BankApp {
    private Command openCommand;
    private Command closeCommand;

    void openAccount(){
        openCommand.execute();
    }

    void closeAccount() {
        closeCommand.execute();
    }
}
