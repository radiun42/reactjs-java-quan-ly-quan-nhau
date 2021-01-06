package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.ChiTietHoaDon;

@Repository
public interface ChiTietHoaDonRepository extends JpaRepository<ChiTietHoaDon, Long> {

}
