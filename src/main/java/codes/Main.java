package codes;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.spi.SessionFactoryServiceRegistryBuilder;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Configuration con= new Configuration()
                .configure().
                addAnnotatedClass(Student.class).
                addAnnotatedClass(LabTop.class)
                .addAnnotatedClass(Teacher1.class);

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
//
//         Address address= new Address("123","123","344","344");
//
//        Student student= new Student();
//        student.setStudentId(7);
//        student.setFirstName("usman");
//        student.setSecondName("khalid");
//        student.setStudentNumber("12499");
//        student.setAddress(address);
//        LabTop labTop= new LabTop();
//        labTop.setDuration(12);
//        labTop.setId(1);
//        labTop.setLabtopYear("2012");
//        student.setLabTop(labTop);


        Teacher1 teacher = new Teacher1();
        teacher.setTeacherId(3);
        teacher.setTeachersName("usman");

        teacher.setTeacherCode("12hg");
        teacher.setTelefonNumber("13454433");
        teacher.setTeacherSubject("usjsj");



//        session.save(labTop);
       session.save(teacher);
       transaction.commit();
        System.out.println("hello world");

    }
}
