package com.application.modudeal.dto;

import java.util.Date;

import lombok.Data;

@Data
public class NoticeDTO {

	private int noticeId;
	private int adminId;
	private String title;
	private String content;
	private Date createdAt;

}
