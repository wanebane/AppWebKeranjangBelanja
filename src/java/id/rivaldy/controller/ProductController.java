/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.rivaldy.controller;

import id.rivaldy.dao.ProductService;
import id.rivaldy.model.Cart;
import id.rivaldy.model.Product;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author RomyRivaldy
 */
@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService ps;
    
    @RequestMapping(value = "/all")
    public String showAllCustomers(Model model) {
        List<Product> product = ps.findAll();
        model.addAttribute("product", product);
        return "product";
    }
    
    @RequestMapping(value = "{productId}")
    public String showOneCustomer(@PathVariable Integer productId, Model model){
        Product product = ps.findById(productId);
        model.addAttribute("product", product);
        return "detail";
    }
    
    @RequestMapping(value = "/add")
    public String addToCart(HttpSession session, Model model){
        Cart carts = (Cart) session.getAttribute("user");
        Product product = (Product) session.getAttribute("product");
        carts.getCarts().add(product);
        model.addAttribute("msg", "Berhasil ditambahkan ke keranjang");
        session.removeAttribute("product");
        return "success";
    }
}
