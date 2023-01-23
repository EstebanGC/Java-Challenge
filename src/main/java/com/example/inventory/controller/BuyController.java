package com.example.inventory.controller;

import com.example.inventory.dto.BuyDto;
import com.example.inventory.service.BuyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
@RequiredArgsConstructor
@RequestMapping(value = "/api")
public class BuyController {

    private final BuyService buyService;

    @GetMapping(value = "/buy")
    public ResponseEntity<List<BuyDto>> getBuy() {
        return buyService.getBuys();
    }

    @PostMapping(value = "/buy")
    public ResponseEntity<Void> saveBuy(@RequestBody BuyDto buyDto) {
        return buyService.saveBuy(buyDto);
    }
}
