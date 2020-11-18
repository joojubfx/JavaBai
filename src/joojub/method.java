package joojub;

import java.util.Scanner;

/**
 * 파일명 : SungJukV4
 * 작성일 : 2020.11.18
 *
 * 프로그램설명 : 성적처리프로그램 v4
 * 학생 3명의
 * 이름, 국어, 영어, 수학점수를 키보드로 입력받아
 * 총점, 평균, 학점을 계산하고 결과 출력
 * 단 평균은 소수점 첫째자리까지
 * name, kor, eng, mat, sum, mean, grd
 * 학점기준은 수우미양가로 하되 switch 문으로
 * 만점은 100점으로.
 *
 * 성적처리 기능을 구현함으로써 코드가 길어지가 내용파악이 어려워 지는 것을 방지하기 위해
 * 함수(메서드)로 재정의
 *
 */
public class method {
    /** 메서드
     * 특정 작업을 수행하기 위해 작성한 명령어들의 묶음
     * c언어의 함수와 비슷한 성격을 가지는 프로그래밍 요소
     * 입력값을 통해 무언가 하고 그 결과를 도출하는 수학의 함수(블랙박스)와 비슷한 개념
     *
     * 메서드의 목적
     * 프로그램을 작성하다보면 반복적으로 쓰인 코드를 종종 보는데
     * 효율적으로 작성하려면 반복문으로 처리하면 되지만 반복문이 반복된다면
     * 메서드를 적용하면 기능별로 모듈화를 적용할 수 있기 때문에 프로그램의 가독성이 좋아지고
     * 협업시에도 유용하며 기능변경시 유지보수에도 좋음
     * *
     */

    /**
     * 메서드 정의
     * 접근제한자 리턴값 메서드이름(타입 매개변수명){
     *    메서드 몸체
     * }
     */

    public static void main(String[] args) {
        //인사말 메소드 출력
        sayHello();
        System.out.println("-----------------");
        sayHello2();
        System.out.println("-----------------");
        sayHello3("안녕");
        System.out.println("-----------------");
        System.out.println(sayHello4("방가방가"));
        System.out.println("-----------------");
        computeNum(8, 9);
        System.out.println("-----------------");
        computeAllSum(1, 5);
        System.out.println("-----------------");
        computeAllSum2(100, 1);
    }

    /**
     * public : 접근제한자, 외부클래스의 메서드 사용허가 여부
     * static : 정적 메서드, 객체생성 없이 바로 호출가능
     * void : 메서드가 반환하는 값이 없음
     */

    //간단한 인삿말 출력 메서드
    public static void sayHello() {
        System.out.println("Hello World!!");
    }
    //간단한 인삿말을 3번 출력하는 메서드 :sayHello2
    public static void sayHello2() {
        for (int i=0; i<=2; i++ ) {
            System.out.println("Hello World!!");
        }
    }

    //인삿말을 변경해서 3번 출력하는 메서드 :sayHello3
    //매개변수 : 메서드 처리시 필요로 하는 입력값
    public static void sayHello3(String msg) {
        for (int i=0; i<=2; i++ ) {
            System.out.println(msg);
        }
    }

    /*인삿말을 변경해서 3번 출력하는 메서드 :sayHello3
    인삿말 출력을 메서드가 바로 하지 않고 인삿말 생성후 호출한 대상에게 넘김
     */
    public static String sayHello4(String name) {
        return name;
    }

    /*두개의 정수를 매개변수로 선언하고 사칙연산한 결과를 출력하는 메서드
    computeNum
    ? + ? = ?
    ? - ? = ?
    ? × ? = ?
    ? ÷ ? = ?
    */
    public static void computeNum(int num1, int num2) {
        int num3=0;
        num3 = num1 + num2;
        System.out.println(num1 + "+" + num2 + "=" + num3);

        num3 = num1 - num2;
        System.out.println(num1 + "-" + num2 + "=" + num3);

        num3 = num1 * num2;
        System.out.println(num1 + "×" + num2 + "=" + num3);

        num3 = num1 / num2;
        System.out.println(num1 + "÷" + num2 + "=" + num3);
    }

    // 두개의 정수를 매개변수로 선언한고 두 정수를 범위로 설정해서 그것의 모든 합을 구하고 출력하는 메서드
    // computeAllSum
    // ex) 5,1 -> 1+2+3+4+5+ = 15

    public static void computeAllSum(int num1, int num2) {
        int vnum1=0, vnum2=0, vnum3=0;
        String fmt = "%d ~ %d 정수범위 총합 : %d\n";

        if (num1>num2) {vnum1 = num2; vnum2 = num1;}
        else {vnum1 = num1; vnum2 = num2;}

        for (int i=vnum1; i<=vnum2; i++) {
            vnum3 += i;
            System.out.println(i + "+" + (i+1) + "=" + (i+(i+1)));
        }

        System.out.printf(fmt, num1, num2, vnum3);

    }

    public static void computeAllSum2(int num1, int num2) {
        int vnum1=0, vnum2=0, vnum3=0;
        String fmt = "%d ~ %d 정수범위 총합 : %d\n";

        if (num1>num2) {vnum1 = num2; vnum2 = num1;}
        else {vnum1 = num1; vnum2 = num2;}

        vnum3 = ((vnum1+vnum2) * vnum2) /2; //가우스 덧셈

        System.out.printf(fmt, num1, num2, vnum3);

    }
}
