public class Main { // 메인은 가능한 간결하게. 함수들을 여러 개 만들어야 할 경우에는 클래스를 늘리기.
    public static void main(String[] args) {
        MainUpdate Main = new MainUpdate();
        Main.print();
        Main.render();







        // if문
        /*
        int i = 0;

        if (i < 10) {
            i가 10보다 작을 때 실행
        }
        else if (i==10) {
            i가 10일 때 실행 되게 하고 싶다면, else-if 사용
        }
        else {
            i가 10보다 클 때 실행 (i가 10보다 클 때 실행되는게 싫다면, else 지우기.
        }
        */


        // switch문
        /*
        int i = 0;

        switch (i) { i에 해당하는 case 실행. case 뒤에 break가 없다면 다음 case까지 실행된다.
            case 0:

                break;
            case 1:

                break;

            case 2:

                break;
        }
        */


        // for문
        /*
        //int i = 0; // for문 앞과 for문 안에 동시에 변수 선언 불가능. 하나는 지우기.
        
        for (int i = 0 ; i < 10 ; i++ ) { // ( ; 조건문 ; ) <-처럼 조건문만 있어도 실행 가능

        }
        */


        // while문
        /*
        int i = 0;

        while (i < 10) {
            i++;
            if (i== 5)
                i++;
                continue;
            // i++; 무한루프에 빠짐
        }
        */
        
        
        // static / new
        /*
        static: 데이터의 주소가 정적이다. 데이터 영역으로 올려주는 개념.
        new: 데이터의 주소가 동적이다.

        public static Main single = new Main();
        static은 single을 정적으로, new는 Main()을 동적으로
        */

    }
}