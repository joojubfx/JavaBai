package semiproject;

import java.util.Scanner;

public class EmployeeV2Main {
    public static void main(String[] args) {
        EmployeeV2Service srv = new EmployeeV2Service();

        Scanner sc = new Scanner(System.in);

        int menu=0;
        while (true) {
            srv.displayMenu();
            menu = sc.nextInt();
            //int menu= System.in.read();

            switch(menu) {
                case 1 : srv.newEmployee(); break;      //입력
                case 2 : srv.readEmployee(); break;     //조회
                case 3 : srv.readOneEmployee(); break;  //상세조회
                case 4 : srv.modifyEmployee(); break;   //수정
                case 5 : srv.removeEmployee(); break;   //삭제
                case 0 : System.exit(0); break;         //삭제
                default:
                    System.out.println(menu);
                    System.out.println("잘못된 입력입니다.");
            }
        }
    }
}
