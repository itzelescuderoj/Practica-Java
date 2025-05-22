package Model;

public class Triangulo {
    private double lado;
    private double base;
    private double altura;

    public double getlado() {
        return lado;
    }

    public void setlado(double lado) {
        this.lado = lado;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

     public double getaltura() {
        return altura;
    }

    public void setaltura(double altura) {
        this.altura = altura;
    }

    public double getPerimeter() {
        return (2 * lado) + base;
    }

    public double getArea() {
        return (base * altura) / 2;
    }
}