//CRUD 개념 놓고 쓸것 ,,
//Create - Read - Update - Delete
// 이벤트 출력, 확인 및 수행하는 곳  ex) 학생 추가 누르면 학생추가, 몇점인지 출력하는거 etc

import java.util.List;
import java.util.Scanner;
public class MainUpdate { // CRUD
    private Scanner scanner = null;

    MainUpdate() {
        scanner = new Scanner(System.in);
    }

    // ** 입력
    private int input() {
        int num = 0;
        try {
            System.out.print("입력 : ");
            num = scanner.nextInt();
            scanner.nextLine();
        } catch (Exception e) {
            System.out.println("error!!");
        }


        if (num < 1 || num > 5) {
            return 0;
        }

        return num;
    }

    // ** 매뉴 출력
    private void mainMenu() {
        System.out.println("1. 학생 추가");
        System.out.println("2. 학생 검색");
        System.out.println("3. 학생 수정");
        System.out.println("4. 학생 삭제");
        System.out.println("5. 학생 출력");
    }

    private Student initialize() {
        // ** 객체 생성
        Student student = new Student();

        // ** 생성된 객체의 초기화
        // ** 이름 초기화
        System.out.print("학생이름 입력 : ");
        String name = scanner.nextLine();
        student.setName(name);

        // ** 국어점수 초기화
        System.out.print("국어점수 입력 : ");
        int korScore = scanner.nextInt();
        student.setKorScore(korScore);
        scanner.nextLine();

        // ** 영어점수 초기화
        System.out.print("영어점수 입력 : ");
        int engScore = scanner.nextInt();
        student.setEngScore(engScore);
        scanner.nextLine();

        // ** 수학점수 초기화
        System.out.print("수학점수 입력 : ");
        int mathScore = scanner.nextInt();
        student.setMathScore(mathScore);

        // ** 객체 반환
        return student;
    }

    public void render() {
        mainMenu();

        switch (input()) {
            case 1:
                Student student = initialize();
                StudentManager.getInstance().C(student);
                break;

            case 3:
                StudentManager.getInstance().U("홍길똥", "홍길동");
                break;

            default:
                System.out.println("잘못 입력 하였습니다.");
                break;
        }

        List<Student> student = StudentManager.getInstance().R("홍길똥");

        if (student == null)
            System.out.println("해당 학생은 존재하지 않습니다.");
        else {
            for (Student student1 : student) {
                System.out.println("======= 학생 정보 =======");
                System.out.println("학생 이름 : " + student1.getName());
                System.out.println("국어 점수 : " + student1.getKorScore());
                System.out.println("영어 점수 : " + student1.getEngScore());
                System.out.println("수학 점수 : " + student1.getMathScore());
            }
        }
    }
}