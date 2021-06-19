package lk.dmax.spring.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Driver {
    @Id
    private String driverNic;
    private int driverStatus;
    private String driverName;
    private String driverAddress;
    private String driverTel;

}
