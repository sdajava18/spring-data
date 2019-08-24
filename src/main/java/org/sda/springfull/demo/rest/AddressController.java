package org.sda.springfull.demo.rest;

import org.sda.springfull.demo.domain.Address;
import org.sda.springfull.demo.dto.AddressDto;
import org.sda.springfull.demo.mapper.AddressMapper;
import org.sda.springfull.demo.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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

    @RequestMapping(value = "/address/{id}", method = RequestMethod.GET)
    public Address findById(@PathVariable Long id){
        return this.addressService.findById(id);
    }

//    @RequestMapping(value = "/address", method = RequestMethod.GET)
//    @ResponseBody
//    public List<Address> findBy(@RequestParam Long price){
//        // handle request
//    }
//
    @ResponseStatus(value = HttpStatus.CREATED)
    @RequestMapping(value = "/address", method = RequestMethod.POST)
    public void save(@RequestBody @Valid AddressDto addressDto){
        this.addressService.save(AddressMapper.toEntity(addressDto));
    }
}
