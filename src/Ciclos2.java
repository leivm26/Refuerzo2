import javax.swing.*;

public class Ciclos2 {
    public static void main (String [] args){
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("digite un numero"));
        while (numero > 0 && numero != 0) {

            JOptionPane.showMessageDialog(null,"el numero"+numero+"es positivo");
            numero = Integer.parseInt(JOptionPane.showInputDialog("digite otro numero"));

            if (numero<0 && numero !=0){
                JOptionPane.showMessageDialog(null,"el numero"+numero+"es negativo");
                numero = Integer.parseInt(JOptionPane.showInputDialog("digite otro numero"));
            }

        }
    }
}
