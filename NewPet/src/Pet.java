public abstract class Pet { // abstract: 추상화
    // abstract 메서드가 있는 클래스는 반드시 abstract로 선언되어야 한다.
    // Pet pet = new "pet"(); 불가능 -> "자손 클래스 명"으로는 가능
    // abstract 메서드는 선언만 있고, {구현}을 사용할 수 없다.
    // abstract 클래스는 private, static, final이 될 수 없다.
    // = abstract 클래스는 객체가 될 수 없기 때문에.
    // abstract 클래스를 상속받은 하위 클래스는 받드시 abstract 메서드를 {구현}해야 한다.

//    Pet() {}
//    Pet(String Name, int Age) {
//        this.Name = Name;
//        this.Age = Age;
//    }
//
//    protected String Name;
//    protected int Age;
//
//    protected String getName() { return Name; }
//
//    protected void setName(String Name) { this.Name = Name; }
//
//    protected int getAge() { return Age; }
//
//    protected void setAge(int Age) { this.Age = Age; }

    protected String sound;
    public abstract void initialize();
    protected abstract void Walk();
    protected abstract void Eat();
    protected abstract void Sleep();
    protected abstract void Bark();

}