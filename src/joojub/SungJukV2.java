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
 */
public class SungJukV2 {

    public static void main(String[] args) {
        //변수 선언
        String name = "";
        int kor = 0;
        int eng = 0;
        int mat = 0;
        int sum = 0;
        double mean = 0.0;
        char grd = '가';

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
        //String.format(형식지정자, 변수들)
        mean = Double.parseDouble(String.format("%.1f", mean));

        //결과출력

        System.out.println("이름 : " + name);
        System.out.println("국어 : " + kor);
        System.out.println("영어 : " + eng);
        System.out.println("수학 : " + mat);
        System.out.println("----------");
        System.out.println("총점 : " + sum);
        System.out.println("평균 : " + mean);
        //System.out.printf("평균 : %.1f\n", mean);
        System.out.println("학점 : " + grd);
    }
}
