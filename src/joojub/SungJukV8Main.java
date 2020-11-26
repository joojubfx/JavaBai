package joojub;

import java.io.IOException;
import java.util.Scanner;

/**
        * 파일명 : SungJukV8Main
        * 작성일 : 2020.11.26
        *
        * 프로그램설명 : 성적처리프로그램 v8
        * 성적처리 프로그램을 체계적으로 만들려고 함
        * 객체지향 기법을 토대로 CRUD 기능을 제공하도록 작성
        * 성적데이터 입력/조회/수정/삭제 메뉴를 제공해서 프로그램의 사용성을 높임
        * 즉, 입력받은 성적데이터를 동적배열에 저장하고 저장된 성적데이터를 조회하거나 수정, 삭제할 수 있도록 함
        *
        * SungJukService : readSungJuk, showSungJuk, showOneSungJuk
        *                  modifySungJuk, removeSungJuk, displayMenu, computeSungJuk
        */

public class SungJukV8Main {
    public static void main(String[] args) throws IOException {
        SungJukV8Service srv = new SungJukV8Service();

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
