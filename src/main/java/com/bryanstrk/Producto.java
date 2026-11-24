package com.bryanstrk;

public class Producto {

    private String nombre;
    private int peso;
    private int valor;

    public Producto(String nombre, int peso, int valor) {
        this.nombre = nombre;
        this.peso = peso;
        this.valor = valor;
    }


    public String getNombre() {
        return nombre;
    }

    public int getPeso() {
        return peso;
    }

    public int getValor() {
        return valor;
    }
}
