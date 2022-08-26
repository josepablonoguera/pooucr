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
public class Cliente extends Persona{
    
      private String idCliente;
      private double descuento;
       //Metodo de pago
      private String tipoPago;

    public Cliente(String idCliente, double descuento, String tipoPago) {
        this.idCliente = idCliente;
        this.descuento = descuento;
        this.tipoPago = tipoPago;
    }

    public Cliente(String idCliente, double descuento,
            String tipoPago, String cedula, String nombreCompleto,
            Date fechaNacimiento, boolean discapacidad, String telefono,
            String direccion, String correoElectronico) {
        super(cedula, nombreCompleto, fechaNacimiento, 
                discapacidad, telefono, direccion, correoElectronico);
        
        this.idCliente = idCliente;
        this.descuento = descuento;
        this.tipoPago = tipoPago;
    }

    /**
     * @return the idCliente
     */
    public String getIdCliente() {
        return idCliente;
    }

    /**
     * @param idCliente the idCliente to set
     */
    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * @return the descuento
     */
    public double getDescuento() {
        return descuento;
    }

    /**
     * @param descuento the descuento to set
     */
    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    /**
     * @return the tipoPago
     */
    public String getTipoPago() {
        return tipoPago;
    }

    /**
     * @param tipoPago the tipoPago to set
     */
    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", descuento=" + descuento + ", tipoPago=" + tipoPago + '}';
    }

   
      
      
      
    
}
