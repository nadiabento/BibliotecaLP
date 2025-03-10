package com.UtilsLibrary;


public class Conversor {
    
    public class ConverterTemperatura {
        private double valor;
        private String unidadeOrigem;
        private String unidadeDestino;
    
        public ConverterTemperatura( double valor, String unidadeOrigem, String unidadeDestino) {
        this.valor = valor;
        this.unidadeOrigem = unidadeOrigem;
        this.unidadeDestino = unidadeDestino;
        }

        public double converter(){
            if (unidadeOrigem.equals(unidadeDestino)){
                return valor;
            }

            double ValorEmCelsius;

            switch (unidadeOrigem) {
                case "FAHRENHEIT":
                    ValorEmCelsius = (VALOR - 32) * 5/9;                    
                    break;
                case "KELVIN":
                    ValorEmCelsius = valor - 273.15;
                    break;
                case "CELSIUS":
                    ValorEmCelsius = valor;
                    break;

                default:
                    throw new IllegalArgumentException("unidade de destino invalida: " + unidadeDestino);
            }

        }


    }
    

    
}