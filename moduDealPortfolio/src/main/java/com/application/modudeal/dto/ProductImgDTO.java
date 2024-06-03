package com.application.modudeal.dto;

import java.util.Date;

import lombok.Data;

@Data
public class ProductImgDTO {
	
	private String imgUuid;
    private int productId;
    private String imgUrl;
    private Date imgAt;
    
}
