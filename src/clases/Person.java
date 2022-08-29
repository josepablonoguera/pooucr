
package clases;

import java.util.Date;

/**
 * 
 * @author pablonoguera
 */
public class Person {
    
    private boolean disability;     
     
    private Date birthday;
    
    private ContactInformation contact;
    
    private String fullName;
    private String id;    

    public Person() {
    }

    public Person(boolean disability, Date birthday, ContactInformation contact,
            String fullName, String id) {
        this.disability = disability;
        this.birthday = birthday;
        this.contact = contact;
        this.fullName = fullName;
        this.id = id;
    }

    /**
     * @return the disability
     */
    public boolean isDisability() {
        return disability;
    }

    /**
     * @param disability the disability to set
     */
    public void setDisability(boolean disability) {
        this.disability = disability;
    }

    /**
     * @return the birthday
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * @param birthday the birthday to set
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * @return the contact
     */
    public ContactInformation getContact() {
        return contact;
    }

    /**
     * @param contact the contact to set
     */
    public void setContact(ContactInformation contact) {
        this.contact = contact;
    }

    /**
     * @return the fullName
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * @param fullName the fullName to set
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" + "disability=" + disability + ", birthday=" + birthday + ", contact=" + contact + ", fullName=" + fullName + ", id=" + id + '}';
    }
    

    
}
