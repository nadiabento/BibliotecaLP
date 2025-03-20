package com.UtilsLibrary;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
         // converção entre  temperaturas
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da temperatura: ");
        double valor = scanner.nextDouble();
        scanner.nextLine(); // Limpa a linha pendente

        System.out.print("Digite a unidade de origem (CELSIUS, FAHRENHEIT, KELVIN): ");
        String unidadeOrigem = scanner.nextLine().toUpperCase().trim();

        System.out.print("Digite a unidade de destino (CELSIUS, FAHRENHEIT, KELVIN): ");
        String unidadeDestino = scanner.nextLine().toUpperCase().trim();

        try {
            double resultado = ConversorTemperatura.converter(valor, unidadeOrigem, unidadeDestino);
            System.out.println("Resultado: " + resultado + " " + unidadeDestino);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        
         // conversão entre medidas de distancia
        System.out.print("Digite o valor da distancia: ");
        double distancia = scanner.nextDouble();
        scanner.nextLine(); // Limpa o buffer do teclado

        System.out.print("Digite a unidade de origem (KM, MI, YD, M): ");
        String origemDistancia = scanner.nextLine().toUpperCase().trim();

        System.out.print("Digite a unidade de destino (KM, MI, YD, M): ");
        String destinoDistancia = scanner.nextLine().toUpperCase().trim();

        try {
            double resultado = ConversorDistancia.converterDistancia(distancia, origemDistancia, destinoDistancia);
            System.out.println("Resultado: " + resultado + " " + destinoDistancia);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
            }

 
        // conversão entre pesos
        System.out.print("Digite o valor do peso: ");
        double peso = scanner.nextDouble();
        scanner.nextLine(); // Limpa o buffer do teclado

        System.out.print("Digite a unidade de origem (G, KG, LB, OZ): ");
        String origemPeso = scanner.nextLine().toUpperCase().trim();

        System.out.print("Digite a unidade de destino (G, KG, LB, OZ): ");
        String destinoPeso = scanner.nextLine().toUpperCase().trim();

        try {
            double resultado = ConversorPeso.converterPeso(peso, origemPeso, destinoPeso);
            System.out.println("Resultado: " + resultado + " " + destinoPeso);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        
 


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
