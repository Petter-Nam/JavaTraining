package com.application.jpa.chapter02_mapping;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.application.jpa.data.BrandDTO;

@RestController
@RequestMapping("/brand")
public class BrandRestController {

	@Autowired
	private BrandService brandService;
	
	@GetMapping // localhost/brand (브랜드 전체조회)
	public List<BrandDTO> getAllBrands() {
		return brandService.getAllBrands(); // 브랜드 전체조회 데이터 반환
	}
	
	@GetMapping("/{brandId}")  // localhost/brand/{id} (브랜드 상세조회)
	public BrandDTO getBrandById(@PathVariable("brandId") Long brandId){
		return brandService.getBrandById(brandId); // 브랜드 상세조회 데이터 반환
	}
	
	@PostMapping // localhost/brand (브랜드 추가)
	public void createBrand(@RequestBody BrandDTO brandDTO) {
		brandService.createBrand(brandDTO); 
	}
	
	@PutMapping("/{brandId}") // localhost/brand/{id} (브랜드 수정)
	public void updateBrand(@PathVariable("brandId") Long brandId , // ID 따로 
							@RequestBody BrandDTO brandDTO) {		// 수정할 데이터 따로 
		
		brandService.updateBrand(brandId, brandDTO);
		
	}
	
	@DeleteMapping("/{brandId}") // localhost/brand/{id} (브랜드 삭제)
	public void deleteBrand(@PathVariable("brandId") Long brandId) {
		brandService.deleteBrand(brandId);
	}
	
}
