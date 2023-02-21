package codes;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    private  String streetCode;
    private  String steetName;
    private String country;
    private  String CityCode;
}
