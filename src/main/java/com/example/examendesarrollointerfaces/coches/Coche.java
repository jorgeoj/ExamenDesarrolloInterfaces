package com.example.examendesarrollointerfaces.coches;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Coche {
    private String matricula;
    private String modelo;
    private String tipoTarifa;
    private Date fechaEntrada;
    private Date fechaSalida;
    private Double costeTotal;
}
