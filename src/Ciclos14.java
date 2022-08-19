import java.util.Scanner;

public class Ciclos14 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);

        int sueldos;
        int cont_sueldos=0;
        int suma_suel=0;

        for ( int i=0;i<=9;i++);
        {
            System.out.println("digite 10 sueldos");
            sueldos = entrada.nextInt();
            suma_suel = suma_suel+sueldos;

            if(sueldos>1000);
            {
                cont_sueldos++;
            }
            }
        System.out.println("la suma de los sueldos es: "+suma_suel);
        System.out.println("mayores de 1000: "+cont_sueldos);
        }

    }

