package com.clinica.api.models;

import com.clinica.api.dto.AddressDto;
import com.clinica.api.emun.Specialty;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "doctor")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private  String name;
    @Enumerated
    private Specialty specialty;
    private Integer document;
    private String email;
    private String phone;

    @Embedded
    private AddressDto adress;


}
