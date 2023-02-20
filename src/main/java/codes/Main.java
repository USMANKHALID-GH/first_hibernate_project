package codes;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.spi.SessionFactoryServiceRegistryBuilder;

public class Main {
    public static void main(String[] args) {
        Configuration con= new Configuration().configure().addAnnotatedClass(Student.class);

        SessionFactory sessionFactory=con.buildSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();

//
//        Student student1= new Student();
//        student1.setStudentId(1);
//        student1.setFirstName("usman");
//        student1.setSecondName("khalid");
//        student1.setStudentNumber("12499");

//        Student student0= new Student();
//        student1.setStudentId(2);
//        student1.setFirstName("usman");
//        student1.setSecondName("khalid");
//        student1.setStudentNumber("12499");


        Student student= new Student();
        student.setStudentId(3);
        student.setFirstName("usman");
        student.setSecondName("khalid");
        student.setStudentNumber("12499");



       session.save(student);
       transaction.commit();
        System.out.println("hello world");

    }
}
