package lab02;

import java.util.ArrayList;
import java.util.Scanner;

public class KhachHangVN extends KhachHang {
    public String[] DoiTuongKH = {"Sinh hoạt", "Kinh doanh", "Sản xuất"};
    Scanner sc = new Scanner(System.in);
    int x;

    public KhachHangVN() {
        super();
    }

    public double ThanhTien() {
        if (SoLuong < DinhMuc[0]) {
            return ThanhTien = SoLuong * DonGia[0];
        } else if (DinhMuc[0] <= SoLuong && SoLuong < DinhMuc[1]) {
            return ThanhTien = SoLuong * DonGia[1];
        } else if (DinhMuc[1] <= SoLuong && SoLuong < DinhMuc[2]) {
            return ThanhTien = SoLuong * DonGia[2];
        } else {
            return ThanhTien = DonGia[3] * DinhMuc[2] + (SoLuong - DinhMuc[2]) * DonGia[3];
        }
    }

    @Override
    public void inputKH() {
        super.inputKH();
        System.out.println("Nhập đối tượng khách hàng (0 = SinhHoat, 1 = KinhDoanh, 2 = SanXuat): ");
        x = sc.nextInt();
    }

    @Override
    public void outputKH() {
        super.outputKH();
        System.out.println("Đối tượng khách hàng: " + DoiTuongKH[x]);
        System.out.println("Tổng tiền: " + ThanhTien);
    }

    //hàm tính tổng số lượng (kw)
//    public double TongSL(){
//        int sum1;
//        sum1 = this.SoLuong;
//        return sum1;
//    }


//    ArrayList<KhachHang> DSKH = new ArrayList<KhachHang>();
//    public void themKH(String date, String id, String name, String doituong, int soluong, double thanhTien){
//        DSKH.add(new KhachHang(MaKH,HoTenKH,NgayHD));
//    }
//    public void HD012019(){
//        if(this.NgayHD.equals("01/2019")){
//            System.out.println("Mã KH: " );
//        }
//    }


}
