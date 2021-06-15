package lk.dmax.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.EnableMBeanExport;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "Booking")
public class Booking {
    @Id
    private String bookingId;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "Booking_Vehicle",
            joinColumns = {@JoinColumn(name = "bookingId")},
            inverseJoinColumns = {@JoinColumn(name = "vehicleNo")}
    )
    private List<Vehicle> vehicleList;

    @OneToMany
    private List<Driver> driverList;

    @OneToMany
    private List<Customer> customerList;
}