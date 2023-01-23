package com.example.inventory.dto;

import lombok.*;
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BuyDetailDto {

    private int productId;
    private String name;
    private int quantity;
}
