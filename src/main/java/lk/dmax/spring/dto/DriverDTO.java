package lk.dmax.spring.dto;


import lk.dmax.spring.MtoM.Booking;
import lk.dmax.spring.MtoM.Customer;
import lk.dmax.spring.MtoM.Vehicle;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class DriverDTO {

    private String driverNic;

    private int driverStatus;

    private String driverName;

    private String address;

    private String tel;

    private List<Booking> bookingList;

    private List<Customer> customerList;

    private List<Vehicle> vehicleList;


    //signup driver
    public DriverDTO(String driverNic, String driverName, String address, String tel) {
        this.driverNic = driverNic;
        this.driverName = driverName;
        this.address = address;
        this.tel = tel;
    }

    public DriverDTO(String driverNic, int driverStatus, String driverName, String address, String tel) {
        this.driverNic = driverNic;
        this.driverStatus = driverStatus;
        this.driverName = driverName;
        this.address = address;
        this.tel = tel;
    }
}
