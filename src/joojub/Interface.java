package joojub;

/**인터페이스
 * 추상메서드와 상수만으로 구성된 특수한 클래스
 * 어떤 클래스를 만들때 추상메서드를 통해 기본이 되는 틀을 제공하여
 * 규칙에 맞춰 코드를 짤 수 있게 해줌
 * 클래스와는 달리 다중종속을 지원함
 *
 * 인터페이스 작성시 interface를 사용
 * 인터페이스를 구현할때는 implements를 사용
 * 접근제한자는 퍼블릭으로 고정
 */

public class Interface {
    public static void main(String[] args) {
        Cat3 c = new Cat3();
        System.out.println(c.cry());
    }
}

class Animal3 {
    protected int weight;
    protected int height;
}

interface Animal3Action {
    //public static String Color = "브라운";
    //static String Color = "브라운";
    String Color = "브라운";
    abstract String cry();
}

class Cat3 extends Animal3 implements Animal3Action {
    @Override
    public String cry() {return "냥냥";}

}

class Dog3 extends Animal3 implements Animal3Action {
    @Override
    public String cry() {return "멍멍";}
}

class Murloc extends Animal3 implements Animal3Action {
    @Override
    public String cry() {return "아옳옳";}
}
