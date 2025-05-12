package com.example.Banco.controller;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;


import com.example.Banco.model.BancoModel;
import com.example.Banco.service.BancoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FacturaControlador {
    private final List<BancoModel> BancoItems = new ArrayList<>();

    @Autowired
    private BancoService bancoService;

    @GetMapping("/")
    public String mostrarFormulario(Model model) {
        model.addAttribute("cliente", new BancoModel());
        model.addAttribute("clientes", BancoItems);
        model.addAttribute("gananciaMorosidad", BancoItems.stream()
                .mapToDouble(BancoModel::getTotalGanadoPorMorosidad).sum());
        return "formulario";
    }

    @PostMapping("/agregar")
    public String agregarCliente(@ModelAttribute("cliente") BancoModel cliente) {
        bancoService.calcularEstadoDeCuenta(cliente);
        BancoItems.add(cliente);
        return "redirect:/";
    }
}

