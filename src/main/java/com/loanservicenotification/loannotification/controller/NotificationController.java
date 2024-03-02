package com.loanservicenotification.loannotification.controller;

import com.loanservicenotification.loannotification.dao.LoanRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class NotificationController {

//    @Autowired
//    private  final LoanRequest loanRequest;

//    public NotificationController(LoanRequest loanRequest) {
//        this.loanRequest = loanRequest;
//    }

    @PostMapping("/notify")
    public  void notifyUser(@RequestBody LoanRequest loanRequest){
        System.out.println("Hello " + " " + loanRequest.getBorrower()+ " " + "Your loan amount of" + " " + " " +  loanRequest.getAmount() + "has been processed Successfully" );

    }

}
