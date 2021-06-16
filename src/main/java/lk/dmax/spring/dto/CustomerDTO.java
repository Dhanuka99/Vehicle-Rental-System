package lk.dmax.spring.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CustomerDTO {

    private String customerNic;
    private String name;
    private String email;
    private String password;
    private String drivingLicense;
    private String address;
    private int contactNo;

}
