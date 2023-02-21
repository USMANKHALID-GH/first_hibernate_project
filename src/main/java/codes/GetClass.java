package codes;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class GetClass {
    public static void main(String[] args) {
        Configuration con= new Configuration().configure().addAnnotatedClass(Student.class)
                .addAnnotatedClass(LabTop.class)
                .addAnnotatedClass(Teacher1.class);

        SessionFactory sessionFactory=con.buildSessionFactory();
        Session session=sessionFactory.openSession();
//        Transaction transaction=session.beginTransaction();

        Student student= null;
         student=(Student) session.get(Student.class,7);

        System.out.println("first session is printing..................");
       System.out.println(student.toString());
        System.out.println("transaction  1 is done");
        session.beginTransaction().commit();
        session.clear();
        System.out.println("second session is printing..................");


        Session session1 =sessionFactory.openSession();
        Student student1= session1.get(Student.class,7);
        System.out.println(student1.getLabTop());
        System.out.println("transaction  2 is done");
        session1.beginTransaction().commit();
        session1.clear();


        Session session2 =sessionFactory.openSession();
        Query q1= session2.createQuery("FROM Student ");
        List<Student> student2= q1.list();
        System.out.println(student2.get(1).getLabTop());
        System.out.println("transaction  2 is done");
        session1.beginTransaction().commit();
        session1.clear();

    }
}
