package com.bridgelabz.AddressBookApp.service;


import com.bridgelabz.AddressBookApp.dto.AddressDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressService {

    private List<AddressDTO> list = new ArrayList<>();

    // GET ALL
    public List<AddressDTO> getAll() {
        return list;
    }

    // CREATE
    public AddressDTO create(AddressDTO dto) {
        list.add(dto);
        return dto;
    }

    // GET BY ID
    public AddressDTO getById(int id) {
        return list.get(id);
    }

    // UPDATE
    public AddressDTO update(int id, AddressDTO dto) {
        list.set(id, dto);
        return dto;
    }

    // DELETE
    public void delete(int id) {
        list.remove(id);
    }
}
