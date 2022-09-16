/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

import java.util.Arrays;

/**
 *
 * @author pablonoguera
 */
public class Matrices {

    /**
     * Clase principal sigue el comentario...
     *
     * @param args
     */
    public static void main(String[] args) {
       
        //Declaración de un array bidimencional
        int matriz[][] = new int[10][10];
        matriz = llenar(matriz);

        int vector[] = new int[matriz.length * matriz[0].length];
        vector = llenaVector(vector, matriz);
        vector = burbuja(vector);
        //imprimeVector(vector);

        String rep = verificaRepetidos(vector);

        String numerosRpetidos[] = rep.split(",");
        Arrays.sort(numerosRpetidos);
        for (int i = 0; i < numerosRpetidos.length; i++) {
            System.out.print(" "+ numerosRpetidos[i]);
        }
        System.out.println("");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                boolean flag = false;
                for (int k = 0; k < numerosRpetidos.length; k++) {
                 
                    if (numerosRpetidos[k].equalsIgnoreCase(String.valueOf(matriz[i][j]))) {
                        flag = true;
                    }
                }
                if (flag) {
                System.out.print("\u001B[37m\u001B[41m"+"[" + i + "][" + j + "]: " + matriz[i][j] + " ");
                }else{
                System.out.print("\u001B[37m\u001B[47m"+"[" + i + "][" + j + "]: " + matriz[i][j] + " ");
                }
            }
            System.out.println("");
        }

    }

    private static int[][] llenar(int[][] matriz) {

        int matrizRetorno[][] = new int[matriz.length][matriz[0].length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                int n = (int) (Math.random() * 1000);
                matrizRetorno[i][j] = n;
            }
        }

        return matrizRetorno;

    }

    private static int[] burbuja(int[] vector) {
        int i, j, aux;
        for (i = 0; i < vector.length - 1; i++) {
            for (j = 0; j < vector.length - i - 1; j++) {
                if (vector[j + 1] < vector[j]) {
                    aux = vector[j + 1];
                    vector[j + 1] = vector[j];
                    vector[j] = aux;
                }
            }
        }
        return vector;
    }

    private static int[] llenaVector(int[] vector, int[][] matriz) {
        int k = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                vector[k] = matriz[i][j];
                k++;
            }

        }
        return vector;
    }

    private static void imprimeVector(int[] vector) {

        for (int i = 0; i < vector.length; i++) {
            System.out.print(" " + vector[i]);
        }

    }

    private static String verificaRepetidos(int[] vector) {
        String repetidos = "";
        for (int i = 0; i < vector.length; i++) {
          
            if ((i + 1) < vector.length) {
                if (vector[i] == vector[i + 1]) {
                    repetidos = repetidos + vector[i] + ",";
                }
            }
        }
        if (!repetidos.isEmpty()) {
            return repetidos.substring(0, repetidos.length() - 2);
        }else{
        return "";
        }
        
    }

    
}
