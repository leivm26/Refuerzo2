import java.util.Scanner;

public class Condiconales4 {
    public static void main(String[] args) {
        Scanner descuento = new Scanner(System.in);

        double compra;
        System.out.println("ingrese el monto de la compra");

        compra = descuento.nextDouble();
           if (compra > 300) {
            compra -=  (compra*0.20);


         }
             System.out.println("Cual es la cantidad que pagara una persona por su compra es: "+ compra);

        }
    }

