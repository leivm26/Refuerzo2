import java.util.Scanner;

public class Arreglos3 {
    public static void main (String [] args) {
        int arreglo[] = new int[5];
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < arreglo.length; i++) {

            System.out.println("digite un numero: ");
            arreglo[i] = entrada.nextInt();
        }
        System.out.println("los numeros en orden inverso son: ");
        int j =4;
        while (j>=0)
        {
            System.out.println("|"+arreglo[j]+"|");
            j--;
        }
    }

    }

