package lk.dmax.spring.service.impl;

import jdk.nashorn.internal.parser.Token;
import lk.dmax.spring.dto.DriverDTO;
import lk.dmax.spring.entity.Customer;
import lk.dmax.spring.entity.Driver;
import lk.dmax.spring.exception.NotFoundException;
import lk.dmax.spring.repo.DriverRepo;
import lk.dmax.spring.service.DriverService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class DriverServiceImpl implements DriverService {

    @Autowired
    DriverRepo driverRepo;

    @Autowired
    ModelMapper mapper;

    @Override
    public void saveDriver(DriverDTO driverDTO) {
       if (driverRepo.existsById(driverDTO.getDriverNic())){
           throw new NotFoundException("Driver Not Found");
       }driverRepo.save(mapper.map(driverDTO, Driver.class));
    }

    @Override
    public void updateDriver(DriverDTO driverDTO) {
        if(driverRepo.existsById(driverDTO.getDriverNic())){
            driverRepo.save(mapper.map(driverDTO, Driver.class));
        }
    }

    @Override
    public DriverDTO searchDriver(String id) {
        Optional<Driver> driver = driverRepo.findById(id);
        if (driver.isPresent()){
            return mapper.map(driver,DriverDTO.class);
        }
        return null;
    }

    @Override
    public ArrayList<DriverDTO> getAllDrivers() {
        List<Driver> allDrivers = driverRepo.findAll();
        return mapper.map(allDrivers, new TypeToken<ArrayList<DriverDTO>>(){}.getType());
    }

    @Override
    public void deleteDriver(String id) {

        if (driverRepo.existsById("id")){
            throw new NotFoundException("No Driver For Delete");
        }driverRepo.deleteById(id);
    }

    @Override
    public long countDriver() {
        return 0;
    }
}
