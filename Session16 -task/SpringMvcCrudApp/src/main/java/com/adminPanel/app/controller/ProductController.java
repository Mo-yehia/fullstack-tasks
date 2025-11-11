package com.adminPanel.app.controller;

import com.adminPanel.app.model.Product;
import com.adminPanel.app.model.ProductDetails;
import com.adminPanel.app.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public String productsList(Model model) {
        List<Product> products = productService.getAllProducts();

        model.addAttribute("products", products);
        return "homePage";
    }


    @GetMapping("/add")
    public String AddProduct(Model model) {
        Product product = new Product();
        product.setProductDetails(new ProductDetails());
        model.addAttribute("product", product);
        return "addProductForm";
    }


    @PostMapping("/save")
    public String saveProduct(@ModelAttribute("product") Product product) {
        ProductDetails details = product.getProductDetails();

        if (details != null) {
            details.setProduct(product);
            if (details.getAvailable() == null) {
                details.setAvailable(false);
            }
        }

        productService.addProduct(product);
        return "redirect:/";
    }

    @GetMapping("/showProductDetails")
    public String showProductDetails(@RequestParam("id") int id, Model model) {
        Product product = productService.getProductById(id);
        model.addAttribute("product", product);
        return "viewDetailsPage";
    }

    @GetMapping("/update")
    public String showUpdateForm(@RequestParam("id") int id, Model model) {
        Product product = productService.getProductById(id);
        model.addAttribute("product", product);
        return "updateDetailsForm";
    }

    @PostMapping("/processUpdateProductForm")
    public String processUpdateForm(@ModelAttribute("product") Product product) {

        productService.updateProduct(product);
        return "redirect:/";
    }


    @GetMapping("/delete")
    public String deleteProduct(@RequestParam("id") int id) {
        productService.deleteProduct(id);
        return "redirect:/";
    }

}
