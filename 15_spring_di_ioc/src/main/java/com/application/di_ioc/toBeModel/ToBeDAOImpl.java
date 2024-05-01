package com.application.di_ioc.toBeModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository // 해당 클래스를 DAO로 지정하여 spring bean으로 등록한다.
public class ToBeDAOImpl implements ToBeDAO {

	
	// before
	// private ToBeDAO toBeDAO = new ToBeDAOImpl();
	
	// after
	@Autowired // 뒤의 new 객체생성을 자동으로 연결
	private ToBeDAO toBeDAO;
}
