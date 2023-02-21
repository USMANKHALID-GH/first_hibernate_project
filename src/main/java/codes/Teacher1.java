package codes;



import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Teacher1 {
    @Id
    private int  teacherId;
    private String teachersName;
    private String teacherSubject;
    private String teacherCode;
    private String telefonNumber;

    public Teacher1(int teacherId, String teachersName, String teacherSubject, String teacherCode, String telefonNumber) {
        this.teacherId = teacherId;
        this.teachersName = teachersName;
        this.teacherSubject = teacherSubject;
        this.teacherCode = teacherCode;
        this.telefonNumber = telefonNumber;
    }

    public Teacher1() {

    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", teachersName='" + teachersName + '\'' +
                ", teacherSubject='" + teacherSubject + '\'' +
                ", teacherCode='" + teacherCode + '\'' +
                ", telefonNumber='" + telefonNumber + '\'' +
                '}';
    }

    public String getTeachersName() {
        return teachersName;
    }

    public void setTeachersName(String teachersName) {
        this.teachersName = teachersName;
    }

    public String getTeacherSubject() {
        return teacherSubject;
    }

    public void setTeacherSubject(String teacherSubject) {
        this.teacherSubject = teacherSubject;
    }

    public String getTeacherCode() {
        return teacherCode;
    }

    public void setTeacherCode(String teacherCode) {
        this.teacherCode = teacherCode;
    }

    public String getTelefonNumber() {
        return telefonNumber;
    }

    public void setTelefonNumber(String telefonNumber) {
        this.telefonNumber = telefonNumber;
    }
}
