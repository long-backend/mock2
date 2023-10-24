package com.example.demo.dto;

import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.List;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TongHopDTO {
    private String maHoaDon;

    @NotBlank(message = "Loai hoa don khong duoc de trong")
    private String loaiHoaDon;
    private String tenNhaCungCap;
    @NotBlank(message = "So HD khong duoc de trong")
    private String soHD;
    @NotBlank(message = "Dia chi khong duoc de trong")
    @Size(min = 2, max = 50, message = "Dia chi tu 2 den 50 ky tu")
    private String diaChi;

    @NotNull(message = "Ngay lap khong duoc de trong")
    private LocalDate ngayLap;
    @NotBlank(message = "Ly do khong duoc de trong")
    private String lyDo ;

    @NotBlank(message = "Nhan vien khong duoc de trong")
    private String nhanVien ;

    private long tongTien ;
    @Valid
    List<ThuocDTO> list;
}
