package Model;
// Generated 29 avr. 2021 23:38:53 by Hibernate Tools 4.3.1

import javax.faces.bean.ManagedBean;




/**
 * Contact generated by hbm2java
 */

@ManagedBean(name = "Contact")
public class Contact  implements java.io.Serializable {


     private int id;
     private String nom;
     private String prenom;
     private String email;

    public Contact() {
    }


    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getNom() {
        return this.nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return this.prenom;
    }
    
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + '}';
    }

}

