package joojub;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**성적처리 추상클래스를 상속해서 만든 클래스*/

public class SungJukV8Service extends SungJukV8GenericService {
    //멤버변수 선언
    //입력받은 모든 데이터를 동적배열에 저장
    List<SungJukV5VO> sjdata = new ArrayList<>();


    @Override
    /**
     * 이름과 성적데이터를 입력 받아 총점, 평균, 학점을 계산한뒤 동적배열에 추가함
     */
    public void newSungJuk() {
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

        // 입력받은 데이터를
        SungJukV5VO sj = new SungJukV5VO(name, kor, eng, mat,0,0.0,'0');
        // 총점, 평균. 학점을 계산
        computeSungJuk(sj);
        // 처리된 성적데이터를 동적배열에 저장
        sjdata.add(sj);
    }

    @Override
    /**
     * 저장된 성적 데이터 중에서 번호, 이름, 국어, 영어, 수학만 뽑아서 리스트형태로 출력
     */
    public void readSungJuk() {
        String fmt = "이름 : %s, 국어 : %d, 영어 : %d,1 수학 : %d\n";
        //동적배열에 저장된 데이터들을 출력하기 위해 각 요소를 순회할 수 있도록 Iterrator 객체 선언
        Iterator<SungJukV5VO> iter = sjdata.iterator();
        //StringBuilder dout = new StringBuilder();

        while (iter.hasNext()) {
            SungJukV5VO sj = iter.next();
            System.out.println(String.format(fmt, sj.getName(), sj.getKor(), sj.getEng(), sj.getMat()));
            //dout.append(sj.getName()).append(sj.getKor()).append(sj.getEng()).append(sj.getMat());
        }
    }

    @Override
    /**
     * 상세조회할 학생이름을 입력받아 이름, 국어, 영어, 수학, 총점, 평균, 학점을 출력
     */
    public void readOneSungJuk() {
        String fmt = "이름 : %s, 국어 : %d, 영어 : %d, 수학 : %d\n"+
                "총점 : %d, 평균 : %.2f, 학점 %s\n";
        //상세 조회할 학생이름 입력받음
        Scanner sc =new Scanner(System.in);
        System.out.println("누구를 조회할까요?");
        String name = sc.nextLine();

        //입력받은 이름으로 데이터 검색 후 결과 출력
        for (SungJukV5VO sj : sjdata) {
            if (sj.getName().equals(name)) {
                System.out.println(String.format(fmt, sj.getName(), sj.getKor(), sj.getEng(), sj.getMat(), sj.getSum(), sj.getMean(), sj.getGrd()));
                break;
            }
        }
    }

    @Override
    public void modifySungJuk() {
        super.modifySungJuk();
    }

    @Override
    public void removeSungJuk() {
        super.removeSungJuk();
    }

    public void displayMenu() {
        StringBuilder menu = new StringBuilder();
                menu.append("------------------------\n")
                    .append("성적처리 프로그램 V8\n")
                    .append("------------------------\n")
                    .append("1. 성적 데이터 입력\n")
                    .append("2. 성적 데이터 조회\n")
                    .append("3. 성적 데이터 상세조회\n")
                    .append("4. 성적 데이터 수정\n")
                    .append("5. 성적 데이터 삭제\n")
                    .append("0. 프로그램 종료\n")
                    .append("------------------------\n")
                    .append("원하시는 작업은? ");

        System.out.println(menu);
    } //메뉴 출력

    public void computeSungJuk(SungJukV5VO sj) {
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
    }// 성적처리
}
