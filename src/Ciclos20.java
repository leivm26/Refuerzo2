import java.util.Scanner;

public class Ciclos20 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        int sueldo=0;
        int sueldoMaximo=0;

        do {
            System.out.println("digite sus sueldos");
            sueldo = entrada.nextInt();

            if (sueldo > sueldoMaximo) {

                sueldoMaximo = sueldo;
            }
        }while (sueldo!=0);
        System.out.println("el sueldo maximo es: "+sueldoMaximo);

            }
        }


