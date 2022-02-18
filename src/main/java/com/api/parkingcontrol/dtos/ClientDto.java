/*
 * DAVID NUNES RIBEIRO
 * INF3 - 2022
 */

package com.api.parkingcontrol.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class ClientDto {

    @NotBlank
    @Size(max = 7)
    private String plateCar;
    @NotBlank
    private String Name;
    @NotBlank
    private String block;

    public String getPlateCar() {
        return plateCar;
    }

    public void setPlateCar(String plateCar) {
        this.plateCar = plateCar;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }
}
