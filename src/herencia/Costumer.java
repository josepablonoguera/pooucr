/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author pablonoguera
 */
public class Costumer extends Person{
    private String idCostumer;
    private String payMethod;
    private double discount;

    public Costumer() {
    }

    public Costumer(String idCostumer, String payMethod, double discount) {
        this.idCostumer = idCostumer;
        this.payMethod = payMethod;
        this.discount = discount;
    }

    
    public Costumer(String idCostumer, String payMethod, double discount, String id, String name, String email, String phone) {
        super(id, name, email, phone);
        this.idCostumer = idCostumer;
        this.payMethod = payMethod;
        this.discount = discount;
    }

    /**
     * @return the idCostumer
     */
    public String getIdCostumer() {
        return idCostumer;
    }

    /**
     * @param idCostumer the idCostumer to set
     */
    public void setIdCostumer(String idCostumer) {
        this.idCostumer = idCostumer;
    }

    /**
     * @return the payMethod
     */
    public String getPayMethod() {
        return payMethod;
    }

    /**
     * @param payMethod the payMethod to set
     */
    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod;
    }

    /**
     * @return the discount
     */
    public double getDiscount() {
        return discount;
    }

    /**
     * @param discount the discount to set
     */
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return super.toString() + " Costumer{" + "idCostumer=" + idCostumer + ", payMethod=" + payMethod + ", discount=" + discount + '}';
    }
    
    
}
