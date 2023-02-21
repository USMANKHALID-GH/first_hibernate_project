package codes;


import lombok.Data;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;


import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Student {
    @Id
    private int StudentId;
    private String firstName;
    private String secondName;
    private String studentNumber;
    @Embedded
    private  Address address;
//    @OneToMany(mappedBy = "student")
    @OneToOne(fetch = FetchType.EAGER)
    private LabTop labTop;

    @Override
    public String toString() {
        return "Student{" +
                "StudentId=" + StudentId +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", studentNumber='" + studentNumber + '\'' +
                '}';
    }

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }
}
