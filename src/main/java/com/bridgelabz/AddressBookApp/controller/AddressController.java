package com.bridgelabz.AddressBookApp.controller;
import com.bridgelabz.AddressBookApp.dto.AddressDTO;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/addressbook")
public class AddressController {

    private List<AddressDTO> list = new ArrayList<>();

    // GET ALL
    @GetMapping("/")
    public List<AddressDTO> getAll() {
        return list;
    }

    // CREATE
    @PostMapping("/create")
    public AddressDTO create(@RequestBody AddressDTO dto) {
        list.add(dto);
        return dto;
    }

    // GET BY ID
    @GetMapping("/get/{id}")
    public AddressDTO getById(@PathVariable int id) {
        return list.get(id);
    }

    // UPDATE
    @PutMapping("/update/{id}")
    public AddressDTO update(@PathVariable int id, @RequestBody AddressDTO dto) {
        list.set(id, dto);
        return dto;
    }

    // DELETE
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        list.remove(id);
        return "Deleted";
    }
}