import java.util.Scanner;
public class User {


    private String name;


    public String getName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름을 입력해주세요: ");
        String name = scanner.nextLine();
        scanner.close();
        System.out.println("입력하신 이름은 " + name + "입니다.");
        return name;
    }


    public void Initialize(String name) {
        this.name/*private String name;의 name을 뜻함.*/ = name;/*public void Initialize(String name)의 name을 뜻함.*/
    }


    public void Update() {
        System.out.println(name);
    }


    public void Output() {
        System.out.println("Hello World!!");
    }
}
/*
// Scanner 객체 생성
Scanner scanner = new Scanner(System.in);

// 사용자에게 입력 안내 메시지 출력
System.out.print("이름을 입력해주세요: ");

// 사용자로부터 한 줄을 입력받아 name 변수에 저장
String name = scanner.nextLine();

// 입력받은 이름 출력
System.out.println("입력하신 이름은 " + name + "입니다.");

// Scanner 객체 닫기
scanner.close();
*/