import javax.swing.*;

public class Ciclos19 {
    public static void main (String [] args){
        float nota;
        int aprobados=0,condicionados=0,suspensos=0;

        for (int i=1;i<=6;i++) {
            do {
                nota = Float.parseFloat(JOptionPane.showInputDialog("digite una nota entre 0-10: "));
            } while (nota < 0 || nota > 10);

            if (nota == 4) {
                condicionados++;
            } else if (nota >= 5) {
                aprobados++;
            } else {
                suspensos++;
            }
        }
        System.out.println("cantidad de aprobados: "+aprobados);
        System.out.println("cantidad de condicionados: "+condicionados);
        System.out.println("cantidad de suspensos: "+suspensos);

            }
        }



