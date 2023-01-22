package com.example.inventory.service.impl;

import com.example.inventory.dto.CustomPageResponse;
import com.example.inventory.dto.ProductDto;
import com.example.inventory.model.Product;
import com.example.inventory.repository.ProductRepository;
import com.example.inventory.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    @Override
    public ResponseEntity<CustomPageResponse> getProduct(int page, int size) {
        log.info("Init getProduct with: {}");
        ResponseEntity<CustomPageResponse> response;
        try {
            Pageable pageable = PageRequest.of(page.size);
            Page<Product> productPage = productRepository.findAll(pageable);
            
        } catch (Exception e){

        }
        return response;
    }

    @Override
    public ResponseEntity<Void> saveProduct(List<ProductDto> productDtoList) {
        return null;
    }

    @Override
    public ResponseEntity<Void> updateProduct(ProductDto productDto, int productId) {
        return null;
    }

    @Override
    public ResponseEntity<Void> deleteProduct(int productId) {
        return null;
    }
}
