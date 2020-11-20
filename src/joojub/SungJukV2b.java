package joojub;

import java.util.Scanner;

/**
 * 파일명 : SungJukV2
 * 작성일 : 2020.11.17
 *
 * 프로그램설명 : 성적처리프로그램 v2
 * 이름, 국어, 영어, 수학점수를 키보드로 입력받아
 * 총점, 평균, 학점을 계산하고 결과 출력
 * 단 평균은 소수점 첫째자리까지
 * name, kor, eng, mat, sum, mean, grd
 * 학점기준은 수우미양가로 하되 switch 문으로
 * 만점은 100점으로.
 *
 * 성적처리 결과 출력시 출력문을 하나만 사용하기로 함
 * 그리고 Math.round()를 이용해서 평균은 소수점 둘째자리까지 끊어서 출력
 */
public class SungJukV2b {

    public static void main(String[] args) {
        //변수 선언
        String name = "";
        int kor;
        int eng;
        int mat;
        int sum;
        double mean;
        char grd;
        String fmt = " 이름 : %s\n 국어 : %d\n 영어 : %d\n 수학 : %d\n 총점 : %d\n 평균 : %.2f\n 학점 : %c\n";

        String result;
        //처리

        //성적데이터를 입력 하기 위해 스캐너 클래스 초기화
        Scanner scn = new Scanner(System.in);

        System.out.print("이름  ");
        name = scn.nextLine();
        System.out.print("한국어점수  ");
        kor = scn.nextInt();
        System.out.print("영어점수  ");
        eng = scn.nextInt();
        System.out.print("수학점수  ");
        mat = scn.nextInt();


        sum = kor + eng + mat;
        mean = (double)sum / 3;

        /*grd = (mean >= 90) ? '수' :
              (mean >= 80) ? '우' :
              (mean >= 70) ? '미' :
              (mean >= 60) ? '양' : '가';*/

        //학점계산은 switch문으로 처리
        switch ((int)mean/10) {
            case 10 :
            case 9 : grd = '수'; break;
            case 8 : grd = '우'; break;
            case 7 : grd = '미'; break;
            case 6 : grd = '양'; break;
            default : grd = '가';
        }
        //Math.round(값) : 반올림
        //String.value0f() : 숫자를 문자로 변환


        mean = Math.round(mean*100)/100.0;

        result = String.format(fmt, name, kor, eng, mat, sum, mean, grd);

        //결과출력

        // 문자열 연결 연산자로 문장을 만드는 경우 String 자료형의 특성때문에 성능저하 발생

        System.out.println(result);
    }
}
