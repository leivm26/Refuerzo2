import java.util.Scanner;

public class Ciclos10 {
    public static void main (String [] args ){
        Scanner entrada = new Scanner(System.in);

        int num,sumaTotal;
        sumaTotal = 0;

        for (int i=1; i<=10;i++){
            System.out.println("digite un numero: ");
            num = entrada.nextInt();

            sumaTotal = sumaTotal + num;

            System.out.println("la suma total es: "+sumaTotal);
        }


    }
}
