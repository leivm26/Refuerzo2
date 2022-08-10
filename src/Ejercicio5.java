import java.util.Scanner;

public class Ejercicio5 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        float participacion, primerExamen, segundoExamen, examenFinal=0;

        //pedir datos necesarios
        System.out.println("Digite la nota de participacion: ");
        participacion = entrada.nextFloat();

        System.out.println("Digite la nota de primer examen: ");
        primerExamen = entrada.nextFloat();

        System.out.println("Digite la nota segundo examen: ");
        segundoExamen = entrada.nextFloat();

        System.out.println("Digite la nota del examen final: ");
        var notaFinal = entrada.nextFloat();

        //Calculos
        participacion *= 0.10f;
        primerExamen *= 0.25f;
        segundoExamen *= 0.25f;
        examenFinal *= 0.40f;

        //Suma de notas
        notaFinal = participacion + primerExamen + segundoExamen + examenFinal;

        System.out.println("la nota final es: "+notaFinal);
    }
}
