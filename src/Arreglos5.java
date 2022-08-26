import java.util.Scanner;

public class Arreglos5 {
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);
        int numero [] = new int[10];
        for (int i=0;i<10;i++) {
            System.out.println("digite un numero");
            numero[i] = entrada.nextInt();
        }
        System.out.println("el resultado es");
        for (int i=0;i<=4;i++){
            System.out.println(numero[i]);
            System.out.println(numero[9-i]);
        }
    }
}
