import java.util.Scanner;

public class Arreglo6 {
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);
        int a[],b[],c[];

        a = new int[10];
        b = new int[10];
        c = new int[20];

        System.out.println("digite el primer arreglo: ");
        for(int i=0;i<10;i++) {
            System.out.print((i + 1) + ".digite un numero: ");
            a[i] = entrada.nextInt();
        }
        System.out.println("digite el segundo arreglo: ");
        for(int i=0;i<10;i++) {
            System.out.print((i + 1) + ".digite un numero: ");
            b[i] = entrada.nextInt();
        }
        int j=0;
        for(int i=0;i<10;i++) {
            c[j] = a[i];
            j++;
            c[j] = b[i];
            j++;
        }
        System.out.println("el tercer arreglo es: ");
        for(int i=0;i<20;i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println();
        }
    }

