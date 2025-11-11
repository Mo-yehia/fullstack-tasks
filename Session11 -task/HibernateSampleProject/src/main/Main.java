package main;

import main.com.myApp.controller.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main
{
    public static void main(String[] args) {
        // define the Session factory
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate-config.xml")
                .addAnnotatedClass(User.class)
                .buildSessionFactory();

        //define session
        Session session = sessionFactory.getCurrentSession();

        //create user object
        User user = new User();
        user.setFirstName("mohamed");
        user.setLastName("yehia");

        try {

            //open the transaction
            session.beginTransaction();

            //Save object to database
            session.save(user);

            //retrieve object from database
            User user1 = session.get(User.class , 1);
            System.out.println("Retrieved: " + user1.getFirstName() + " " + user1.getLastName());


            //delete the object
//            session.delete(user);

            //commit the changes
            session.getTransaction().commit();
        }catch (Exception exception)
        {
            exception.printStackTrace();
        }finally {
            session.close();
        }

    }
}
