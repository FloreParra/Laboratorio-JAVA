package com.mundopc.test;

import com.mudopc.domain.*;

public class MundoPC {
    public static void main(String[] args) {
        DispositivoEntrada dispo1 = new DispositivoEntrada("USB", "red dragon");
        DispositivoEntrada dispo2 = new DispositivoEntrada("inalambriico", "maxell");

        Mouse rata1 = new Mouse("USB", "red dragon");
        Teclado teclado1 = new Teclado("inalambrico", "maxell");
        Teclado teclado2 = new Teclado("USB", "Red dragon");

        Monitor monitor1 = new Monitor("dell", 13.5);

        Computadora compu1 = new Computadora("Dell", monitor1, rata1, teclado2);
        Computadora compu2 = new Computadora("Acer", monitor1, rata1, teclado1);

        Orden orden1 = new Orden();

        orden1.agregarProducto(compu1);
        orden1.agregarProducto(compu2);

        orden1.mostrarOrden();
    }
}
