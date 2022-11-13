/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividad;

/**
 *
 * @author pablonoguera
 */
public class Recursividad {

    public static void main(String[] args) {
        int base = 2;
        int exponente = 1;
        double resultado = potencia(base, exponente);
        System.out.println("resultado = " + resultado);
        double fact = factorial(5);
        System.out.println("fact = " + fact);
        int[] vec = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        double sumaVector = sumaVector(vec, vec.length - 1, vec[vec.length - 1]);
        System.out.println("sumaVector = " + sumaVector / vec.length);
        String matriz[][] = {
            {"9", "2", "3", "4",},
            {"5", "6", "7", "8",},
            {"8", "2", "3", "4",},
            {"5", "4", "3", "6",},};
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(" " + matriz[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
        String diagn = getDiagana(matriz);
        System.out.println("");
        System.out.println("diagn = " + diagn);

        System.out.println("");
        String[][] copy = new String[matriz.length - 1][matriz.length - 1];
        String data[][] = recRecursivo(matriz, copy, 0, 0);
        System.out.println("data = " + data.length);
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                System.out.print(" "+ data[i][j]);
            }
            System.out.println("");
        }
    }

    private static double potencia(int base, int exponente) {

        if (exponente == 0) {
            return 1;
        }
        if (exponente == 1) {
            return base;
        }

        return base * potencia(base, exponente - 1);

    }

    private static double factorial(int i) {
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }

        return i * factorial(i - 1);

    }

    private static double sumaVector(int[] vec, int i, int res) {

        if (i == 0) {
            return vec[0];
        }

        return res + sumaVector(vec, i - 1, vec[i - 1]);

    }

    private static String getDiagana(String[][] matriz) {
        if (matriz.length == 1) {
            return matriz[0][0];
        }

        return getDiagana (nuevaMatriz(matriz));

    }

    private static String[][] nuevaMatriz(String mat[][]) {
        System.out.println("");
        String[][] copy = new String[mat.length - 1][mat.length - 1];
        for (int i = 0; i < copy.length; i++) { // filas
            for (int j = 0; j < copy[0].length; j++) { // columnas
                copy[i][j] = mat[i][j];
                System.out.print(" " + copy[i][j]);
            }
            System.out.println("");
        }
        return copy;
    }

    private static String [][] recRecursivo(String mat[][],String copy[][], int i, int j) {

        if (i == copy.length - 1 && j == copy[0].length - 1) {
            copy[i][j] = mat[i][j];
            return copy;
        }        
          copy[i][j] = mat[i][j];    
        if (j==copy[0].length-1) {
  
           return  recRecursivo(mat, copy, i+1 ,0);
        }
        return recRecursivo(mat, copy, i ,j+1);
 }
}
