package com.mudopc.domain;

public class Mouse extends DispositivoEntrada {
    private int idMouse;
    private static int contadorMouse;

    public Mouse(String tipoDeEntada, String marca) {
        super(tipoDeEntada, marca);
        idMouse = contadorMouse++;
    }

    public int getIdMouse() {
        return idMouse;
    }

}
