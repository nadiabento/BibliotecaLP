package com.UtilsLibrary;

public class ConversorPeso {

    public static double converterPeso(double valor, String unidadeOrigem, String unidadeDestino) {
        
        // Padronizar as unidades de temperatura, para facilitar a leitura
        unidadeOrigem = unidadeOrigem.toUpperCase();
        unidadeDestino = unidadeDestino.toUpperCase();

        if (unidadeOrigem.equals(unidadeDestino)) {
            return valor; // Se as unidades forem iguais, retorna o mesmo valor
        }

        double valorEmGramas;

        // Converter para gramas primeiro
        switch (unidadeOrigem) {
            case "G" -> valorEmGramas = valor;
            case "KG" -> valorEmGramas = valor * 1000;
            case "LB" -> valorEmGramas = valor * 453.592;
            case "OZ" -> valorEmGramas = valor * 28.3495;
            default -> throw new IllegalArgumentException("Unidade de origem inválida: " + unidadeOrigem);
        }

        // Converter de gramas para a unidade de destino
        switch (unidadeDestino) {
            case "G" -> {
                return valorEmGramas;
            }
            case "KG" -> {
                return valorEmGramas / 1000;
            }
            case "LB" -> {
                return valorEmGramas / 453.592;
            }
            case "OZ" -> {
                return valorEmGramas / 28.3495;
            }
            default -> throw new IllegalArgumentException("Unidade de destino inválida: " + unidadeDestino);
        }
    }
}
