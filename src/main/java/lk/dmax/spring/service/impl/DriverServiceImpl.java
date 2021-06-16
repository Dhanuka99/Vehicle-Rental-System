package lk.dmax.spring.service.impl;

import lk.dmax.spring.dto.DriverDTO;
import lk.dmax.spring.service.DriverService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class DriverServiceImpl implements DriverService {
    @Override
    public void saveDriver(DriverDTO driverDTO) {

    }

    @Override
    public void updateDriver(DriverDTO driverDTO) {

    }
}
