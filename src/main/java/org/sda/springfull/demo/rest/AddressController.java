package org.sda.springfull.demo.rest;

import org.sda.springfull.demo.domain.Address;
import org.sda.springfull.demo.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddressController {

    private AddressService addressService;

    @Autowired
    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @RequestMapping(value = "/address", method = RequestMethod.GET)
    public List<Address> findAll(){
        return this.addressService.findAll();
    }

}
