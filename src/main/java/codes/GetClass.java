package codes;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class GetClass {
    public static void main(String[] args) {
        Configuration con= new Configuration().configure().addAnnotatedClass(Student.class);

        SessionFactory sessionFactory=con.buildSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();

        Student student= null;
         student=(Student) session.get(Student.class,1);

        System.out.println(student.toString());
        System.out.println("transaction is done");
        transaction.commit();
    }
}
