import java.util.Scanner;

public class Suma3Notas {
    public static void main (String [] args){
        Scanner entrada = new Scanner (System.in);
        float nota1,nota2,nota3,suma;

        //Guardamos las 3 notas
        System.out.println("Digitar 3 calificaciones: ");

        nota1 = entrada.nextFloat();
        nota2 = entrada.nextFloat();
        nota3 = entrada.nextFloat();

        //Sumar las 3 notas
        suma = nota1+nota2+nota3;

        System.out.println("La suma es: "+suma);





    }
}
