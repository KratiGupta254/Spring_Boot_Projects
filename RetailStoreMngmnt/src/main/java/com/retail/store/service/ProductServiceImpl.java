package com.retail.store.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retail.store.entity.ProductList;
import com.retail.store.repository.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepo productRepo;

	@Override
	public ProductList addProducts(ProductList productList) {
		
		return productRepo.save(productList);
	}

	@Override
	public ProductList updateProduct(ProductList productList) {
		
		return productRepo.save(productList);
	}

	@Override
	public void deleteProduct(Integer id) {
		
		 productRepo.deleteById(id);
	}

	


	
	}


