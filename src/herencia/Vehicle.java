/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author pablonoguera
 */
public class Vehicle {

    private int capacity;
    private double weight;

    private String brand;
    private String color;
    private String model;
    private String transmission;
    private String vim;
    
    
//    tipo de combustible;

    public Vehicle() {
    }

    public Vehicle(int capacity, double weight, String brand, String color, 
            String model, String transmission, String vim) {
        this.capacity = capacity;
        this.weight = weight;
        this.brand = brand;
        this.color = color;
        this.model = model;
        this.transmission = transmission;
        this.vim = vim;
    }

    /**
     * @return the capacity
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * @param capacity the capacity to set
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * @return the weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the transmission
     */
    public String getTransmission() {
        return transmission;
    }

    /**
     * @param transmission the transmission to set
     */
    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    /**
     * @return the vim
     */
    public String getVim() {
        return vim;
    }

    /**
     * @param vim the vim to set
     */
    public void setVim(String vim) {
        this.vim = vim;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "capacity=" + capacity + ", weight=" + weight + ", brand=" + brand + ", color=" + color + ", model=" + model + ", transmission=" + transmission + ", vim=" + vim + '}';
    }

    
}
