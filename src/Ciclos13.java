import javax.swing.*;

public class Ciclos13 {
    public static void main (String [] args){
        int numero, suma_pos=0, conteo_pos=0, suma_neg=0, conteo_neg=0, conteo_ceros=0;
        float media_pos,media_neg;

        for(int i=1; i<=10;i++){
            numero=Integer.parseInt(JOptionPane.showInputDialog("digite un numero: "));

            if (numero ==0) {
                conteo_ceros++;
            }
            else if (numero>0) {
                suma_pos += numero;
                conteo_pos++;
            }
            else {
                suma_neg += numero;
                conteo_neg++;
            }
        }
        if (conteo_pos == 0) {
            System.out.println("no se puede sacar la suma de los positivos");
        }
        else{
            media_pos = (float) suma_pos/conteo_pos;
            System.out.println("la suma de los numeros positivos es: "+media_pos);
        }
        if (conteo_neg == 0) {
            System.out.println("no se puede sacar la media de los negativos");
        }
        else{
            media_neg = (float) suma_neg/conteo_neg;
            System.out.println("la media de los negativos: "+media_neg);
        }
    }
}
