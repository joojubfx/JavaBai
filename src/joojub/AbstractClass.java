package joojub;

/** 추상 클래스
 * 추상 메서드를 포함하는 클래스
 * 추상메서드 : 메서드의 선언부만 있고, 몸체가 없는 메서드
 * 메서드의 몸체는 이것을 상속하는 자식클래스에서 정의함
 *
 */

public class AbstractClass {
    public static void main(String[] args) {
        Cat2 c = new Cat2();
        Dog2 d = new Dog2();

        System.out.println(c.cry());
        System.out.println(d.cry());
    }
}
abstract
class  Animal2 {
    protected int weight;
    abstract String cry();// 추상메서드
}

class Cat2 extends Animal2 {
    @Override
    String cry() {return "냥냥";}
}

class Dog2 extends Animal2 {
    @Override
    String cry() {return "멍멍";}
}