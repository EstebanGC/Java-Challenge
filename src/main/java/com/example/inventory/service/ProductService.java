package com.example.inventory.service;

import com.example.inventory.dto.CustomPageResponse;
import com.example.inventory.dto.ProductDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ProductService {

    /**
     * Method to search paginated products
     *
     * @param page //pageNumber to search
     * @param size //elementNumber per page to return
     * @return //infoObjectPagination and productList
     */
    ResponseEntity<CustomPageResponse> getProduct(int page, int size);

    /**
     * Method to save products
     *
     * @param productDtoList //productList to save
     * @return
     */
    ResponseEntity<Void> saveProduct(List<ProductDto> productDtoList);

    /**
     * Method to update a product
     *
     * @param productDto //producttoUpdate
     * @return
     */
    ResponseEntity<Void> updateProduct(ProductDto productDto, int productId);

    /**
     * Method to deactivate a product (it´s not a good practice deleting info from a database)
     *
     * @param productId //productId to deactivate
     * @return
     */
    ResponseEntity<Void> deleteProduct(int productId);
}

