package com.application.jpa.entityRelation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.application.jpa.chapter04_entityRelation.manyToOne.PostRepository;
import com.application.jpa.chapter04_entityRelation.manyToOne.Reply;
import com.application.jpa.chapter04_entityRelation.manyToOne.ReplyRepository;

@SpringBootTest
public class EntityRelationTest {

	/* many to one */
	@Autowired
	private PostRepository postRepository;
	
	@Autowired
	private ReplyRepository replyRepository;
	
	@Transactional
	@DisplayName("manyToOneTest")
	@Test
	public void manyToOneTest() {
		
		System.out.println("\n - manyToOneTest - \n");
		for (Reply reply : replyRepository.findAll()) {
			System.out.println(reply.toStringCustom());
			System.out.println(reply.getPost().toStringCustom());
			System.out.println("\n=======================\n");
		}
		
	}
	
	
	
}
