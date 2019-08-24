package org.sda.springfull.demo.mapper;

import org.sda.springfull.demo.domain.Address;
import org.sda.springfull.demo.dto.AddressDto;

public class AddressMapper {

    public static Address toEntity(AddressDto addressDto){

        Address address = new Address();
        address.setCity(addressDto.getCity());
        address.setAppartmentNumber(addressDto.getAppartmentNumber());
        address.setHouseNumber(addressDto.getHouseNumber());
        address.setStreet(addressDto.getStreet());

        return address;
    }
}
