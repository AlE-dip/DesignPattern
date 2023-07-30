package com.ale.designpattern.creational.factorymethod;

import com.ale.designpattern.Message;
import org.springframework.util.Assert;

public class Main {
    public static void main(String[] args) throws Exception {
        Candy hardCandy = CandyFactory.getCandy(CandyType.HARD);
        Assert.isTrue(hardCandy.getCandyName().equals("Hard Candy"), Message.toast());
        Candy softCandy = CandyFactory.getCandy(CandyType.SOFT);
        Assert.isTrue(softCandy.getCandyName().equals("Soft Candy"), Message.toast());
    }
}
