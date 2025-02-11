package com.tienda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author joesa
 */
@Controller
public class IndexController {

    @RequestMapping("/") 
    public String index(Model model) {
        //model.addAttribute("attribute", "value");
        return "index";
    }
    
    @RequestMapping("/contacto") 
    public String contacto(Model model) {
        //model.addAttribute("attribute", "value");
        return "contacto";
    }

}
