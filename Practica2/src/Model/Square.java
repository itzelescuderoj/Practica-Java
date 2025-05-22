package Model;

public class Square {
    private double lado;
    private String message;

    public double getPerimeter(){ //Funcion
        //double perimeter = lado * 4;
        return lado * 4;//perimeter; Aqui se retorna directamente con lado*4

    }
    public double getArea () {
        //Validar que this.message tenga valor
        if (!this.message.isEmpty()) {
            getSecretMessage();
        }
        return lado * lado;
    }
        //getters y setters
        public void setLado (double lado){ //Si se quiere asignar un valor al perimetro, necesitas la palabra this para que el valor llegue a (private)
            this.lado = lado;
        }

        public double getLado(){
            return this.lado;
        }
        public void setMessage (String message){
        this.message = message;
        }

    private void getSecretMessage (){
        System.out.println ("Este metodo solo es accesible dentro de la clase, pero no desde afuera");
    }
}
