package lk.dmax.spring.dto;


import jdk.jfr.BooleanFlag;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BookingDTO {
    private String vehicleNo;

    private String driverId;

    private String bookingDate;
    private String returnDate;

    private String paymentStatus;
    private double amount;
}
