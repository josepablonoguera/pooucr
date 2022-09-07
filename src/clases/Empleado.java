package clases;

public class Empleado extends Persona {
    
    private String idEmpleado;

    public Empleado() {
    }

    public Empleado(String id, String name, String idEm) {
        super(id, name);
        this.idEmpleado = idEm;
    }

    /**
     * @return the idEmpleado
     */
    public String getIdEmpleado() {
        return idEmpleado;
    }

    /**
     * @param idEmpleado the idEmpleado to set
     */
    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    @Override
    public String toString() {
        return "Empleado{" + "idEmpleado=" + idEmpleado + '}';
    }
    
    
    
}
