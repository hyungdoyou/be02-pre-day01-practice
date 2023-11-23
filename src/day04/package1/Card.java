package day04.package1;

public class Card {
    private Integer num; // 1~10, j=11, q=12, k=13
    private String type; // 하트, 다이아, 클로버, 스페이드
    private static Integer width;  // 가로 길이는 모든 카드가 동일하므로 static 을 사용하여 어떤 객체든 간에 동일하게 사용토록 구현
    private static Integer height;

    public Card(Integer num, String type, Integer width, Integer height) {
        this.num = num;
        this.type = type;
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Card{" +
                "num=" + num +
                ", type='" + type + '\'' +
                ", width='" + width + '\'' +
                ", height='" + height + '\'' +
                '}';
    }
}
