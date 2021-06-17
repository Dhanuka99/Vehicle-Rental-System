package lk.dmax.spring.service.impl;

import lk.dmax.spring.dto.PackageDTO;
import lk.dmax.spring.service.VehiclePackage;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@Service
@Transactional
public class VehiclePackageImpl implements VehiclePackage {
    @Override
    public void savePackage(PackageDTO packageDTO) {

    }

    @Override
    public void updatePackage(PackageDTO packageDTO) {

    }
}
