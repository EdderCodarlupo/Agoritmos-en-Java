package estructuraSecuencialConsola;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Desarrollar un programa que permita convertir una cantidad dada en metros
 * a sus equivalencias en:
 * Centimetros, pulgadas, pies, y yardas.
 * Considera la siguiente informacion:
 * 1 metro = 100 cm
 * 1 pulgada = 2.54 cm
 * 1 pie = 12 pulgadas
 * 1 yarda = 3 pies.
 */
public class Aplicacion02 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
                
        System.out.print("Ingrese la cantidad en metros: ");
        double metros = teclado.nextDouble();
        double cm, pulgadas, pies, yarda;
        cm = metros * 100;
        pulgadas = cm / 2.54;
        pies = pulgadas / 12;
        yarda = pies / 3;
        
        System.out.println("Equivalencias: \n" + 
                "Centimetros: " + df.format(cm) + "\n" + 
                "Pulgadas: " + df.format(pulgadas) + "\n" +
                "Pies: " + df.format(pies) + "\n" + 
                "Yardas: " + df.format(yarda) + "\n"
        );
    }
}
