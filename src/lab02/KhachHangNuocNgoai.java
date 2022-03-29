package lab02;

import java.util.ArrayList;
import java.util.Scanner;

public class KhachHangNuocNgoai extends KhachHang{
    public String QuocTich;
    Scanner sc = new Scanner(System.in);

    public KhachHangNuocNgoai(){
        super();
        this.QuocTich = "";
    }

    public double ThanhTien(){
        if (SoLuong < DinhMuc[0]) {
            return ThanhTien = SoLuong * DonGia[0];
        } else if (DinhMuc[0] <= SoLuong && SoLuong < DinhMuc[1]) {
            return ThanhTien = SoLuong * DonGia[1];
        } else if (DinhMuc[1] <= SoLuong && SoLuong < DinhMuc[2]) {
            return ThanhTien = SoLuong * DonGia[2];
        } else {
            return ThanhTien = SoLuong * DonGia[3];
        }
    }

    @Override
    public void inputKH() {
        super.inputKH();
        System.out.println("Nhập quốc tịch khách hàng: ");
        QuocTich = sc.nextLine();
    }

    @Override
    public void outputKH() {
        super.outputKH();
        System.out.println("Quốc tịch khách hàng: " + QuocTich);
        System.out.println("Tổng tiền: " + ThanhTien);
    }

    //hàm tính tổng số lượng (kw)
//    public double TongSL(){
//        int sum2;
//        sum2 = this.SoLuong;
//        return sum2;
//    }


    //hàm tính trung bình tiền
    ArrayList<Double> dskhnn = new ArrayList<Double>();

    public void themKHNN(double thanhTien){
        dskhnn.add(thanhTien);
    }
    public double trungBinh() {
        double trungbinh;
        double tong = 0;
        if (dskhnn.size() == 0) {
            return trungbinh = 0;
        }
        else {
            for (Double thanhTien : dskhnn) {
                tong += thanhTien;
            }
            return trungbinh = tong / dskhnn.size();
        }
    }

}
