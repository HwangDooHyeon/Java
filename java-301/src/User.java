public class User { // 리스트에서 이름과 점수들을 초기화하고, 출력하기 (MainUpdate 클래스 활용)

    private String name;
    private int Kor;
    private int Eng;
    private int Math;

    public User(String name, int kor, int eng, int math) {
        this.name = name;
        Kor = kor;
        Eng = eng;
        Math = math;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public int getKor() {return Kor;}
    public void setKor(int kor) {Kor = kor;}

    public int getEng() {return Eng;}
    public void setEng(int eng) {Eng = eng;}

    public int getMath() {return Math;}
    public void setMath(int math) {Math = math;}

}
