import java.util.Scanner;

public class Arreglo12 {
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        boolean creciente = true;
        int numero,sitio_num=0,j=0;

        System.out.println("llenar el arreglo");
        do {
            for (int i = 0; i < 5; i++) {
                System.out.println((i + 1) + ". digite un numero: ");
                arreglo[i] = entrada.nextInt();
            }


            for (int i = 0; i < 4; i++) {
                if (arreglo[i] < arreglo[i + 1]) {
                    creciente = true;
                }
                if (arreglo[i] > arreglo[i + 1]) {
                    creciente = false;
                    break;
                }
            }
            if (creciente == false) {
                System.out.println("el arreglo no esta ordenado en forma creciente, vuelva a digitar: ");
            }
        } while (creciente==false);

        System.out.println("digite un elemento a insertar: ");
        numero = entrada.nextInt();

        while (arreglo[j]<numero && j<5) {
            sitio_num++;
            j++;
        }
        for (int i=4;i>=sitio_num;i--) {
            arreglo[i + 1] = arreglo[i];
        }
        arreglo[sitio_num] = numero;

        System.out.println("el arreglo queda: ");
        for(int i=0;i<6;i++) {
            System.out.println(arreglo[i] + "-");
        }
        System.out.println();
        }



                }





