package estructuraSecuencialConsola;

// Dado dos numeros enteros, hallar la suma

import java.util.Scanner;

public class Problema01 {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int numero1;
        int numero2;
        int sumaDosNumeros;
        
        System.out.print("Ingrese el Primer N�mero: ");
        numero1 = teclado.nextInt();
        
        System.out.print("Ingrese el Segundo N�mero: ");
        numero2 = teclado.nextInt();
        
        sumaDosNumeros = numero1 + numero2;
        
        System.out.println("La suma de los dos n�meros es: " + sumaDosNumeros);
        
    }
    
}
