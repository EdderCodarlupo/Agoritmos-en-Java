package estructuraSecuencialConsola;

import java.util.Scanner;
 //Hallar el cociente y el residuo (resto) de dos números enteros.
public class Problema02 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int numero1, numero2, cociente, residuo;
        System.out.print("Ingrese el primer número: ");
        numero1 = teclado.nextInt();
        System.out.print("Ingrese el segundo número: ");
        numero2 = teclado.nextInt();
        
        cociente = numero1 / numero2;
        residuo = numero1 % numero2;
        
        System.out.println("Cociente: " + cociente + "\nResiduo: " +residuo);
    }
    
}
