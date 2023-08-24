public class Main {
    public static void main(String[] args) {

        // 동적 메모리가 할당 됐다면, 런타임(프로그램 작동 중) 중에 메모리가 할당됐다라는 뜻.
        // 전역 변수, 스태틱 변수, ... 는 정적 메모리 : 프로그램 실행 전 (런타임 이전) 메모리 할당

        // continue, break의 기능
        /*
        continue, break : 반복문 전체에 사용 가능
            continue : 반복문의 처음으로 돌아가서 다시 시작
            break : 반복문을 종료
        */


        // 난수 N이 45보다 크면 while문의 처음으로 돌아가서 반복, 난수 N이 45보다 작으면 인수 i가 1씩 증가된다.
        /*
        int i = 0;

        while (i < 10) {
            int 난수 = N;

            if (45 < 난수)
                continue;

            i++;

            if (true)
                break;
        }
        */


        // do - while : 일단 do 뒤의 내용을 한 번 실행하고, while의 반복 조건이 true라면 do의 내용을 반복 실행한다.
        /*
        int i = 0;

        do {
            // i++; 증감식을 넣어야한다면 이곳에 쓴다.
            System.out.println("HelloWorld");
        } while (i < 10);
        */


        // 문자열 출력 (자바 서식 문자 참조 : https://the-duchi.tistory.com/12)
        /*
        // 문자들을 배열 형태로 만들어 문자열처럼 출력 (char = '문자' 하나를 지정 / 데이터 타입의 개념)
        // %c = 문자를 나타내는 서식 문자
        // \n = 줄 바꿈 서식 문자
        char c = 'A';
        char d = 'B';
        char e = 'C';
        char f = 'D';

        System.out.printf("%c%c%c%c\n", c, d, e, f);


        // 문자열을 출력 (String = "문자열"을 지정 / 클래스의 개념)
        // %s = 문자열을 나타내는 서식 문자
        String name = "홍길동";

        System.out.printf("%s\n", name);


        // length() : 문자열의 길이를 정수로 반환하는 함수
        int i = name.length();

        System.out.println(i);
        */


        // 배열
        /*
        int[] num1 = {10, 20, 30, 40};

        for (int i = 0 ; i < 4 ; ++ i) {
            System.out.println( num1[i]);
        }
        */

        // 배열 선언 및 초기화
        /*
        // new가 사용됐다면, 무조건 동적 메모리에 할당된다.

        int[] num2;
        num2 = new int[]{10, 20, 30, 40};

        int[] num3 = new int[4]; // 크기가 4인 배열
        num3[0] = 10;
        num3[1] = 20;
        num3[2] = 30;
        num3[3] = 40;

        int length = num3.length;
        System.out.printf("%d\n", length);
        */


        // 





















    }
}