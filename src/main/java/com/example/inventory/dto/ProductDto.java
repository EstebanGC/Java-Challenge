package com.example.inventory.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {

    private int productId;

    @NotBlank
    private String name;

    @Min(0)
    private int inInventory;

    @NotNull
    private Boolean enabled;

    @Min(0)
    private int min;

    @Min(1)
    private int max;


}
