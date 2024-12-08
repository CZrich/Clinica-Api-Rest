package com.clinica.api.dto;

import jakarta.persistence.Embeddable;

@Embeddable
public record AddressDto (
    String street,
    Integer number,
    String  complement,
    String city

){
}
