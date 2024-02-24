package step8_04.abstraction;

import java.util.ArrayList;

import step8_02.encapsulation.ProductDTO;
/*
 *  > 인터페이스를 구현하는 클래스는 인터페이스 이름 + Impl(implements)를 추가하여 클래스명을 작성한다.
 *  
 *  ex) AdminOrderDAO     > AdminOrderDAOImpl
 *  	AdminGoodsService > AdminGoodsServiceImpl
 *  
 *  > 클래스 생성시 [interface]에서 Add클릭
 *  > 구현할 인터페이스를 검색하여 선택 후 클래스 생성
 */

public class ProductServiceImpl implements ProductService {

	@Override
	public void createProduct(ProductDTO productDTO) {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<ProductDTO> getProductList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductDTO getProductDetail(int productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateProduct(ProductDTO productDTO) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteProduct(int productId) {
		// TODO Auto-generated method stub

	}

}
