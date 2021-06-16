package lk.dmax.spring.service;

import lk.dmax.spring.dto.VehicleDTO;

public interface VehicleService {
    void saveVehicle(VehicleDTO vehicleDTO);

    void updateVehicle(VehicleDTO vehicleDTO);
}
