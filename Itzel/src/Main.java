import javax.swing.*;

public class Main {
    public static void main(String[] args) throws Exception {

        String num1 = JOptionPane.showInputDialog("Dame un numero");
        String num2 = JOptionPane.showInputDialog("Dame un segundo numero");
        String num3 = JOptionPane.showInputDialog("Dame un tercer numero");
         int suma  = Integer.parseInt(num1) + Integer.parseInt(num2) + Integer.parseInt(num3);
         System.out.println(suma /3);

        //System.out.println((Integer.parseInt(num1) + Integer.parseInt(num2) + Integer.parseInt(num3)) /3);

        }
    }