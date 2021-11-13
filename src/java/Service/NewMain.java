/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.Contact;
import java.util.List;

/**
 *
 * @author YOUSSEF
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContactServices sr=new ContactServices();
        List<Contact> ct=sr.SelectContact();
        for(Contact c:ct){
            System.out.println(c.getNom());
        }
    }
    
}
