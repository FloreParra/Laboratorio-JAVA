package com.mudopc.domain;

public class Orden {
    private final int idOrden;
    private Computadora computadoras[];
    private static int contadorOrden;
    private int contadorComputadora;
    private final static int MAX_COMPUTADORAS = 10;

    public Orden() {
        this.idOrden = ++Orden.contadorOrden;
        this.computadoras = new Computadora[Orden.MAX_COMPUTADORAS];
    }

    public void agregarProducto(Computadora computadora) {
        if (this.contadorComputadora < MAX_COMPUTADORAS) {
            this.computadoras[this.contadorComputadora++] = computadora;
        } else {
            System.out.println("Se ha superado el máximo de computadoras por orden");
        }
    }

    public void mostrarOrden() {
        System.out.println("El número de orden: " + idOrden);
        for (int i = 0; i < this.contadorComputadora; i++) {
            System.out.println(computadoras[i].getNombre());
        }

    }

}
