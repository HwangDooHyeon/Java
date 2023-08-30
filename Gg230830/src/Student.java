// 학생 클래스
public class Student {

    // 속성: 이름, 학년
    private String name;
    private int grade;

    // 생성자
    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    // getter & setter
    public String getName() {
        return name;
    }
    public void setName() {
        this.name = name;
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade() {
        this.grade = grade;
    }

    // 메서드: 자기소개
    public void intruduce() {
        System.out.println("안녕, 나는 " + name + ", " + grade + "학년이야.");
    }

}
