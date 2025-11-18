package com.vargas cortes.parcials vargas.service;

import com.vargas cortes.parcials vargas.model.Clinica;
import java.util.List;

public interface ClinicaService {

    void guardar(Clinica c);
    List<Clinica> listar();
}
