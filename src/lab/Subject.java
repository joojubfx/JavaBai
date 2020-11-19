package lab;

public class Subject {
    //   과목번호          과목명         과목개요       담당교수
    String no; String subjname; String subjdesc; String prof;

    public Subject() {
    }

    public Subject(String no, String subjname, String subjdesc, String prof) {
        this.no = no;
        this.subjname = subjname;
        this.subjdesc = subjdesc;
        this.prof = prof;
    }
}
