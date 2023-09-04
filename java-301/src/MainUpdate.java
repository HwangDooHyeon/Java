import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class MainUpdate {

    public User creatUser(String name, int kor, int eng, int math) {
        return new User(name, kor, eng, math);
    }

    public void render() {
        List<User> arrayList = new ArrayList<>();

        arrayList.add(creatUser("홍길동", 1, 2, 3));
        arrayList.add(creatUser("임꺽정", 10, 20, 30));
        arrayList.add(creatUser("이몽룡", 100, 200, 300));
        arrayList.add(creatUser("김철수", 1000, 2000, 3000));

        for (User obj : arrayList) {
            System.out.println("----------");
            System.out.println(obj.getName());
            System.out.println(obj.getKor());
            System.out.println(obj.getEng());
            System.out.println(obj.getMath());
        }
    }

    public void render0() {

        List<String> array = new ArrayList<String>(); // ArrayList: 끝이 정해져 있는 배열. (크기가 정해져 있음)
        // 데이터와 다른 데이터가 붙어있는 형태: 데이터를 불러오는데 일정한 속도를 보장할 수 있음 / 데이터의 추가, 제거가 힘듦

        array.add("홍길동");
        array.add("임꺽정");
        array.add("이몽룡");

        System.out.println("--------------------");
        System.out.println("render0");

        for (String str : array) // *forEach문의 기능
            System.out.println(str);

        for (int i = 0; i < array.size(); i++) { // List의 특정 값을 출력하고 싶을 때 사용
            System.out.println(array.get(i));
        }
    }

    // 배열 출력
    public void render1() {
        int[] a = {10, 20, 30};

        System.out.println("--------------------");
        System.out.println("render1");

        for (int i = 0 ; i < a.length ; i++) {
            System.out.println(a[i]);
        }
    }

    public void render2 () {
        List<User> array = new ArrayList<User>();

        array.add(new User("홍길동", 70, 80, 90));
        array.add(new User("임꺽정", 71, 81, 91));
        array.add(new User("이몽룡", 72, 82, 92));
        array.add(new User("김철수", 73, 83, 93));

        System.out.println("--------------------");
        System.out.println("render2");

        for (int i = 0; i < array.size(); i++) {
            System.out.println("----------");
            System.out.println(array.get(i).getName() + " ");
            System.out.println(array.get(i).getKor() + " ");
            System.out.println(array.get(i).getEng() + " ");
            System.out.println(array.get(i).getMath() + " ");
        }
    }

    public void render3 () {
        List<User> array = new LinkedList<User>(); // LinkedList: 끝이 정해져 있지 않은 배열 (크기가 정해져 있지 않음) / 자주 사용하지 않음
        // 데이터가 다른 데이터를 가르키는 형태: 데이터를 불러오는데 일정한 속도를 보장할 수 없음 / 데이터를 추가, 삭제하는데 용이함

        array.add(new User("홍길동", 74, 84, 94));
        array.add(new User("임꺽정", 75, 85, 95));
        array.add(new User("이몽룡", 76, 86, 96));
        array.add(new User("김철수", 77, 87, 97));

        System.out.println("--------------------");
        System.out.println("render3");

        for (User user : array) {
            System.out.println("----------");
            System.out.println(user.getName());
            System.out.println(user.getKor());
            System.out.println(user.getEng());
            System.out.println(user.getMath());
        }
    }
}