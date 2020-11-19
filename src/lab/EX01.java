package lab;

public class EX01 {
    public static void main(String[] args) {
        //학생 클래스를 이용해서 객체 생성
        Student s = new Student();
        s.stdno = 201350050;
        s.name = "김태희";
        s.addr = "경기도 고양시";
        s.birth = "1985.3.22";
        s.dept = "학과명";
        s.prof = "504";

        //학과 클래스를 이용해서 객체 생성
        Department d = new Department();
        d.dname = "컴퓨터 공학";
        d.phone = "123-456-78901";
        d.office = "E동 2층";
        d.chief = "504";

        //과목 클래스를 이용해서 객체 생성
        Subject sj = new Subject();
        sj.no = "0205";
        sj.subjname = "프로그래밍";
        sj.subjdesc = "자바프로그래밍";
        sj.prof = "301";

        //교수 클래스를 이용해서 객체 생성
        Professor p = new Professor();
        p.no = "301";
        p.name = "이순신";
        p.mjfield = "프로그래밍";

        //각 객체에 대해 변수에 값 대입

        //기본 생성자를 이용한 객체 생성 및 초기화
        //학생
        Student song = new Student();
        //학과
        //과목
        //교수

        //매개변수 생성자를 이용한 객체 생성 및 초기화
        // 학생
        Student jun = new Student(201252110, "전지현", "경기도 의정부시", "1986.4.30", "의상디자인", "445");
        //학과
        //과목
        //교수



        //객체에 저장된 값 출력
        System.out.println(s.stdno);
        System.out.println(s.name);
        System.out.println(s.addr);
        System.out.println(s.birth);
        System.out.println(s.dept);
        System.out.println(s.prof);

        System.out.println(song.stdno);
        System.out.println(song.name);
        System.out.println(song.addr);
        System.out.println(song.birth);
        System.out.println(song.dept);
        System.out.println(song.prof);

        System.out.println(jun.stdno);
        System.out.println(jun.name);
        System.out.println(jun.addr);
        System.out.println(jun.birth);
        System.out.println(jun.dept);
        System.out.println(jun.prof);
    }
}

