import java.util.Scanner;

public class Main {

    // 함수
    /*
    // (아래의 main도 함수이기 때문에 main의 영역 밖에서 작성해야한다.)
    // return 값은 public 뒤의 데이터 타입으로 정해진다.
    public int function()
    {
        return 0;
    }

    public static String getName(String name)
    {
        return name;
    }
    */

    public static void main(String[] args) {


    // 230825 시작


        // 230824 복습
        /*
        // new가 사용되면 무조건 힙(동적 메모리)에 저장
        // new에 저장된 데이터는 똑같은 데이터라도 계속해서 새롭게 만들어 냄.
        */


        // 문자열 길이 구하기
        /*
        String name = "홍길동";
        int length = name.length();
        System.out.println(length);
        */


        // 문자열 비교하기
        /*
        Scanner scanner = new Scanner(System.in);

        String[] names = {"홍길동", "임꺽정", "이몽룡", "철수", "민수", "영희"};

        System.out.print("비교할 이름을 입력해주세요: ");
        String name = scanner.nextLine();

        for (int i = 0 ; i < names.length ; ++i) {
            boolean isEqual = name.equals(names[i]);

            if (isEqual == true) {
                System.out.println("리스트에 [" + names[i] + "] 이(가) 있습니다.");
            }
        }

        scanner.close();
        */


        // 문자열 분리, 결합
        /*
        //문자열 분리
        String[] words = "안녕,하세요,반갑습니다".split(","); // ["안녕", "하세요", "반갑습니다"]

        for (int i = 0 ; i < words.length ; ++i ) {
            System.out.println(words[i]);
        }

        //문자열 결합
        String formatted = String.format("이름: %s, 나이: %d", "홍길동", 30);

        System.out.println(formatted);
        */


        // 문자열 공백 제거하기
        /*
        String trimmed = "  안녕  !! ".trim();
        System.out.println(trimmed);
        */


        // Class
        /*
        // 클래스는 데이터와 기능이 한 데 묶여있다. = 캡슐화 되어있다.
        // 모든 객체는 Class로 만들어진다. / 모든 Class가 객체인 것은 아니다.
            // ex) 충돌판정 클래스, 거리 측정 클래스, ...
        // 상속 :
        // 다형성 : 클래스는 다양한 형태를 가질 수 있음
            // ex) 배그: 캐릭터 클래스, 총 클래스, 자동차 클래스, 바람 클래스, ...
        // 추상성 : 여러 클래스들을 포함하는 개념을 가질 수 있음
            // ex) 각각의 클래스 : 모니터, 본체, 키보드, ... -> 컴퓨터: 각 클래스들을 포함하는 개념
        // is a 관계? :
        // has a 관계? :
        */

        // 클래스 예제
        /*
        User user = new User();
        user.Initialize("홍길동");
        user.getName();
        user.Update();
        //user.Output();
        */


    // 230825 끝


        /* -------------------------------------------------- */


    // 230828 시작


        // Class 예제
            // 변수(name, password, age)를 초기화한 뒤 출력
        /*

        // 생성자 호출 및 초기화
        User user = new User("홍길동", "1q2w3e4r!", 22);

        // 위에서 초기화된 내용을 각각 받아옴
        String name = user.getName();
        String password = user.getPassword();
        int age = user.getAge();

        // 비교 연산 수행 및 값 변경
        name = "임꺽정";
        password = "q1w2e3r4@";
        age = 32;

        // 새로운 값 세팅
        user.setName(name);
        user.setPassword(password);
        user.setAge(age);

        // 새롭게 세팅된 값 출력
        user.updateName();
        user.updatePassword();
        user.updateAge();

        */

        // 230828 끝


        /* -------------------------------------------------- */


// 230830 시작


        // 다차원 배열 선언 및 초기화
        /*

        // case 1

        int [][] array1 = new int [2][2];

        array1[0][0] = 10;
        array1[0][1] = 20;
        array1[1][0] = 30;
        array1[1][1] = 40;


        // case 2

        int [][] array2 = new int [][] { // new int [][] 생략 가능
                {10, 20},
                {30, 40}
        };

        */


        // 배열 출력
        /*

        int [][] array3 = {
                {001, 002, 003, 004},
                {101, 102, 103, 104},
                {201, 202, 203, 204},
                {301, 302, 303, 304},
                {401, 402, 403, 404},
                {501, 502, 503, 504},
                {601, 602, 603, 604},
                {701, 702, 703, 704},
                {801, 802, 803, 804},
                {901, 902, 903, 904},
        };

        for (int i = 0 ; i < array3.length ; ++i) {
            for (int j = 0 ; j < array3[i].length ; ++j) {
                System.out.println(array3[i][j]);
            }
        }

        */


        // main에서 main 자신을 호출 (재귀적 호출, 재귀 함수) -
        /*

        String[] arg = {};
        main(arg);

        */


        // 형변환
        /*

        int sec = 705;

        int min = sec / 60;
        sec %= 60;

        // int min = (int)(sec / 60); // 형변환 (사진 참조)
        // sec -= min * 60;

        System.out.println(min + " : " + sec);

        */


        // 모든 객체는 클래스지만, 모든 클래스는 객체가 아니다.


        // 생성자 : 매개변수가 들어있지 않음
        // 복사 생성자 : 매개변수가 하나라도 들어 있음



        // Static
        /*
        // 정적 메모리를 선언할 때 사용하는 키워드 (예약 키워드: 미리 설정된 명령어)
        // 글로벌 함수를 만들 수 있는건 스태틱이 유일
        // 스태틱으로 데이터를 생성하면 프로그램을 종료할 때까지 데이터가 지워지지 않는다.
        // 스태틱 변수를 다른 모든 클래스에서도 사용이 가능하다.
        // 스태틱 변수는 호출함과 동시에 자동으로 초기화된다.
        // Static은 클래스, 함수, 변수, 모두에 사용 가능하다.
        // 스태틱으로 변수를 만들고, 그 변수로 함수를 만들 경우, 함수 또한 스태틱으로 만들어야 한다.
        */

        // 예시
        /*
        public static int count = 0;
        public static void main(String[] args) {
            기본 메인 함수
        }
        */

        // 생명주기: static 변수나 메서드는 클래스가 메모리에 로드될 때 초기화되고, 프로그램이 종료될 때까지 유지됩니다.
        // 접근방법: static 멤버는 클래스 이름으로 직접 접근할 수 있어. 인스턴스를 생성하지 않아도 사용 가능합니다.
        // 제약사항: static 메서드에서는 static이 아닌 멤버에 직접 접근할 수 없습니다. static 메서드는 인스턴스 생성 없이 호출되기 때문에 인스턴스 변수에 접근할 방법이 없습니다.



        /* -------------------------------------------------- */


    // 230831 시작

        // public /* 접근제어자 */ static /* 정적 */ int /* 데이터 형태 */ number; /* 변수 이름 */
        // -> 공개된 정적인 정수 형태의 변수 number를 선언.

        // System.out.println(User/* 클래스 이름 */.user /* 함수 이름 */);

        // static : 어디서나 사용할 수 있는 구조 = 매우 편리하다. = 어디서나 사용할 수 있기 때문에, 어디서나 문제가 발생할 수 있다. = 안전성에 취약하다.
        // getter, setter 이용 추천 -> 안전성 보강 (완전한 해결은 아님.)


        // singleton(싱글톤): 단독 개체 / 관리자 클래스를 대부분 싱글톤으로 생성 / 같은 업무의 관리자는 하나만 생성
        // 면접 기초 질문으로 자주 나옴 *** Singleton 패턴은 언제 어디서든 편하게 호출하여 데이터를 쉽게 공유하고 리소스를 절약할 수 있기에 자주사용되는 디자인 패턴중 하나입니다. ***
        // -> 데이터를 공유할 수 있어야 함.

        /*
        Singleton singleton;



        Singleton.getInstance().setNumber(10);
        int number = Singleton.getInstance().getNumber();

        System.out.println(number);
        */



        /* -------------------------------------------------- */


    // 230901 시작

        // 상속

        // 함수가 (변경 재구성)










































        /* -------------------------------------------------- */


    }
}