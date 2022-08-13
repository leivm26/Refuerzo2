import java.util.Scanner;

public class Ejercicio12 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Cual fue tu nota");
        double num1 = entrada.nextDouble();

        if (num1<=5) {
            System.out.println("insuficiente");
        }
        else if (num1<6) {
            System.out.println("suficiente");
        }
        else if (num1<7) {
            System.out.println("bien");
        }
        else if (num1<=8) {
            System.out.println("notable");
        }
        else if (num1<=10){
            System.out.println("sobresaliente");
        }
    }
}
