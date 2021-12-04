package com.mudopc.domain;

public class Monitor {
    private int idMonitor;
    private String marca;
    private double tamanio;
    private static int contadorMonitor;

    private Monitor() {
        this.idMonitor = ++Monitor.contadorMonitor;
    }

    public Monitor(String marca, double tamanio) {
        this();
        this.marca = marca;
        this.tamanio = tamanio;
    }

    public int getIdMonitor() {
        return idMonitor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamaño(double tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Monitor [idMonitor=" + idMonitor + ", marca=" + marca + ", tamaño=" + tamanio + "]";
    }

}
