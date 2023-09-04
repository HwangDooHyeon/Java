public class Singleton {
    public static/*주소를 정적으로 만들어준다 = 주소가 변경되지 않는다.*/ Singleton/*형태*/ singleton/*변수명*/ = null; // Singleton 관리자는 반드시 하나만
    // 계속해서 new로 메모리 할당 할 수 있으나, 메모리 재할당 할 때마다 기존 데이터는 GC로 이동한다.
    private Singleton () {} // 그래서 private으로 메모리 재할당을 막는다.
}
