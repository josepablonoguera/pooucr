/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrays;

/**
 *
 * @author pablonoguera
 */
public class ArryasUCR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       double [] notas ={100,50,60,80,100};
       System.out.println("Tamaño: "+ notas.length);
      
        double sumatoria = 0.0;
        
        for (int i = 0; i < notas.length; i++) {
            sumatoria += notas[i];
             System.out.println("Notas["+i+"]: "+notas[i]);
        }
        System.out.println("Sumatoria: "+ sumatoria);
        System.out.println("Promedio: "+ sumatoria / notas.length);
        
   
    }
    
}












