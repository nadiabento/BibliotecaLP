package com.UtilsLibrary;

import java.util.ArrayList;
import java.util.List;

// Classe para representar uma fila (FIFO - Primeiro a entrar, primeiro a sair)
public class FifoBuffer<T> {
    private final List<T> fila; // Lista para armazenar os elementos

    // Construtor
    public FifoBuffer() {
        this.fila = new ArrayList<>();
    }

    // Adiciona um elemento no final da fila
    public void adicionarElemento(T elemento) {
        fila.add(elemento);
        System.out.println("Adicionado à fila: " + elemento);
    }

    // Remove o primeiro elemento da fila
    public T removerElemento() {
        if (fila.isEmpty()) {
            System.out.println("A fila está vazia.");
            return null;
        }
        return fila.remove(0); // Remove o primeiro elemento
    }

    // Mostra os elementos da fila
    public void listarElementos() {
        System.out.println("Fila: " + fila);
    }
}



