package lk.dmax.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class VehicleDTO {

    private String vehicleNo;
    private int vehicleStatus;
    private String brand;
    private String type;
    private int noOfPassenger;
    private String TransmissionType;
    private String fuelType;
    private String driverNic;

    public VehicleDTO(String vehicleNo, String brand, String type, int noOfPassenger, String transmissionType, String fuelType) {
        this.vehicleNo = vehicleNo;
        this.brand = brand;
        this.type = type;
        this.noOfPassenger = noOfPassenger;
        TransmissionType = transmissionType;
        this.fuelType = fuelType;
    }



    //    private double rentDurationPrice;
//    private int dailyRate;
//    private String freeKMforday;
//    private double monthlyRate;
//    private double freeKMForMonth;
//    private double pricePerExtraKM;
}
