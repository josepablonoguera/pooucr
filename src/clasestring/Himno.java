/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasestring;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * @author pablonoguera
 */
public class Himno {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
//fondos
    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException{
        pintarAntorcha();
   
        
        

        while (true) {            
            ejecutarHimno();
        }
        

    }

   
    /**
     * 
     */
    public static void ejecutarHimno() {
      String datos = "Letra: José María Zeledón , Música: Manuel María Gutiérrez";
        System.out.println("");
        System.out.println(ANSI_RED_BACKGROUND + ANSI_WHITE + "Himno Nacional de Costa Rica");
        System.out.println("");
        System.out.println(ANSI_BLUE_BACKGROUND+"                         ");
        System.out.println(ANSI_WHITE_BACKGROUND+"                         ");
        System.out.println(ANSI_RED_BACKGROUND+"                         ");
        System.out.println(ANSI_WHITE_BACKGROUND+"                         ");
        System.out.println(ANSI_BLUE_BACKGROUND+"                         ");
        System.out.println("");
        String letra = datos.split(",")[0].split(":")[1].trim();
        System.out.println("Letra: " + letra);

        String musica = datos.split(",")[1].split(":")[1].trim();
        System.out.println("Música: " + musica);

        String cancion
                = "Noble patria, tu hermosa bandera "
                + "- expresión de tu vida nos da; "
                + "- bajo el límpido azul de tu cielo"
                + " - blanca y pura descansa la paz."
                + "#"
                + "En la lucha tenaz, de fecunda labor "
                + "- que enrojece del hombre la faz, "
                + "- conquistaron tus hijos labriegos sencillos "
                + "- eterno prestigio, estima y honor.\n"
                + "#"
                + "¡Salve, oh tierra gentil! "
                + "- ¡Salve, oh madre de amor! "
                + "- Cuando alguno pretenda "
                + "- tu gloria manchar, "
                + "- verás a tu pueblo valiente y viril, "
                + "- la tosca herramienta en arma trocar.\n"
                + "#"
                + "Salve oh Patria tú pródigo suelo, "
                + "- dulce abrigo y sustento nos da; "
                + "- bajo el límpido azul de tu cielo "
                + "- ¡vivan siempre el trabajo y la paz!";

        System.out.println("");
        int velocidad=100;
        String estrofas[] = cancion.split("#");
        for (int i = 0; i < estrofas.length; i++) {
            if (i==2) {
                velocidad = velocidad + 800;
            }
           
            String[] lineas = estrofas[i].split("-");
            for (int j = 0; j < lineas.length; j++) {
                
                if (i==2 && j == 2) {
                    velocidad= velocidad - 800;
                }
                String[] palabras = lineas[j].split(" ");
                for (int k = 0; k < palabras.length; k++) {

                    try {
                        Thread.sleep(velocidad);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Himno.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    pintar(palabras[k], i);
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
    /**
     * 
     * @param linea
     * @param parrafo 
     */
    public static void pintar(String linea, int parrafo){
    
        if (parrafo == 0) {
            System.out.print(ANSI_BLUE_BACKGROUND +" "+ linea);
        }
         if (parrafo == 1) {
            System.out.print(ANSI_WHITE_BACKGROUND +" "+ linea);
        }
          if (parrafo == 2) {
            System.out.print(ANSI_RED_BACKGROUND + " "+linea);
        }
            if (parrafo == 3) {
            System.out.print(ANSI_BLUE_BACKGROUND + " "+linea);
        }
    }
    /**
     * 
     */
    public static void pintarAntorcha(){
    
        System.out.println(ANSI_WHITE_BACKGROUND+"  "+ANSI_GREEN_BACKGROUND+"  "+ANSI_RED_BACKGROUND+"  "+ANSI_GREEN_BACKGROUND+"  "+ANSI_WHITE_BACKGROUND+"  ");
        System.out.println(ANSI_WHITE_BACKGROUND+"  "+ANSI_GREEN_BACKGROUND+"      "+ANSI_WHITE_BACKGROUND+"  ");
        System.out.println(ANSI_WHITE_BACKGROUND+"   "+ANSI_GREEN_BACKGROUND+"    "+ANSI_WHITE_BACKGROUND+"   ");
        System.out.println(ANSI_WHITE_BACKGROUND+"   "+ANSI_GREEN_BACKGROUND+"    "+ANSI_WHITE_BACKGROUND+"   ");
        System.out.println(ANSI_WHITE_BACKGROUND+"   "+ANSI_GREEN_BACKGROUND+"    "+ANSI_WHITE_BACKGROUND+"   ");
        System.out.println(ANSI_WHITE_BACKGROUND+"   "+ANSI_GREEN_BACKGROUND+"    "+ANSI_WHITE_BACKGROUND+"   ");
        System.out.println(ANSI_WHITE_BACKGROUND+"   "+ANSI_GREEN_BACKGROUND+"    "+ANSI_WHITE_BACKGROUND+"   ");
        System.out.println(ANSI_WHITE_BACKGROUND+"   "+ANSI_GREEN_BACKGROUND+"    "+ANSI_WHITE_BACKGROUND+"   ");

        
        
        
    
    
    
    
    }
}
