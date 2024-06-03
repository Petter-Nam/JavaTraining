package com.application.modudeal.dto;

import java.util.Date;

import lombok.Data;

@Data
public class ChatDTO {

	private int chatId;
    private String senderId;
    private String receiverId;
    private String message;
    private Date sendTime;
    
}
