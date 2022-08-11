import java.util.Scanner;

public class Condicionales2 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        int num1,num2;

        System.out.println("por favor ingrese un numero: ");
        num1 = entrada.nextInt();

        System.out.println("por favor ingrese otro numero: ");
        num2 = entrada.nextInt();

        if(num1==num2)
            System.out.println("son iguales");
        else
        {
            if(num1>num2)
                System.out.println(num1 + "es mayor que " + num2);
            else
                System.out.println(num2 + "es mayor que " + num1);
        }

    }
}
