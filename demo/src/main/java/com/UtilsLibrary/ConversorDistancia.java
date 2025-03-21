package com.UtilsLibrary;

public class ConversorDistancia {

    public static double converterDistancia(double valor, String unidadeOrigem, String unidadeDestino) {
        unidadeOrigem = unidadeOrigem.toUpperCase();
        unidadeDestino = unidadeDestino.toUpperCase();

        if (unidadeOrigem.equals(unidadeDestino)) {
            return valor; // Se forem iguais, retorna o mesmo valor
        }

        double valorEmMetros;

        // Converter para metros primeiro
        switch (unidadeOrigem) {
            case "KM" -> valorEmMetros = valor * 1000;
            case "MI" -> valorEmMetros = valor * 1609.34;
            case "YD" -> valorEmMetros = valor * 0.9144;
            case "M" -> valorEmMetros = valor;
            default -> throw new IllegalArgumentException("Unidade de origem inválida: " + unidadeOrigem);
        }

        // Converter de metros para unidade de destino
        switch (unidadeDestino) {
            case "KM" -> {
                return valorEmMetros / 1000;
            }
            case "MI" -> {
                return valorEmMetros / 1609.34;
            }
            case "YD" -> {
                return valorEmMetros / 0.9144;
            }
            case "M" -> {
                return valorEmMetros;
            }
            default -> throw new IllegalArgumentException("Unidade de destino inválida: " + unidadeDestino);
        }
    }
}
