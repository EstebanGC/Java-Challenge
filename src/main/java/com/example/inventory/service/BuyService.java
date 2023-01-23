package com.example.inventory.service;

import com.example.inventory.dto.BuyDto;
import org.springframework.http.ResponseEntity;

import java.util.List;
public interface BuyService {

    ResponseEntity<List<BuyDto>> getBuys();
    ResponseEntity<String> saveBuy(BuyDto buyDto);
}
