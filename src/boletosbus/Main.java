/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletosbus;

import clases.Cliente;
import clases.Empleado;
import clases.Persona;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author pablonoguera
 */
public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static Persona[] personas;
    static int i = 0;

    public static void main(String[] args) throws IOException {
        System.out.println("Ingrese la cantidad de Personas: ");
        int tam = Integer.parseInt(br.readLine());
        personas = new Persona[tam];
        menu();

    }

    private static void menu() {
        System.out.println("Bienvenido al Sistema");
        System.out.println("Opción 1: Registrar Personas");

        try {

            int opc = Integer.parseInt(br.readLine());

            switch (opc) {
                case 1:
                    if (i < personas.length) {
                        Persona p = fabricaPersonas();
                        personas[i] = p;
                        i++;
                    }else{
                        System.out.println("LLego al limite de personas");
                    }
                    menu();
                    break;
                default: {
                    menu();
                }
            }

        } catch (IOException iOException) {
        } catch (NumberFormatException numberFormatException) {
        }

    }

    private static Persona fabricaPersonas() throws IOException {

        System.out.println("Nombre: ");
        String nombre = br.readLine();
        System.out.println("Id: ");
        String id = br.readLine();

        return new Persona(id, nombre);
    }

}
