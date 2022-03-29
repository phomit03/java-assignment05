package lab02;

import java.util.Scanner;

public class KhachHang {
    protected int MaKH, SoLuong;
    protected double[] DonGia = {1000, 1200, 1500, 2000};
    public int[] DinhMuc = {50, 100, 200};
    protected double ThanhTien;
    protected String NgayHD, HoTenKH;

    public KhachHang() {
        MaKH = 0;
        SoLuong = 0;
        ThanhTien = 0;
        NgayHD = "";
        HoTenKH = "";
    }

    public KhachHang(int maKH, int soLuong, double[] donGia, double thanhTien, String ngayHD, String hoTenKH, Scanner sc) {
        MaKH = maKH;
        SoLuong = soLuong;
        DonGia = donGia;
        ThanhTien = thanhTien;
        NgayHD = ngayHD;
        HoTenKH = hoTenKH;
    }

    //getter & setter
    public int getMaKH() {
        return MaKH;
    }

    public void setMaKH(int maKH) {
        MaKH = maKH;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int soLuong) {
        SoLuong = soLuong;
    }

    public double[] getDonGia() {
        return DonGia;
    }

    public void setDonGia(double[] donGia) {
        DonGia = donGia;
    }

    public double getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(double thanhTien) {
        ThanhTien = thanhTien;
    }

    public String getNgayHD() {
        return NgayHD;
    }

    public void setNgayHD(String ngayHD) {
        NgayHD = ngayHD;
    }

    public String getHoTenKH() {
        return HoTenKH;
    }

    public void setHoTenKH(String hoTenKH) {
        HoTenKH = hoTenKH;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    //nhập thông tin khách hàng
    Scanner sc = new Scanner(System.in);
    public void inputKH(){
        System.out.println("Nhập mã khách hàng: ");
        MaKH = sc.nextInt();
        System.out.println("Nhập tên khách hàng: ");
        HoTenKH = sc.nextLine();
        HoTenKH = sc.nextLine();
        System.out.println("Nhập ngày xuất hoá đơn: ");
        NgayHD = sc.nextLine();
        System.out.println("Nhập số lượng tiêu thụ: ");
        SoLuong = sc.nextInt();
    }
    public void outputKH(){
        System.out.println("Mã khách hàng: " + MaKH);
        System.out.println("Tên khách hàng: " + HoTenKH);
        System.out.println("Ngày xuất hoá đơn: " + NgayHD);
        System.out.println("Số lượng tiêu thụ: " + SoLuong);
    }

}
