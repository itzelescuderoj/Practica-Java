import Model.Circle;
import Model.Square;
import Model.Triangulo;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Square sq = new Square();
        sq.setLado(10);
        sq.setMessage("");//Se accede mediante el metodo
        System.out.println(sq.getLado());
        System.out.println(sq.getPerimeter()); 
        System.out.println(sq.getArea());
        System.out.println();

        Circle ci = new Circle();
        ci.setRadio(10);
        System.out.println(ci.getArea());
        System.out.println(ci.getPerimeter());
        System.out.println();

        Triangulo tri = new Triangulo();
        tri.setlado(5);
        tri.setBase(6);
        tri.setaltura(4);
        System.out.println(tri.getPerimeter());
        System.out.println(tri.getArea());


    }
}