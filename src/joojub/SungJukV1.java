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
    public class Student {
        String name;
        int kor, eng, mat, sum, mean, grd;
    }
    public static void main(String[] args) {
        Student std1 = new Student();
        std1.name = "닐리리";
        std1.eng = 80;
        std1.kor = 70;
        std1.mat = 90;

        std1.sum = std1.eng+std1.kor+std1.mat;
        std1.mean = std1.sum/3;

        std1.grd = (std1.eng >=90) ? (std1.eng>=70 && std1.eng<=89) ? (std1.eng )

        }
    }
}
