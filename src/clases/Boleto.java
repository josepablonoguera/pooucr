package clases;


import java.util.Date;

public class Boleto {

    private Date fecha;

    private Bus unidadBus;

    private String numeroAsiento;

    public Boleto(Date fecha, Bus unidadBus, String numeroAsiento) {
        this.fecha = fecha;
        this.unidadBus = unidadBus;
        this.numeroAsiento = numeroAsiento;
    }

    public Boleto() {
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the unidadBus
     */
    public Bus getUnidadBus() {
        return unidadBus;
    }

    /**
     * @param unidadBus the unidadBus to set
     */
    public void setUnidadBus(Bus unidadBus) {
        this.unidadBus = unidadBus;
    }

    /**
     * @return the numeroAsiento
     */
    public String getNumeroAsiento() {
        return numeroAsiento;
    }

    /**
     * @param numeroAsiento the numeroAsiento to set
     */
    public void setNumeroAsiento(String numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    @Override
    public String toString() {
        return "Boleto{" + "fecha=" + fecha + ", unidadBus=" + unidadBus + ", numeroAsiento=" + numeroAsiento + '}';
    }
    
    
    
}
