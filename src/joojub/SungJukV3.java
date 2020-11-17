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

    public static void main(String[] args) {
        //변수 선언
        //배열변수 자료형 변수명[] = new 자료형[크기]

        String name[] = new String[3];
        int kor[] = new int[3];
        int eng[] = new int[3];
        int mat[] = new int[3];
        int sum[] = new int[3];
        double mean[] = new double[3];
        char grd[] = new char[3];

        String fmt = " 이름 : %s\n 국어 : %d\n 영어 : %d\n 수학 : %d\n 총점 : %d\n 평균 : %.2f\n 학점 : %c\n";
        //처리

        //성적데이터를 입력 하기 위해 스캐너 클래스 초기화
        Scanner scn = new Scanner(System.in);

        for (int i=0; i<3; i++) {
            System.out.println((i+1) + "번째 학생 성적 입력중");
            System.out.print("이름  ");
            name[i] = scn.nextLine();
            System.out.print("한국어점수  ");
            kor[i] = Integer.parseInt(scn.nextLine());
            System.out.print("영어점수  ");
            eng[i] = Integer.parseInt(scn.nextLine());
            System.out.print("수학점수  ");
            mat[i] = Integer.parseInt(scn.nextLine());
            //scn.skip("\r\n|[\r\n]");
            }
        //수학성적 입력시 같이 입력된 엔터키가 다음 데이터(이름) 입력시 입력값으로 자동으로 전달됨
        //그런 상황을 해결하기 위해 미리 엔터키를 제거 하는 코드 삽입

        for (int i=0; i<3; i++) {
            sum[i] = kor[i] + eng[i] + mat[i];
            mean[i] = (double) sum[i] / 3;


            switch ((int) mean[i] / 10) {
                case 10:
                case 9: grd[i] = '수'; break;
                case 8: grd[i] = '우'; break;
                case 7: grd[i] = '미'; break;
                case 6: grd[i] = '양'; break;
                default: grd[i] = '가';
            }

            mean[i] = Math.round(mean[i] * 100) / 100.0;

        }
        for (int i=0; i<3; i++) {
            System.out.printf(fmt, name[i], kor[i], eng[i], mat[i], sum[i], mean[i], grd[i]);
        }
    }
}
