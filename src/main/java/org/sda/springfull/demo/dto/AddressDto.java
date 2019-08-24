package org.sda.springfull.demo.dto;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

public class AddressDto {

    @NotBlank
    private String street;

    @NotBlank
    private String city;

    @NotEmpty
    private String houseNumber;

    private String appartmentNumber;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getAppartmentNumber() {
        return appartmentNumber;
    }

    public void setAppartmentNumber(String appartmentNumber) {
        this.appartmentNumber = appartmentNumber;
    }
}
