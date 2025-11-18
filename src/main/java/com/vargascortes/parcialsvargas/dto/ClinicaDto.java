package com.vargascortes.parcialsVargas.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClinicaDto {
    private Long id;
    private String nombre;
    private String direccion;
    private String telefono;
}
