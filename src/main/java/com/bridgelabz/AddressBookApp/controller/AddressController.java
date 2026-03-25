package com.bridgelabz.AddressBookApp.controller;

import com.bridgelabz.AddressBookApp.dto.AddressDTO;
import com.bridgelabz.AddressBookApp.service.AddressService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/addressbook")
public class AddressController {

    @Autowired
    AddressService service;

    // GET ALL
    @GetMapping("/")
    public List<AddressDTO> getAll() {
        log.info("Fetching all contacts");
        return service.getAll();
    }

    @PostMapping("/create")
    public AddressDTO create(@Valid @RequestBody AddressDTO dto) {
        return service.create(dto);
    }

    @GetMapping("/get/{id}")
    public AddressDTO getById(@PathVariable int id) {
        log.info("Fetching contact with id: {}", id);
        return service.getById(id);
    }

    @PutMapping("/update/{id}")
    public AddressDTO update(@PathVariable int id, @Valid @RequestBody AddressDTO dto) {
        return service.update(id, dto);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        log.info("Deleting contact with id: {}", id);
        service.delete(id);
        return "Deleted";
    }
}