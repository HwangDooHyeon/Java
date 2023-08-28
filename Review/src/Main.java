import java.util.Scanner;

public class Main {
    private static int Scanner;

    public static void main(String[] args) {

    /* 0단계 */


        // 예제 "안녕, 자바!"를 출력하는 프로그램을 작성해 보세요.
        /*
        --------------------------------------------------
        출력
        >> 안녕, 자바!
        --------------------------------------------------

        System.out.println("안녕, 자바!");

        */


        // 예제 네 개의 정수 10, 20, 30, 40을 한 줄에 출력해보세요.
        /*
        --------------------------------------------------
        출력
        >>  10, 20, 30, 40
        --------------------------------------------------

        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;

        System.out.printf(a + ", " + b + ", " + c + ", " + d);

        */


        // 예제 자신의 이름과 나이를 출력하는 프로그램을 만들어보세요.
        /*
        --------------------------------------------------
        출력
        >> 홍길동, 24
        --------------------------------------------------

        String name = "홍길동";
        int age = 24;

        System.out.printf(name + ", " + age);

        */


        // 예제 두 개의 실수를 더한 결과를 출력해보세요.
        /*
        --------------------------------------------------
        출력
        >>  6.28
        --------------------------------------------------

        float a = 3.14f;

        System.out.println(a * 2);

        */


        // 정수를 입력받아 양수인지 음수인지 판별해 보세요.
        /*

        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하세요: ");

        int number = scanner.nextInt();

        if (number >= 0) {
            System.out.println("양수입니다.");
        } else {
            System.out.println("음수입니다.");
        }

        scanner.close();

        */


        // 세 개의 숫자 중 가장 큰 숫자를 찾아 출력해 보세요.
        /*

        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = scanner.nextInt();

        System.out.print("세 번째 숫자를 입력하세요: ");
        int num3 = scanner.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("가장 큰 수는 " + num1 + "입니다.");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("가장 큰 수는 " + num2 + "입니다.");
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("가장 큰 수는 " + num3 + "입니다.");
        }

        scanner.close();

        */


        // 나이를 입력받아 성인인지 미성년자인지 판별해 보세요.
        /*

        Scanner scanner = new Scanner(System.in);

        System.out.print("나이를 입력하세요: ");

        int age = scanner.nextInt();

        if (age >= 20) {
            System.out.println("성인입니다.");
        } else {
            System.out.println("미성년자입니다.");
        }

        scanner.close();

        */


        // 점수를 입력받아 학점을 출력해 보세요.
        /*

        Scanner scanner = new Scanner(System.in);

        System.out.print("점수를 입력하세요: ");

        int score = scanner.nextInt();

        if (score > 90) {
            System.out.print("A");
        } else if (score > 70) {
            System.out.print("B");
        } else if ( score > 50) {
            System.out.print("c");
        } else if ( score > 30) {
            System.out.print("D");
        } else {
            System.out.print("F");
        }

        scanner.close();

        */


        // 현재 시간을 받아 오전인지 오후인지 판별해 보세요.
        /*

        Scanner scanner = new Scanner(System.in);

        System.out.print("현재 시간을 입력하세요(24시간 형식): ");

        int hour = scanner.nextInt();

        if (hour < 12) {
            System.out.print("오전");
        } else if ( hour < 23 ){
            System.out.print("오후");
        } else if ( hour == 24 ){
            System.out.print("오전");
        } else {
            System.out.print("시간을 다시 입력해주세요.");
        }

        scanner.close();

        */


        // 요일 번호를 입력받아 요일 이름을 출력해 보세요.
        /*

        Scanner scanner = new Scanner(System.in);

        System.out.print("요일 번호를 입력하세요(1-7): ");

        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.print("월");
                break;

            case 2:
                System.out.print("화");
                break;

            case 3:
                System.out.print("수");
                break;

            case 4:
                System.out.print("목");
                break;

            case 5:
                System.out.print("금");
                break;

            case 6:
                System.out.print("토");
                break;

            case 7:
                System.out.print("일");
                break;
        }

        scanner.close();

        */


        // '월'을 입력받아 계절을 출력해 보세요.
        /*
        */































    }
}