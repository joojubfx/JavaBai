package joojub;

/** 캡슐화
    클래스와 멤버변수 선언시 정보의 은닉정도를 부여
    정보은닉 : 사용자가 굳이 알 필요가 없는 정보는 사용자로부터 숨겨야 한다는 개념
    최소한의 정보만으로 보안과 보호를 구현할 수 있음
    자바에서 지원하는 4가지 접근 제한자
    public default protected private
 */
public class Capsulation {
    public static void main(String[] args) {
        Person2 p = new Person2();

        p.setName("홍길동"); /*   private로 선언된 멤버변수는 객체명 변수명으로 대입하거나 읽어서 출력할 수 없음
         setter메서드를 이용함
         */
        /* privateㄹ 선언된 멤버변수를 출력하려면 getter 메서드를 이용함*/
        System.out.println(p.getName());
    }
}
class Person2 {
    /** 멤버변수 선언시 캡슐화를 적용하려면 접근제한자를 private로 사용*/
    private String name;
    private String job;
    private int age;
    private String gender;
    private String blood;


    /** setter/getter 메서드
     * setter
     * public void setXxx(매개변수) {
     *     this.변수 = 매개변수;     *
     * }
     * public 반환값 getXxx() {
     *     return 멤버변수;
     * }
     * */
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
