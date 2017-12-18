/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.rivaldy.controller;

import id.rivaldy.dao.CustomerService;
import id.rivaldy.form.LoginBean;
import id.rivaldy.model.Customer;
import id.rivaldy.utils.PasswordDigest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author RomyRivaldy
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @Autowired
    CustomerService cs;

    @RequestMapping()
    public String goLogin(Model model) {
        LoginBean loginBean = new LoginBean();
        model.addAttribute("loginBean", loginBean);
        return "login";
    }

    public String checkLogin(HttpSession session, @ModelAttribute LoginBean loginBean, Model model) {
        Customer cus = cs.findByUsername(loginBean.getUsername());
        if (cus.getUsername() == null) {
            model.addAttribute("errMsg", "Username salah");
            return "login";
        }
        String encryptedPassword = PasswordDigest.createEncryptedPassword(loginBean.getPassword());
        if (!encryptedPassword.equals(cus.getPassword())) {
            model.addAttribute("errMsg", "Password salah");
            return "login";
        }
        session.setAttribute("cus", cus);
        return "successlogin";
    }
}
