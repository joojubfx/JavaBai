package lab;

public class Q79_Movie {
    /**79. 영화정보 시스템에 대한 다음의 요구사항을 참고하여 다음 클래스들을 작성하시오

     - 각 영화는 제목과 개봉연도에 의해 식별된다. 각 영화는 분 단위의 상영시간을 갖는다.
     또한, 제작사와 한 개 또는 그 이상의 장르(공포,액션,드라마등)에 의해 분류된다. 각 영화는 한 명 또는 그 이상의 감독이 있고, 한 명 또는 그 이상의 배우가 등장한다.
     각 영화는 줄거리도 제공한다. 마지막으로 출현한 영화배우들이 말하는 영화소개가 하나 이상 제공된다

     - 배우들은 이름과 생년월일로 식별되며 한 개 이상의 영화에 출현한다. 각 배우는 영화에서 배역을 맡는다.

     - 감독들도 이름과 생년월일로 식별되며 한 개 이상의 영화를 감독한다. 감독이 영화에 출현하는 것도 가능하다. (그 감독이 감독한 영화에 한해서 말이다)

     - 제작사는 이름으로 식별되며 주소를 갖는다. 제작사는 한 개 이상의 영화를 제작한다 */

    String title;
    String openyear;
    String runtime;
    String genre;
    String director;
    String actor;
    String story;
    String sogae;

    public Q79_Movie() {
    }

    public Q79_Movie(String title, String openyear, String runtime, String genre, String director, String actor, String story, String sogae) {
        this.title = title;
        this.openyear = openyear;
        this.runtime = runtime;
        this.genre = genre;
        this.director = director;
        this.actor = actor;
        this.story = story;
        this.sogae = sogae;
    }
}

public class Actor() {
    String name;
    String birth;
    String title;
    String casting;

    public Actor() {
    }

    public Actor(String name, String birth, String title, String casting) {
        this.name = name;
        this.birth = birth;
        this.title = title;
        this.casting = casting;
    }
}

public class Director() {
    String name;
    String birth;
    String title;
    String casting;

    public Director() {
    }

    public Director(String name, String birth, String title, String casting) {
        this.name = name;
        this.birth = birth;
        this.title = title;
        this.casting = casting;
    }
}

public class Company() {
    String name;
    String address;
    String title;

    public Company() {
    }

    public Company(String name, String address, String title) {
        this.name = name;
        this.address = address;
        this.title = title;
    }
}