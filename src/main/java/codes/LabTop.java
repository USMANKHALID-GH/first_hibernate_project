package codes;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class LabTop {
    @Id
    private  int id;
    private  String labtopName;
    private String labtopYear;
    private int duration;

//    @ManyToOne
//    private  Student student;
}
