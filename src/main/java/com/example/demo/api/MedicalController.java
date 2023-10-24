package com.example.demo.api;

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
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalTime;
import java.util.*;

@RestController
@CrossOrigin
public class MedicalController {

    @Autowired
    private IHoaDonService hoaDonService;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private IThuocService thuocService;

    @Autowired
    private ITongHopService tongHopService;


    @PostMapping(value = "/medical")
    public ResponseEntity<Map<String, String>> addItem(@Valid @RequestBody TongHopDTO tongHopDTO) {

        HoaDonEntity hoaDonEntity = tongHopService.save(tongHopDTO);
        Map<String, String> success = new HashMap<>();
        return ResponseEntity.ok(success);
    }


    @GetMapping(value = "/medical")
    public ResponseEntity<List<HoaDonDTO>> getItem() {
        return ResponseEntity.ok(tongHopService.getHoaDon());
    }

    @DeleteMapping(value = "/medical")
    public ResponseEntity<List<HoaDonDTO>> deleteItem(@RequestBody List<String> list) {

        return ResponseEntity.ok(tongHopService.deleteHoaDon(list));
    }
}
