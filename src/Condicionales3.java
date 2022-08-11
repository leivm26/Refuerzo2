import javax.swing.*;

public class Condicionales3 {
    public static void main (String [] args ){
        char letra;

        letra = JOptionPane.showInputDialog("Digite una letra: ").charAt(0);
        if (Character.isUpperCase(letra)) {
            JOptionPane.showMessageDialog(null, "Es una letra mayuscula");
        }
        else{
            JOptionPane.showMessageDialog(null,"Es una letra minuscula");

        }
    }
}
