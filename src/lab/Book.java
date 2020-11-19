package lab;

public class Book {
    //멤버변수 선언
    String name;
    String writer;
    String pubname;
    int price;
    double discount;
    String bkimg;

    //기본 생성자
    public Book() {
    }
    //매개변수 생성자
    public Book(String name, String writer, String pubname, int price, double discount, String bkimg) {
        this.name = name;
        this.writer = writer;
        this.pubname = pubname;
        this.price = price;
        this.discount = discount;
        this.bkimg = bkimg;
    }
}
