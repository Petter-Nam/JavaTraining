package com.application.modudeal.dto;

import java.util.Date;

import lombok.Data;

@Data
public class CompletedTradeDTO {

	private int transactionId;
	private String buyerId;
	private String sellerId;
	private int productId;
	private Date transactionDate;

}
