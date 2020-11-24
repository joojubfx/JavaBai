package joojub;

import java.util.Scanner;

/**
 * 로그인 확인 프로그램
 * 0. 인증용 아이디와 비밀번호를 하나 생성해 둠
 *  => abc123, 987xyz
 * 1. scanner 로 아이디, 비밀번호를 입력받음
 * 2a. 아이디와 비밀번호가 틀리면 "가입되지 않은 아이디!"
 * 2b. 아이디만 맞으면 "비밀번호가 틀렸음"
 * 2c. 아이디와 비밀번호가 맞으면 "로그인 성공!"
 */

public class LoginME {
    public static void main(String[] args) {
        String name = "abc123";
        String code = "987xyz";
        String username = "";
        String usercode = "";

        while (true) {
            Scanner un = new Scanner(System.in);
            System.out.println("아이디를 입력하세요");
            username = un.nextLine();

            Scanner uc = new Scanner(System.in);
            System.out.println("비밀번호을 입력하세요");
            usercode = uc.nextLine();

            if (name.equals(username) && code.equals(usercode)) { System.out.println("로그인 성공!"); break; }

            else if (name.equals(username)) System.out.println("비밀번호가 틀렸음");

            else System.out.println("가입되지 않은 아이디!");
        }
    }
}
