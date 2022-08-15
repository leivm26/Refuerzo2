import javax.swing.*;

public class Ciclos7 {
    public static void main (String [] args){
        int numero,elementos =0, suma =0;
        float media;

        numero = Integer.parseInt(JOptionPane.showInputDialog("digite un numero: "));

        while (numero >=0) {
            suma += numero;
            elementos++;

            numero = Integer.parseInt(JOptionPane.showInputDialog("digite otro numero: "));
        }
        if (elementos ==0) {
            System.out.println("error: la division entre 0 no existe");
        }
        else{
            media = (float) suma/elementos;
            System.out.println("la media es: "+media);
        }
    }
}
