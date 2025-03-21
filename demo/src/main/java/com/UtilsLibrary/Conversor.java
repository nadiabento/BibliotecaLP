package com.UtilsLibrary;

//Exceção personalizada para unidade inválida

class UnidadeInvalidaException extends RuntimeException {
    public UnidadeInvalidaException(String mensagem) {
        super(mensagem);
        
    }
}

// Classe utilitária para conversões
public class Conversor {
    
    // Conversão de Tempo
    public static double converterTempo(double valor, String unidadeOrigem, String unidadeDestino) {
        double segundos;
        switch (unidadeOrigem) {
            case "s": segundos = valor; break;
            case "min": segundos = valor * 60; break;
            case "h": segundos = valor * 3600; break;
            case "d": segundos = valor * 86400; break;
            default: throw new UnidadeInvalidaException("Unidade de origem inválida: " + unidadeOrigem);
        }

        switch (unidadeDestino) {
            case "s": return segundos;
            case "min": return segundos / 60;
            case "h": return segundos / 3600;
            case "d": return segundos / 86400;
            default: throw new UnidadeInvalidaException("Unidade de destino inválida: " + unidadeDestino);
        }
    }

    // Conversão de Velocidade
    public static double converterVelocidade(double valor, String unidadeOrigem, String unidadeDestino) {
        double metrosPorSegundo;
        switch (unidadeOrigem) {
            case "m/s": metrosPorSegundo = valor; break;
            case "km/h": metrosPorSegundo = valor / 3.6; break;
            case "mph": metrosPorSegundo = valor * 0.44704; break;
            case "kn": metrosPorSegundo = valor * 0.514444; break;
            default: throw new UnidadeInvalidaException("Unidade de origem inválida: " + unidadeOrigem);
        }

        switch (unidadeDestino) {
            case "m/s": return metrosPorSegundo;
            case "km/h": return metrosPorSegundo * 3.6;
            case "mph": return metrosPorSegundo / 0.44704;
            case "kn": return metrosPorSegundo / 0.514444;
            default: throw new UnidadeInvalidaException("Unidade de destino inválida: " + unidadeDestino);
        }
    }

    // Conversão de Área
    public static double converterArea(double valor, String unidadeOrigem, String unidadeDestino) {
        double metrosQuadrados;
        switch (unidadeOrigem) {
            case "m²": metrosQuadrados = valor; break;
            case "km²": metrosQuadrados = valor * 1_000_000; break;
            case "ha": metrosQuadrados = valor * 10_000; break;
            case "ac": metrosQuadrados = valor * 4046.86; break;
            default: throw new UnidadeInvalidaException("Unidade de origem inválida: " + unidadeOrigem);
        }

        switch (unidadeDestino) {
            case "m²": return metrosQuadrados;
            case "km²": return metrosQuadrados / 1_000_000;
            case "ha": return metrosQuadrados / 10_000;
            case "ac": return metrosQuadrados / 4046.86;
            default: throw new UnidadeInvalidaException("Unidade de destino inválida: " + unidadeDestino);
        }
    }
}
