package Secuencial;

import java.util.Scanner;

/**
 * Crear una aplicaci�n que solicite 
 * ingresar dos n�meros enteros y 
 * permita realizar las operaciones matem�ticas b�sicas con dichos n�meros.
 * SUMA, RESTA, MULTIPLICACI�N, DIVISI�N. RESTO, POTENCIA
 */

public class Aplicacion01 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // Declaracion de variables
        int numero1, numero2, suma, resta, multiplicacion, division, resto, potencia;
        System.out.println("N�mero 1: ");
        numero1 = teclado.nextInt();
        System.out.println("N�mero 2: ");
        numero2 = teclado.nextInt();
        // Proceso
        suma = numero1 + numero2;
        resta = numero1 - numero2;
        multiplicacion = numero1 * numero2;
        division = numero1 / numero2;
        resto = numero1 % numero2;
        potencia = (int) Math.pow(numero1, numero2);
        // Salida
        System.out.println("Resultados: \n"
                + "Suma: " + suma + "\n"
                + "Resta: " + resta + "\n"
                + "Multiplicaci�n: " + multiplicacion + "\n"
                + "Divisi�n: " + division + "\n"
                + "Resto: " + resto + "\n"
                + "Potencia: " + potencia + "\n"
                );
    
    }
    
}
