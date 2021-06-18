package lk.dmax.spring.repo;

import lk.dmax.spring.dto.DriverDTO;
import lk.dmax.spring.entity.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.ArrayList;

public interface DriverRepo extends JpaRepository<Driver,String> {

    @Query("select d from Driver d where d.driverStatus=1")
    ArrayList<DriverDTO> checkDriverAvailability();


}
