package com.example.demo.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Data
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HoaDonEntity {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String maHoaDon;
    @Column(columnDefinition = "nvarchar(50)")
    private String loaiHoaDon;
    @Column(columnDefinition = "nvarchar(50)")
    private String tenNhaCungCap;
    @Column(columnDefinition = "nvarchar(50)")
    private String soHD;
    @Column(columnDefinition = "nvarchar(50)")
    private String diaChi;
    private LocalDate ngayLap;
    private LocalTime gioLap;
    @Column(columnDefinition = "nvarchar(50)")
    private String lyDo ;
    @Column(columnDefinition = "nvarchar(50)")
    private String nhanVien ;
    private long tongTien ;
    private boolean status = true;

    @OneToMany(mappedBy = "hoaDon")
    List<ThuocEntity> listThuoc;

}
