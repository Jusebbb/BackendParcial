package com.vargascortes.parcialsVargas.controller;

import com.vargascortes.parcialsVargas.model.Clinica;
import com.vargascortes.parcialsVargas.service.ClinicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clinicas")
public class ClinicaController {

    @Autowired
    private ClinicaService service;

    @PostMapping("/guardar")
    public void guardar(@RequestBody Clinica clinica) {
        service.guardar(clinica);
    }

    @GetMapping("/listar")
    public List<Clinica> listar() {
        return service.listar();
    }
}
