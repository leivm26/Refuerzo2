import java.util.Scanner;

public class Ciclos4 {
    public static void main (String [] args){
        int numero,contador =0;
        Scanner ingreso = new Scanner(System.in);

        System.out.println("contar numeros");
        System.out.println("finalizar con numero negativo");

        do {
            System.out.println("digite un numero");
            numero = ingreso.nextInt();

            if (numero < 0)
                break;
            contador++;
        }while (numero>=0);

        System.out.println("numeros ingresados: "+contador);
        }
    }

