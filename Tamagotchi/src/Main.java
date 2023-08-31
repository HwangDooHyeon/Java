import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Exercise exercise = new Exercise();

        System.out.println("행동을 선택하세요.");
        System.out.println("1. 밥먹기");
        System.out.println("2. 잠자기");
        System.out.println("3. 산책가기");
        System.out.println("0. 게임종료");
        System.out.print("입력하세요: ");

        exercise.add(scanner.nextInt());
        System.out.print("피로도가 " + 1 + " 증가했습니다.");
                /*exercise.outPutExercise();
        System.out.print(" 증가했습니다.");*/


/*

        System.out.print("입력하세요: ");

        switch (scanner.nextInt()) {
            case 1:System.out.print("1 입력하세요: ");
                break;

            case 2:System.out.print("2 입력하세요: ");
                break;

            case 3:System.out.print("3 입력하세요: ");
                break;

            case 0:System.out.print("0 입력하세요: ");
                break;

            default: System.out.print("다시 입력하세요: ");
        }

*/
    }
}