package exercicio2;

import javax.swing.JOptionPane;

public class teste_conversor extends conversor{
    public static void main(String[] args) {
        conversor teste = new conversor();

        //-------------- CELSIUS
        double celsius;
        celsius = Double.parseDouble(JOptionPane.showInputDialog("Digite valor de Celsius para converter para fahrenheit e kelvin"));
        //fahrenheit
        JOptionPane.showMessageDialog(null, + celsius + "ºC para fahrenheit é: " + teste.converter_celsius_fahrenheit(celsius));
    
        //kelvin
        JOptionPane.showMessageDialog(null, + celsius + "ºC para kelvin é: " + teste.converter_celsius_kelvin(celsius));


        //-------------- fahrenheit
        double fahrenheit;
        fahrenheit = Double.parseDouble(JOptionPane.showInputDialog("Digite valor de fahrenheit para converter para celsius e kelvin"));
        //celsius
        JOptionPane.showMessageDialog(null, + fahrenheit + "ºF para celsius é: " + teste.converter_fahrenheit_celsius(fahrenheit));

        //kelvin
        JOptionPane.showMessageDialog(null, + fahrenheit + "ºF para kelvin é: " + teste.converter_fahrenheit_kelvin(fahrenheit));

        //-------------- Kelvin
        double kelvin;
        kelvin = Double.parseDouble(JOptionPane.showInputDialog("Digite valor de kelvin para converter para celsius e fahrenheit"));
        //celsius
        JOptionPane.showMessageDialog(null, + kelvin + "ºK para celsius é: " + teste.converter_kelvin_celsius(kelvin));

        //fahrenheit
        JOptionPane.showMessageDialog(null, + kelvin + "ºK para fahrenheit é: " + teste.converter_kelvin_fahrenheit(kelvin));
    }
}
