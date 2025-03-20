package com.UtilsLibrary;

import java.util.ArrayList;
import java.util.List;

// Classe para representar uma pilha (LIFO - Último a entrar, primeiro a sair)
public class LifoBuffer<T> {
    private List<T> pilha; // Lista para armazenar os elementos

    // Construtor
    public LifoBuffer() {
        this.pilha = new ArrayList<>();
    }

    // Adiciona um elemento no topo da pilha
    public void adicionarElemento(T elemento) {
        pilha.add(elemento);
        System.out.println("Adicionado à pilha: " + elemento);
    }

    // Remove o último elemento da pilha
    public T removerElemento() {
        if (pilha.isEmpty()) {
            System.out.println("A pilha está vazia.");
            return null;
        }
        return pilha.remove(pilha.size() - 1); // Remove o último elemento
    }

    // Mostra os elementos da pilha
    public void listarElementos() {
        System.out.println("Pilha: " + pilha);
    }
}

