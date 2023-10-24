package com.example.demo.service;

import com.example.demo.entity.HoaDonEntity;

import java.util.List;
import java.util.Optional;

public interface IHoaDonService {
    List<HoaDonEntity> findAll();
    HoaDonEntity save(HoaDonEntity hoaDonEntity);
    Optional<HoaDonEntity> findById(String id);
}
