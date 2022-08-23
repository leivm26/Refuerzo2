import java.util.Scanner;

public class Ciclos18 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        int codigo;
        int litros,litrosArticulo1=0,conteoMas600=0;
        float precioLitro,importeFactura, facturacionTotal=0;

        facturacionTotal=0;
        litrosArticulo1=0;
        conteoMas600=0;

        for (int i=1;i<=5;i++){
            System.out.println("factura N."+i);
            System.out.println("codigo de producto: ");
            codigo = entrada.nextInt();
            System.out.println("cantidad litros: ");
            litros= entrada.nextInt();

            switch (codigo) {
                case 1:
                    precioLitro = 0.6f;
                    break;
                case 2:
                    precioLitro = 3f;
                    break;
                case 3:
                    precioLitro = 1.25f;
                    break;
                importeFactura = (float) litros * precioLitro;
                litrosArticulo1 += litros;


                if (importeFactura >= 600) conteoMas600++;
            }
            System.out.println("resumen de ventas");
            System.out.println("la facturacion total es de: "+facturacionTotal);
            System.out.println("ventas del producto 1: "+litrosArticulo1);
            System.out.println("factura mayor a 600: "+conteoMas600);


            }
        }
    }

