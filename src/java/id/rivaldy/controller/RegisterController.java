package id.rivaldy.controller;

import id.rivaldy.dao.CustomerService;
import id.rivaldy.form.RegisterFormBean;
import id.rivaldy.model.Customer;
import id.rivaldy.utils.PasswordDigest;
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
@RequestMapping("/register")
public class RegisterController {
    
    @Autowired
    CustomerService cs;
    
    @RequestMapping()
    public String goRegister(Model model){
        model.addAttribute("mRegister", "This is my register page");
        model.addAttribute("tRegister", "Register");
        return "register";
    }
    
    @RequestMapping(value="/save")
    public String saveRegister(@ModelAttribute("registerBean") RegisterFormBean registerBean, Model model){
        Customer cus = new Customer();
        String encryptedPassword = PasswordDigest.createEncryptedPassword(registerBean.getPassword());
        cus.setFirstName(registerBean.getFirstName());
        cus.setLastName(registerBean.getLastName());
        cus.setUsername(registerBean.getUsername());
        cus.setPassword(encryptedPassword);
        
        cs.saveCustomer(cus);
        model.addAttribute("data", registerBean);
        return "successregistration";
    }
}
