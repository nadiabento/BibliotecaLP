package com.bibliotecalp;

public class Main {
    public static void main(String[] args) {
        // converção entre  temperaturas
        double temp1 = ConversorTemperatura.converter(100,  "CELSIUS", "FAHRENHEIT");
        double temp2 = ConversorTemperatura.converter(212, "FAHRENHEIT", "CELSIUS");
        double temp3 = ConversorTemperatura.converter(300, "KELVIN", "CELSIUS");
        double temp4 = ConversorTemperatura.converter(25, "CELSIUS", "KELVIN");

        System.out.println("100°C em Fahrenheit é: " + temp1 + "°F");
        System.out.println("212°F em Celsius é: " + temp2 + "°C");
        System.out.println("300K em Celsius é: " + temp3 + "°C");
        System.out.println("25°C em Kelvin é: " + temp4 + "K");

       
        // conversão entre medidas de distancia
        double distan1 = ConversorDistancia.converterDistancia(1, "KM", "M");
        double distan2 = ConversorDistancia.converterDistancia(1, "MI", "KM");
        double distan3 = ConversorDistancia.converterDistancia(100, "YD", "M");
        double distan4 = ConversorDistancia.converterDistancia(500, "M", "MI");
        
        
        System.out.println("1 km em metros é: " + distan1 + " m");
        System.out.println("1 mi em quilômetros é: " + distan2 + " km");
        System.out.println("100 yd em metros é: " + distan3 + " m");
        System.out.println("500 m em milhas é: " + distan4 + " mi");

        // conversão entre pesos
        double peso1 = ConversorPeso.converterPeso(1000, "G", "KG");
        double peso2 = ConversorPeso.converterPeso(1, "KG", "LB");
        double peso3 = ConversorPeso.converterPeso(10, "OZ", "G");
        double peso4 = ConversorPeso.converterPeso(5, "LB", "OZ");

        System.out.println("1000 g em quilogramas é: " + peso1 + " kg");
        System.out.println("1 kg em libras é: " + peso2 + " lb");
        System.out.println("10 oz em gramas é: " + peso3 + " g");
        System.out.println("5 lb em onças é: " + peso4 + " oz");
    
    }                
}