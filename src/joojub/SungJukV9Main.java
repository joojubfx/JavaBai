package joojub;

import java.io.IOException;
import java.util.Scanner;

/**
        * 파일명 : SungJukV9Main
        * 작성일 : 2020.11.27
        *
        * 프로그램설명 : 성적처리프로그램 v9
        * 성적처리 프로그램에 저장기능을 추가, sungjuk.dat 라는 파일을 생성해서 입력한 성적데이터는 이곳에 저장
        */

public class SungJukV9Main {
    public static void main(String[] args) throws IOException {
        SungJukV9Service srv = new SungJukV9Service();

        Scanner sc = new Scanner(System.in);

        int menu=0;
        while (true) {
            srv.displayMenu();
            menu = sc.nextInt();
            //int menu= System.in.read();

            switch(menu) {
                case 1 : srv.newSungJuk(); break;      //입력
                case 2 : srv.readSungJuk(); break;     //조회
                case 3 : srv.readOneSungJuk(); break;  //상세조회
                case 4 : srv.modifySungJuk(); break;   //수정
                case 5 : srv.removeSungJuk(); break;   //삭제
                case 0 : System.exit(0); break;         //삭제
                default:
                    System.out.println(menu);
                    System.out.println("잘못된 입력입니다.");
            }
        }
    }
}
