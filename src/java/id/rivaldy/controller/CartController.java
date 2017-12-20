/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.rivaldy.controller;

import id.rivaldy.dao.ProductService;
import id.rivaldy.form.CartBean;
import id.rivaldy.model.Product;
import java.util.Map;
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
@RequestMapping("/cart")
public class CartController {

    @Autowired
    ProductService ps;

//    CartBean cart = new CartBean();
    double totalPriceinCart;
    int key = 1;

    @RequestMapping(value = "/add/{productID}")
    public String addCart(@PathVariable Integer productID, Model model, HttpSession session) {

        try {
            Product pro = ps.findById(productID);
            CartBean cart = (CartBean) session.getAttribute("cart");
            if (cart == null) {
                cart = new CartBean();
                cart.getCarts().put(key++, pro);
                session.setAttribute("cart", cart);
            } else {
                cart.getCarts().put(key++, pro);
                session.setAttribute("cart", cart);
            }
            totalPriceinCart = totalPriceinCart + pro.getPrice();
//           int count = cart.getCarts().size();
//            System.out.println("Total : " + count);
//           model.addAttribute("carts", count);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/product/all";
    }

    @RequestMapping(value = "/show")
    public String showCart(Model model, HttpSession session) {
        CartBean cartss = (CartBean) session.getAttribute("cart");
        if (cartss == null) {
            model.addAttribute("errMsg", "Anda belum membeli apapun, silakan beli terlebih dahulu");
            return "cartlist";
        } else {
            Map<Integer, Product> cartz = cartss.getCarts();
            double total = 0.0;
            for (Map.Entry<Integer, Product> entry : cartz.entrySet()) {
                Product value = entry.getValue();
                total = total + value.getPrice();
            }

            totalPriceinCart = total;
            return "cartlist";
        }
    }

    @RequestMapping(value = "/remove/{productID}/{value}")
    public String removeCart(@PathVariable Integer productID, @PathVariable Integer value, HttpSession totalPrice, HttpSession session, Model model) {
        try {
            Product pro = ps.findById(productID);
            if (pro == null) {
                model.addAttribute("errMsg", "Belum ada barang yang dipilih");
                return "product";
            }
            double total;
            totalPriceinCart = totalPriceinCart - pro.getPrice();
            CartBean cart = (CartBean) session.getAttribute("cart");
            cart.getCarts().remove(value, pro);

            int count = cart.getCarts().size();

            model.addAttribute("cart", totalPriceinCart);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "cart";
    }
//    @RequestMapping()
//    public String goCart(Model model){
//        model.addAttribute("msgCart", "This is Cart Page");
//        return "cart";
//    }

}
