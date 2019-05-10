package com.example.sscorpio.sapp;

import java.util.ArrayList;

public class MessegeObject  {

    String  messageId,
            senderId,
            message;

    ArrayList<String> mediaUrlList;

    public MessegeObject(String messageId, String senderId, String message, ArrayList<String> mediaUrlList){
        this.messageId = messageId;
        this.senderId = senderId;
        this.message = message;
        this.mediaUrlList = mediaUrlList;
    }

    public String getMessageId() {
        return messageId;
    }
    public String getSenderId() {
        return senderId;
    }
    public String getMessage() {
        return message;
    }
    public ArrayList<String> getMediaUrlList() {
        return mediaUrlList;
    }
}


