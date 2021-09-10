package com.jaiv.WatchStore;

import com.jaiv.WatchStore.model.Inquiry;
import com.jaiv.WatchStore.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@EnableAutoConfiguration
public class HomeController {
    @Autowired
    private HomeService homeService;


    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("inquiry", new Inquiry());
        return "index";
    }


    @GetMapping("/shop")
    public String shop(Model model){

        model.addAttribute("products", homeService.getProducts());
        return "shop";
    }
    @PostMapping("/inquiry")
    private String searchProducts(@ModelAttribute("inquiry") Inquiry inquiry, BindingResult bindingResult, Model model){
        String productName = inquiry.getSearchString();

        model.addAttribute("products", homeService.searchProducts(productName));
        return "shop";
    }




    @GetMapping("/about")
    public String about(){
        return "about";
    }

    @GetMapping("/blog")
    public String blog(){
        return "blog";
    }

    @GetMapping("/cart")
    public String cart(){
        return "cart";
    }

    @GetMapping("/checkout")
    public String checkout(){
        return "checkout";
    }

    @GetMapping("/contact")
    public String contact(){
        return "index";
    }

    @GetMapping("/confirmation")
    public String confirmation(){
        return "confirmation";
    }
    @GetMapping("/login")
    public String login(){
        return "login";
    }
    @GetMapping("/main")
    public String main(){
        return "main";
    }

}
