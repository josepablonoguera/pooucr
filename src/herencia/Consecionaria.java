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

    static SibajaSystem mySystem;

    private static boolean disponibilidad(Vehicle[] inventary, int i) {
        if (i < inventary.length) {

            if (inventary[i] == null) {
                return true;
            }
        }else{
        
            System.out.println("No hay espacios disponibles");
        
        }
        return false;

    }

    public Consecionaria() {

        mySystem = new SibajaSystem();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Vehicle inventary[] = new Vehicle[4];
            Person persons[] = new Person[4];

            Electric tesla = new Electric(500.0, 1000.0, 5, 2000, "Tesla", "Gris", "Ultra Cyber", "Dual", "324234sdf");
            Sedan carro = new Sedan("Hachback", 0, 0, "Gasolina", 6, 0, "Toyota", "Rojo", "Yaris", "Manual", "sdmfm8e489");
            Combustion chapulin = new Combustion(5000, 2000.0, "Diesel", 0, 0, "John Deere", "Verde", "5e", "Manual", "sdjkfds84348");
            Hybrid corolla = new Hybrid(5, 3, "Toyota", "Blanco", "Corrolla Hy", "Manual", "sd56f4sd");

            try {

                if (disponibilidad(inventary, 0)) {
                    inventary[0] = tesla;
                } else {
                    System.out.println("El campo 0 esta ocupado");
                }
                if (disponibilidad(inventary, 1)) {
                    inventary[1] = carro;
                } else {
                    System.out.println("El campo 1 esta ocupado");
                }
                if (disponibilidad(inventary, 2)) {
                    inventary[2] = chapulin;
                } else {
                    System.out.println("El campo 2 esta ocupado");
                }

                if (disponibilidad(inventary, 3)) {
                    inventary[3] = corolla;
                } else {
                    System.out.println("El campo 3 esta ocupado");
                }
                if (disponibilidad(inventary, 4)) {
                    inventary[4] = corolla;
                } else {
                    System.out.println("El campo 4 esta ocupado");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getLocalizedMessage());
                System.out.println("Inventario lleno");
            }

            try {

                mySystem.setPersons(persons);
                mySystem.setVehicles(inventary);
            } catch (Exception e) {
                System.out.println("problema en persons");
            }

            for (int i = 0; i < inventary.length; i++) {
                System.out.println("Carro Sedan: ");
                if (inventary[i] instanceof Sedan) {
                    Sedan car = (Sedan) inventary[i];

                    System.out.println(car.getStyle());

                }

                if (inventary[i] instanceof Electric) {
                    System.out.println("Carro Electrico: ");
                    Electric car = (Electric) inventary[i];

                    System.out.println(car.getBatteryCharge());
                    System.out.println(car.getChargeVelocity());

                }

                if (inventary[i] instanceof Combustion) {
                    System.out.println("Carro Combustion: ");
                    Combustion car = (Combustion) inventary[i];

                    System.out.println(car.getCylinderCapacity());
                    System.out.println(car.getTankCapacity());
                    System.out.println(car.getTypeCombustion());

                }

                if (inventary[i] instanceof Hybrid) {
                    System.out.println("Carro Hybrid: ");
                    Hybrid car = (Hybrid) inventary[i];

                    try {
                        System.out.println(car.getCylinderCapacity());
                        System.out.println(car.getTankCapacity());
                        System.out.println(car.getTypeCombustion());

                    } catch (Exception e) {
                        System.out.println("Fallo al imprimir datos del hibrido");
                    }

                }

            }

        } catch (Exception e) {

            System.out.println(e.getCause());
            System.out.println("\n" + e.getLocalizedMessage());
            System.out.println("\n" + e.getMessage());
            System.out.println("\n" + e.toString());
            e.printStackTrace();

        }

    }

}
