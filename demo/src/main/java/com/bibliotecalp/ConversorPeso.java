package com.bibliotecalp;


public class ConversorPeso {

    public static double converterPeso(double valor, String unidadeOrigem, String unidadeDestino) {
        unidadeOrigem = unidadeOrigem.toUpperCase();
        unidadeDestino = unidadeDestino.toUpperCase();

        if (unidadeOrigem.equals(unidadeDestino)) {
            return valor; // Se as unidades forem iguais, retorna o mesmo valor
        }

        double valorEmGramas;

        // Converter para gramas primeiro
        switch (unidadeOrigem) {
            case "G":
                valorEmGramas = valor;
                break;
            case "KG":
                valorEmGramas = valor * 1000;
                break;
            case "LB":
                valorEmGramas = valor * 453.592;
                break;
            case "OZ":
                valorEmGramas = valor * 28.3495;
                break;
            default:
                throw new IllegalArgumentException("Unidade de origem inválida: " + unidadeOrigem);
        }

        // Converter de gramas para a unidade de destino
        switch (unidadeDestino) {
            case "G":
                return valorEmGramas;
            case "KG":
                return valorEmGramas / 1000;
            case "LB":
                return valorEmGramas / 453.592;
            case "OZ":
                return valorEmGramas / 28.3495;
            default:
                throw new IllegalArgumentException("Unidade de destino inválida: " + unidadeDestino);
        }
    }
}
