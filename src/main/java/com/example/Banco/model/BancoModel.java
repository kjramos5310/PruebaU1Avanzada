package com.example.Banco.model;

public class BancoModel {
    private String nombreCliente;
    private double saldoAnterior;
    private double montoCompras;
    private double pagoAnterior;

    private double saldoActual;
    private double pagoMinimo;
    private double pagoParaNoGenerarIntereses;
    private boolean esMoroso; // true si no pagó el mínimo

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public double getSaldoAnterior() {
        return saldoAnterior;
    }

    public void setSaldoAnterior(double saldoAnterior) {
        this.saldoAnterior = saldoAnterior;
    }

    public double getMontoCompras() {
        return montoCompras;
    }

    public void setMontoCompras(double montoCompras) {
        this.montoCompras = montoCompras;
    }

    public double getPagoAnterior() {
        return pagoAnterior;
    }

    public void setPagoAnterior(double pagoAnterior) {
        this.pagoAnterior = pagoAnterior;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getPagoMinimo() {
        return pagoMinimo;
    }

    public void setPagoMinimo(double pagoMinimo) {
        this.pagoMinimo = pagoMinimo;
    }

    public double getPagoParaNoGenerarIntereses() {
        return pagoParaNoGenerarIntereses;
    }

    public void setPagoParaNoGenerarIntereses(double pagoParaNoGenerarIntereses) {
        this.pagoParaNoGenerarIntereses = pagoParaNoGenerarIntereses;
    }

    public boolean isEsMoroso() {
        return esMoroso;
    }

    public void setEsMoroso(boolean esMoroso) {
        this.esMoroso = esMoroso;
    }

    public double getInteresesGenerados() {
        return interesesGenerados;
    }

    public void setInteresesGenerados(double interesesGenerados) {
        this.interesesGenerados = interesesGenerados;
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }

    public double getTotalGanadoPorMorosidad() {
        return totalGanadoPorMorosidad;
    }

    public void setTotalGanadoPorMorosidad(double totalGanadoPorMorosidad) {
        this.totalGanadoPorMorosidad = totalGanadoPorMorosidad;
    }

    private double interesesGenerados;
    private double multa;
    private double totalGanadoPorMorosidad;

}
