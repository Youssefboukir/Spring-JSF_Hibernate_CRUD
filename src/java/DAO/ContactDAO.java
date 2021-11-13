/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Contact;
import java.util.List;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author YOUSSEF
 */
public class ContactDAO {

    public int insert(Contact M) {
        Session s = NewHibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = s.beginTransaction();
        s.persist(M);
        tx.commit();
        return 0;
    }

    public int update(Contact M) {
        Session s3 = NewHibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = s3.beginTransaction();
        s3.update(M);
        tx.commit();
        return 0;
    }

    public int delete(int id) {
        Session s2 = NewHibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = s2.beginTransaction();
        Contact p1 = (Contact) s2.load(Contact.class, new Integer(id));
        if (p1 != null) {
            s2.delete(p1);
        }
        tx.commit();
        return 0;
    }

    public Contact getone(Contact M) {
        Session s5 = NewHibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = s5.beginTransaction();
        int id = M.getId();
        Contact p1 = (Contact) s5.get(Contact.class, new Integer(id));
        tx.commit();
        return p1;
    }

    public List<Contact> Select() {
        Session s1 = NewHibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tx = s1.beginTransaction();
        List<Contact> ContactList = s1.createQuery("from Contact").list();
        tx.commit();
        return ContactList;
    }

}
