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
public class Costumer extends Person {
    
      private String idCostumer;
      private double discount;
      private String paymentType;

    public Costumer(String idCostumer, double discount, String paymentType, 
            boolean disability, Date birthday, ContactInformation contact, 
            String fullName, String id) {
        super(disability, birthday, contact, fullName, id);
        this.idCostumer = idCostumer;
        this.discount = discount;
        this.paymentType = paymentType;
    }

    public Costumer(String idCostumer, double discount, String paymentType) {
        this.idCostumer = idCostumer;
        this.discount = discount;
        this.paymentType = paymentType;
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

    /**
     * @return the paymentType
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * @param paymentType the paymentType to set
     */
    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    @Override
    public String toString() {
        return "Costumer{" + "idCostumer=" + idCostumer + ", discount=" + discount + ", paymentType=" + paymentType + '}';
    }
      
     
      
    
}
