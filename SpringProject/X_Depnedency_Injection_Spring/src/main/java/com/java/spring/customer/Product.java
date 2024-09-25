package com.java.spring.customer;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Product {

	private Map<String, Integer> product;

	public Map<String, Integer> getProduct() {
		return product;
	}

	public void setProduct(Map<String, Integer> product) {
		this.product = product;
	}

	public Set<Entry<String, Integer>> entrySet() {
		// TODO Auto-generated method stub
		if(product != null) {
			return product.entrySet();
		}
		else {
			return Set.of();
		}
	}
	
	
}
