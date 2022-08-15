import java.util.Scanner;

public class Ciclos8 {
    public static void main (String [] args){
        Scanner n = new Scanner(System.in);
        int numero;
        System.out.println("digite un numero entero: ");

        numero = n.nextInt();

        System.out.println("numeros del 1 al "+n+" :");
        int i = 1;
        while (i <= numero){
            System.out.println(i);
            i++;
        }
    }
}
