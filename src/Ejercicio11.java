import javax.swing.*;

public class Ejercicio11 {
    public static void main (String [] args) {
        int numero1, numero2, suma, resta, mult, div;
        char operacion;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("digite un numero"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("digite un numero"));

        operacion = JOptionPane.showInputDialog("digite la operacion que desea realizar: ").charAt(0);

        switch (operacion) {
            case 's':
            case 'S':
                suma = numero1 + numero2;
                JOptionPane.showMessageDialog(null, "la suma es: " + suma);
                break;

            case 'r':
            case 'R':    resta = numero1 - numero2;
                JOptionPane.showMessageDialog(null, "la resta es: " + resta);
                break;

            case 'p':
            case 'P':
            case 'm':
            case 'M':
                mult = numero1 * numero2;
                JOptionPane.showMessageDialog(null, "la multiplicacion es: " + mult);
                break;

            case 'd':
            case 'D':
                div = numero1 / numero2;
                JOptionPane.showMessageDialog(null, "la division es: " + div);
                break;
            default:
                JOptionPane.showMessageDialog(null, "error, se equivoco de operacion");
                break;

        }
    }
    }

