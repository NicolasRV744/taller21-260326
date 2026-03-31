// Nicolas Romero vargas
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
        while (actual != null) {
        suma += actual.valor;
        actual = actual.siguiente;
    }

    return suma;
 }
}
class MissingNumberLista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
         System.out.println(" BUSCAR NUMERO FALTANTE ");
         System.out.print("Ingrese el valor de n: ");
        
        
        int n = sc.nextInt();

        ListaEnlazada lista = new ListaEnlazada();
        
         System.out.println("Ingrese " + (n - 1) + " numeros entre 1 y " + n + ":");
        
        for (int i = 0; i < n - 1; i++) {
            
        System.out.print("Numero " + (i + 1) + ": ");
        
        int numero = sc.nextInt();
        lista.insertar(numero);
        }
        long sumaTotal = (long) n * (n + 1) / 2;
        long sumaLista = lista.sumar();

        long faltante = sumaTotal - sumaLista;

        System.out.println("\nEl numero faltante es: " + faltante);
    }
}