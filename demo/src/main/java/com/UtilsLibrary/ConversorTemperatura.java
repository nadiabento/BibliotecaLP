package com.UtilsLibrary;

public class ConversorTemperatura {
    
    public static double converter(double valor, String unidadeOrigem, String unidadeDestino) {
        
        // verificações para evitar erros
        if (unidadeOrigem == null || unidadeDestino == null) {
            throw new IllegalArgumentException("As unidades de origem e destino não podem ser nulas.");
        }

        // Padronizar as unidades de temperatura, para facilitar a leitura
        unidadeOrigem = unidadeOrigem.toUpperCase().trim();
        unidadeDestino = unidadeDestino.toUpperCase().trim();


        if (unidadeOrigem.equals(unidadeDestino)) {
            return valor; // Se a origem e destino forem iguais, retorna o mesmo valor
        }

        double valorEmCelsius;

        // Converter para Celsius primeiro
        switch (unidadeOrigem) {
            case "F" -> valorEmCelsius = (valor - 32) * 5 / 9;
            case "K" -> valorEmCelsius = valor - 273.15;
            case "C" -> valorEmCelsius = valor;
            default -> throw new IllegalArgumentException("Unidade de origem inválida: " + unidadeOrigem);
        }

        // Converter de Celsius para a unidade de destino
        switch (unidadeDestino) {
            case "F" -> {
                return (valorEmCelsius * 9 / 5) + 32;
            }
            case "K" -> {
                return valorEmCelsius + 273.15;
            }
            case "C" -> {
                return valorEmCelsius;
            }
            default -> throw new IllegalArgumentException("Unidade de destino inválida: " + unidadeDestino);
        }
    }
}