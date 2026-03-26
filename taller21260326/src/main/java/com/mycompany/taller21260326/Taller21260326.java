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
        Nodo actual = cabeza;

        while (actual != null) {
            actual = actual.siguiente;
        }

        actual = nuevo; // ❌ ERROR: no enlaza nada
    }
}

