package com.example.inventory.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@Table(name = "product")
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @Column(name = "product_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;

    @Column(name = "name")
    private String name;

    @Column(name = "in_inventory")
    private int inInventory;

    @Column(name = "enabled")
    private boolean enabled;

    @Column(name = "min")
    private int min;

    @Column(name = "max")
    private int max;
}
