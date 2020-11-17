package joojub;

import java.util.Scanner;

/**
 * 파일명 : SungJukV3
 * 작성일 : 2020.11.17
 *
 * 프로그램설명 : 성적처리프로그램 v3
 * 학생 3명의
 * 이름, 국어, 영어, 수학점수를 키보드로 입력받아
 * 총점, 평균, 학점을 계산하고 결과 출력
 * 단 평균은 소수점 첫째자리까지
 * name, kor, eng, mat, sum, mean, grd
 * 학점기준은 수우미양가로 하되 switch 문으로
 * 만점은 100점으로.
 *
 * 성적처리 결과 출력시 출력문을 하나만 사용하기로 함
 */
public class SungJukV3 {
//    public class Student {
//        String name;
//        int kor, eng, mat, sum, mean;
//        char grd;
//        String f
//    }

    public static void main(String[] args) {
        //변수 선언
        final int NUM = 3;
        String name[] = new String[NUM];
        int kor[] = new int[NUM];
        int eng[] = new int[NUM];
        int mat[] = new int[NUM];
        int sum[] = new int[NUM];
        double mean[] = new double[NUM];
        char grd[] = new char[NUM];
        String fmt = " 이름 : %s\n 국어 : %d\n 영어 : %d\n 수학 : %d\n 총점 : %d\n 평균 : %.2f\n 학점 : %c\n";

        String result[] = new String[NUM];
        //처리

        //성적데이터를 입력 하기 위해 스캐너 클래스 초기화
        Scanner scn = new Scanner(System.in);

        for (int i=0; i<=2; i++) {
            System.out.println((i+1) + "번째 학생 성적 입력중");
            System.out.print("이름  ");
            name[i] = scn.next();
            System.out.print("한국어점수  ");
            kor[i] = scn.nextInt();
            System.out.print("영어점수  ");
            eng[i] = scn.nextInt();
            System.out.print("수학점수  ");
            mat[i] = scn.nextInt();

            sum[i] = kor[i] + eng[i] + mat[i];
            mean[i] = (double) sum[i] / 3;

        /*grd = (mean >= 90) ? '수' :
              (mean >= 80) ? '우' :
              (mean >= 70) ? '미' :
              (mean >= 60) ? '양' : '가';*/

            //학점계산은 switch문으로 처리
            switch ((int) mean[i] / 10) {
                case 10:
                case 9: grd[i] = '수'; break;
                case 8: grd[i] = '우'; break;
                case 7: grd[i] = '미'; break;
                case 6: grd[i] = '양'; break;
                default: grd[i] = '가';
            }
            //Math.round(값) : 반올림
            //String.value0f() : 숫자를 문자로 변환


            mean[i] = Math.round(mean[i] * 100) / 100.0;

            result[i] = String.format(fmt, name[i], kor[i], eng[i], mat[i], sum[i], mean[i], grd[i]);

            //결과출력

            // 문자열 연결 연산자로 문장을 만드는 경우 String 자료형의 특성때문에 성능저하 발생


        }
        for (int j=0; j<=2; j++) {
            System.out.println(result[j]);        }

    }
}
