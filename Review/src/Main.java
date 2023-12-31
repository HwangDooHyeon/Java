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

        Scanner scanner = new Scanner(System.in);

        System.out.print("'월'을 입력하세요(1-12): ");

        int season = scanner.nextInt();

        switch (season) {
            case 1:
                System.out.print(season + "월");
                break;
            case 2:
                System.out.print(season + "월");
                break;
            case 3:
                System.out.print(season + "월");
                break;
            case 4:
                System.out.print(season + "월");
                break;
            case 5:
                System.out.print(season + "월");
                break;
            case 6:
                System.out.print(season + "월");
                break;
            case 7:
                System.out.print(season + "월");
                break;
            case 8:
                System.out.print(season + "월");
                break;
            case 9:
                System.out.print(season + "월");
                break;
            case 10:
                System.out.print(season + "월");
                break;
            case 11:
                System.out.print(season + "월");
                break;
            case 12:
                System.out.print(season + "월");
                break;
        }

        scanner.close();

        */


        // 메뉴 번호를 입력받아 음식 이름을 출력해 보세요.
        /*
        // [1. 피자, 2. 파스타, 3. 햄버거, 4. 샐러드, 5. 스테이크, 잘못된 메뉴 번호]

        Scanner scanner = new Scanner(System.in);

        System.out.print("메뉴 번호를 입력하세요(1-5): ");

        int menu = scanner.nextInt();

        switch (menu) {
            case 1:
                System.out.print("피자");
                break;
            case 2:
                System.out.print("파스타");
                break;
            case 3:
                System.out.print("햄버거");
                break;
            case 4:
                System.out.print("샐러드");
                break;
            case 5:
                System.out.print("스테이크");
                break;
            default:
                System.out.print("잘못된 메뉴 번호");
                break;
        }

        scanner.close();

        */


        // 성적 등급을 입력받아 평가를 출력해 보세요.
        /*
        // [A. 우수, B. 좋음, C. 보통, D. 미흡, F. 불합격, 잘못된 등급]

        Scanner scanner = new Scanner(System.in);

        System.out.print("성적 등급을 입력하세요(A-F): ");

        char grade = scanner.next().charAt(0);

        switch (grade) { // (Character.toUpperCase(grade))
            case 'A' : // 'A' | 'a' 도 가능
                System.out.print("A. 우수");
                break;
            case 'B':
                System.out.print("B. 좋음");
                break;
            case 'C':
                System.out.print("C. 보통");
                break;
            case 'D':
                System.out.print("D. 미흡");
                break;
            case 'F':
                System.out.print("F. 불합격");
                break;
            default:
                System.out.print("잘못된 등급");
                break;
        }

        scanner.close();

        */


        // 1부터 사용자가 입력한 숫자까지의 합을 구해봐.
        /*

        Scanner scanner = new Scanner(System.in);

        System.out.print("마지막 값을 입력하세요: ");

        int sum = 0;

        int count = scanner.nextInt();

        for (int i = 0 ; i < count+1 ; i++) {
            sum += i;
        }

        System.out.print(sum);

        scanner.close();

        */


        // 2의 거듭제곱을 결과값이 1000을 넘지 않을 때까지 출력해 보세요.

        /*
        int result = 1;

        for (int i = 0 ; result < 1000 ; ++i) {

            result *= 2;

            if (result < 1000) {

                System.out.println(result);

            }
        }
        */


        // 입력받은 값으로부터 1까지 거꾸로 출력하는 프로그램을 작성해 보세요.
        /*

        Scanner scanner = new Scanner(System.in);

        System.out.print("마지막 값을 입력하세요: ");

        int count = scanner.nextInt();

        for (int i = 0 ; i < count ; ++i) {

            int countDown = count;

            countDown -= i;

            System.out.println(countDown);

        }

        scanner.close();
        */



        // 사용자가 0을 입력할 때까지 숫자를 계속 입력받아 보세요.

        /*
        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자를 입력하세요 (0을 입력하면 종료): ");

        int number = scanner.nextInt();

        while (number == 0) {

            System.out.print("숫자를 입력하세요 (0을 입력하면 종료): ");

        }

        scanner.close();
        */































    }
}