package com.miempresa.minimercado.controller;

import com.miempresa.minimercado.model.Producto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductoController {

    @GetMapping("/producto")
    public String mostrarFormulario() {
        return "productoFormulario";
    }

    @PostMapping("/producto")
    public String registrarProducto(@RequestParam String nombre,
                                    @RequestParam double precio,
                                    @RequestParam int cantidad,
                                    Model model) {
        Producto producto = new Producto(nombre, precio, cantidad);
        model.addAttribute("producto", producto);
        return "productoExito";
    }
}
