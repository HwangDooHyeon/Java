import java.util.Scanner;


public class User {


    // 필드 (클래스에서 변수는 대체로 private, 함수는 대체로 public으로 작성한다.)
    private String name;
    private String password;
    private int age;


    // 생성자
    public User() {}
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