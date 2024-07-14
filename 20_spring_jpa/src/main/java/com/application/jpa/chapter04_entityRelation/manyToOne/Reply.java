package com.application.jpa.chapter04_entityRelation.manyToOne;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;

@Entity
@Getter
public class Reply {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "REPLY_ID")
	private Long id;
	//private Long postId;
	private String content;
	private LocalDateTime enrollDate;
	private LocalDateTime updateDate;
	
	// 단방향
	@ManyToOne
	@JoinColumn(name = "post_id")
	private Post post;
	
	
	public String toStringCustom() {
		return "Reply [id=" + id + ", content=" + content + ", enrollDate=" + enrollDate + ", updateDate=" + updateDate
				+ ", post=" + post + "]";	
	}
	
	
}
