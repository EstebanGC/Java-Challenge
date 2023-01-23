package com.example.inventory.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Builder
@Table(name = "product_buy")
@NoArgsConstructor
@AllArgsConstructor

public class BuyProduct {

    @Id
    @Column(name = "product_buy_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int buyProductId;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "buy_id" )
    @JsonIgnore
    private Buy buy;
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "product_id")
    private Product product;
    @Column(name = "quantity")
    private int quantity;
}
