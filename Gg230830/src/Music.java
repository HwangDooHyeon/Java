// 음악 클래스
public class Music {

    // 속성: 제목, 가수
    private String title;
    private String singger;

    // 생성자
    public Music(String title, String singger) {
        this.title = title;
        this.singger = singger;
    }

    // getter & setter

    public String getTitle() {
        return title;
    }
    public void setTitle() {
        this.title = title;
    }
    public String getSingger() {
        return singger;
    }
    public  void setSingger() {
        this.singger = singger;
    }

    // 메서드: 음악을 재생한다

    public void play() {
        System.out.println(singger + "의 " + title + "을(를) 재생합니다.");
    }

}
