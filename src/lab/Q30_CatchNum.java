package lab;

import java.util.Scanner;

public class Q30_CatchNum {

    /**30. 다음 조건에 따라 숫자 맞추기 프로그램을 작성해보세요. (CatchNumber)

     가. 사용자로부터 1 - 100사이의 숫자를 입력 받으세요 (num1)

     나. 변수에 임의의 숫자 3자리를 초기화합니다 (num2)

     다.  num1이 num2보다 크면 “추측한 숫자가 큽니다”라고 출력하세요

     라.  num1이 num2보다 작으면 “추측한 숫자가 작습니다”라고 출력하세요

     마.  num1과 num2가 같으면 “빙고! 숫자를 맞췄습니다”라고 출력하고 종료
     */

    public static void main(String[] args) {
        int num1=0, num2=0;

        System.out.println("1~999까지의 숫자를 입력하세요.");
        Scanner scn = new Scanner(System.in);
        num1 = scn.nextInt();

        if (num1==0 || num1>999) {
            System.out.println("범위에 맞는 숫자를 입력하세요");
        }
        else {
            num2 = (int)((Math.random() * 900)+100);
            System.out.println("추측값 : " + num1 + "\n랜덤값 : " + num2);

            if (num1 > num2) System.out.println("추측한 숫자가 큽니다.");
            else if (num1 < num2) System.out.println("추측한 숫자가 작습니다.");
            else System.out.println("빙고 숫자를 맞췄습니다.");
        }
    }
}
