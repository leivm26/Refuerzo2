import javax.swing.*;

public class Ciclos3 {
    public static void main (String [] args){
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("digite un numero"));

        while (numero != 0){
            if(numero %2 == 0){
                System.out.println("el numero"+numero+"es par");
            }
            else {
                System.out.println("el numero"+numero+"es impar");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("digite otro numero"));
        }
    }
}
