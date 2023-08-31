import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // scanner.nextInt();

        Exercise exercise = new Exercise();

        exercise.outPutExercise();

        exercise.add(1);
        exercise.outPutExercise();


        exercise.sub(1);
        exercise.outPutExercise();




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


    }
}