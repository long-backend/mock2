package com.example.demo.service;

import com.example.demo.dto.HoaDonDTO;
import com.example.demo.dto.TongHopDTO;
import com.example.demo.entity.HoaDonEntity;
import com.example.demo.entity.ThuocEntity;

import java.util.List;

public interface ITongHopService {
    HoaDonEntity save(TongHopDTO tongHopDTO);

    List<HoaDonDTO> getHoaDon();

    List<HoaDonDTO> deleteHoaDon(List<String> list);
}
