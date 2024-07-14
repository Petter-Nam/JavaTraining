package com.application.modudeal.user.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class MemberDTO {

	private String memberId;
	private String password;
	private String name;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date birthDate;
	private String hp;
	private String email;
	private String addressZipcode;
	private String addressRoad;
	private String addressJibun;
	private String addressNamuji;
	private Date joinAt;
	private String activeYn;
	private Date inactiveAt;

}
