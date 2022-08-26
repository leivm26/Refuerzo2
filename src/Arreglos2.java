import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class Arreglos2 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);

        float [] numeros = new float[5];

        System.out.println("guardando los datos en el arreglo");
        for(int i=0;i<5;i++) {
            System.out.println((i + 1) + ".digite un numero: ");
            numeros[i] = entrada.nextFloat();
        }
        System.out.println("imprimir los elementos del arreglo");
        for(float i:numeros){
            System.out.println(i);
        }

    }
}
