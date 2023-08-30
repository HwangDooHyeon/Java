import java.util.Scanner;


public class User {


    // 필드 (클래스에서 변수는 대체로 private, 함수는 대체로 public으로 작성한다.)
    private String name;
    private String password;
    private int age;
    public void  재귀함수(int i) {
        if (i != 0) {
            재귀함수(i - 1);
        }
        else
            return;
    } // 조건 없이 생성하면 자기 자신이 계속해서 자기 자신을 불러내기 때문에 스택오버플로우 오류 발생
    public int[] numbers;

    public int[] getNumbers() { return numbers; }
    /*
    public int[] getNumber(int index) {
        if (index < 0 || numbers.length <= index)
            return -1;

        return numbers[index];
    }
    */ // ???

    public void setNumbers(int[] numbers) { this.numbers = numbers; }

    // 생성자 : 매개변수가 들어있지 않음.
    public User() {
        this.name = ""; //  생략가능
        this.password = ""; //  생략가능
        this.age = 0; //  생략가능
    }
    //복사 생성자 : 매개변수가 한 개 이상 들어있음.
    public User(String name, String password, int age) {
        this.name = name;
        this.password = password;
        this.age = age;
    }


    // get: 데이터를 참조하기 위해 사용함.
    // set: 데이터를 어떤 값으로 변경하기 위해 사용함.

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }


    // 직접 생성한 함수
    public void Initialize(String name) {
        this.name= getName();
    }


    public void updateName() {
        System.out.println(name);
    }

    public void updatePassword() {
        System.out.println(password);
    }

    public void updateAge() {
        System.out.println(age);
    }
}

// 230829
    /*
    깊은 복사와 얕은 복사에 대해서 알아보기 (어려운 내용이라 교육하진 않음 / 내용만 이해하면 될듯함)
    public User(String name, String password, int age) //
    {
        this.name = user.getName();
        this.password = user.getPassword;
        this.age = user.getAge;
    }
    */


