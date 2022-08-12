import javax.swing.*;

public class Condicionales6 {
    public static void main(String[] args) {
        int numero1, numero2;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digitar el primer numero"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digitar el segundo numero"));

        if (numero1 % 2 == 0) {

            JOptionPane.showMessageDialog(null, "ambos numeros son pares: ");
        }
    }

}







