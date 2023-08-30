// 차 클래스
public class Car {

    // 속성: 브랜드, 연식
    private String brand;
    private int year;

    // 생성자
    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // getter & setter
    public String getBrand() {
        return brand;
    }
    public void setBrand() {
        this.brand = brand;
    }
    public int getYear() {
        return year;
    }
    public void setYear() {
        this.year = year;
    }

    // 메서드: 차를 운전한다
    public void drive() {
        System.out.println(brand + " 차를 운전합니다.");
    }

}