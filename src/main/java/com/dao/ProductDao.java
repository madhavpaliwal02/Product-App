package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

import javax.transaction.Transactional;

import com.entities.Product;

@Component
public class ProductDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	// create
	@Transactional
	public void createProduct(Product product) {
		this.hibernateTemplate.saveOrUpdate(product);
	}
	
	// get all products
	public List<Product> getAllProducts() {
		return (List<Product>)this.hibernateTemplate.loadAll(Product.class);
	}
	
	// get a product
	public Product getProduct(int pid) {
		return (Product)this.hibernateTemplate.get(Product.class, pid);
	}
	
	// delete a product
	@Transactional
	public void deleteProduct(int pid) {
		this.hibernateTemplate.delete(getProduct(pid));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
