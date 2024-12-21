// Almacene 9 numeros en una matriz de 3 x 3 y obtenga los números ordenados.
package arrays;

import java.util.Scanner;

public class Problema85 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int[] array = new int[9];
        
        int indice;

        // Llenamos la matriz de tamaño 3 x 3
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Posición [" + i + "][" + j + "]: ");
                matriz[i][j] = teclado.nextInt();
            }
        }

        // Mostramos los datos que contiene la matriz
        System.out.println("\nMatriz de 3 x 3");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        
        // PROCESO

        // Pasamos los datos de la matriz a un array unidimensional
        indice = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                array[indice] = matriz[i][j];
                indice++;
            }
        }

        //Ordenamos el arreglo de una dimension
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                int temp;
                if (array[j] > array[j + 1]) {
                    temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }

        // Llenamos la matriz ordenada de tamaño 3 x 3
        indice = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = array[indice];
                indice++;
            }
        }
        
        // Mostramos los datos que contiene la matriz ordenada
        System.out.println("\nMatriz ordenada de 3 x 3");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }

    }

}
