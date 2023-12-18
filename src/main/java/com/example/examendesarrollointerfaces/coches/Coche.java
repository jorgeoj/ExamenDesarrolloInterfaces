package com.example.examendesarrollointerfaces.coches;

import com.example.examendesarrollointerfaces.clientes.Cliente;

import java.util.Date;

public class Coche {
    private String matricula;
    private String modelo;
    private Cliente cliente;
    private String tipoTarifa;
    private Date fechaEntrada;
    private Date fechaSalida;
    private Double costeTotal;

    public Coche(String matricula, String modelo, Cliente cliente, String tipoTarifa, Date fechaEntrada, Date fechaSalida, Double costeTotal) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.cliente = cliente;
        this.tipoTarifa = tipoTarifa;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.costeTotal = costeTotal;
    }

    public Coche() {
    }

    public String getMatricula() {
        return this.matricula;
    }

    public String getModelo() {
        return this.modelo;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public String getTipoTarifa() {
        return this.tipoTarifa;
    }

    public Date getFechaEntrada() {
        return this.fechaEntrada;
    }

    public Date getFechaSalida() {
        return this.fechaSalida;
    }

    public Double getCosteTotal() {
        return this.costeTotal;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setTipoTarifa(String tipoTarifa) {
        this.tipoTarifa = tipoTarifa;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public void setCosteTotal(Double costeTotal) {
        this.costeTotal = costeTotal;
    }
    public String toString() {
        return "Coche(matricula=" + this.getMatricula() + ", modelo=" + this.getModelo() + ", cliente=" + this.getCliente() + ", tipoTarifa=" + this.getTipoTarifa() + ", fechaEntrada=" + this.getFechaEntrada() + ", fechaSalida=" + this.getFechaSalida() + ", costeTotal=" + this.getCosteTotal() + ")";
    }
}
