package lk.dmax.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Customer {
    @Id
    private String nic;

    private String name;

    private String email;

    private String password;

    private MultipartFile nicImg;

    private String drivingLicense;

    private MultipartFile drivingLicenseImg;

    private String address;

    private int contactNo;


}
