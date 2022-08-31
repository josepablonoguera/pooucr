/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parqueo;

import clases.Person;

/**
 *
 * @author pablonoguera
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Person persona1 = new Person();    
        Person persona2 = new Person(false, null, null, "Maria Perez", "14684987");    
             
        Person vector[] = new Person[2];
        vector[0] = persona1;
        vector[1] = persona2;
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i].toString());
        }
        
    }
    
}
