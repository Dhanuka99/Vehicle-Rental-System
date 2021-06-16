package lk.dmax.spring.service.impl;


import lk.dmax.spring.dto.CustomerDTO;
import lk.dmax.spring.entity.Customer;
import lk.dmax.spring.exception.ValidateException;
import lk.dmax.spring.repo.CustomerRepo;
import lk.dmax.spring.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class CustomerImpl implements CustomerService {

    @Autowired
    CustomerRepo customerRepo;

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

}
