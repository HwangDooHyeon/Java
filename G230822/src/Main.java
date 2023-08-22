public class Main {
    public static void main(String[] args) {

        int num1 = 10;

        if (num1%2 == 1){
            System.out.println("홀");
        }
        else {
            System.out.println("짝");
        }


        int num2 = 0;

        if (num2>=0) {
            System.out.println("양수");
        }
        else {
            System.out.println("음수");
        }

    }
}

// ** 연산자 **

    // ** 산술 연산자 **
        // [+] 더하기
        // [-] 빼기
        // [*] 곱하기
        // [/] 나누기
        // [%] 나머지
                /* 982347892765
                난수%45 + 1 == (0 ~ 44) + 1
                1 ~ 45 */

    // ** 연산자 결합 사용 ** 반드시 이항 연산이여야만 사용 가능
        // [=+] 더하기
        // [=-] 빼기
        // [=*] 곱하기
        // [=/] 나누기
        // [=%] 나머지
            // ex) int num =+ 10 + 20; -> 10 + 20 -> 30 + num
            // ex) int num = 113210 * 25540 / 343630 % 435340;

    // ** 비교 연산자 **
        // [>] A가 B보다 큰가?
        // [<] A가 B보다 작은가?
        // [>=] A가 B보다 크거나 같은가?
        // [<=] A가 B보다 작거나 같은가?
        // [==] A와 B가 같은가?
        // [!=] A와 B가 같지 않은가(다른가)? (!: not)

    // ** 논리 연산자 **
        // [&&] And 그리고
        // A와 B를 모두 충족했을 때
        // [||] Or 또는 (| = shift + \)
        // A 또는 B 중 하나만 충족했을 때
        // [!] Not ~ 아니다.
            // ex) ! ( A < B ) = A > B

    // ** 단항 연산자 **
        // [++] 1씩 증가
        // 전위 연산: ++num
        // 후위 연산: num++
        // [--] 1씩 감소
        // 전위 연산: --num
        // 후위 연산: num--

    // ** 삼항 연산자 **
        // [A ? B : C] A가 맞다면, B 아니면 C를 반환. { 액셀 함수: if(a=true,b,c) }
            // ex) int num1 = 10;
            // ex) int num2 = 20;
            // ex) int num3 = (num1 < num2) ? 100 : 200;
            // num3 = 100

    // ** 연산자 우선 순위 **
        // https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Ft1.daumcdn.net%2Fcfile%2Ftistory%2F997A014D5A90B9B00D
        // 1번과 14번이 제일 중요


// ** 분기문 **
    // if (조건){} else{} : 만약 (조건=참) 일때 {}, 아니면 {} -> else 없이 if만 사용 가능: 조건이 참이면 다음 연산으로 넘어감. 액셀처럼 if 안에 또 if 사용 가능. 최대 스택 4096까지 가능.
    // 모든 if - else문은 반드시 if문으로 시작 / else if (조건) : 조건이 들어간 추가 if문 /
        // int num1 = 10;
        // int num2 = 20;
        //
        // if(num1 > num2)
        // {
        //
        // }
        // else if
        // {
        //
        // }
        // else <- 생략 가능
        // {
        //
        // }

