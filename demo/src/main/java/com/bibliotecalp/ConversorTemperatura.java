package com.bibliotecalp;

public class ConversorTemperatura {
    private double valor;
    private String unidadeOrigem;
    private String unidadeDestino;

    public ConversorTemperatura(double valor, String unidadeOrigem, String unidadeDestino) {
        this.valor = valor;
        this.unidadeOrigem = unidadeOrigem;
        this.unidadeDestino = unidadeDestino;
    }

    public static double converter(double valor, String unidadeOrigem, String unidadeDestino) {
        if (unidadeOrigem.equals(unidadeDestino)) {
            return valor; // Se a origem e destino forem iguais, retorna o mesmo valor
        }

        double valorEmCelsius;

        // Converter para Celsius primeiro
        switch (unidadeOrigem) {
            case "FAHRENHEIT":
                valorEmCelsius = (valor - 32) * 5 / 9;
                break;
            case "KELVIN":
                valorEmCelsius = valor - 273.15;
                break;
            case "CELSIUS":
                valorEmCelsius = valor;
                break;
            default:
                throw new IllegalArgumentException("Unidade de origem inválida: " + unidadeOrigem);
        }

        // Converter de Celsius para a unidade de destino
        switch (unidadeDestino) {
            case "FAHRENHEIT":
                return (valorEmCelsius * 9 / 5) + 32;
            case "KELVIN":
                return valorEmCelsius + 273.15;
            case "CELSIUS":
                return valorEmCelsius;
            default:
                throw new IllegalArgumentException("Unidade de destino inválida: " + unidadeDestino);
        }
    }
}