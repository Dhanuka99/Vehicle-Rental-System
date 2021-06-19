package lk.dmax.spring.service.impl;


import lk.dmax.spring.dto.BookingDTO;
import lk.dmax.spring.repo.BookingRepo;
import lk.dmax.spring.service.BookingService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import javax.jws.Oneway;
import javax.transaction.Transactional;
import java.util.ArrayList;

@Service
@Transactional
public class BookingServiceImpl implements BookingService {

    @Autowired
    BookingRepo bookingRepo;

    @Autowired
    ModelMapper mapper;


    @Override
    public void saveBooking(BookingDTO bookingDTO) {

//        if(bookingRepo.existsById(bookingDTO.get)){
//
//        }
    }

    @Override
    public void updateBooking(BookingDTO bookingDTO) {

    }

    @Override
    public ArrayList<BookingDTO> getAllBookings() {
        return null;
    }

    @Override
    public BookingDTO searchBooking() {
        return null;
    }

    @Override
    public void deleteBooking(String id) {

    }
}
