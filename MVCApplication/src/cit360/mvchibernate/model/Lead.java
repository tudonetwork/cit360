
package cit360.mvchibernate.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/* CIT 360
 * @author: RAMON ANDRADE @2019
 * 
 * */

@Entity
@Table(name="LEADS_TABLE")
public class Lead implements Serializable {
    
    @Id @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phonenumber;
    private String country;

    public Lead() {
    }

    
    public Lead(String firstName, String lastName, String email, String phonenumber, String country) {
        this.firstName = firstName;
        this.phonenumber = phonenumber;
        this.lastName = lastName;
        this.email = email;
        this.country = country;
    }


    public Long getId() {
        return id;
    }

     public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getPhoneNumber() {
        return phonenumber;
    }

    public void setPhoneNumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
       
}
