package step6_02.method;

/*
 * 
 * # 생성자 오버로딩
 * 
 *  - 생성자도 메서드이기 때문에 메서드 오버로딩 기법이 적용 가능하다.
 *  - 생성자 오버로딩을 구현하기 위해서는 메서드와 마찬가지로
 *    파라메타의 개수나 타입을 다르게 정의 하면 된다.
 * 
 * */
/*
 * 
 * # 생성자 오버로딩
 * 
 *  - 생성자도 메서드이기 때문에 메서드 오버로딩 기법이 적용 가능하다.
 *  - 생성자 오버로딩을 구현하기 위해서는 메서드와 마찬가지로
 *    파라메타의 개수나 타입을 다르게 정의 하면 된다.
 * 
 * */

class GoodsVO {
	
	String goodsCd;
	String goodsNm;
	int goodsPrice;
	
	// 기본생성자
	GoodsVO() {
		this.goodsCd = "없음";
		this.goodsNm = "없음";
		this.goodsPrice = -1;
	}
	
	// 생성자 오버로딩
	GoodsVO(String goodsCd) {
		this.goodsCd = goodsCd;
		this.goodsNm = "없음";
		this.goodsPrice = -1;
	}
	
	// 생성자 오버로딩
	GoodsVO(String goodsCd , String goodsNm) {
		this.goodsCd = goodsCd;
		this.goodsNm = goodsNm;
		this.goodsPrice = -1;
	}
	
	// 생성자 오버로딩
	GoodsVO(String goodsCd , String goodsNm , int goodsPrice) {
		this.goodsCd = goodsCd;
		this.goodsNm = goodsNm;
		this.goodsPrice = goodsPrice;
	}
	
	void printData() {
		System.out.println("goodsCd : " + this.goodsCd);
		System.out.println("goodsNm : " + this.goodsNm);
		System.out.println("goodsPrice : " + this.goodsPrice);
		System.out.println();
	}
	
}


public class MethodEx19_03 {

	public static void main(String[] args) {

		GoodsVO goods1 = new GoodsVO();
		goods1.printData();
		
		GoodsVO goods2 = new GoodsVO("0x001");
		goods2.printData();
		
		GoodsVO goods3 = new GoodsVO("0x002" , "셔츠");
		goods3.printData();
		
		GoodsVO goods4 = new GoodsVO("0x003" , "맨투맨" , 100000);
		goods4.printData();
		
	}

}
