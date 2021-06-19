package lk.dmax.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Booking {
    @Id
    private int bookingId;
    private String customerNic;
    private String vehicleNo;
    private String driverNic;
    private String bookingDate;
    private String bookingTime;
    private String returnDate;
    private String returnTime;
    private int bookingStatus;
}
