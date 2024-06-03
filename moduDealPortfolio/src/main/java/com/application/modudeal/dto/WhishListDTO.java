package com.application.modudeal.dto;

import java.util.Date;

import lombok.Data;

@Data
public class WhishListDTO {

	private int wishlistId;
	private String memberId;
	private int productId;
	private String productImgUrl;
	private Date addedAt;

}
