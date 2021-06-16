package lk.dmax.spring.repo;

import lk.dmax.spring.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepo extends JpaRepository<Booking,String> {

}
