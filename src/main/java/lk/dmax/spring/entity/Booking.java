package lk.dmax.spring.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.List;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "Booking")
public class Booking {
    @Id
    @GeneratedValue
    private String bookingId;

    private String vehicleNo;

    private String driverId;

    private String bookingDate;
    private String returnDate;

    private String paymentStatus;
    private double amount;


//    //booking and vehicle m:m relationship

    @ManyToMany
    @JoinTable(
            name = "Booking_Vehicle",
            joinColumns = @JoinColumn(name = "bookingId"),
            inverseJoinColumns = @JoinColumn(name = "vehicleNo")
    )
    private List<Vehicle> vehicleList;

    //booking and driver m:m relationship

    @ManyToMany
    @JoinTable(
            name = "Booking_Driver",
            joinColumns = @JoinColumn(name = "bookingId"),
            inverseJoinColumns = @JoinColumn(name = "driverNic")
    )
    private List<Driver> driverList;
}
