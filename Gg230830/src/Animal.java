// 동물 클래스
public class Animal {

    // 속성: 이름, 나이
    private String name;
    private int age;

    // 생성자
    public  Animal (String name, int age) {
        this.name = name;
        this.age = age;
    }

    // name getter & setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // age getter & setter
    public  int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    // 메서드: 동물 소리
    public void makeSound() {
        System.out.println("동물이 소리를 냅니다.");
    }

}
