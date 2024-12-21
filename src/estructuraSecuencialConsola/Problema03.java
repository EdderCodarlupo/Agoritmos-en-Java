package estructuraSecuencialConsola;

import javax.swing.JOptionPane;

public class Problema03 {

    // Dado el valor de venta de un producto, hallar el igv (18%) y el precio de venta.
    public static void main(String[] args) {
        double valorVenta = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de venta"));
        double igv = valorVenta * 0.18;
        double precioVenta = valorVenta + igv;

        System.out.println("El igv es: " + igv);
        System.out.println("El precio de venta del producto es: " + precioVenta);

    }

}
