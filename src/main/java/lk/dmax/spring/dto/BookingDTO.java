package lk.dmax.spring.dto;


import jdk.jfr.BooleanFlag;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BookingDTO {
    private String vehicleNo;

    private String driverNic;

    private String bookingDate;
    private String bookingTime;
    private String returnDate;
    private String returnTime;

    private String paymentStatus;
    private double amount;

    private String customerNic;
    private ArrayList<String> vehiclesNoList;
    private ArrayList<String> driverNicList;

    public BookingDTO(String bookingDate, String bookingTime, String returnDate, String returnTime, String customerNic, ArrayList<String> vehiclesNoList, ArrayList<String> driverNicList) {
        this.bookingDate = bookingDate;
        this.bookingTime = bookingTime;
        this.returnDate = returnDate;
        this.returnTime = returnTime;
        this.customerNic = customerNic;
        this.vehiclesNoList = vehiclesNoList;
        this.driverNicList = driverNicList;
    }


}
