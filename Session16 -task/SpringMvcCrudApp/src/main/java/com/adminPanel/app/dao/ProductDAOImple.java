package com.adminPanel.app.dao;

import com.adminPanel.app.model.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import javax.transaction.Transactional;
import java.util.List;
@Repository
public class ProductDAOImple implements ProductDAO{
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public List<Product> getAllProducts() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Product", Product.class).getResultList();
    }

    @Override
    @Transactional
    public void addProduct(Product product) {
        Session session = sessionFactory.getCurrentSession();
        session.save(product);
    }

    @Override
    @Transactional
    public void updateProduct(Product product) {
        Session session = sessionFactory.getCurrentSession();

        Product existingProduct = session.get(Product.class, product.getId());
        if(existingProduct != null){
            existingProduct.setName(product.getName());
            existingProduct.setProductDetails(product.getProductDetails());

            session.update(existingProduct);
        }

    }

    @Override
    @Transactional
    public Product findById(int id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Product.class, id);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        Session session = sessionFactory.getCurrentSession();
        Product product = session.get(Product.class, id);
        if (product != null) {
            session.delete(product);
        }
    }

}
