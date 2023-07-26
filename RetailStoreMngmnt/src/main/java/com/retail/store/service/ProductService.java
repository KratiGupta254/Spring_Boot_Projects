package com.retail.store.service;

import com.retail.store.entity.ProductList;

public interface ProductService {

	ProductList addProducts(ProductList productList);


	ProductList updateProduct(ProductList productList);


	void deleteProduct(Integer id);

}
