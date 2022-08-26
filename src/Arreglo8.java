import java.util.Scanner;

public class Arreglo8 {
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        boolean creciente=false, decreciente=false;

        System.out.println("llenar el arreglo");
        for (int i=0;i<10;i++) {
            System.out.println((i + 1) + ".digite un numero: ");
            arreglo[i] = entrada.nextInt();
        }
        for (int i=0;i<9;i++) {
            if (arreglo[i] < arreglo[i + 1]) {
                creciente = true;

            }
            if (arreglo[i] > arreglo[i + 1]) {
                decreciente = true;
            }
        }
        if (creciente==true && decreciente==false) {
            System.out.println("el arreglo esta en forma creciente");
        } else if (creciente==false && decreciente==true) {
            System.out.println("el arreglo esta en forma decreciente");
        } else if (creciente== true && decreciente== true) {
            System.out.println("el arreglo esta desordenado");
        } else if (creciente== false && decreciente == false) {
            System.out.println("todos los numeros del arreglo son iguales");

        }

    }

    }


