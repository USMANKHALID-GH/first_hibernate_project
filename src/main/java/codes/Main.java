package codes;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {


        Student student1= new Student();
        student1.setStudentId(1);
        student1.setFirstName("usman");
        student1.setSecondName("khalid");
        student1.setStudentNumber("12499");
        Configuration con= new Configuration().configure().addAnnotatedClass(Student.class);
        SessionFactory sessionFactory=con.buildSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
       session.save(student1);
       transaction.commit();
        System.out.println("hello world");

    }
}
