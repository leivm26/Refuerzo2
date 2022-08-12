import javax.swing.*;

public class Condicionales10 {
    public static void main (String [] args){
        int dia,mes,año;

        dia = Integer.parseInt(JOptionPane.showInputDialog("digite el dia:"));
        mes = Integer.parseInt(JOptionPane.showInputDialog("digite el mes:"));
        año = Integer.parseInt(JOptionPane.showInputDialog("digite el año:"));

        if (año ==0) {
            JOptionPane.showMessageDialog(null, "fecha incorrecta");
        } else {
             if (mes ==2 && (dia>0 && dia <=28)) {
                 JOptionPane.showMessageDialog(null, "fecha correcta");
             } else {
                 JOptionPane.showMessageDialog(null, "fecha incorrecta");
             }
             if (mes ==4 || mes==6 || mes==9 || mes==11) {
                 if (dia > 0 && dia <= 30){
                     JOptionPane.showMessageDialog(null, "fecha correcta");
                 } else{
                     JOptionPane.showMessageDialog(null, "fecha incorrecta");
                 }
             }
             if (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12){
                 if (dia>0 && dia<=31) {
                     JOptionPane.showMessageDialog(null, "fecha correcta");
                 } else {
                     JOptionPane.showMessageDialog(null, "fecha incorrecta");
                 }

             }
        }

    }
}
