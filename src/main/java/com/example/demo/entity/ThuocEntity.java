package com.example.demo.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ThuocEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long maThuoc;
    @Column(columnDefinition = "nvarchar(50)")
    private String tenThuoc;
    @Column(columnDefinition = "nvarchar(50)")
    private String donViTinh;
    private long soLuong;
    private long donGia;
    private long ck;
    private long tienCK;
    private long vat;
    private long thanhTien;
    private LocalDate hanDung;
    private boolean status = true;

    @ManyToOne
    @JoinColumn(name = "maHoaDon")
    HoaDonEntity hoaDon;


}
