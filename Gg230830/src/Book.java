// 책 클래스
public class Book {

    // 속성: 제목, 저자
    public String title;
    public String author;

    // 생성자
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle () {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor() {
        this.author = author;
    }

    // 메서드: 책 정보를 출력한다
    public void showInfo() {
        System.out.println("제목: " + title + ", 저자: " + author);
    }

}
