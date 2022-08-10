import java.util.Scanner;

public class Ejercicio6 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        int horasTotales, semanas,dias,horas;

        System.out.println("Digite el numero de horas: ");
        horasTotales = entrada.nextInt();

        semanas = horasTotales / 168;
        dias = horasTotales%168 / 24;
        horas = horasTotales%24;

        System.out.println("El equivalente es:");
        System.out.println("semanas es: "+semanas);
        System.out.println("dias es: "+dias);
        System.out.println("horas es: "+horas);
    }
}
