package com.mycompany.taller21260326;

import java.util.Scanner;

class Nodo {
    int valor;
    Nodo siguiente;

    public Nodo(int valor) {
        this.valor = valor;
        this.siguiente = null;
    }
}

class ListaEnlazada {
    Nodo cabeza;

    public void insertar(int valor) {
        Nodo nuevo = new Nodo(valor);
        if (cabeza == null) {
        cabeza = nuevo;
        } else {
           Nodo actual = cabeza;
            while (actual.siguiente != null) {
            actual = actual.siguiente;
        }

        actual.siguiente = nuevo;
    }
 }
 public long sumar() {
        long suma = 0;
        Nodo actual = cabeza;
        while (actual.siguiente != null) { 
        suma += actual.valor;
        actual = actual.siguiente;
    }

    return suma;
}
