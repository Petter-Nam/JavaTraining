package step6_02.method;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;

//생성자를 이용한 필드 초기화

class GoodsDTO {
	String goodsCD;
	String goodsNm;
	int goodsPrice;
	
	void setData(String goodsCD, String goodsNM, int goodsPrice) {
		this.goodsCD = goodsCD;
		this.goodsNm = goodsNM;
		this.goodsPrice = goodsPrice;
	}
	
	// 생성자 자동완성
	// 좌측 상단 Source > Generate Constructor Using Fields..
	public GoodsDTO(String goodsCD, String goodsNm, int goodsPrice) {
		super();
		this.goodsCD = goodsCD;
		this.goodsNm = goodsNm;
		this.goodsPrice = goodsPrice;
	}
	
	void printData() {
		System.out.println("goodsCd : " + this.goodsCD);
		System.out.println("goodsNm : " + this.goodsNm);
		System.out.println("goodsPrice : " + this.goodsPrice);
		System.out.println();
	}
}

public class MethodEx19_2 {

	public static void main(String[] args) {
		
		
		 //(before) //생성자 // 상단 생성자 자동완성 생성후 after로 변경해야함
		//GoodsDTO goodsDTO = new GoodsDTO();
		//goodsDTO.setData("0x001", "셔츠", 30000);
		//goodsDTO.printData();
		
		
		//(after)
		GoodsDTO goods1 = new GoodsDTO("0x001", "셔츠", 30000);
		goods1.printData();
		
		GoodsDTO goods2 = new GoodsDTO("0x002", "데님 진", 20000);
		goods2.printData();
		
		GoodsDTO goods3 = new GoodsDTO("0x003", "슬랙", 400000);
		goods3.printData();
		
		 // 생성자 사용 예시
		Scanner scan = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm--dd");
		DecimalFormat df = new DecimalFormat();
	}

}
