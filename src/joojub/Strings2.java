package joojub;

import java.sql.SQLOutput;

/**
 * 문자열 처리시 유용한 기능을 제공하는 메서드
 *
 */
public class Strings2 {
    public static void main(String[] args) {
        //문자열 길이 : length

        /*
        문자열 검색
        indexOf : 지정한 문자찾기, 위치값 출력
        */

        String str = "Hello, World!!";
        int idx = str.indexOf('W');
        System.out.println(idx);
        idx = str.indexOf('w');
        System.out.println(idx);
        idx = str.indexOf("Hello");
        System.out.println(idx);

        // lastIndexOf(문자) : 오른쪽기준 지정한 문자 찾기, 위치값 출력

        str = "Hello, Hi, noon";
        idx = str.lastIndexOf('H');
        System.out.println(idx);
        idx = str.lastIndexOf('n');
        System.out.println(idx);

        // 문자 바꾸기 : replace
        // replace(찾을 문자열, 바꿀 문자열)
        str = "a*b*c*d";
        str = str.replace("*", "-");
        System.out.println(str);

        //문자열 분리 : split
        //지정한 문자를 기준으로 문자열을 나눠 배열에 저장
        //split (구분기호)
        str = "201350050, 김태희, 경기도, 1985.3.22, 컴퓨터, 504";
        String result[] = str.split(",");
        /*for(int i=0; i< result.length; i++) {
            System.out.println(result[i]);
        }*/
        for (String data : result) {
            System.out.println(data );
        } //향상된 for 문을 사용하면 배열을 쉽게 다룰 수 있음

        //문자열 추출 : subString
        //subString(시작위치, 끝위치);
        str = "Hello, World!!";
        String word = str.substring(7, 12);
        System.out.println(word);;

        // ex) 주민번호에서 성별체크 하는 코드 작성
        // 123456-1234567, 987654-4567890
        String a = "123456-1234567";
        String b = "987654-4567890";

        String s = a.substring(7, 8);

        System.out.println(s);

        if (s.equals("1") || s.equals("3")) System.out.println("남성입니다");
        else System.out.println("여성입니다.");

        //지정한 문자 추출 : charAt
        str = "987654-4567890";
        System.out.println(str.charAt(7));

        //정규 표현식에 따라 일치여부 확인 : Matches
        //정규식 사용가능 메서드 : split, replaceAll
        int num = 1234567;
        String str1 = String.format("%d", num);
        String str2 = "1234567";
        System.out.println(str1.matches(str2));

        str1 = String.format("%,d", num);
        System.out.println(str1.matches(str2));

        System.out.println(str1.matches("[a-z].+"));
        System.out.println(str1.matches("[0-9].+"));

        /**정규표현식 regular expression
         *
         * 특별한 규칙을 가진 문자열의 집합을 표현하기 위해 사용하는 형식언어
         *         [] : 문자집합이나 범위를 나타냄
         *         [0-9] 숫자, [a-zA-Z] 영문자, [가-힣]한글
         *          * : 0개 이상 무한개의 임의의 문자 반복
         *          + : 1개 이상 무한개의 임의의 문자 반복
         *          ? : 0개 또는 1개의 임의의 문자 반복
         *          {n, m} : 최소 n개 이상 m개 이하 반복
         *          ^ : 문자열 시작
         *          $ : 문자열 끝
         *          . : 임의의 문자 하나를 의미
         */

        // 다음 문자열이 전화번호형식에 맞게 작성되었는지 알아보는 정규식을 작성하세요
        // 010-123-4567, 011-1234-5678

        String phone  = "010-123-4567";
        String pattern1  = "[0-9]{3}-[0-9]{3,4}-[0-9]{4}";

        System.out.println(phone.matches(pattern1));


        // ex) 사용자 아이디가 다음 규칙에 적합하게 작성되었는지 확인
        // 영문자 소문자/대문자, 숫자, 특수기호등이 포함
        // abc123!XYZ, 123jkl
        String uid = "abc123!XYZ";
        String pattern2 = "[a-zA-Z0-9!]+";

        System.out.println(uid.matches(pattern2));

        // 첫글자는 영문자 소문자/대문자 두번째는 영문자, 숫자 특수기호등이 포함
        // 아이디의 길이는 6-18
        // abc123!XYZ, 123jkl

        uid = "abc123!XYZ";
        String pattern3 = "^[a-zA-Z][a-zA-Z0-9!@#$%^&*()_+-=]{5,18}";

        System.out.println(uid.matches(pattern3));
    }
}
