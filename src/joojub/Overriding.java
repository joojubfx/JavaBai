package joojub;

import sun.security.krb5.internal.crypto.crc32;

/** 메서드 재정의 override
 * 객체지향 중요3대 개념중 다형성에 해당
 * 상속관계이 있는 상위클래스의 메서드를 하의클래스에서 같은 이름의 메서드로 다시 작성하는 것
 * 즉, 상속받은 메서드를 새로 정의해서 사용하는 것을 말함
 * 객체화할 수 없음
 *
 */

public class Overriding {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        System.out.println(cat.cry());
        System.out.println(dog.cry());
    }
}

class Animal {
    protected String cry() {return "동물이 웁니다.";}
}

class Cat extends Animal {
    @Override
    protected String cry() {return "야옹야옹";}
}

class Dog extends Animal {
    @Override
    protected String cry() {return "월월월";}
}
