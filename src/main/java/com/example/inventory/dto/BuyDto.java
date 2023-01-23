package com.example.inventory.dto;

import lombok.*;
import java.util.List;
import java.time.LocalDateTime;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BuyDto {

    private LocalDateTime date;
    private String clientIdType;
    private long clientId;
    private String clientName;
    private List<BuyDetailDto> products;
}
