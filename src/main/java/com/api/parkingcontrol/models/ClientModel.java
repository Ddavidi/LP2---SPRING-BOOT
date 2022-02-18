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
@Table(name = "TB_CLIENT")
public class ClientModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) // envia os dados para o pgadmin de maneira automatica
    private UUID cpf;
    @Column(nullable = false, unique = true, length = 11)
    private LocalDateTime registrationDate;
    @Column(nullable = false, length = 130)
    private String Name;
    @Column(nullable = false, length = 30)
    private String plateCar;
    @Column(nullable = false, length = 30)
    private String block;

    public UUID getCpf() {
        return cpf;
    }

    public void setCpf(UUID cpf) {
        this.cpf = cpf;
    }

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDateTime registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPlateCar() {
        return plateCar;
    }

    public void setPlateCar(String plateCar) {
        this.plateCar = plateCar;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }
}
