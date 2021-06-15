package lk.dmax.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "Vehicle")
public class Vehicle {

    @Id
    private String vehicleNo;
    private String brand;
    private String type;
    private int noOfPassenger;
    private String TransmissionType;
    private String fuelType;
    private double rentDurationPrice;
    private int dailyRate;
    private String freeKMforday;
    private double monthlyRate;
    private double freeKMForMonth;
    private double pricePerExtraKM;

    @ManyToMany(mappedBy = "vehicleList")
    private List<Booking> bookingList;
}
