/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.rivaldy.form;

import id.rivaldy.model.Product;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author RomyRivaldy
 */
public class CartBean {

    private Map<Integer, Product> carts;

    public CartBean() {
        carts = new HashMap<>();
    }

    public CartBean(Map<Integer, Product> carts) {
        this.carts = carts;
    }
    
    
    public Map<Integer, Product> getCarts() {
        return carts;
    }

    public void setCarts(Map<Integer, Product> carts) {
        this.carts = carts;
    }
    
    
}
