package lab;

public class Department {
    //     학과명      전화번호        사무실위치        학과장
    String dname; String phone; String office; String chief;


    public Department() {
    }

    public Department(String dname, String phone, String office, String chief) {
        this.dname = dname;
        this.phone = phone;
        this.office = office;
        this.chief = chief;
    }
}