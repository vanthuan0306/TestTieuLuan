package quanlykhohang;

import java.util.Date;

public class DienMay extends SanPham{
    
    private String hangSX;
    private String xuatXu;

    public DienMay(int soThuTu, String loaHangHoa, String maHangHoa, String tenHangHoa, int soHangHoaTonKho,
            int giaNhapHangHoa, Date ngayHangHoaNhapKho, String hangSX, String xuatXu){
        this.stt = soThuTu;
        this.loaiHangHoa = loaHangHoa;
        this.maHangHoa = maHangHoa;
        this.tenHangHoa = tenHangHoa;
        this.soHangHoaTonKho = soHangHoaTonKho;
        this.giaNhapHangHoa = giaNhapHangHoa;
        this.ngayHangHoaNhapKho = ngayHangHoaNhapKho;
        this.hangSX = hangSX;
        this.xuatXu = xuatXu;
    }

    public DienMay(){}

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

    public int getSoThuTu() {
        return stt;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
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

    public String getHangSX() {
        return hangSX;
    }

    public String getXuatXu() {
        return xuatXu;
    }
}
