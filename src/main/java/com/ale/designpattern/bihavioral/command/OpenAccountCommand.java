package com.ale.designpattern.bihavioral.command;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OpenAccountCommand implements Command {
    private Account account;
    @Override
    public void execute() {
        account.openAccount();
    }
}
