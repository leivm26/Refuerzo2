import javax.swing.*;

public class Ciclos17 {
    public static void main (String [] args){
        int codigo, litros, litrosArticulo1=0,conteoMas600=0;
        float precioLitro, importeFactura, facturacionTotal=0;

        for (int i=1; i<=5; i++){
            codigo = Integer.parseInt(JOptionPane.showInputDialog("articulo N"+i+"digite el codigo: "));
            litros = Integer.parseInt(JOptionPane.showInputDialog("articulo N"+i+"digite la cantidad en litros: "));
            precioLitro = Float.parseFloat(JOptionPane.showInputDialog("articulo N"+i+"digite el precio por litro: "));

            importeFactura = (float) litros * precioLitro;
            facturacionTotal += importeFactura;

            if (codigo == 1) {
                litrosArticulo1 += litros;
            }
            if (importeFactura > 600) {
                conteoMas600++;
            }
        }
        System.out.println("resumen de ventas");
        System.out.println("facturacion total: "+facturacionTotal);
        System.out.println("cantidad en litros vendidos del articulo 1"+litrosArticulo1);
        System.out.println("cantidad de facturas mayores a 600: "+conteoMas600);


            }

        }


