package com.example.inventory.controller;

import com.example.inventory.dto.BuyDto;
import com.example.inventory.service.BuyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
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

    @GetMapping(value = "/get/buy")
    public ResponseEntity<List<BuyDto>> getBuy() {
        return buyService.getBuys();
    }

    @PostMapping(value = "/create/buy")
    public ResponseEntity<String> saveBuy(@RequestBody BuyDto buyDto) {
        return buyService.saveBuy(buyDto);
    }
}
