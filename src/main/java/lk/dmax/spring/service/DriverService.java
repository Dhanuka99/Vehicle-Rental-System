package lk.dmax.spring.service;

import lk.dmax.spring.dto.DriverDTO;

public interface DriverService {
    void saveDriver(DriverDTO driverDTO);

    void updateDriver(DriverDTO driverDTO);
}
