package lk.dmax.spring.repo;

import lk.dmax.spring.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepo extends JpaRepository<Vehicle,String> {
}
