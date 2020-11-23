package joojub;

import java.util.Scanner;

/**
 * 파일명 : SungJukV6Main
 * 작성일 : 2020.11.23
 *
 * 프로그램설명 : 성적처리프로그램 v6
 * 중간고사와 기말고사 성적처리프로그램
 * v1을 토대로 중간고사 성적과 기말고사 성적 클래스를 상속을 이용해서 작성하세요
 *
 * 중간고사 : 국어 영어 수학
 * 기말고사 : 국어 영어 수학 미술 과학
 *
 */

public class SungJukV6Main {
    public static void main(String[] args) {
        MidSungJuk msj = new MidSungJuk();

        msj.readSungJuk();
        msj.computeSungJuk();
        msj.printSungJuk();

        FinalSungJuk fsj = new FinalSungJuk();

        fsj.readSungJuk();
        fsj.computeSungJuk();
        fsj.printSungJuk();
    }
}

class MidSungJuk {
    protected String name;
    protected int kor;
    protected int eng;
    protected int mat;
    protected int sum;
    protected double mean;
    protected char grd;

    public MidSungJuk() {
    }

    public MidSungJuk(String name, int kor, int eng, int mat) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getKor() {
            return kor;
        }

        public void setKor(int kor) {
            this.kor = kor;
        }

        public int getEng() {
            return eng;
        }

        public void setEng(int eng) {
            this.eng = eng;
        }

        public int getMat() {
            return mat;
        }

        public void setMat(int mat) {
            this.mat = mat;
        }

        public int getSum() {
            return sum;
        }

        public void setSum(int sum) {
            this.sum = sum;
        }

        public double getMean() {
            return mean;
        }

        public void setMean(double mean) {
            this.mean = mean;
        }

        public char getGrd() {
            return grd;
        }

        public void setGrd(char grd) {
            this.grd = grd;
        }
        protected void readSungJuk() {
            Scanner scn = new Scanner(System.in);

            System.out.print("이름  ");
            name = scn.nextLine();
            System.out.print("한국어점수  ");
            kor = scn.nextInt();
            System.out.print("영어점수  ");
            eng = scn.nextInt();
            System.out.print("수학점수  ");
            mat = scn.nextInt();
        }

        protected void computeSungJuk() {
            sum = kor + eng + mat;
            mean = (double)sum / 3;

            grd = (mean >= 90) ? '수' :
                  (mean >= 80) ? '우' :
                  (mean >= 70) ? '미' :
                  (mean >= 60) ? '양' : '가';
        }

        protected void printSungJuk() {
            String fmt = " 이름 : %s\n 국어 : %d\n 영어 : %d\n 수학 : %d\n 총점 : %d\n 평균 : %.2f\n 학점 : %c\n";
            String result;
            result = String.format(fmt, name, kor, eng, mat, sum, mean, grd);
            System.out.println(result);
        }
}

class FinalSungJuk extends MidSungJuk {
     protected int art;
     protected int sci;

     public FinalSungJuk() {
     }

     public FinalSungJuk(String name, int kor, int eng, int mat, int art, int sci) {
         super(name, kor, eng, mat);
         this.art = art;
         this.sci = sci;
     }

    /**부모 클래스에 정의된 멤버변수 초기화코드는 super로 치환해서 호출할 수 있음
     * super(생성자 매개변수 목록)
     * super.메서드
     * super.멤버변수
     */

    @Override
     protected void readSungJuk() {
         Scanner scn = new Scanner(System.in);
         super.readSungJuk();
         System.out.print("미술점수  ");
         art = scn.nextInt();
         System.out.print("과학점수  ");
         sci = scn.nextInt();
    }

    protected void computeSungJuk() {
        sum = kor + eng + mat + art + sci;
        mean = (double)sum / 5;

        grd = (mean >= 90) ? '수' :
              (mean >= 80) ? '우' :
              (mean >= 70) ? '미' :
              (mean >= 60) ? '양' : '가';
    }

    protected void printSungJuk() {
        String fmt = " 이름 : %s\n 국어 : %d\n 영어 : %d\n 수학 : %d\n 미술 : %d\n 과학 : %d\n 총점 : %d\n 평균 : %.2f\n 학점 : %c\n";
        String result;
        result = String.format(fmt, name, kor, eng, mat, art, sci, sum, mean, grd);
        System.out.println(result);
    }
}


