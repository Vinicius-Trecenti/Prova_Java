package exercicio1;

public class retangulo extends forma{
    // Crie as classes concretas que possuem como atributos: lado, base, altura e
    // raio, conforme o caso. Estas classes devem implementar os métodos
    // calcularPerimetro() e calcularArea() de acordo com suas características.
    double altura;
    double base;
    double perimetro;
    double area;

    
    public retangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    @Override
    public double calcularArea() {
        super.calcularArea();
        area = base*altura;
        return area;
    }

    @Override
    public double calcularPerimetro() {
        super.calcularPerimetro();
        perimetro = 2*(altura + base);
        return perimetro;
    }

}
