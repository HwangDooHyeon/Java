public class TestDog extends TestPet {

    // Aminal 클래스의 메서드를 오버라이딩 했다.
    // 오버라이드: 부모 클래스의 메서드를 자신의 클래스에 맞게 변경한 것. (다형성)
    // != 오버로딩: 메서드의 이름은 같으나, 매개변수의 유형과 개수가 다른 것. (편의성)
    // 조건: 상속된 경우에만 사용 할 수 있다.
    /* 조건: 메서드가 완전히 같아야 한다.
    -> 메서드의 이름과 매개변수의 유형, 개수가 같음. (재구성될 내용}만 다름) */

    public void makeSound() {
        System.out.println("멍멍!");
    }

    public void getOutput() {
        System.out.println("출력 내용 없음");
    }

    public void getOutput(String str) {
        System.out.println("출력 내용 : " + str);
    }

}