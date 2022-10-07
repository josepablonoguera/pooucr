/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author pablonoguera
 */
public class Hybrid extends Vehicle implements ElectricInterfaz, CombustionInterfaz, SedanInterface{
    
    private double chargeVelocity;

    @Override
    public double getBatteryCharge() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getChargeVelocity() {
       return chargeVelocity;
    }

    @Override
    public void setBatteryCharge(double batteryCharge) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setChargeVelocity(double chargeVelocity) {
        this.chargeVelocity = chargeVelocity;
    }

    @Override
    public int getCylinderCapacity() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getTankCapacity() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getTypeCombustion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setCylinderCapacity(int cylinderCapacity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setTankCapacity(double tankCapacity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setTypeCombustion(String typeCombustion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Hybrid() {
    }

    public Hybrid(int capacity, double weight, String brand, String color, String model, String transmission, String vim) {
        super(capacity, weight, brand, color, model, transmission, vim);
    }

    @Override
    public String getStyle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setStyle(String style) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
