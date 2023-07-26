package com.retail.store.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ProductList")
public class ProductList {
	
    @Id
    @Column(name = "id")
	private Integer id;
    @Column(name = "code")
	private String code;
    @Column(name = "name")
	private String name;
    @Column(name = "category")
    private String category;
    @Column(name = "cost")
    private Double cost;
	public ProductList(Integer id, String code, String name, String category,
			Double cost) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
		this.category = category;
		this.cost = cost;
	}
	public ProductList() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ProductList [id=");
		builder.append(id);
		builder.append(", code=");
		builder.append(code);
		builder.append(", name=");
		builder.append(name);
		builder.append(", category=");
		builder.append(category);
		builder.append(", cost=");
		builder.append(cost);
		builder.append("]");
		return builder.toString();
	}
	
    
    
    
    
}
