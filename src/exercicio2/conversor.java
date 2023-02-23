package exercicio2;

public class conversor {
    // Crie uma classe Conversor que inclua também a escala Kelvin (K). Esta classe
    // deve conter conversores entre as três escalas de temperatura (Celsius,
    // Fahrenheit e Kelvin), totalizando seis funções. A relação entre as três escalas é
    // dada por:

    double celsius, fahrenheit, kelvin;

    public double converter_celsius_fahrenheit(double celsius) {
        fahrenheit = (celsius*9/5)+32;
        return fahrenheit;
    }
    
    public double converter_celsius_kelvin(double celsius) {
        kelvin = celsius + 273.15;
        return kelvin;
    }

    public double converter_fahrenheit_celsius(double fahrenheit) {
        celsius = (fahrenheit - 32) * 5/9;
        return celsius;
    }

    public double converter_fahrenheit_kelvin(double fahrenheit) {
        kelvin = (fahrenheit - 32) * 5/9 + 273.15;
        return kelvin;
    }

    public double converter_kelvin_celsius(double kelvin) {
        celsius = kelvin - 273.15;
        return celsius;
    }

    public double converter_kelvin_fahrenheit(double kelvin) {
        fahrenheit = (kelvin - 273.15) * 9/5 + 32;
        return fahrenheit;
    }
}
