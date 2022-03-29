# java-assignment05
Java Seasion05

LAB01: 
1. Tạo một giao diện (interface) có tên INews bao gồm phương thức void Display().

2. Tạo một lớp có tên News:

a. Khai báo các thuộc tính bao gồm: ID (int), Title (String), PublishDate (String), Author (String), Content (String) và AverageRate (float). Tạo các phương thức setter và getter cho từng thuộc tính, riêng AverageRate thì chỉ có getter.

b. Thực thi giao diện INews.

c. Phương thức Display() sẽ in ra Title, PublishDate, Author, Content và AverageRate của tin tức ra console.

d. Khai báo một mảng có tên RateList kiểu int gồm 3 phần tử.

e. Tạo một phương thức có tên Calculate() để thiết đặt thuộc tính AverageRate ở ý a là trung bình cộng của 3 phần tử của mảng RateList ở ý d.

LAB02:
Xây dựng chương trình quản lý danh sách hoá đơn tiền điện của khách hàng. Thông tin bao gồm các loại khách hàng :
+ Khách hàng Việt Nam: mã khách hàng, họ tên, ngày ra hoá đơn (ngày, tháng, năm), đối tượng khách hàng (sinh hoạt, kinh doanh, sản xuất): số lượng (số KW tiêu thụ). Thành tiền được tính như sau:
- Nếu số lượng <= định mức thì: thành tiền = số lượng * đơn giá.
- Ngược lại thì: thành tiền = đơn giá * định mức + số lượng KW vượt định mức * Đơn giá mới
+ Khách hàng nước ngoài: mã khách hàng, họ tên, ngày ra hoá đơn (ngày, tháng, năm), quốc tịch, số lượng.
Thành tiền được tính = số lượng * đơn giá.
Thực hiện các yêu cầu sau:
+ Nhập xuất danh sách các hóa đơn khách hàng.
+ Tính tổng số lượng cho từng loại khách hàng.
+ Tính trung bình thành tiền của khách hàng người nước ngoài.
+ Xuất ra các hoá đơn trong tháng 01 năm 2019 (cùa cả 2 loại khách hàng).

1 Mảng định mức, đơn giá như sau
<50: giá 1000đ
50-100: giá 1200đ
100-200: giá 1500đ
>200: giá 2000đ
