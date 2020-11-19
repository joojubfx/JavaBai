package lab;

import java.util.Scanner;

public class Q26_Salary {
    /**26. 사용자가 연봉과 결혼 여부를 입력하면 다음의 세금율에 의해 납부해야
     할 세금을 계산하는 프로그램을 작성하세요 (Tax)

     가. 미혼인 경우 : 연봉 3000미만 - 10%,  연봉 3000이상 - 25%

     나. 결혼한 경우 : 연봉 6000미만 - 15%,  연봉 6000이상 - 35%*/

    public static void main(String[] args) {
        int salary=0, tex=0;
        String marry;

        System.out.println("연봉을 입력해주세요.");
        Scanner scn_Salary = new Scanner(System.in);
        salary = scn_Salary.nextInt();

        System.out.println("결혼 하셨나요? y/n");
        Scanner scn_Marry = new Scanner(System.in);
        marry = scn_Marry.nextLine();

        //System.out.println(marry);

        if (marry.equals("y") || marry.equals("Y")) {
            if (salary < 3000) {
                tex = salary/10;
                System.out.println("연봉 : "+salary+"\n세율 : 10%"+"\n세금 : "+tex);
            } else {
                tex = salary/25;
                System.out.println("연봉 : "+salary+"\n세율 : 25%"+"\n세금 : "+tex);
            }

        } else if (marry.equals("n") || marry.equals("N")) {
            if (salary < 6000) {
                tex = salary/15;
                System.out.println("연봉 : "+salary+"\n세율 : 15%"+"\n세금 : "+tex);
            } else {
                tex = salary/35;
                System.out.println("연봉 : "+salary+"\n세율 : 35%"+"\n세금 : "+tex);
            }
        } else System.out.println("결혼 여부를 다시 입력해주세요.");
    }
}
