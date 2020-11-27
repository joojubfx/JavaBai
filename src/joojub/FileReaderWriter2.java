package joojub;

import java.io.*;

// 2차원 표형태의 데이터를 파일에 저장하기
public class FileReaderWriter2 {
    public static void main(String[] args) throws IOException {
        // 학번, 이름, 주소, 생년월일, 학과명, 교수등으로 구성된 2차원 표형태의 데이터를 student.dat 에 저장하기
        int hakbun = 201350050;
        String name = "김태희";
        String addr = "경기도 고양시";
        String birth = "1985.3.22";
        String dname = "컴퓨터";
        int prof = 504;

        // 학생 기본정보를 student.dat에 저장함
        String fpath = "c:/java/student.dat";
        FileWriter fw = new FileWriter(fpath);
        // 기본 정보를 저장할 형식 정의
        String fmt = "%s, %s, %s, %s, %s, %s";
        String data = String.format(fmt, hakbun, name, addr, birth, dname, prof);

        fw.write(data);

        fw.close();

        //버퍼기능을 이용해서 FileWriter 사용

        fpath = "c:/java/subject.dat";
        fw = new FileWriter(fpath);
        BufferedWriter bw = new BufferedWriter(fw);

        String subjnum = "0205";
        String subjname = "프로그래밍";
        String subjgaeyo = "자바 프로그래밍";
        String subjprfs = "301";

        fmt = "%s, %s, %s, %s";
        data = String.format(fmt, subjnum, subjname, subjgaeyo, subjprfs);
        bw.write(data);

        bw.close();
        fw.close();

        // 과목 기본정보가 저장된 파일을 읽어서 출력하기
        FileReader fr = new FileReader(fpath);
        BufferedReader br = new BufferedReader(fr);
        fmt = "과목번호 : %s\n과목명 : %s\n과목개요 : %s\n담당교수 : %s\n";

        while (br.ready()) {
            String line = br.readLine();

            String[] items = line.split(",");
            String result = String.format(fmt, items[0],items[1],items[2],items[3]);
            System.out.println(result);
        }

        br.close();

    }
}
