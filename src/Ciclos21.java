import javax.swing.*;

public class Ciclos21 {
    public static void main (String [] args){
        int numero;
        boolean hay_negativos = false;

        for(int i=1;i<=10;i++) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("digite un numero:"));

            if (numero < 0) {
                hay_negativos = true;
            }
        }
        if (hay_negativos == true) {
            System.out.println("si existe al menos un numero negativo");
        }
        else{
            System.out.println("no existe ningun numero negaativo ");
            }
        }
    }

