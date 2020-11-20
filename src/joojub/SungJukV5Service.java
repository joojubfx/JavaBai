package joojub;

import java.util.Scanner;

public class SungJukV5Service {
    /**
     * 성적 데이터 입력 메서드
     * retunrn 키보드로 입력받은 성적데이터 SungJukV5VO
     */
    public SungJukV5VO readSungJuk() {

        String name;
        int kor, eng, mat;
        Scanner scn = new Scanner(System.in);

        System.out.print("이름  ");
        name = scn.nextLine();
        System.out.print("한국어점수  ");
        kor = scn.nextInt();
        System.out.print("영어점수  ");
        eng = scn.nextInt();
        System.out.print("수학점수  ");
        mat = scn.nextInt();

        return new SungJukV5VO(name, kor, eng, mat,0,0,' ');
    }

    /**
     * 입력받은 성적에 대해 총점, 평균, 학점을 계산하는 메서드
     */
    public void computeSungJuk(SungJukV5VO sj){

        sj.setSum(sj.getKor() + sj.getEng() + sj.getMat());

        sj.setMean ((double)sj.getSum() / 3);

        switch ((int)sj.getMean()/10) {
            case 10 :
            case 9 : sj.setGrd('수'); break;
            case 8 : sj.setGrd('우'); break;
            case 7 : sj.setGrd('미'); break;
            case 6 : sj.setGrd('양'); break;
            default: sj.setGrd('가');
        }
    }//computeSungJuk

    /**
     * 입력한 이름, 국어, 영어, 수학점수와 계산된 총점, 평균, 학점등을 출력하는 메서드
     */
    public void printSungJuk(SungJukV5VO sj) {

        String fmt = " 이름 : %s\n 국어 : %d\n 영어 : %d\n 수학 : %d\n 총점 : %d\n 평균 : %.2f\n 학점 : %c\n";
        String result;
        result = String.format(fmt, sj.getName(), sj.getKor(), sj.getEng(), sj.getMat(), sj.getSum(), sj.getMean(), sj.getGrd());
        System.out.println(result);
    }
}

