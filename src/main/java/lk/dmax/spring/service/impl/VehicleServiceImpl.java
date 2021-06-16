package lk.dmax.spring.service.impl;

import lk.dmax.spring.dto.VehicleDTO;
import lk.dmax.spring.service.VehicleService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class VehicleServiceImpl implements VehicleService {
    @Override
    public void saveVehicle(VehicleDTO vehicleDTO) {

    }

    @Override
    public void updateVehicle(VehicleDTO vehicleDTO) {

    }
}
