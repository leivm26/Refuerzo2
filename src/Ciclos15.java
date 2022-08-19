import javax.swing.*;

public class Ciclos15 {
    public static void main (String [] args){
        int edad,sumaEdad=0,conteoMayor18=0,conteoMayor175=0;
        float altura,sumaAltura=0,mediaEdad,mediaAltura;

        for(int i=1; i<=5;i++){
            edad = Integer.parseInt(JOptionPane.showInputDialog("alumno "+i+" digite su edad: "));
            altura = Float.parseFloat(JOptionPane.showInputDialog("alumno "+i+" digite su estatura: "));

            sumaEdad += edad;
            sumaAltura += altura;

            if(edad>18) {
                conteoMayor18++;
            }
            if(altura >1.75){
                conteoMayor175++;
            }
        }
        mediaEdad = (float) sumaEdad/5;
        mediaAltura = (float) sumaAltura/5;

        System.out.println("la edad promedio es: "+mediaEdad);
        System.out.println("la estatura promedio es:"+mediaAltura);
        System.out.println("cantidad de alumnos mayores a 18 años: "+conteoMayor18);
        System.out.println("cantidad de alumnos que miden mas de 1.75: "+conteoMayor175);
    }
}
