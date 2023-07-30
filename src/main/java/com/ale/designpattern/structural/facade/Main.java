package com.ale.designpattern.structural.facade;

public class Main {
    public static void main(String[] args) {
        FacadeService facadeService = FacadeService.getInstance();

        facadeService.runFacebookAndSendSms();
        facadeService.runYoutubeAndSendSms();
    }
}
