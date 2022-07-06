package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; 
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeCtrl {

	@RequestMapping("/")
	public String home() {
		return "index";
	}

	@RequestMapping("/add-product")
	public String addProduct(Model m) {
		m.addAttribute("title", "Add-Product");
		return "add_product_form";
	}

}
