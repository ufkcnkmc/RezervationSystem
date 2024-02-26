package com.ufkcnkmc.springboot.thymeleafdemo.controller;

import com.ufkcnkmc.springboot.thymeleafdemo.entity.Customer;
import com.ufkcnkmc.springboot.thymeleafdemo.repository.CustomerRepository;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    @Autowired
    protected CustomerRepository customerRepository;

    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworldform";
    }

    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/about")
    public String about() {
        return "about";
    }

    @RequestMapping("/contact")
    public String contact() {
        return "contact";
    }

    @RequestMapping("/list-customers")
    public String listCustomers(Model model) {
        model.addAttribute("customers", customerRepository.findAll());
        return "customerList"; 
    }

    @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude(HttpServletRequest request, Model model) {

        String theName = request.getParameter("studentName"); 
        String email = request.getParameter("email"); 
        String message = request.getParameter("message");

        theName = theName.toUpperCase(); //burada ismi büyütüyoruz

        Customer c = new Customer();
        c.setName(theName);
        c.setEmail(email);
        c.setMessage(message);

        customerRepository.save(c);


        return "contact";

    }
}
