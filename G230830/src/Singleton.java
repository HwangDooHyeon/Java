public class Singleton {
    private static Singleton instance = null; // 프로그램이 실행됐을 때(클래스가 로드됐을 때), null 값으로 초기화

    public Singleton() {
        // private constructor
    }

    public static Singleton getInstance() { // getInstance() 함수를 호출한 시점에 딱 1번만 new 할당 (static이기 때문에 프로그램 종료까지 할당된 메모리 유지)
        if (instance == null) { // 그 이후 호출부터는 이미 메모리가 할당 됐기 때문에, 메모리 재할당 X
            instance = new Singleton();
        }
        return instance;
    }

    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }











}