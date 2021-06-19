package lk.dmax.spring.repo;

import lk.dmax.spring.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BookingRepo extends JpaRepository<Booking,String> {


//    @Query("SELECT MAX(Booking.bookingId) AS LastID FROM Booking")
//    int getlastId();
//
//    SELECT column_name FROM table_name
//    ORDER BY column_name DESC
//    LIMIT 1;

//    @Query("select m.bookingId from Booking m order by m.bookingId desc limit 1")
//    int getLastBookingId();

}
