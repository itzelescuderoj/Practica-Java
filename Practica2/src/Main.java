import Model.Circle;
import Model.Square;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Square sq = new Square();
        sq.setLado(10);
        sq.setMessage("");//Se accede mediante el metodo
        System.out.println(sq.getLado());
        double squarePerimeter = sq.getPerimeter();
       // System.out.println(squarePerimeter);
        System.out.println(sq.getArea());
        System.out.println();

        Circle ci = new Circle();
        ci.setAltura(10);
        ci.setBase(10);
        ci.setRadius(3.1416);
        System.out.println(ci.getArea());
        System.out.println(ci.getPerimeter());



    }
}