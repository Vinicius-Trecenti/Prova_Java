package exercicio1;

public class triangulo extends forma{
    // Crie as classes concretas que possuem como atributos: lado, base, altura e
    // raio, conforme o caso. Estas classes devem implementar os métodos
    // calcularPerimetro() e calcularArea() de acordo com suas características.

    double ladoA, ladoB, ladoC;
    double base, altura;
    double perimetro, area;

    public triangulo(double ladoA, double ladoB, double ladoC, double base, double altura) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        super.calcularArea();

        area = (base*altura)/2;

        return area;
    }

    @Override
    public double calcularPerimetro() {
        super.calcularPerimetro();
        perimetro = ladoA + ladoB + ladoC;
        return perimetro;
    }
    
}
