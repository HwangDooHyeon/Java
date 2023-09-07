public class Student { // 리스트에서 이름과 점수들을 초기화하고, 출력하기 (MainUpdate 클래스 활용)

    private int userID;
    private String name;
    private int Kor;
    private int Eng;
    private int Math;

    public Student() {}
    public Student(String name, int kor, int eng, int math) {
        this.name = name;
        this.Kor = kor;
        this.Eng = eng;
        this.Math = math;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public int getKorScore() {return Kor;}
    public void setKorScore(int kor) {Kor = kor;}

    public int getEngScore() {return Eng;}
    public void setEngScore(int eng) {Eng = eng;}

    public int getMathScore() {return Math;}
    public void setMathScore(int math) {Math = math;}

}
