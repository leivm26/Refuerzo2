import javax.swing.*;

public class Ejercicio13 {
    public static void main (String [] args){


        final int  saldo_inicial = 1000;
        int opcion;
        float ingreso,saldoActual,retiro;

        opcion= Integer.parseInt(JOptionPane.showInputDialog("bienvenido a su cajero automatico"
               + "1. ingresar dinero a la cuenta"
        + "2. retirar dinero de la cuenta"
        + "3. salir"));

        switch (opcion){
            case 1: ingreso = Float.parseFloat(JOptionPane.showInputDialog("digite la cantidad a ingresar en la cuenta"));
            saldoActual = saldo_inicial +  ingreso;
            JOptionPane.showMessageDialog(null,"dinero en cuenta: "+saldoActual);
            break;

            case 2: retiro = Float.parseFloat(JOptionPane.showInputDialog("digite cantidad que desea retirar"));

            if (retiro>saldo_inicial) {
                JOptionPane.showMessageDialog(null, "no cuenta con el saldo suficiente para este retiro");
            }
            else {
                saldoActual = saldo_inicial - retiro;
                JOptionPane.showMessageDialog(null, "dinero en cuenta: " + saldoActual);
            }
            break;
            case 3 : break;
            default: JOptionPane.showMessageDialog(null,"se equivoco de opcion de menu");break;
            }
        }
    }

