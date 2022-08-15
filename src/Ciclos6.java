import javax.swing.*;

public class Ciclos6 {
    public static void main (String [] args){
        int suma =0, numero;

        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("digite un numero"));
            if (numero != 0) {
                suma = suma + numero;
            }
        }while (numero!=0);
        System.out.println("el valor es: "+suma+" ." );
            }
        }


