package com.ale.designpattern.structural.facade;

public class FacadeService {
    private static FacadeService instance;
    private SmsService smsService;
    private FaceBookService faceBookService;
    private YoutubeService youtubeService;

    private FacadeService() {
        this.smsService = new SmsService();
        this.faceBookService = new FaceBookService();
        this.youtubeService = new YoutubeService();
    }

    public static FacadeService getInstance(){
        if (instance == null) {
            instance = new FacadeService();
        }
        return instance;
    }

    public void runYoutubeAndSendSms(){
        youtubeService.runVideo();
        smsService.sendMessage();
    }

    public void runFacebookAndSendSms(){
        faceBookService.sendMessage();
        smsService.sendMessage();
    }
}
