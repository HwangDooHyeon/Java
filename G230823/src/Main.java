public class Main
{
    public static void main(String[] args)
    {

    // *** switch문 ***
        /*
        case 다음에는 반드시 break; 작성하기.
        break;가 없으면 다음 case까지 실행한다.
        case 1, 3, 4, 2가 있고, break가 없을 때, value가 4라면 case 1, 3은 지나가고 case 4, 2가 실행되고 switch문이 종료된다.
        해당 value값이 없다면 switch문이 종료된다.
        동일한 case가 존재할 경우 오류 발생
        default: if-else문의 else에 해당
        */

        int value1 = 1;
            // System.out.println(value + "월입니다");
            // swhitch문 없이 출력되게 하려면 위처럼 쓰면 된다.

        switch (value1) // value1의 값에 따른 "N월입니다" 출력
        {
            case 1:
                System.out.println("1월입니다");
                break;
            case 2:
                System.out.println("2월입니다");
                break;
            case 3:
                System.out.println("3월입니다");
                break;
            case 4:
                System.out.println("4월입니다");
                break;
            case 5:
                System.out.println("5월입니다");
                break;
            case 6:
                System.out.println("6월입니다");
                break;
            case 7:
                System.out.println("7월입니다");
                break;
            case 8:
                System.out.println("8월입니다");
                break;
            case 9:
                System.out.println("9월입니다");
                break;
            case 10:
                System.out.println("10월입니다");
                break;
            case 11:
                System.out.println("11월입니다");
                break;
            case 12:
                System.out.println("12월입니다");
                break;
            default:
                System.out.println("1~12까지의 숫자만 입력해주세요.");
                break;
        }

        // switch문을 사용한 분류 - 서점의 책 종류 = {판타지 = (로맨스, SF), 부동산 = (경매, 중개)}

        int value2 = 0;
        int value3 = 0;

        switch (value2) // value2, value3의 값에 따른 도서 분류 출력
        {
            case 0:
                switch (value3)
                {
                    case 0:
                        System.out.println("로맨스");
                        break;
                    case 1:
                        System.out.println("SF");
                        break;
                }
                break;
            case 1:
                switch (value3)
                {
                    case 0:
                        System.out.println("경매");
                        break;
                    case 1:
                        System.out.println("중개");
                        break;
                }
                break;
        }

        // 변수 하나만 써서 도서 구분하기 (미완성)
        /*int value4 = 1;

        final int 판타지 = 0;
        final int 부동산 = 1;

         if (value4 + 판타지 == 00 )
        {
            System.out.println("경매2");
        }

        if ((value4 & 판타지) == 0)
        {
            System.out.println("판타지1");
        }
        if ((value4 & 판타지) == 1)
        {
            System.out.println("판타지2");
        }
        if ((value4 & 부동산) == 0)
        {
            System.out.println("부동산1");
        }
        if ((value4 & 부동산) == 1)
        {
            System.out.println("부동산2");
        }

        switch (value4)
        {
            case 0:
                switch (value4)
                {
                    case 0:
                        System.out.println("로맨스");
                        break;
                    case 1:
                        System.out.println("SF");
                        break;
                }
                break;
            case 1:
                switch (value4)
                {
                    case 0:
                        System.out.println("경매");
                        break;
                    case 1:
                        System.out.println("중개");
                        break;
                }
                break;
        }*/



    // *** 데이터 타입 ***
        /*
        정수형 타입
            short : 2 byte
            int : 4 byte
            long : 8 byte
        실수형 타입
            float : 4 byte
            double : 8 byte
        문자형 타입
            char : 2 byte (java는 유니코드를 기본으로 채택하고 있기 때문에 2 byte)
        */



    // *** 변수 선언 ***
        /*
        int number; <- 변수 선언
        number = 0; <- 변수 초기화
        int number = 10 <- 변수 선언과 동시에 초기화
        */



    // *** for문 ***
        /*
        횟수가 있는 반복문
        초기문, 조건문, 증감문
        for(초기문 ; 조건문 ; 증감문(단항연산자(++, --)))
        */

        for (int i = 0 ; i < 10 ; ++i) // i의 값에 따른 Hello for 횟수 N만큼 반복 출력
        {
            System.out.println(i + 1 + " Hello For");
        }

        for (int j = 2 ; j <= 9 ; j += 2) // 구구단 출력
        {
            System.out.println("*** " + j + " 단 ***");
                        for(int k = 1 ; k <= 9 ; ++k)
            {
                System.out.println(j + " * " + k + " = " + (j*k));
            }
        }



    // *** while문 ***
        /*
        정해진 횟수가 없는 무한 반복문
        무한 반복문일지라도 아래처럼 작성하면 횟수를 정할 수 있다.
            while(조건문)
                초기문, 조건문, 증감문
        */

        int i = 0;
        while (i < 10) // i의 값에 따른 Hello while 횟수 N만큼 반복 출력
        {
            ++i;
            System.out.println(i + " Hello while");
        }

        // 1626년도 인디언이 멘헤튼 섬을 24달러에 판매. 24달러를 은행에 입금. 매년 3%복리 했을 때, 현재 얼마인가?
        int year = 1626;
        double money = 24;
        while (year < 2023)
        {
            ++year;
            money *= 1.03;
        }
        System.out.println(money);



    // if-else문과 switch문의 차이
    // 기계어란 무엇인가?
    // 프로그래밍 언어의 종류
    // 컴파일러란 무엇인가요?
    // 자바 가상 머신 (JVM)이란?
    // 컴파일이란 무엇인가요?
    // 인터프리터 언어란 무엇인가요?
    // 인터프리터와 컴파일러의 차이는?
    // JDK란?
    // 환경변수란?



    }
}
