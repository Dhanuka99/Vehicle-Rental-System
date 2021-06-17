package lk.dmax.spring.repo;

import lk.dmax.spring.entity.VehiclePackage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PackageRepo extends JpaRepository<VehiclePackage,String> {
}
