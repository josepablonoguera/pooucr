/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author pablonoguera
 */
public class Seller extends Person {
    
    private String idSeller;    
    private User user;

    public Seller() {
    }

    public Seller(String idSeller, User user) {
        this.idSeller = idSeller;
        this.user = user;
    }

    public Seller(String idSeller, User user, String id, String name) {
        super(id, name);
        this.idSeller = idSeller;
        this.user = user;
    }

    public Seller(String idSeller, User user, String id, String name,
            String email, String phone) {
        super(id, name, email, phone);
        this.idSeller = idSeller;
        this.user = user;
    }

    /**
     * @return the idSeller
     */
    public String getIdSeller() {
        return idSeller;
    }

    /**
     * @param idSeller the idSeller to set
     */
    public void setIdSeller(String idSeller) {
        this.idSeller = idSeller;
    }

    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return super.toString()+ " Seller{" + "idSeller=" + idSeller + ", user=" + user + '}';
    }

   

    
}
