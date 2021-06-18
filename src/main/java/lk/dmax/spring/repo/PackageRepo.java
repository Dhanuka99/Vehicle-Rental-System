package lk.dmax.spring.repo;

import lk.dmax.spring.entity.Package;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PackageRepo extends JpaRepository<Package,String> {
}
