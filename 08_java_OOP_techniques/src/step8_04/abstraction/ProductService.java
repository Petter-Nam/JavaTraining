package step8_04.abstraction;

import java.util.ArrayList;

import step8_02.encapsulation.ProductDTO;

public interface ProductService {

	public abstract void createProduct(ProductDTO productDTO);
	public abstract ArrayList<ProductDTO> getProductList();
	public ProductDTO getProductDetail(int productId);
	public void updateProduct(ProductDTO productDTO);
	public void deleteProduct(int productId);
	
}
