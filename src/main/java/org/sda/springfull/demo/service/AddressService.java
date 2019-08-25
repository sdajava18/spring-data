package org.sda.springfull.demo.service;

import org.sda.springfull.demo.domain.Address;
import org.sda.springfull.demo.repository.AddressRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AddressService {

    private AddressRepository addressRepository;

    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Transactional
    public Address save(Address address){
        return this.addressRepository.save(address);
    }

    @Transactional(readOnly = true)
    public List<Address> findAll(){
        return this.addressRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Address findById(Long id) {
        return this.addressRepository.findById(id).get();
    }
}
