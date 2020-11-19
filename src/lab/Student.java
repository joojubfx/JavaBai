package lab;

public class Student {
    //    학번          이름         주소        생년월일        학과명         교수
    int stdno; String name; String addr; String birth; String dept; String prof;
    //기본 생성자
    public Student() {
        stdno = 201250006;
        name = "송혜교";
        addr = "서울영등포구";
        birth = "1988.9.17";
        dept = "컴퓨터";
        prof = "301";
    }

    //매개변수를 사용하는 생성자
    //매개변수명과 멤버변수명이 같은 경우 변수가림shadowing 현상 발생
    //클래스의 멤버변수임을 명확하게 표현하기 위해 변수명 앞에 this라는 키워드를 추가 작성
    public Student(int stdno, String name, String addr, String birth, String dept, String prof) {
        this.stdno = stdno;
        this.name = name;
        this.addr = addr;
        this.birth = birth;
        this.dept = dept;
        this.prof = prof;
    }
}


