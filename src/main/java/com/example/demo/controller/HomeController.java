package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/home")
    public String home() {
        return "index";
    }

    @RequestMapping("/contact")
    public String contact() {
        return "contact";
    }

    @RequestMapping("/product_summary")
    public String productSummary() {
        return "product_summary";
    }

    @RequestMapping("/special_offer")
    public String specialOffer() {
        return "special_offer";
    }

    @RequestMapping("/delivery")
    public String normal() {
        return "delivery";
    }

    @RequestMapping("/products")
    public String products() {
        return "products";
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/faq")
    public String faq() {
        return "faq";
    }

    @RequestMapping("/legal_notice")
    public String legalNotice() {
        return "legal_notice";
    }

    @RequestMapping("/register")
    public String register() {
        return "register";
    }

    @RequestMapping("/tac")
    public String tac() {
        return "tac";
    }

    @RequestMapping("/compair")
    public String compair() {
        return "compair";
    }

    @RequestMapping("/components")
    public String components() {
        return "components";
    }

    @RequestMapping("/product_details")
    public String productDetails() {
        return "product_details";
    }

    @RequestMapping("/forgetpass")
    public String forgetpass() {
        return "forgetpass";
    }

}
