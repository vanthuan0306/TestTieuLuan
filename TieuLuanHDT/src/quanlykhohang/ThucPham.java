package quanlykhohang;

import java.util.Date;

public class ThucPham extends SanPham{
    private String loaiTP;
    
    public ThucPham(int soThuTu, String loaHangHoa, String maHangHoa, String tenHangHoa, int soHangHoaTonKho,
            int giaNhapHangHoa, Date ngayHangHoaNhapKho, String loaiThucPham){
        this.stt = soThuTu;
        this.loaiHangHoa = loaHangHoa;
        this.maHangHoa = maHangHoa;
        this.tenHangHoa = tenHangHoa;
        this.soHangHoaTonKho = soHangHoaTonKho;
        this.giaNhapHangHoa = giaNhapHangHoa;
        this.ngayHangHoaNhapKho = ngayHangHoaNhapKho;
        this.loaiTP =loaHangHoa;
    }

    public ThucPham(){}

    public void setMaHangHoa(String maHangHoa) {
        this.maHangHoa = maHangHoa;
    }

    public void setTenHangHoa(String tenHangHoa) {
        this.tenHangHoa = tenHangHoa;
    }

    public void setSoHangHoaTonKho(int soHangHoaTonKho) {
        this.soHangHoaTonKho = soHangHoaTonKho;
    }

    public void setGiaNhapHangHoa(int giaNhapHangHoa) {
        this.giaNhapHangHoa = giaNhapHangHoa;
    }

    public void setNgayHangHoaNhapKho(Date ngayHangHoaNhapKho) {
        this.ngayHangHoaNhapKho = ngayHangHoaNhapKho;
    }

    public void setLoaiHangHoa(String loaiHangHoa) {
        this.loaiHangHoa = loaiHangHoa;
    }

    public void setSoThuTu(int stt) {
        this.stt = stt;
    }

    public void setLoaiTP(String loaiTP) {
        this.loaiTP = loaiTP;
    }

    public int getSoThuTu() {
        return stt;
    }

    public String getLoaiHangHoa() {
        return loaiHangHoa;
    }

    public String getMaHangHoa() {
        return maHangHoa;
    }

    public String getTenHangHoa() {
        return tenHangHoa;
    }

    public int getSoHangHoaTonKho() {
        return soHangHoaTonKho;
    }

    public int getGiaNhapHangHoa() {
        return giaNhapHangHoa;
    }

    public Date getNgayHangHoaNhapKho() {
        return ngayHangHoaNhapKho;
    }

    public String getLoaiTP() {
        return loaiTP;
    }
}
