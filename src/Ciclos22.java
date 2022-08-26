import java.util.Scanner;

public class Ciclos22 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        int suspensos=0;
        int aprobados=0;

        for(int i=1;i<=5;i++) {
            System.out.println("digite sus calificaciones");
            int n = entrada.nextInt();

            if (n >= 5) {
                aprobados++;
            }
            if (n < 5) {
                suspensos++;
            }
        }
        System.out.println("tiene: "+suspensos+" suspensos");
            }
        }


