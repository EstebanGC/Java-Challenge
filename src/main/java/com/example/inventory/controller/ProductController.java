package com.example.inventory.controller;


import com.example.inventory.dto.CustomPageResponse;
import com.example.inventory.dto.ProductDto;
import com.example.inventory.service.ProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
@RequiredArgsConstructor
@RequestMapping("/api")
public class ProductController {

    private final ProductService productService;

//
    @GetMapping(value = "/product")
    public ResponseEntity<CustomPageResponse> getProduct(
            @RequestParam @Min(0) Integer page,
            @RequestParam @Min(1) Integer size) {
        return productService.getProduct(page, size);
    }

    @PostMapping(value = "/product")
    public ResponseEntity<Void> saveProduct(@RequestBody @Valid List<ProductDto> productDtoList) {
        return productService.saveProduct(productDtoList);
    }

    @PutMapping(value = "/product/{productId}")
    public ResponseEntity<Void> updateProduct(
            @RequestBody @Valid ProductDto productDto,
            @PathVariable @Min(value = 1) int productId) {
        return productService.updateProduct(productDto, productId);
    }

    @DeleteMapping(value = "/product/{productId}")
    public ResponseEntity<Void> deleteProduct(@PathVariable @Min(1) int productId) {
        return productService.deleteProduct(productId);
    }
}