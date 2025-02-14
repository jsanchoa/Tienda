package com.tienda.controller;

import com.tienda.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/categoria") //Prefijo
public class CategoriaController {

    @Autowired
    CategoriaService categoriaService;

    @RequestMapping("/listado")
    public String index(Model model) {
        var categorias = categoriaService.getCategorias(false);

        model.addAttribute("categorias", categorias);
        model.addAttribute("totalCategorias", categorias.size());
        return "/categoria/listado";
    }

}
