package com.retail.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.retail.store.entity.ProductList;

public interface ProductRepo extends JpaRepository<ProductList, Integer>{

}
