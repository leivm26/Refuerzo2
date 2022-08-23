import java.util.Scanner;

public class Ciclos16 {
    public static void main (String [] args){
        int numero;
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("ingrese un numero del 0 al 10: ");
            numero = entrada.nextInt();
        } while (0 <= numero && numero >=10);

        for (int i =1; i <=10; i++){
            System.out.println(numero+"X"+ i + "="+numero*i);
        }

    }
}
