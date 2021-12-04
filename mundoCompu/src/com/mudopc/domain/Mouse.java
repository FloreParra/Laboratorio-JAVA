package com.mudopc.domain;

public class Mouse extends DispositivoEntrada {
    private final int idMouse;
    private static int contadorMouse;

    public Mouse(String tipoDeEntada, String marca) {
        super(tipoDeEntada, marca);
        idMouse = contadorMouse++;
    }

    public int getIdMouse() {
        return idMouse;
    }

    @Override
    public String toString() {
        return "Mouse [idMouse=" + idMouse + "]" + super.toString();
    }

}
