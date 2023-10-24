package com.example.demo.dto;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Timer;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HoaDonDTO {
    private String maHoaDon;
    private String loaiHoaDon;
    private String tenNhaCungCap;
    private String soHD;
    private String diaChi;
    private LocalDate ngayLap;
    private LocalTime gioLap;
    private String lyDo ;
    private String nhanVien ;
    private long tongTien ;

}
