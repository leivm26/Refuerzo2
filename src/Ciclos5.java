import javax.swing.*;

public class Ciclos5 {
    public static void main (String [] args){
        int numero, aleatorio, contador =0;

        aleatorio =(int) Math.random()*100;

        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("digite un numero: "));

            if (aleatorio > numero) {
                System.out.println("digite un numero mayor");
            }
            else {
                System.out.println("digite un numero menor");
            }
            contador++;

        }while(numero != aleatorio);
        System.out.println("adivinaste el numero en: "+contador+" intentos");

        }


    }

