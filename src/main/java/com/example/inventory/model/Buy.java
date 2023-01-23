package com.example.inventory.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Builder
@Table(name = "buy")
@NoArgsConstructor
@AllArgsConstructor
public class Buy {

    @Id
    @Column(name = "buy_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int buyId;

    @Column(name = "date")
    private LocalDateTime date;

    @Column(name = "client_type_id")
    private String clientIdType;

    @Column(name = "client_id")
    private long clientId;

    @Column(name = "client_name")
    private String clientName;

    @OneToMany(
            mappedBy = "buy",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    private Set<BuyProduct> products = new HashSet<>();
}
