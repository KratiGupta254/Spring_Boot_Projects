package com.retail.store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.retail.store.entity.ProductList;
import com.retail.store.service.ProductService;

@RestController
@CrossOrigin()
@RequestMapping("/retailstore")
public class ProductController {
	
	
    @Autowired
	private ProductService productService;
            
      @PostMapping("products")
      public ResponseEntity<ProductList> addProducts(@RequestBody ProductList productList){
    	  ProductList product=productService.addProducts(productList);
    	  return new ResponseEntity<>(product,HttpStatusCode.valueOf(200));
      }
    
    @PutMapping("updateproduct")
    public ResponseEntity<ProductList> updateProduct(@RequestBody ProductList productList){
    	ProductList updatedProduct=productService.updateProduct(productList);
    	return new ResponseEntity<>(updatedProduct,HttpStatusCode.valueOf(200));
 
    }
    
    @DeleteMapping("deleteproduct/{id}")
    public void deleteProduct(@PathVariable("id") Integer id) {
    	productService.deleteProduct(id);
    }
    
}
