/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author pablonoguera
 */
public class Combustion extends Vehicle implements CombustionInterfaz{
    
    private int cylinderCapacity;
    private double tankCapacity;
    private String typeCombustion;

    public Combustion() {
    }

    public Combustion(int cylinderCapacity, double tankCapacity, String typeCombustion) {
        this.cylinderCapacity = cylinderCapacity;
        this.tankCapacity = tankCapacity;
        this.typeCombustion = typeCombustion;
    }

    public Combustion(int cylinderCapacity, double tankCapacity, String typeCombustion, int capacity, double weight, String brand, String color, String model, String transmission, String vim) {
        super(capacity, weight, brand, color, model, transmission, vim);
        this.cylinderCapacity = cylinderCapacity;
        this.tankCapacity = tankCapacity;
        this.typeCombustion = typeCombustion;
    }

    /**
     * @return the cylinderCapacity
     */
    @Override
    public int getCylinderCapacity() {
        return cylinderCapacity;
    }

    /**
     * @param cylinderCapacity the cylinderCapacity to set
     */
    @Override
    public void setCylinderCapacity(int cylinderCapacity) {
        this.cylinderCapacity = cylinderCapacity;
    }

    /**
     * @return the tankCapacity
     */
    @Override
    public double getTankCapacity() {
        return tankCapacity;
    }

    /**
     * @param tankCapacity the tankCapacity to set
     */
    @Override
    public void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    /**
     * @return the typeCombustion
     */
    @Override
    public String getTypeCombustion() {
        return typeCombustion;
    }

    /**
     * @param typeCombustion the typeCombustion to set
     */
    @Override
    public void setTypeCombustion(String typeCombustion) {
        this.typeCombustion = typeCombustion;
    }

    @Override
    public String toString() {
        return super.toString() + "Combustion{" + "cylinderCapacity=" 
                + cylinderCapacity + ", tankCapacity=" + tankCapacity 
                + ", typeCombustion=" + typeCombustion + '}';
    }
    
    
    
    
}
