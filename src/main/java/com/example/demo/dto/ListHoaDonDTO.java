package com.example.demo.dto;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ListHoaDonDTO {
    private Long maHoaDon;
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
