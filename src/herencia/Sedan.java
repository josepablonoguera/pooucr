/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author pablonoguera
 */
public class Sedan extends Combustion {
    
    private String style;

    public Sedan(String style) {
        this.style = style;
    }

    public Sedan(String style, int cylinderCapacity, double tankCapacity, String typeCombustion) {
        super(cylinderCapacity, tankCapacity, typeCombustion);
        this.style = style;
    }

    public Sedan(String style, int cylinderCapacity, double tankCapacity, String typeCombustion, int capacity, double weight, String brand, String color, String model, String transmission, String vim) {
        super(cylinderCapacity, tankCapacity, typeCombustion, capacity, weight, brand, color, model, transmission, vim);
        this.style = style;
    }

    /**
     * @return the style
     */
    public String getStyle() {
        return style;
    }

    /**
     * @param style the style to set
     */
    public void setStyle(String style) {
        this.style = style;
    }

    @Override
    public String toString() {
        return super.toString() +"Sedan{" + "style=" + style + '}';
    }

    
    
   
    

}
