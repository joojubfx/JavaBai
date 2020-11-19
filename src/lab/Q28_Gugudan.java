package lab;

import java.util.Scanner;

public class Q28_Gugudan {

    /**28. 사용자로부터 숫자(1 - 9)를 하나 입력 받아, 구구단을 출력하는 프로그램을
    작성해보세요. 단, 1 - 9 이외의 숫자나 문자를 입력 받으면 “잘못 입력하셨습니다!!”라는 메시지를 출력하도록 합니다. (GuGuDan)*/

    public static void main(String[] args) {
        int i=0, num=0, num2=0;

        System.out.println("1~9까지 숫자를 입력하세요.");

        Scanner scn = new Scanner(System.in);

        num = scn.nextInt();

        if (num<1 || num>9) {
            System.out.println("잘못 입력하셨습니다.");
        }

        else {
            for (i=1; i<=9 ;i++){
                num2 = num * i;
                System.out.println(num + "x" + i + "=" + num2);
            }
        }
    }
}
