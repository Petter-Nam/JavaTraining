package com.application.jpa.chapter04_entityRelation.manyToOne;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;

@Entity
@Getter
public class Post {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="POST_ID")
	private Long id;
	private String subject;
	private String content;
	private LocalDateTime enrollDate;
	private LocalDateTime updateDate;
	
	// 양방향
	@OneToMany(mappedBy = "post")
	private List<Reply> replies = new ArrayList<Reply>();
	
	
	public String toStringCustom() {
		return "Post [id=" + id + ", subject=" + subject + ", content=" + content + ", enrollDate="
				+ enrollDate + ", updateDate=" + updateDate + "]";

	}
	
	
}
