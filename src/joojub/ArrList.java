package joojub;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** ArrayList
 * 동적배열의 한 종류
 * List 인터페이스를 구현해서 만든 컬렉션 프레임워크
 * 요소의 저장순서가 유지되고 중복으로 데이터를 저장할 수 있음
 * 크기 늘어나면 새로운 배열을 생성하고 기존의 요소를 옮겨야 하는 복잡한 과정이 동반됨
 */

public class ArrList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        //데이터 추가  add(대상)
        names.add("혜교");
        names.add("지현");
        names.add("수지");

        //특정 위치에 데이터 추가 : add(위치, 대상)
        names.add(1, "수현");

        //컬렉션 자료구조에 저장된 데이터를 출력하려면 foreach 구문 사용
        for (String name : names) {
            System.out.println(name);
        }

        //요소 추출 : get(위치)
        System.out.println(names.get(1));

        //요소 수정 : set(위치, 대상)
        names.set(1, "윤아");
        System.out.println(names.get(1));

        //요소 삭제 : remove(위치)
        names.remove(1);
        System.out.println(names.get(1));

        //요소 모두삭제 : clear()

        //데이터 검색하기
        //배열에서 원하는 데이터를 찾는 방법은 2가지
        //위치로 찾음 : get(위치)
        //실제값으로 찾음 : contains, indexOF
        String game[] = {"srw", "용과같이", "어쌔신크리드"};
        //ArrayList<String> games = (ArrayList<String>)Arrays.asList(game);
        //문법적으로는 문제없지만 실행시 다운캐스팅 오류발생

        List<String> games = Arrays.asList(game);
        //일반 배열을 동적배열로 변환하려면
        //Arrays 클래스의 asList 메서드를 사용함
        System.out.println(games);

        //games 동적배열에서 특정데이터를 찾아옴
        for (int i = 0; i < games.size(); i++) { //위치기반 검색
            if (games.get(i).equals("용과같이")) {
                System.out.println((i + 1) + "번째항목");
                break;
            }
        }

        for (String g : games) { //값기반 검색
            if (g.equals("어쌔신크리드")) {
                System.out.println("데이터찾음");
                break;
            }
        }

        if (games.contains("srw")) System.out.println("데이터찾음!!"); //값기반

        System.out.println(games.indexOf("srw")); //위치기반


        // 게임 정보에 대한 객체 생성
        GameInfo g1 = new GameInfo("srd", 35000);
        GameInfo g2 = new GameInfo("용과같이", 45000);
        GameInfo g3 = new GameInfo("어쌔신크리드", 55000);

        //동적배열에 객체들을 저장
        List<GameInfo> games2 = new ArrayList<>();
        games2.add(g1);
        games2.add(g2);
        games2.add(g3);

        // 특정 검색요소를 출력
        // ArrayList 의 타입은 GameInfo 의 객체이므로 GameInfo 객체의 주소가 저장됨
        // 대상.변수명 또는 대상.getter 를 이용해야 함
        System.out.println(games2.get(1).name);
        System.out.println(games2.get(1).price);

        // 특정 요소를 검색하는 코드를 4가지 버전(for,foreach, contains, indexOf)으로 작성
        for (int i = 0; i < games2.size(); i++) {
            if (games2.get(i).name.equals("용과같이")) {
                System.out.println(i + 1 + "번째 항목");
                break;
            }
        }

        for (GameInfo j : games2) {
            if (j.name.equals("srw")) {
                System.out.println("데이터 찾음");
                break;
            }
        }

        for (GameInfo j : games2) {
            if (j.name.contains("어쌔신크리드")) {
                System.out.println("데이터 찾음!!");
                break;
            }
        }
        for (GameInfo j : games2) {
            if (j.name.indexOf("srw")>=0) {
                System.out.println("데이터찾음");
                break;
            }
        }
    }
}


class GameInfo {
    String name;
    int price;

    public GameInfo(String name, int price) {
        this.name = name;
        this.price = price;
    }
}