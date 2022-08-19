import java.util.Scanner;

public class Ciclos12 {
    public static void main (String [] args){
        long factorial =1;
        int numero;
        Scanner entrada = new Scanner (System.in);
        System.out.println("digite un numero: ");

        numero= entrada.nextInt();
        for (int i = numero; i > 0; i--) {
            factorial = factorial * i;
        }
        System.out.println("el factorial de "+numero+" es: "+factorial);
        }

    }


