package com.application.jpa.QueryDsl;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.application.jpa.chapter03_persistenceQueries.QueryDsl.QueryDslRepository;
import com.application.jpa.data.Product;
import com.querydsl.core.Tuple;

@SpringBootTest
public class QueryDslTest {

	@Autowired
	private QueryDslRepository queryDslRepository;
	
	
	@DisplayName("1-1) 기초 메뉴얼 (전체컬럼 조회)")
	@Test
	public void basicEx01() {
		
		System.out.println("\n - 기초(전체컬럼 조회) - \n");
		List<Product> products = queryDslRepository.basicEx01();
		for (Product product : products) {
			System.out.println(product);
		}
		
		
	}
	
	
	@DisplayName("1-2) 기초 메뉴얼 (단일컬럼 조회)")
	@Test
	public void basicEx02() {
		
		System.out.println("\n - 기초(단일컬럼 조회) - \n");
		List<String> productNms = queryDslRepository.basicEx02();
		for (String productNm : productNms) {
			System.out.println(productNm);
		}
		
	}
	
	
	@DisplayName("1-3) 기초 메뉴얼 (2개 이상의 컬럼 조회)")
	@Test
	public void basicEx03() {
		
		System.out.println("\n - 기초(2개 이상의 컬럼 조회) - \n");
		List<Tuple> products = queryDslRepository.basicEx03();
		for (Tuple tuple : products) {
			Object[] product = tuple.toArray(); // Object배열로 반환후 사용(임시)
			System.out.println("productId : " + product[0]);
			System.out.println("productNm : " + product[1]);
			System.out.println();
		}
		
	}
	
	
	@DisplayName("2) Where 구문 사용 메뉴얼")
	@Test
	public void whereEx() {
		
		System.out.println("\n - Where 구문 사용 - \n");
		
		long productId = 2;
		Product product = queryDslRepository.whereEx(productId);
		System.out.println(product);
		
	}
	
	
	@DisplayName("3) Order By 구문 사용 메뉴얼")
	@Test
	public void orderByEx() {
		
		System.out.println("\n - Order By 구문 사용 - \n");
		int deliveryPrice = 0;
		
		for (Product product : queryDslRepository.orderByEx(deliveryPrice)) {
			System.out.println(product);
		}
		
		
	}
	
	
	@DisplayName("4) Group By 사용 메뉴얼")
	@Test
	public void groupByEx() {

		System.out.println("\n - Order By 구문 사용 - \n");
		for (Tuple tuple : queryDslRepository.groupByEx()) {
			Object[] result = tuple.toArray();
			System.out.println("deliveryPrice : " + result[0]);
			System.out.println("count : " + result[1]);
			System.out.println();
		}
		
	}
	
	
	@DisplayName("5) Join 구문 사용 메뉴얼")
	@Test
	public void joinEx() {
		
		System.out.println("\n - Join 구문 사용 - \n");
		
	}
	
	
	@DisplayName("6) Subquery 구문 사용 메뉴얼")
	@Test
	public void subqueryEx() {

		System.out.println("\n - Subquery 구문 사용 - \n");
		
	}
	
	
}
