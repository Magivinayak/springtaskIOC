package com.example.productsWithThymeleaf.controller;

import com.example.productsWithThymeleaf.entity.Products;
import com.example.productsWithThymeleaf.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/displayProduct")
    public String allProducts(Model model){
        List<Products> productsList=service.getAllProducts();
        model.addAttribute("products",productsList);
        return "displayProduct";
    }

    @GetMapping("/addProduct")
    public String showAllProducts(){
        return "addProduct";
    }

    @PostMapping("/addProduct")
    public String addProducts(@ModelAttribute Products products){
        service.addProduct(products);
        return "redirect:/";
    }


}
