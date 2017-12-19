package id.rivaldy.dao;

import id.rivaldy.model.Product;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

/**
 *
 * @author RomyRivaldy
 */
@Repository
@Transactional
public class ProductService {

    @PersistenceContext
    EntityManager em;

    public ProductService() {
    }

    public ProductService(EntityManager em) {
        this.em = em;
    }
    
    @Transactional
    public void register(Product pro){
        this.em.persist(pro);
    }
    
    public List<Product> findAll(){
        List<Product> product;
        product = this.em.createNamedQuery("Product.findAll").getResultList();
        return product;
    }
    
    public Product findById(Integer productId){
        return em.find(Product.class, productId);
    }
}
