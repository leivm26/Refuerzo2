import java.util.Scanner;

public class Arreglo10 {
    public static void main (String[]args) {
        Scanner entrada = new Scanner(System.in);
        int tabla[] = new int[10];
        int numero, posicion;

        for(int i=0;i<8;i++) {
            System.out.print((i + 1) + "ingrese un numero: ");
            tabla[i] = entrada.nextInt();
        }
        System.out.print("ingrese un nuevo numero a la tabla");
        numero=entrada.nextInt();
        System.out.println("ingrese la posicion que desea del 1 al 10");
        posicion= entrada.nextInt();

        for (int i=8; i>=(posicion-1);i--) {
            tabla[i + 1] = tabla[i];
        }
        tabla[(posicion-1)]=numero;
        for (int i=0;i<10;i++) {
            System.out.print("|" + tabla[i] + "|");
        }
        System.out.println();
        }

    }






