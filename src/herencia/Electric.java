/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author pablonoguera
 */
public class Electric extends Vehicle implements ElectricInterfaz  {
    
    private double batteryCharge;
    private double chargeVelocity;

    public Electric() {
    }

    public Electric(double batteryCharge, double chargeVelocity) {
        this.batteryCharge = batteryCharge;
        this.chargeVelocity = chargeVelocity;
    }

    public Electric(double batteryCharge, double chargeVelocity, int capacity
            , double weight, String brand, String color, String model, 
            String transmission, String vim) {
        super(capacity, weight, brand, color, model, transmission, vim);
        this.batteryCharge = batteryCharge;
        this.chargeVelocity = chargeVelocity;
    }

    /**
     * @return the batteryCharge
     */
    
    @Override
    public double getBatteryCharge() {
        return batteryCharge;
    }

    /**
     * @param batteryCharge the batteryCharge to set
     */
    
    @Override
    public void setBatteryCharge(double batteryCharge) {
        this.batteryCharge = batteryCharge;
    }

    /**
     * @return the chargeVelocity
     */
    
    @Override
    public double getChargeVelocity() {
        return chargeVelocity;
    }

    /**
     * @param chargeVelocity the chargeVelocity to set
     */
    
    @Override
    public void setChargeVelocity(double chargeVelocity) {
        this.chargeVelocity = chargeVelocity;
    }

    @Override
    public String toString() {
        return super.toString() + "Electric{" + "batteryCharge=" + batteryCharge 
                + ", chargeVelocity=" + chargeVelocity + '}';
    }
    
    
    
    
    
    
}
