// 과일 클래스
public class Fruit {

    // 속성: 이름, 색깔
    private String name;
    private String color;

    // 생성자
    public Fruit(String name, String color) {
        this.name = name;
        this.color = color;
    }

    // getter & setter
    public String getName() {
        return name;
    }
    public void setName() {
        this.name = name;
    }
    public String getColor() {
        return color;
    }
    public void setColor() {
        this.color = color;
    }

    // 메서드: 과일 정보 출력
    public void showInfo() {
        System.out.println("이 과일은 " + name + "이고, 색깔은 " + color + "이야.");
    }

}
