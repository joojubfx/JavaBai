package semiproject;

import java.util.*;

/**인사정보 처리 인터페이스르 구현한 클래스
 * 인사정보 처리 CRUd
 */

public class EmployeeV1Service extends EmployeeV1GenericService {
    List<EmployeeVO> empldata = new ArrayList<>();

    @Override
    /**
     * 인사정보 입력
     */
    public void newEmployee() {
        /*String fname,lname,email,phone,hdate, jobid;
        int sal, empno, mgrid, deptid;
        double comm = 0.0;*/

        //모든 정보는 일단 문자형으로 받되 필요에 따라 적절한 형변환을 해서 변수에 저장

        EmployeeVO emp = new EmployeeVO(0, "", "", "","","","",0,0.0,0,0);

        Scanner scn = new Scanner(System.in);

        System.out.print("사원 번호  ");
        emp.setEmpno(Integer.parseInt(scn.nextLine()));
        System.out.print("이름  ");
        emp.setFname(scn.nextLine());
        System.out.print("성  ");
        emp.setLname(scn.nextLine());
        System.out.print("이메일 주소  ");
        emp.setEmail(scn.nextLine());
        System.out.print("전화 번호  ");
        emp.setPhone(scn.nextLine());
        System.out.print("입사 날짜  ");
        emp.setHdate(scn.nextLine());
        System.out.print("직책  ");
        emp.setJobid(scn.nextLine());
        System.out.print("급여  ");
        emp.setSal(Integer.parseInt(scn.nextLine()));
        System.out.print("수당  ");
        emp.setComm(Double.parseDouble(scn.nextLine()));
        System.out.print("상사id  ");
        emp.setMgrid(Integer.parseInt(scn.nextLine()));
        System.out.print("부서id  ");
        emp.setDeptid(Integer.parseInt(scn.nextLine()));

        // 처리된 성적데이터를 동적배열에 저장
        empldata.add(emp);
    }

    @Override
    public void readEmployee() {
        String hdr = "\tempno\tfname\temail\tjobid\tmgrid\tdetid";
        String fmt = "%8s %8s %8s %8s %8s %8s\n";

        System.out.println(hdr);

        Iterator<EmployeeVO> iter = empldata.iterator();

        while (iter.hasNext()) {
            EmployeeVO r = iter.next();
            System.out.printf(fmt,r.getEmpno(), r.getFname(), r.getEmail(), r.getJobid(), r.getMgrid(), r.getDeptid());
        }
    }

    @Override
    /**
     * 상세인사정보 출력
     * 사원번호를 입력받아 출력함
     */
    public void readOneEmployee() {
        String fmt = "%8s %8s %8s %8s %8s %8s %8s %8s %8s %8s %8s\n";

        EmployeeVO emp = new EmployeeVO();

        Scanner sc = new Scanner(System.in);
        System.out.println("조회할 사원번호를 입력하세요.");
        emp.setEmpno(Integer.parseInt(sc.nextLine()));

        for (EmployeeVO e : empldata) {
            //입력한 사원번호와 순회해서 읽어온 사원번호와 비교해서 일치하면 이것을 출력하기 위해 다른 변수에 저장함
            if (e.getEmpno() == emp.getEmpno()) {
                emp = e;
                System.out.printf(fmt, emp.getEmpno(), emp.getFname(), emp.getLname(), emp.getEmail(), emp.getPhone(),
                        emp.getHdate(), emp.getJobid(), emp.getSal(), emp.getComm(), emp.getMgrid(), emp.getDeptid());
                break;
            } else {System.out.println("맞지 않는 사원번호입니다"); break;}
        }
    }

    @Override
    public void modifyEmployee() {

    }

    @Override
    public void removeEmployee() {

    }

    //인사정보 처리 UI 출력
    public void displayMenu() {
        StringBuilder menu = new StringBuilder();
        menu.append("------------------------\n")
                .append("인사 관리 프로그램 V1\n")
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
