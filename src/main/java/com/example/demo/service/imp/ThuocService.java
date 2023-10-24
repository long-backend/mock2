package com.example.demo.service.imp;

import com.example.demo.entity.ThuocEntity;
import com.example.demo.repository.ThuocRepository;
import com.example.demo.service.IThuocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ThuocService implements IThuocService {

    @Autowired
    private ThuocRepository thuocRepository;

    @Override
    public ThuocEntity save(ThuocEntity thuocEntity) {
        return thuocRepository.save(thuocEntity);
    }
}
