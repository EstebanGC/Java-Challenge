package com.example.inventory.repository;

import com.example.inventory.model.Buy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BuyRepository extends JpaRepository<Buy, Integer>{
}
