package com.example.demo.service.imp;

import com.example.demo.dto.HoaDonDTO;
import com.example.demo.dto.ThuocDTO;
import com.example.demo.dto.TongHopDTO;
import com.example.demo.entity.HoaDonEntity;
import com.example.demo.entity.ThuocEntity;
import com.example.demo.service.IHoaDonService;
import com.example.demo.service.IThuocService;
import com.example.demo.service.ITongHopService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.CollectionUtils;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class TongHopService implements ITongHopService {

    @Autowired
    private IHoaDonService hoaDonService;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private IThuocService thuocService;

    @Override
    public HoaDonEntity save(TongHopDTO tongHopDTO) {
        HoaDonEntity hoaDonEntity = modelMapper.map(tongHopDTO, HoaDonEntity.class);
        hoaDonEntity.setGioLap(LocalTime.now());
        hoaDonEntity = hoaDonService.save(hoaDonEntity);
        List<ThuocDTO> listThuoc = Optional.ofNullable(tongHopDTO.getList()).orElse(Collections.emptyList());
        if (!listThuoc.isEmpty()) {
            for (ThuocDTO item : listThuoc) {
                ThuocEntity thuocEntity = modelMapper.map(item, ThuocEntity.class);
                thuocEntity.setHoaDon(hoaDonEntity);
                thuocEntity = thuocService.save(thuocEntity);
            }
        }
        return hoaDonEntity;
    }

    @Override
    public List<HoaDonDTO> getHoaDon() {
        List<HoaDonDTO> listHoaDonDTO = new ArrayList<>();
        List<HoaDonEntity> listHoaDonEntity = hoaDonService.findAll();

        if (!listHoaDonEntity.isEmpty()) {
            for (HoaDonEntity item : listHoaDonEntity) {
                HoaDonDTO hoadon = modelMapper.map(item, HoaDonDTO.class);
                listHoaDonDTO.add(hoadon);
            }
        }
        Collections.reverse(listHoaDonDTO);
        return listHoaDonDTO;
    }

    @Override
    public List<HoaDonDTO> deleteHoaDon(List<String> list) {
        for (String item : list) {
            Optional<HoaDonEntity> hoaDonEntity = hoaDonService.findById(item);
            if (hoaDonEntity.isPresent()) {
                hoaDonEntity.get().setStatus(false);
                hoaDonService.save(hoaDonEntity.get());
            }
        }

        List<HoaDonDTO> listHoaDonDTO = getHoaDon();
        return listHoaDonDTO;
    }
}
