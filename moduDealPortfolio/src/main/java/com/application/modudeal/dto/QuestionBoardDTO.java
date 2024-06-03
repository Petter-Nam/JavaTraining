package com.application.modudeal.dto;

import java.util.Date;

import lombok.Data;

@Data
public class QuestionBoardDTO {

	private int questionId;
    private String memberId;
    private String title;
    private String question;
    private String answer;
    private Date questionDate;
    private Date answerDate;
    
}
