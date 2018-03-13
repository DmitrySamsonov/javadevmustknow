package edu.javatutorials.javadevmustknow._05___Hibernate._5_1___Session_Factory;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CreateSessionFactory {

    public static void main(String[] args) {
        start();
    }

    private static void start() {

        Configuration configuration = new Configuration();

        configuration.configure("hibernate.cfg.xml");

//        try {

//            ServiceRegistry serviceRegistry = new ServiceRegistryBuilder()
//                    .applySettings(configuration.getProperties())
//                    .buildServiceRegistry();

            SessionFactory sessionFactory = configuration.buildSessionFactory();
//        } catch (Throwable ex) {
//            System.err.println("Failed to create sessionFactory object." + ex);
//            throw new ExceptionInInitializerError(ex);
//        }
        System.out.println("all good!");

        Session session = sessionFactory.openSession();
        Transaction tx = null;
        Integer employeeID = null;

        try {
            tx = session.beginTransaction();
            Employee category = new Employee();
            category.setFirstName("mitya");
            category.setLastName("sam");
            category.setSalary(90);
            employeeID = (Integer) session.save(category);
            tx.commit();
        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }


}
