import javax.swing.*;

public class Ciclos1 {
    public static void main (String [] args){
        int numero,cuadrado;

        numero = Integer.parseInt(JOptionPane.showInputDialog("digite un numero"));

        while (numero>= 0){
            cuadrado = (int)Math.pow(numero,2);

            JOptionPane.showMessageDialog(null,"el numero "+numero+" elevado al cuadrado es: "+cuadrado);

            numero = Integer.parseInt(JOptionPane.showInputDialog("digite otro numero"));
        }
    }
}
