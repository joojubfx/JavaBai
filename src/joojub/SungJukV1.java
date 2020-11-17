package joojub;

/**
 * 파일명 : SungJukV1
 * 작성일 : 2020.11.17
 *
 * 프로그램설명 : 성적처리프로그램 v1
 * 이름, 국어, 영어, 수학점수를 설정하면
 * 총점, 평균, 학점을 계산하고 결과 출력
 * name, kor, eng, mat, sum, mean, grd
 * 학점기준은 수우미양가
 * 만점은 100점으로.
 */
public class SungJukV1 {
//    public class Student {
//        String name;
//        int kor, eng, mat, sum, mean, grd;
//    }
//    public static void main(String[] args) {
//        Student std1 = new Student();
//        std1.name = "닐리리";
//        std1.eng = 80;
//        std1.kor = 70;
//        std1.mat = 90;
//
//        std1.sum = std1.eng+std1.kor+std1.mat;
//        std1.mean = std1.sum/3;
//
//        std1.grd = (std1.mean >=90) ? (std1.mean>=70 && std1.mean<=89) ? (std1.mean  )
//
//        }
//    }
    public static void main(String[] args) {
        //변수 선언
        String name = "지현";
        int kor = 99;
        int eng = 98;
        int mat = 99;
        int sum = 99;
        double mean = 0.0;
        char grd = '가';

        //처리
        sum = kor + eng + mat;
        mean = sum / 3;

        //결과출력
        System.out.println("이름 : " + name);
        System.out.println("국어 :" + kor);
        System.out.println("영어 :" + eng);
        System.out.println("수학 :" + mat);
        System.out.println("----------");
        System.out.println("총점 :" + sum);
        System.out.println("평균 :" + mean);
    }
}
