public class Main
{
    public static void main(String[] args)
    {

    // *** switch문 ***
        // case 다음에는 반드시 break; 작성하기.
        // break;가 없으면 다음 case까지 실행한다.
        // case 1, 3, 4, 2가 있고, break가 없을 때, value가 4라면 case 1, 3은 지나가고 case 4, 2가 실행되고 switch문이 종료된다.
        // 해당 value값이 없다면 switch문이 종료된다.
        // 동일한 case가 존재할 경우 오류 발생
        // default: if-else문의 else에 해당

        int value1 = 4;
            // System.out.println(value + "월입니다");
            // swhitch문 없이 출력되게 하려면 위처럼 쓰면 된다.

        switch (value1)
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

        



    }
}