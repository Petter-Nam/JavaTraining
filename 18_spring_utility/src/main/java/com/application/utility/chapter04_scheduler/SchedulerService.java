package com.application.utility.chapter04_scheduler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;


@Service
public class SchedulerService {
	
	@Autowired
	private SchedulerDAO schedularDAO;
	// 				초 분 시 일 월 요일
	@Scheduled(cron="0 0 15 * * *")
	public void getProductList() {
		System.out.println("ex) 15시 스케쥴러");
		schedularDAO.getProductList();
	}
}
