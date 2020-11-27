package joojub;

import java.io.*;

/**성적처리 추상클래스를 상속해서 만든 클래스*/

public class SungJukV9Service extends SungJukV8Service {
    private String fpath = "c:/java/sungjuk.dat";
    private FileWriter fw = null;
    private FileReader fr = null;
    private BufferedReader br = null;
    private BufferedWriter bw = null;

    public SungJukV9Service()  {
        //프로그램 최초 시작시 파일에 저장된 모든 성적데이터를 List 타입의 sjdata 에 저장
        try {
            LoadSungJuk();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**v8서비스의 newSungJuk 을 재정의*/

    @Override
    public void newSungJuk() {
        super.newSungJuk();

        // 성적데이터 입력받은 후 ArrayList 객체에 저장
        try {
            writeSungJuk(sj);
        } catch (IOException e) {
            System.out.println("파일쓰기오류");
            //e.printStackTrace();
        }
    }

    protected void LoadSungJuk () throws IOException {
        fr = new FileReader(fpath);
        br = new BufferedReader(fr);

        while(br.ready()) {
            String[] s = br.readLine().split(",");

            sj = new SungJukV5VO(s[0], Integer.parseInt(s[1]), Integer.parseInt(s[2]), Integer.parseInt(s[3]),
                    Integer.parseInt(s[4]), Double.parseDouble(s[5]), s[6].charAt(0));
            // 파일에서 읽어온 성적데이터 하나를 List 변수 sjdata 에 저장
            sjdata.add(sj);
        }
        br.close();
        fr.close();
    }

    /**writesungjuk
     * 입력받은 데이터를 sungjuk.dat 에 저장
     */

    protected void writeSungJuk(SungJukV5VO sj) throws IOException {
        String fmt = "%s,%s,%s,%s,%s,%.1f,%s";

        // 파일 기록시 추가기능을 활성화함
        fw = new FileWriter(fpath, true);
        bw = new BufferedWriter(fw);

        String data = String.format(fmt, sj.getName(), sj.getKor(), sj.getEng(), sj.getMat(), sj.getSum(), sj.getMean(), sj.getGrd());

        bw.write(data);//filewriter 클래스를 이용해서 파일에 데이터를 기록할때 다소 불편함
                       //=>PrintWriter
        bw.newLine();//줄바꿈 메서드

        bw.close();
        fw.close();
    }

    @Override
    public void displayMenu() {
        StringBuilder menu = new StringBuilder();
        menu.append("------------------------\n")
                .append("성적처리 프로그램 V9\n")
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
    }
}
