/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author pablonoguera
 */
public class SibajaSystem {
    
    private Person [] persons;
    private Vehicle [] vehicles;   

    public SibajaSystem() {
        persons = new Person[4];
        
    }

    public SibajaSystem(Person[] persons, Vehicle[] vehicles) {
        this.persons = persons;
        this.vehicles = vehicles;
    }

    /**
     * @return the persons
     */
    public Person[] getPersons() {
        return persons;
    }

    /**
     * @param persons the persons to set
     */
    public void setPersons(Person[] persons) {
        this.persons = persons;
    }

    /**
     * @return the vehicles
     */
    public Vehicle[] getVehicles() {
        return vehicles;
    }

    /**
     * @param vehicles the vehicles to set
     */
    public void setVehicles(Vehicle[] vehicles) {
        this.vehicles = vehicles;
    }
    
    
}
