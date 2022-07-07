package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import com.dao.ProductDao;
import com.entities.Product;


@Controller
public class HomeCtrl {

	@Autowired
	private ProductDao productDao;

	@RequestMapping("/")
	public String home(Model m) {
		
		List<Product> products = this.productDao.getAllProducts();
		m.addAttribute("product", products);
		
		return "index";
	}

	@RequestMapping("/add-product")
	public String addProduct(Model m) {
		m.addAttribute("title", "Add-Product");
		return "add_product_form";
	}

	// handle add product form
	@RequestMapping(value = "/handle-product", method = RequestMethod.POST)
	public RedirectView handleProduct(@ModelAttribute Product product, HttpServletRequest request) {
		
		System.out.println(product);
		this.productDao.createProduct(product);
		
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath() + "/");
		return redirectView;
	}

	
	
	
	
	
	
	
}
