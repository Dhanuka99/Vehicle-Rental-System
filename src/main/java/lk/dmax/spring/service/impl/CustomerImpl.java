package lk.dmax.spring.service.impl;


import lk.dmax.spring.dto.BookingDTO;
import lk.dmax.spring.dto.CustomerDTO;
import lk.dmax.spring.entity.Booking;
import lk.dmax.spring.entity.Customer;
import lk.dmax.spring.exception.ValidateException;
import lk.dmax.spring.repo.BookingRepo;
import lk.dmax.spring.repo.CustomerRepo;
import lk.dmax.spring.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class CustomerImpl implements CustomerService {

    @Autowired
    CustomerRepo customerRepo;

    @Autowired
    BookingRepo  bookingRepo;

    @Autowired
    ModelMapper mapper;

    @Override
    public void saveCustomer(CustomerDTO dto) {
            if (customerRepo.existsById(dto.getCustomerNic())) {
                throw new ValidateException("Customer Already Exist");
            }
            customerRepo.save(mapper.map(dto, Customer.class));
        }

    @Override
    public void updateCustomer(CustomerDTO dto) {
        if(customerRepo.existsById(dto.getCustomerNic())){
           customerRepo.save(mapper.map(dto,Customer.class));
        }
    }

    @Override
    public List<BookingDTO> placeBooking(BookingDTO bookingDTO) {
        List<Booking> all = (List<Booking>) bookingRepo.save(mapper.map(bookingDTO,Booking.class));
        return mapper.map(all, new TypeToken<ArrayList<BookingDTO>>() {
        }.getType());

    }


}
