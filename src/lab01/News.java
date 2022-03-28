package lab01;

import java.util.Scanner;

public class News implements INews{
    public int ID;
    public String Title;
    public String PublishDate;
    public String Author;
    public String Content;
    public float AverageRate;
    //Khai báo một mảng có tên RateList kiểu int gồm 3 phần tử
    int[] RateList  = new int[3];


    //Tạo các phương thức setter và getter cho từng thuộc tính, riêng AverageRate thì chỉ có getter.
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public float getAverageRate() {
        return AverageRate;
    }

    //thực thi giao diện lab01.INews
    @Override
    public void Display() {
        System.out.println("ID: " + getID());
        System.out.println("Title: " + getTitle());
        System.out.println("PublishDate: " + getPublishDate());
        System.out.println("Author: " + getAuthor());
        System.out.println("Content: " + getContent());
        System.out.println("AverageRate: " + getAverageRate());

    }

    //Tạo một phương thức có tên Calculate() để thiết đặt thuộc tính AverageRate ở đó
    // a là trung bình cộng của 3 phần tử của mảng RateList ở ý d.


    public void Calculate() {
        float total = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập các phần tử của mảng: \n");
        for (int i = 0; i < 3; i++) {
            System.out.printf("RateList[%d] = ", i);
            RateList[i] = sc.nextInt();
            total = total + RateList[i];
        }
        AverageRate = (total)/3;
        System.out.println("\nTrung bình cộng của 3 phần tử mảng RateList là: " + AverageRate);
        return;
    }
}
