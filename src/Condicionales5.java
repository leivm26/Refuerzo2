import javax.swing.*;

public class Condicionales5 {
    public static void main (String [] args){
        int horasTrabajadas;
        float salarioTotal;

        horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Digitar el total de horas trabajadas: "));

        if(horasTrabajadas <= 40){
            salarioTotal = horasTrabajadas * 16;

        }
        else{
            salarioTotal = (40*16) + ((horasTrabajadas-40) * 20);

        }
        JOptionPane.showMessageDialog(null,"el salario total es: "+salarioTotal);
    }


}
