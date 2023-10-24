package com.example.demo.dto;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ThuocDTO {
    @NotBlank(message = "Ten thuoc khong duoc de trong")
    private String tenThuoc;
    private String donViTinh;
    @NotNull(message = "So Luong khong duoc de trong")
    private long soLuong;
    @NotNull(message = "Don gia khong duoc de trong")
    private long donGia;
    @NotNull(message = "CK khong duoc de trong")
    private long ck;
    @NotNull(message = "Tien CK khong duoc de trong")
    private long tienCK;
    @NotNull(message = "VAT khong duoc de trong")
    private long vat;
    @NotNull(message = "Thanh tien khong duoc de trong")
    private long thanhTien;
    @NotNull(message = "Han dung khong duoc de trong")
    private LocalDate hanDung;
}
