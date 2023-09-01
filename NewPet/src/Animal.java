public interface Animal {

    // interface에서는 추상메서드와 상수만 쓸 수 있다.
    // 객체가 될 수 없음.
    public static int EXP_MAX = 0;
    // interface에서 만들어진 변수는 그 자체로 public(누구나)이면서 static(어디서나)이면서 final(고정된값)이다.
    // (그래서 회색으로 나옴)
    // 변경 할 필요 없는 값들 (ex: max값) 을 interface에서 변수로 주로 생성함.
    // final: 상수화. 최종적으로 수정된 값 (변경 불가능)

    void Attack();
    // interface에 있는 메서드는 하위클래스에서 반드시 구현돼야 한다.
    // Pet 클래스는 추상 클래스기 때문에 구현 할 필요가 없다.
    // Pet 클래스를 상속받은 Dog, Cat 클래스는 반드시 Attack() 메서드를 구현해야 한다.
}
