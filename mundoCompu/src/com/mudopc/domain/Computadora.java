package com.mudopc.domain;

public class Computadora {
    private final int idCompu;
    private String nombre;
    private Monitor monitor;
    private Mouse mouse;
    private Teclado teclado;
    private static int contadorCompu;

    private Computadora() {
        this.idCompu = ++Computadora.contadorCompu;
    }

    public Computadora(String nombre, Monitor monitor, Mouse mouse, Teclado teclado) {
        this();
        this.nombre = nombre;
        this.monitor = monitor;
        this.mouse = mouse;
        this.teclado = teclado;
    }

    public int getidCompu() {
        return idCompu;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    @Override
    public String toString() {
        return "Computadora [idCompu=" + idCompu + ", monitor=" + monitor + ", mouse=" + mouse + ", nombre=" + nombre
                + ", teclado=" + teclado + "]";
    }

}
