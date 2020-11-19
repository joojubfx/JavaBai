package lab.Movies;

public class MovieMain {
    public static void main(String[] args) {
        String genre[] = {"멜로", "로맨스", "코미디", "뮤지컬"};
        String director[] = {"바즈 루어만"};
        String actor[] = {"니콜 키드먼", "이완 맥그리거"};
        String summary = "막이 오르는 순간, 위대한 사랑이 시작된다!\n" +
                "1899년 파리, 지상에서 가장 화려한 세계 '물랑 루즈' 최고의 뮤지컬 가수 샤틴은 신분 상승과 성공을 위해 투자자를 구하다가 우연히 사랑을 찾아 몽마르트로 흘러온 영국의 낭만파 시인 크리스티앙을 만나게 된다. 샤틴에게서 운명적 사랑을 느낀 크리스티앙은 그녀가 있는 '물랑 루즈'라는 신비의 세계에 발을 들여놓는다. 하지만 그 둘 사이에 거역할 수 없는 슬픈 운명이 서서히 다가오는데...";
        String desc = "";

        Movie moulinrouge = new Movie("Moulin Rouge", "2001", 125, "Bazmak Production", genre, director, actor, summary, desc);

        System.out.println(moulinrouge.getTitle());
        System.out.println(moulinrouge.getYear());
        for (int i=0; i<genre.length; i++) {
            System.out.println(moulinrouge.getGenre()[i]);
        }
        System.out.println(moulinrouge.getRuntime()+"분");
        System.out.println(moulinrouge.getPrdtin());
    }
}
