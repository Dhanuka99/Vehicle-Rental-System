package lk.dmax.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import java.util.List;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Customer {
    @Id
    private String CustomerNic;

    private String name;

    private String email;

    private String password;


    private String drivingLicense;


    private String address;

    private int contactNo;

    @OneToMany(targetEntity = Booking.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "cb_fk",referencedColumnName = "nic")
    private List<Booking> bookingList;

}
