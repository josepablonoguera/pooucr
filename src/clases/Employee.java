/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.Date;

/**
 *
 * @author pablonoguera
 */
public class Employee extends Person {
    
    private String idEmployee;  

    public Employee(String idEmployee, boolean disability, Date birthday, 
            ContactInformation contact, String fullName, String id) {
        super(disability, birthday, contact, fullName, id);
        this.idEmployee = idEmployee;
    }

    /**
     * @return the idEmployee
     */
    public String getIdEmployee() {
        return idEmployee;
    }

    /**
     * @param idEmployee the idEmployee to set
     */
    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
    }

    public Employee(String idEmployee) {
        this.idEmployee = idEmployee;
    }

    @Override
    public String toString() {
        return "Employee{" + "idEmployee=" + idEmployee + '}';
    }
    
    
    
    
    
}
