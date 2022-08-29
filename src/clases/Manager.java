
package clases;

import java.util.Date;

/**
 *
 * @author pablonoguera
 */
public class Manager extends Employee{
    
   private double bonus;

    public Manager(double bonus, String idEmployee, boolean disability, 
            Date birthday, ContactInformation contact, String fullName, 
            String id) {
        super(idEmployee, disability, birthday, contact, fullName, id);
        this.bonus = bonus;
    }

    /**
     * @return the bonus
     */
    public double getBonus() {
        return bonus;
    }

    /**
     * @param bonus the bonus to set
     */
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public Manager(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Manager{" + "bonus=" + bonus + '}';
    }
   
   
   
   
    
}
