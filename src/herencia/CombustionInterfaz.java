/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package herencia;

/**
 *
 * @author pablonoguera
 */
public interface CombustionInterfaz {

    /**
     * @return the cylinderCapacity
     */
    int getCylinderCapacity();

    /**
     * @return the tankCapacity
     */
    double getTankCapacity();

    /**
     * @return the typeCombustion
     */
    String getTypeCombustion();

    /**
     * @param cylinderCapacity the cylinderCapacity to set
     */
    void setCylinderCapacity(int cylinderCapacity);

    /**
     * @param tankCapacity the tankCapacity to set
     */
    void setTankCapacity(double tankCapacity);

    /**
     * @param typeCombustion the typeCombustion to set
     */
    void setTypeCombustion(String typeCombustion);
    
}
