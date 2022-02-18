/*
 * DAVID NUNES RIBEIRO
 * INF3 - 2022
 */

package com.api.parkingcontrol.dtos;

import javax.validation.constraints.NotBlank;

public class CarDto {

    @NotBlank
    private String Street;
    @NotBlank
    private String City;
    @NotBlank
    private String block;
}
