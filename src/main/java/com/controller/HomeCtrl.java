package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeCtrl {

	@RequestMapping("/")
	public String home() {
		return "index";
	}

	@RequestMapping("/add-product")
	public String addProduct() {
		return "add_product_form";
	}

}
