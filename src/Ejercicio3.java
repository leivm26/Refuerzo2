import java.util.Scanner;

public class Ejercicio3 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        float guillermo,luis,juan,total;

        System.out.println("Digitar la cantidad de dinero que tiene guillermo");
        guillermo = entrada.nextFloat();

        //Luis tiene la mitad de lo de guillermo
        luis = guillermo/2;
        juan = (guillermo+luis)/2;

        total = guillermo+luis+juan;

        System.out.println("La cantidad de dinero entre los tres es: "+total);
    }
}
