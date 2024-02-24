package step8_02.encapsulation;
// DTO (Data Transfer Object) : 데이터 전송 객체
// VO ( value Object) : 값(데이터) 객체
// BO (Buisiness Object) : 비즈니스 객체
public class ProductDTO {
	
	private long productId;
	private String productNm;
	private int price;
	private long brandId;
	private String brandNm;
	/*
	  
	 - getter & setter 생성 단축키
	 
	  좌측 상단 Source > Generate Getters and Getters > selectAll > Generate
	
	 */
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public String getProductNm() {
		return productNm;
	}
	public void setProductNm(String productNm) {
		this.productNm = productNm;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public long getBrandId() {
		return brandId;
	}
	public void setBrandId(long brandId) {
		this.brandId = brandId;
	}
	public String getBrandNm() {
		return brandNm;
	}
	public void setBrandNm(String brandNm) {
		this.brandNm = brandNm;
	}
	
	

}
