/*
 * DAVID NUNES RIBEIRO
 * INF3 - 2022
 */

package com.api.parkingcontrol.models;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "TB_CAR")
public class CarModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID cep;
    @Column(nullable = false, unique = true, length = 9)
    private LocalDateTime registrationDate;
    @Column(nullable = false, length = 130)
    private String City;
    @Column(nullable = false, length = 30)
    private String Street;
    @Column(nullable = false, length = 30)
    private String block;

    public UUID getCep() {
        return cep;
    }

    public void setCep(UUID cep) {
        this.cep = cep;
    }

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDateTime registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }
}
