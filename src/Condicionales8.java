import java.util.Scanner;

public class Condicionales8 {
    public static void main(String[] args) {
        int numero;
        Scanner entrada = new Scanner(System.in);

        System.out.println("digite un numero");
        numero = entrada.nextInt();
         if (numero <10) {
             System.out.println("el numero" + numero + "tiene 1 cifra");
         }
         else if (numero <100) {
             System.out.println("el numero" + numero + "tiene 2 cifras");
         }
         else if (numero <1000) {
             System.out.println("el numero" + numero + "tiene 3 cifras");
         }
         else if (numero <10000) {
             System.out.println("el numero" + numero + "tiene 4 cifras");
         }
         else if (numero <100000){
             System.out.println("el numero" + numero + "tiene 5 cifras");
         }
         }
    }







