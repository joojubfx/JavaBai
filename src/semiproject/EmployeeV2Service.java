package semiproject;

import java.io.*;

public class EmployeeV2Service extends  EmployeeV1Service{
    private String fpath = "c:/java/empl.dat";
    private FileWriter fw = null;
    private FileReader fr = null;
    private BufferedWriter bw = null;
    private BufferedReader br = null;

    public EmployeeV2Service()  {
        //프로그램 최초 시작시 파일에 저장된 모든 성적데이터를 List 타입의 empldata 에 저장
        try {
            LoadEmployee();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void newEmployee() {
        super.newEmployee();
        try {
            writeEmployee(emp);
        } catch (IOException e) {
            System.out.println("파일쓰기오류");
            //e.printStackTrace();
        }
    }

    protected void LoadEmployee () throws IOException {
        fr = new FileReader(fpath);
        br = new BufferedReader(fr);

        while(br.ready()) {
            String[] s = br.readLine().split(",");

            emp = new EmployeeVO(Integer.parseInt(s[0]), s[1], s[2], s[3], s[4], s[5], s[6],
                    Integer.parseInt(s[7]), Double.parseDouble(s[8]), Integer.parseInt(s[9]), Integer.parseInt(s[10]));

            empldata.add(emp);
        }
        br.close();
        fr.close();
    }

    public void writeEmployee(EmployeeVO emp) throws IOException {
        String fmt = "%s,%s,%s,%s,%s,%s,%s,%s,%.1f,%s,%s";

        // 파일 기록시 추가기능을 활성화함
        fw = new FileWriter(fpath, true);
        bw = new BufferedWriter(fw);

        String data = String.format(fmt, emp.getEmpno(), emp.getFname(), emp.getLname(), emp.getEmail(),emp.getPhone(),
                emp.getHdate(), emp.getJobid(),emp.getSal(),emp.getComm(),emp.getMgrid(),emp.getDeptid());

        bw.write(data);
        bw.newLine();

        bw.close();
        fw.close();
    }

    @Override
    public void displayMenu() {
        StringBuilder menu = new StringBuilder();
        menu.append("------------------------\n")
                .append("인사 관리 프로그램 V2\n")
                .append("------------------------\n")
                .append("1. 인사 정보 입력\n")
                .append("2. 인사 정보 조회\n")
                .append("3. 인사 정보 상세조회\n")
                .append("4. 인사 정보 수정\n")
                .append("5. 인사 정보 삭제\n")
                .append("0. 프로그램 종료\n")
                .append("------------------------\n")
                .append("원하시는 작업은? ");

        System.out.println(menu);
    }
}
