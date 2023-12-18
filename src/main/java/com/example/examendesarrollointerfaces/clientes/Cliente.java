package com.example.examendesarrollointerfaces.clientes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    private String id;
    private String nombre;
    private String correo;
}
