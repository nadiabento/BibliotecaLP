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

}


