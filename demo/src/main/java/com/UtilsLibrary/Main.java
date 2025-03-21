package com.UtilsLibrary;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Conversão de Tempo: " + Conversor.converterTempo(150, "h", "min") + " min");
            System.out.println("Conversão de Velocidade: " + Conversor.converterVelocidade(100, "km/h", "m/s") + " m/s");
            System.out.println("Conversão de Área: " + Conversor.converterArea(1, "ha", "m²") + " m²");
        
      
        // Testando FIFO
        System.out.println("\n=== Teste FIFO ===");
        FifoBuffer<Integer> fila = new FifoBuffer<>();
        fila.adicionarElemento(10);
        fila.adicionarElemento(20);
        fila.adicionarElemento(30);
        fila.listarElementos();
        fila.removerElemento();
        fila.listarElementos();

        // Testando LIFO
        System.out.println("\n=== Teste LIFO ===");
        LifoBuffer<String> pilha = new LifoBuffer<>();
        pilha.adicionarElemento("A");
        pilha.adicionarElemento("B");
        pilha.adicionarElemento("C");
        pilha.listarElementos();
        pilha.removerElemento();
        pilha.listarElementos();
        
        } catch (UnidadeInvalidaException e) {
            System.err.println("Erro: " + e.getMessage());
    }
}
}
