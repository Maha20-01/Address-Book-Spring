package com.bridgelabz.AddressBookApp.controller;
import com.bridgelabz.AddressBookApp.dto.AddressDTO;
import com.bridgelabz.AddressBookApp.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController




@RequestMapping("/addressbook")
public class AddressController {

    private List<AddressDTO> list = new ArrayList<>();
    @Autowired
    AddressService service;
    // GET ALL
    @GetMapping("/")
    public List<AddressDTO> getAll() {
        return service.getAll();
    }

    @PostMapping("/create")
    public AddressDTO create(@RequestBody AddressDTO dto) {
        return service.create(dto);
    }

    @GetMapping("/get/{id}")
    public AddressDTO getById(@PathVariable int id) {
        return service.getById(id);
    }

    @PutMapping("/update/{id}")
    public AddressDTO update(@PathVariable int id, @RequestBody AddressDTO dto) {
        return service.update(id, dto);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        service.delete(id);
        return "Deleted";
    }
}