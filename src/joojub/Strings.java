package joojub;

/** String 클래스
 * c 언어에서는 문자열은 char 형 배열로 표현
 * 자바에서는 문자열처리를 위한 별도의 String 클래스 제공
 *
 * String 클래스의 객체는 한번 생성되면 그 값을 읽기만 가능하고 변경 할 수 없는 불변객체임
 * 따라서 + 연산자로 문자열을 결합하는 경우 기존의 문자열이 변경되는 것이 아니고 각각의
 * 내용을 합쳐 새로운 객체를 생성함
 */

public class Strings {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        str1 = str1 + str2; //메모리 낭비가 심함
        // StringBuffer, StringBuilder 추천

        StringBuffer sb = new StringBuffer();
        sb.append("Hello").append("world").append("wow");
        System.out.println(sb);

        /*문자열 간 비교
        문자열 상수 풀이라는 개념 이해 필요
        a객체 생성 => "Hello"를 SCP 에 저장
        b객체 생성 => SCP 에 이미 존재하므로 같은 값을 참조하도록 함
        c객체 생성 => SCP 가 아닌 전혀 새로운 위치에 "Hello"를 생성
        */

        String a = "Hello";
        String b = "Hello";
        String c = new String("Hello");

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(b == c);

        /*문자열 변수간 비교에서 == 연산자는 값을 비교하는 것이 아니고 값이 저장된 위치를 비교함(중요!)
        따라서, 문자열간 값을 비교할 때는 equals 메서드를 사용해야 함
         */

        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(b.equals(c));
    }
}
