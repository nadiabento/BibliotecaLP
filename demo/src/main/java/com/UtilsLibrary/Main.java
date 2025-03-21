package com.UtilsLibrary;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        do {
            System.out.println("\n=== Conversor de Unidades ===");
            System.out.println("1 - Converter Temperatura");
            System.out.println("2 - Converter Distância");
            System.out.println("3 - Converter Peso");
            System.out.println("4 - Converter Tempo");
            System.out.println("5 - Converter Velocidade");
            System.out.println("6 - Converter Área");
            System.out.println("7 - Testar FIFO");
            System.out.println("8 - Testar LIFO");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1:
                    converterTemperatura(scanner);
                    break;
                case 2:
                    converterDistancia(scanner);
                    break;
                case 3:
                    converterPeso(scanner);
                    break;
                case 4:
                    System.out.print("Digite o valor do tempo: ");
                    double tempo = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Digite a unidade de origem (h, min, s): ");
                    String origemTempo = scanner.nextLine().toLowerCase().trim();
                    System.out.print("Digite a unidade de destino (h, min, s): ");
                    String destinoTempo = scanner.nextLine().toLowerCase().trim();
                    System.out.println("Resultado: " + Conversor.converterTempo(tempo, origemTempo, destinoTempo) + " " + destinoTempo);
                    break;
                case 5:
                    System.out.print("Digite o valor da velocidade: ");
                    double velocidade = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Digite a unidade de origem (km/h, m/s, mph): ");
                    String origemVelocidade = scanner.nextLine().toLowerCase().trim();
                    System.out.print("Digite a unidade de destino (km/h, m/s, mph): ");
                    String destinoVelocidade = scanner.nextLine().toLowerCase().trim();
                    System.out.println("Resultado: " + Conversor.converterVelocidade(velocidade, origemVelocidade, destinoVelocidade) + " " + destinoVelocidade);
                    break;
                case 6:
                    System.out.print("Digite o valor da área: ");
                    double area = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Digite a unidade de origem (m², ha, km²): ");
                    String origemArea = scanner.nextLine().toLowerCase().trim();
                    System.out.print("Digite a unidade de destino (m², ha, km²): ");
                    String destinoArea = scanner.nextLine().toLowerCase().trim();
                    System.out.println("Resultado: " + Conversor.converterArea(area, origemArea, destinoArea) + " " + destinoArea);
                    break;
                case 7:
                    testarFIFO();
                    break;
                case 8:
                    testarLIFO();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void converterTemperatura(Scanner scanner) {
        System.out.print("Digite o valor da temperatura: ");
        double valor = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Digite a unidade de origem (CELSIUS, FAHRENHEIT, KELVIN): ");
        String unidadeOrigem = scanner.nextLine().toUpperCase().trim();
        System.out.print("Digite a unidade de destino (CELSIUS, FAHRENHEIT, KELVIN): ");
        String unidadeDestino = scanner.nextLine().toUpperCase().trim();
        System.out.println("Resultado: " + ConversorTemperatura.converter(valor, unidadeOrigem, unidadeDestino) + " " + unidadeDestino);
    }

    private static void converterDistancia(Scanner scanner) {
        System.out.print("Digite o valor da distância: ");
        double distancia = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Digite a unidade de origem (KM, MI, YD, M): ");
        String origemDistancia = scanner.nextLine().toUpperCase().trim();
        System.out.print("Digite a unidade de destino (KM, MI, YD, M): ");
        String destinoDistancia = scanner.nextLine().toUpperCase().trim();
        System.out.println("Resultado: " + ConversorDistancia.converterDistancia(distancia, origemDistancia, destinoDistancia) + " " + destinoDistancia);
    }

    private static void converterPeso(Scanner scanner) {
        System.out.print("Digite o valor do peso: ");
        double peso = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Digite a unidade de origem (G, KG, LB, OZ): ");
        String origemPeso = scanner.nextLine().toUpperCase().trim();
        System.out.print("Digite a unidade de destino (G, KG, LB, OZ): ");
        String destinoPeso = scanner.nextLine().toUpperCase().trim();
        System.out.println("Resultado: " + ConversorPeso.converterPeso(peso, origemPeso, destinoPeso) + " " + destinoPeso);
    }

    private static void testarFIFO() {
        System.out.println("\n=== Teste FIFO ===");
        FifoBuffer<Integer> fila = new FifoBuffer<>();
        fila.adicionarElemento(10);
        fila.adicionarElemento(20);
        fila.adicionarElemento(30);
        fila.listarElementos();
        fila.removerElemento();
        fila.listarElementos();
    }

    private static void testarLIFO() {
        System.out.println("\n=== Teste LIFO ===");
        LifoBuffer<String> pilha = new LifoBuffer<>();
        pilha.adicionarElemento("A");
        pilha.adicionarElemento("B");
        pilha.adicionarElemento("C");
        pilha.listarElementos();
        pilha.removerElemento();
        pilha.listarElementos();
    }
}