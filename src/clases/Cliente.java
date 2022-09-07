package clases;

public class Cliente extends Persona {
    
    private String idCliente;
    private double descuento;

    public Cliente() {
    }

    public Cliente(String id, String name, String idCliente, double descuento) {
        super(id, name);
        this.idCliente= idCliente;
        this.descuento= descuento;
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

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", descuento=" + descuento + '}';
    }
    

}
