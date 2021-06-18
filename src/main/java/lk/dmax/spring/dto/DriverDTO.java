package lk.dmax.spring.dto;


import lk.dmax.spring.entity.Booking;
import lk.dmax.spring.entity.Customer;
import lk.dmax.spring.entity.Vehicle;
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


    public DriverDTO(String driverNic, String driverName, String address, String tel) {
        this.driverNic = driverNic;
        this.driverName = driverName;
        this.address = address;
        this.tel = tel;
    }
}
