package lk.dmax.spring.controller;


import lk.dmax.spring.dto.CustomerDTO;
import lk.dmax.spring.exception.NotFoundException;
import lk.dmax.spring.service.CustomerService;
import lk.dmax.spring.util.StandradResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity saveCustomer(@RequestBody CustomerDTO customerDTO){
        if (customerDTO.getNic().trim().length() <= 0) {
            throw new NotFoundException("Customer id cannot be empty");
        }
        customerService.saveCustomer(customerDTO);
        return new ResponseEntity(new StandradResponse("201", "Done", customerDTO), HttpStatus.CREATED);
    }
}
