/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

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
        
       int matriz [][] =new int[10][10];
        matriz = llenar(matriz);
       
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
               
                    System.out.print("["+i+"]["+j+"]: "+matriz[i][j]+" ");
                
                     
               
               
            }
            System.out.println("");
        }
        
        
    }

    private static int[][] llenar(int[][] matriz) {
    
        int matrizRetorno [][]= new int[matriz.length][matriz[0].length];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                int n = (int) (Math.random() * 100);
                matrizRetorno[i][j]= n;
            }
        }
        
        return matrizRetorno;
        
        
    
    }
    
   
    
}
