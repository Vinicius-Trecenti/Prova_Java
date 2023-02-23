package exercicio1;

import javax.swing.JOptionPane;

public class teste_formas {
    //c) Escreva uma classe com o método main() para testar esta aplicação.
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Iniciando programa de formas!");
        JOptionPane.showMessageDialog(null, "Na ordem [1º retangulo - 2º circulo - 3º triangulo]");

        //---------------------- retangulo
        double altura_retangulo, base_retangulo;
        altura_retangulo = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do retangulo: "));
        base_retangulo = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do retangulo: "));
        retangulo teste_retangulo = new retangulo(altura_retangulo, base_retangulo);

        //area
        JOptionPane.showMessageDialog(null, "A area do retangulo é: " + teste_retangulo.calcularArea());
        //perimetro
        JOptionPane.showMessageDialog(null, "O perimetro do retangulo é: " + teste_retangulo.calcularPerimetro());
        

        //------------------------ circulo
        double raio;
        raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio do circulo: "));
        circulo teste_circulo = new circulo(raio);

        //area
        JOptionPane.showMessageDialog(null, "A area do circulo é: " + teste_circulo.calcularArea());
        //perimetro
        JOptionPane.showMessageDialog(null, "O perimetro do circulo é: " + teste_circulo.calcularPerimetro());
        

        //------------------------- Triangulo
        double ladoA, ladoB, ladoC, base, altura;

        ladoA = Double.parseDouble(JOptionPane.showInputDialog("Digite o lado A do triangulo: "));
        ladoB = Double.parseDouble(JOptionPane.showInputDialog("Digite o lado B do triangulo: "));
        ladoC = Double.parseDouble(JOptionPane.showInputDialog("Digite o lado C do triangulo: "));
        base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do triangulo:  "));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do triangulo: "));

        triangulo teste_triangulo = new triangulo(ladoA, ladoB, ladoC, base, altura);

        //area
        JOptionPane.showMessageDialog(null, "A area do circulo é: " + teste_triangulo.calcularArea());
        //perimetro
        JOptionPane.showMessageDialog(null, "O perimetro do circulo é: " + teste_triangulo.calcularPerimetro());
        JOptionPane.showMessageDialog(null, "FIM");
    }
}
