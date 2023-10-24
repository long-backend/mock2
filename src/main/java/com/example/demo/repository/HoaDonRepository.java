package com.example.demo.repository;

import com.example.demo.entity.HoaDonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HoaDonRepository extends JpaRepository<HoaDonEntity,String> {
    public List<HoaDonEntity> findByStatusTrue();
}
