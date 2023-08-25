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

        User user = new User();
        user.Initialize("홍길동");
        user.getName();
        user.Update();
        //user.Output();







    }
}