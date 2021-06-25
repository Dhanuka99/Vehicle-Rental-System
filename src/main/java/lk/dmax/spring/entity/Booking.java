package lk.dmax.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int bookingId;
    private String customerNic;
    private String vehicleNo;
    private String driverNic;
    private String bookingDate;
    private String bookingTime;
    private String bookingStatus;
    private String returnDate;
    private String returnTime;
    private double startMileage;
    private double endMileage;
    private String releaseStatus;
}
