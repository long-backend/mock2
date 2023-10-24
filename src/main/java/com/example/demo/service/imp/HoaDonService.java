package com.example.demo.service.imp;

import com.example.demo.entity.HoaDonEntity;
import com.example.demo.repository.HoaDonRepository;
import com.example.demo.service.IHoaDonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HoaDonService implements IHoaDonService {
    @Autowired
    HoaDonRepository hoaDonRepository;

    @Override
    public List<HoaDonEntity> findAll() {

        return hoaDonRepository.findByStatusTrue();
    }



    @Override
    public HoaDonEntity save(HoaDonEntity hoaDonEntity) {
        return hoaDonRepository.save(hoaDonEntity);
    }

    @Override
    public Optional<HoaDonEntity> findById(String id) {

        Optional<HoaDonEntity> hoaDonEntity= hoaDonRepository.findById(id);

        return hoaDonEntity;
    }


}
