import javax.swing.*;
import java.util.Scanner;

public class Arreglos1 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        int nElementos;

        nElementos = Integer.parseInt(JOptionPane.showInputDialog("digite la cantidad de elementos del arreglo:"));

        char[] letras = new char[nElementos];

        System.out.println("digite los elementos del arreglo: ");
        for(int i=0;i<nElementos;i++) {
            System.out.println((i + 1) + ". digite un caracter: ");
            letras[i] = entrada.next().charAt(0);
        }
        System.out.println("los caracteres del arreglo son: ");
        for (int i=0;i<nElementos;i++){
            System.out.print(letras[i]+" ");
        }
    }
}
