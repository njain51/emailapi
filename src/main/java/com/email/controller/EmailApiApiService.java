package com.email.controller;

import com.email.entity.Email;
import com.email.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmailApiApiService {

    @Autowired
    private EmailService emailService;

    @RequestMapping(value = "/welcome")
    @ResponseBody
    public String sayHello() {
        return "Hello World Modified";
    }

    @RequestMapping(value = "/sendemail" , method = RequestMethod.POST)
    public ResponseEntity<?> sendEmail(@RequestBody Email email) {

        boolean result = this.emailService.sendEmail(email.getSubject(), email.getMessage(), email.getRecipent_add(), email.getSender_add());

        if(result){
            return ResponseEntity.ok("Email is sent successfully ..");
        }
        else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Email not sent");
        }



    }


}
