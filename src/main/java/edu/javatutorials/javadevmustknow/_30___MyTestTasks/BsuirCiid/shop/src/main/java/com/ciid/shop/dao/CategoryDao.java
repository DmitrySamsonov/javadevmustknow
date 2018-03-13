package com.ciid.shop.dao;

import com.ciid.shop.model.Category;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;

@Repository
public class CategoryDao {

    private static SessionFactory factory;

    @PostConstruct
    private void init(){
        try {
            Configuration configuration =  new Configuration();
            configuration.configure("hibernate.cfg.xml");


            factory = configuration.buildSessionFactory();
//            factory = new AnnotationConfiguration().
//                    configure().
//                    addPackage("com.xyz") //add package if used.
//                            addAnnotatedClass(Category.class).
//                            buildSessionFactory();
        } catch (Exception ex) {
            System.err.println("Failed to create sessionFactory object." + ex);
            throw new ExceptionInInitializerError(ex);
        }
        System.out.println("all god");
    }

    public Integer insert(String categoryName){
        Session session = factory.openSession();
        Transaction tx = null;
        Integer employeeID = null;

        try {
            tx = session.beginTransaction();
            Category category = new Category();
            category.setName(categoryName);
            employeeID = (Integer) session.save(category);
            tx.commit();
        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return employeeID;
    }

    public void updateById(){

    }
    public void updateByName(){

    }

    public void deleteById(){

    }
    public void deleteByName(){

    }


    public void selectAll(){

    }

    public void selectById(){

    }

    public void selectByName(){

    }
}
