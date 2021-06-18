package lk.dmax.spring.service.impl;


import lk.dmax.spring.repo.BookingRepo;
import lk.dmax.spring.service.BookingService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import javax.jws.Oneway;
import javax.transaction.Transactional;

@Service
@Transactional
public class BookingServiceImpl implements BookingService {

    @Autowired
    BookingRepo bookingRepo;

    @Autowired
    ModelMapper mapper;
}
