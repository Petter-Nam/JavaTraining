package com.application.modudeal.dto;

import java.util.Date;

import lombok.Data;

@Data
public class QnaDTO {

	private int qnaId;
    private String memberId;
    private int productId;
    private String question;
    private String answer;
    private Date questionDate;
    private Date answerDate;
    
}
