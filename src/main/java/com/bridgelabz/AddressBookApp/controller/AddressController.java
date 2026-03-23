package com.bridgelabz.AddressBookApp.controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addressbook")
public class AddressController {

    @GetMapping("/")
    public String getMessage() {
        return "Address Book App Working!";
    }
}