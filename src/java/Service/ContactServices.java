


package Service;

import DAO.ContactDAO;
import Model.Contact;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean(name = "ContactServices")
@SessionScoped
public class ContactServices {
    ContactDAO dao;

    public ContactDAO getDao() {
        return dao;
    }

    public void setDao(ContactDAO dao) {
        this.dao = dao;
    }

    public ContactServices() {
        dao = new ContactDAO();   
    }
    public void Ajouter( Contact M) {
        dao.insert(M);     
    }
    public void Supprimer(int id) {
        dao.delete(id);
    }
    public void Modifier(Contact M) {
        dao.update(M);
    }
    public List<Contact> SelectContact() {
        List<Contact> cont=dao.Select();
        return cont;
    } 
}
