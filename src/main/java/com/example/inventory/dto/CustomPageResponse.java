package com.example.inventory.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Class to wrap useful content over pagination
 * @param <T>
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomPageResponse {
    private long totalElements;
    private int totalPage;
    private boolean lastPage;
    private T data;
}
