package exercicio1;

public class circulo extends forma{
    // Crie as classes concretas que possuem como atributos: lado, base, altura e
    // raio, conforme o caso. Estas classes devem implementar os métodos
    // calcularPerimetro() e calcularArea() de acordo com suas características.

    double pi;
    double raio;
    double area, perimetro;

    public circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        super.calcularArea();
        pi = 3.14;
        area = pi*(raio * raio);
        return area;
    }

    @Override
    public double calcularPerimetro() {
        super.calcularPerimetro();
        perimetro = (2*pi)*raio;
        return perimetro;
    }
    
    
}
