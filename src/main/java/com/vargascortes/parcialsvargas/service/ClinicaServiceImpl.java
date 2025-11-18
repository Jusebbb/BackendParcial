package com.vargascortes.parcialsvargas;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ClinicaServiceImpl implements ClinicaService {

    private List<Clinica> lista = new ArrayList<>();

    @Override
    public void guardar(Clinica c) {
        lista.add(c);
    }

    @Override
    public List<Clinica> listar() {
        return lista;
    }
}
