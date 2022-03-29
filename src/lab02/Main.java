package lab02;

public class Main {
    public static void main(String[] args) {
        //nhap
        KhachHangVN khvn1 = new KhachHangVN();
        KhachHangVN khvn2 = new KhachHangVN();
        KhachHangVN khvn3 = new KhachHangVN();
        System.out.println("Vui lòng nhập thông tin khách hàng Việt Nam 1.");
        khvn1.inputKH();
        System.out.println("\nVui lòng nhập thông tin khách hàng Việt Nam 2.");
        khvn2.inputKH();
        System.out.println("\nVui lòng nhập thông tin khách hàng Việt Nam 3.");
        khvn3.inputKH();


        KhachHangNuocNgoai khnn1 = new KhachHangNuocNgoai();
        System.out.println("\nVui lòng nhập thông tin khách hàng nước ngoài 1.");
        khnn1.inputKH();
        KhachHangNuocNgoai khnn2 = new KhachHangNuocNgoai();
        System.out.println("\nVui lòng nhập thông tin khách hàng nước ngoài 2.");
        khnn2.inputKH();
        KhachHangNuocNgoai khnn3= new KhachHangNuocNgoai();
        System.out.println("\nVui lòng nhập thông tin khách hàng nước ngoài 3.");
        khnn3.inputKH();

        //in
        System.out.println("\nThông tin khách hàng Việt Nam 1: ");
        khvn1.ThanhTien();
        khvn1.outputKH();
        System.out.println("\nThông tin khách hàng Việt Nam 2: ");
        khvn2.ThanhTien();
        khvn2.outputKH();
        System.out.println("\nThông tin khách hàng Việt Nam 3: ");
        khvn3.ThanhTien();
        khvn3.outputKH();

        System.out.println("\nThông tin khách hàng nước ngoài 1: ");
        khnn1.ThanhTien();
        khnn1.outputKH();
        System.out.println("\nThông tin khách hàng nước ngoài 2: ");
        khnn2.ThanhTien();
        khnn2.outputKH();
        System.out.println("\nThông tin khách hàng nước ngoài 3: ");
        khnn3.ThanhTien();
        khnn3.outputKH();

        //Tổng số lượng kw của từng loại khách hàng
        int sum1, sum2;
        sum1 = khvn1.SoLuong + khvn2.SoLuong + khvn3.SoLuong;
        sum2 = khnn1.SoLuong + khnn2.SoLuong + khnn3.SoLuong;
        KhachHangNuocNgoai khnn = new KhachHangNuocNgoai();
        KhachHangVN khvn = new KhachHangVN();
        System.out.println("\nTong So Luong (KW) Dien cua KH Viet Nam: " + sum1 + " (KW)");
        System.out.println("Tong So Luong (KW) Dien cua KH Nuoc Ngoai: " + sum2 + " (KW)");

        //Tính trung bình thành tiền của khách hàng người nước ngoài.
        KhachHangNuocNgoai dsknn1 = new KhachHangNuocNgoai();
        dsknn1.themKHNN(khnn1.ThanhTien());
        dsknn1.themKHNN(khnn2.ThanhTien());
        dsknn1.themKHNN(khnn3.ThanhTien());
        dsknn1.trungBinh();
        System.out.format("\nTrung bình tiền điện của KH Nước Ngoài: %.3f", dsknn1.trungBinh() + "$");

        //Xuất ra các hoá đơn trong tháng 01 năm 2019 (a cả 2 loại khách hàng).
        System.out.println("Các hoá đơn trong tháng 01 năm 2019 của KH Việt Nam: ");
        System.out.println("Các hoá đơn trong tháng 01 năm 2019 của KH Nước Ngoài: ");





    }
}
