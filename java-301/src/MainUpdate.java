import java.util.ArrayList;
import java.util.List;

public class MainUpdate {

    /*
    public void render() {

        List<String> array = new ArrayList<String>(); // List: 끝이 정해져 있지 않은 배열 (크기가 정해져 있지 않음)
        // 데이터가 다른 데이터를 가르키는 형태: 데이터를 불러오는데 일정한 속도를 보장할 수 없음 / 데이터를 추가, 삭제하는데 용이함

        array.add("홍길동");
        array.add("임꺽정");
        array.add("이몽룡");

        for (String str : array) // *forEach문의 기능
            System.out.println(str);

        for (int i = 0 ; i < array.size() ; i++) { // List의 특정 값을 출력하고 싶을 때 사용
            System.out.println(
                    array.get(i)
            );
        }
    }
    */

    User user = new User("홍길동", 70, 80, 90);

    public void print() {
        System.out.println(user);
    }

    public void render() {
        List<User> user = new ArrayList<User>();

        user.add(new User("임꺽정", 75, 85, 95));














    }
}
