import java.util.*;
public class StudentManager {

// <싱글톤> 으로 생성한 이유: 데이터를 한번만 만들기 위해
    private static StudentManager instance = null;

    public static StudentManager getInstance() {

        if(instance == null)
            instance = new StudentManager();

        return instance;

    }
// <싱글톤>


// <생성자>
    private StudentManager() {

        studentList = new LinkedList<>();
    }
// <생성자>


// <데이터>
    private List<Student> studentList;
    private int primaryKey;
// <데이터>


// <함수>
    public void C(Student student) {

        studentList.add(student);
        primaryKey++;

        System.out.println("학생 추가 완료");

    }

    public List<Student> R(String name) {

        List<Student> students = new ArrayList<>();

        for (Student student : studentList) {
            if(student.getName().equals(name)) {
                students.add(student);
                //return student;
            }
        }
        return students;
    }

    public void U(String name, String changeName) {
        // 변경
        List<Student> students = R(name);

        for (Student student : students) {
            student.setName(changeName);
        }
    }
    public void U(int score) {
        // 변경
        List<Student> students = R("홍길동");
        R("홍길동");
    }

    public void D(int index) {
        studentList.remove(index);
    }
    public void D(String name) {
        List<Student> students = R(name);
        studentList.removeAll(students);
    }
}
