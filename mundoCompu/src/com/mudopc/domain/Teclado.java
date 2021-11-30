package com.mudopc.domain;

public class Teclado extends DispositivoEntrada {
    private int idTeclado;
    private static int contadorTeclado;

    public Teclado(String tipoDeEntada, String marca) {
        super(tipoDeEntada, marca);
        this.idTeclado = ++Teclado.contadorTeclado;
    }

    public int getIdTeclado() {
        return idTeclado;
    }

    @Override
    public String toString() {
        return "Teclado [idTeclado=" + idTeclado + "]";
    }

}
