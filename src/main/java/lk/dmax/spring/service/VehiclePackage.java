package lk.dmax.spring.service;

import lk.dmax.spring.dto.PackageDTO;

public interface VehiclePackage {
    void savePackage(PackageDTO packageDTO);

    void updatePackage(PackageDTO packageDTO);
}
