package com.example.inventory.controller;


import com.example.inventory.dto.ProductDto;
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
@RequestMapping(value = "/product")
public class ProductController {

    private final ProductService productService;

    @PostMapping(value = "/product")
    public ResponseEntity<Void> saveProduct(@RequestBody @Valid
                                            List<ProductDto> productDtoList){
        return productService.saveProduct(productDtoList);
    }

    @PutMapping(value = "/product/{productId}")
    public ResponseEntity<Void> updateProduct(
            @RequestBody @Valid ProductDto productDto,
            @PathVariable @Min(value = 1) int productId){
        return productService.updateProduct(productDto, productId)ñ
    }

    @DeleteMapping(value = "/product/{productId}")
    public ResponseEntity<Void> deleteProduct(
            @PathVariable @Min(1) int productId){
        return productService.deleteProduct(productId);
    }
}

