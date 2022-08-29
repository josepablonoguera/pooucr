
package parqueo;

import clases.Costumer;
import clases.Manager;
import clases.Person;
import java.util.ArrayList;

/**
 *
 * @author pablonoguera
 */
public class Principal {

    ArrayList <Person> persons = new ArrayList();
    
    public static void main(String[] args) {
       persons.add(new Costumer(idCostumer, 0, paymentType, true, birthday, 
               contact, fullName, id));
       persons.add(new Manager(0, idEmployee, true, birthday, contact, fullName, id));
    }
    
}
