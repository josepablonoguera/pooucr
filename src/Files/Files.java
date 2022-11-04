/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package files;

/**
 *
 * @author pablonoguera
 */
import java.io.BufferedReader;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner; // Import the Scanner class to read text files

public class Files {

    public static void main(String[] args) {

        BufferedReader objReader = null;
        try {
            String strCurrentLine;

            objReader = new BufferedReader(new FileReader("PU.txt", StandardCharsets.UTF_8));
            
            int i =1;
            while ((strCurrentLine = objReader.readLine()) != null) {

              String datos[] = strCurrentLine.split(",");
                 
                    Elector elector = new Elector(datos[0], datos[5] + " " + datos[6] + " " + datos[7]);
                    System.out.println(i+" "+ elector.getCedula()+ " "+elector.getNombreCompleto() );
                    i++;
            }

        } catch (IOException e) {

            e.printStackTrace();

        }
    }
}
