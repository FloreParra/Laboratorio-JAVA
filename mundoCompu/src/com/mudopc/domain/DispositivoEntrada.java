package com.mudopc.domain;

public class DispositivoEntrada {
    private String tipoDeEntada;
    private String marca;

    public DispositivoEntrada(String tipoDeEntada, String marca) {
        this.tipoDeEntada = tipoDeEntada;
        this.marca = marca;
    }

    public String getTipoDeEntada() {
        return tipoDeEntada;
    }

    public void setTipoDeEntada(String tipoDeEntada) {
        this.tipoDeEntada = tipoDeEntada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "DispositivoEntrada [marca=" + marca + ", tipoDeEntada=" + tipoDeEntada + "]";
    }

}
