package com.application.modudeal.dto;

import java.util.Date;

import lombok.Data;

@Data
public class BuyerProductDTO {

	private int buyerProductId;
    private String memberId;
    private int productId;
    private String productImgUrl;
    private Date addedAt;
    
}
