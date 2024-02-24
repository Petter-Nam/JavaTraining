package step8_04.abstraction;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * 
 *  # 인터페이스 타입 객체 생성
 * 
 *  - 클래스가 구현한 인터페이스의 타입의 참조형으로 이를 구현한 클래스의 객체를 생성할 수 있다.
 *  - 인터페이스를 자료형으로 구현할 경우 프로그램은 더욱 유연해진다.
 * 
 *  [ 방법 ]
 * 
 *  인터페이스 변수명 = new 클래스명();
 *  
 *   [ 예시 ]
 *  
 *   List<Object> temp1 = new ArrayList<Object>();
 *   List<Object> temp2 = new Vector<Object>();
 *   
 *   Map<Object,Object> temp3 = new HashMap<Object, Object>();
 *   Map<Object,Object> temp4 = new TreeMap<Object, Object>();
 *   
 * */

class HyundaiCard implements CreditCard {

	@Override
	public void purchasing() {
		// TODO Auto-generated method stub

	}

	@Override
	public void onlinePayments() {
		// TODO Auto-generated method stub

	}

	@Override
	public void cashAdvance() {
		// TODO Auto-generated method stub

	}

	@Override
	public void automaticPayments() {
		// TODO Auto-generated method stub

	}

	@Override
	public void rewardPoints() {
		// TODO Auto-generated method stub

	}

	@Override
	public void milesAccumulation() {
		// TODO Auto-generated method stub

	}

	@Override
	public void insuranceBenefits() {
		// TODO Auto-generated method stub

	}

	@Override
	public void emergencyServices() {
		// TODO Auto-generated method stub

	}

	@Override
	public void installmentPayments() {
		// TODO Auto-generated method stub

	}
}

class ShinhanCard implements CreditCard{

	@Override
	public void purchasing() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onlinePayments() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cashAdvance() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void automaticPayments() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rewardPoints() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void milesAccumulation() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insuranceBenefits() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void emergencyServices() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void installmentPayments() {
		// TODO Auto-generated method stub
		
	}
}

class WooriCard implements CreditCard{

	@Override
	public void purchasing() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onlinePayments() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cashAdvance() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void automaticPayments() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rewardPoints() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void milesAccumulation() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insuranceBenefits() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void emergencyServices() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void installmentPayments() {
		// TODO Auto-generated method stub
		
	}
}

public class AbstractionEx03 {

	public static void main(String[] args) {

		HyundaiCard hyundaiCard1 = new HyundaiCard();
		ShinhanCard shinhanCard1 = new ShinhanCard();
		WooriCard wooriCard1 = new WooriCard();
		
		//인터페이스타입으로 객체생성 (이걸로 사용해라!!)
		CreditCard creditCard1 = new HyundaiCard();
		CreditCard creditCard2 = new ShinhanCard();
		CreditCard creditCard3 = new WooriCard();
		
		//예시1
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		
		
		//예시2
		HashMap<String, String> map1 = new HashMap<String, String>();
		Map<String, String> map2 = new HashMap<String, String>();
	}

}