/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.rivaldy.dao;

import id.rivaldy.model.Customer;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author RomyRivaldy
 */
@Repository
@Transactional
public class CustomerService {

    static final Logger logger = Logger.getLogger(CustomerService.class.getName());

    @PersistenceUnit
    EntityManagerFactory emf;

    private EntityManager em;

    @Transactional
    public void saveCustomer(Customer customer) {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(customer);
        em.getTransaction().commit();
        em.close();
    }

    public Customer findByUsername(String username) {
        Customer cus = new Customer();

        try {
            em = emf.createEntityManager();
            Query query = em.createQuery("Select c from Customer c where c.username = :username");
            query.setParameter("username", cus);
            cus = (Customer) query.getSingleResult();
        } catch (NoResultException nre) {
            logger.severe("Username tidak ada");
        }
        return cus;
    }

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }
}
