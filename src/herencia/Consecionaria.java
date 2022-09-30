/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia;

/**
 *
 * @author pablonoguera
 */
public class Consecionaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehicle inventary [] = new Vehicle[3];
        
        Electric tesla = new Electric(500.0, 1000.0, 5, 2000,"Tesla" , "Gris", "Ultra Cyber", "Dual", "324234sdf");
        Sedan  carro = new Sedan("Hachback", 0, 0, "Gasolina", 0, 0, "Toyota", "Rojo", "Yaris", "Manual", "sdmfm8e489");
        Combustion chapulin = new Combustion(5000, 2000.0, "Diesel", 0, 0, "John Deere", "Verde", "5e", "Manual", "sdjkfds84348");
        
        inventary[0]= tesla;
        inventary[1]= carro;
        inventary[2]= chapulin;
        
        for (int i = 0; i < inventary.length; i++) {
            
            System.out.println(inventary[i].getClass().getSimpleName());
            
            if (inventary[i].getClass().getSimpleName().equalsIgnoreCase("Electric")) {
                System.out.println(inventary[i]);
            }
//            
        }
        
        
        
           
        
    }
    
}
