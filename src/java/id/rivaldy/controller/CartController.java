/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.rivaldy.controller;

import id.rivaldy.dao.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author RomyRivaldy
 */
@Controller
@RequestMapping("/cart")
public class CartController {
    
    @Autowired
    ProductService ps;
    
    @RequestMapping()
    public String goCart(Model model){
        model.addAttribute("msgCart", "This is Cart Page");
        return "cart";
    }
}
