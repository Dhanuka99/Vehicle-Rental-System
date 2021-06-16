package lk.dmax.spring.controller;


import com.mysql.cj.log.Log;
import lk.dmax.spring.dto.LoginDTO;
import lk.dmax.spring.exception.NotFoundException;
import lk.dmax.spring.service.LoginService;
import lk.dmax.spring.util.StandradResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/login")
public class LoginController {

    @Autowired
    LoginService loginService;


    @PostMapping(path = "customer")
    public ResponseEntity loginCustomer(@RequestBody LoginDTO loginDTO){
        if(loginDTO.getPassword().trim().length()<=0 || loginDTO.getUserName().trim().length()<=0 || loginDTO.getUsernic().trim().length()<=0){
            throw new NotFoundException("Username or Password cant be empty");
        } loginService.loginCustomer(loginDTO);
        return new ResponseEntity(new StandradResponse("201", "Done", loginDTO), HttpStatus.CREATED);
    }

    @PostMapping(path = "driver")
    public ResponseEntity loginDriver(@RequestBody LoginDTO loginDTO){
    if (loginDTO.getUsernic().trim().length()<=0|| loginDTO.getUserName().trim().length()<=0 || loginDTO.getPassword().trim().length()<=0){
        throw new NotFoundException("User name or password cant empty");
    }
    loginService.loginDriver(loginDTO);
        return new ResponseEntity(new StandradResponse("201", "Done", loginDTO), HttpStatus.CREATED);
    }
}
