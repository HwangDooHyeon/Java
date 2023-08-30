// 계산기 클래스
public class Calculator {

    // 속성: 현재값
    private  double currenValue;

    // 생성자
    public  Calculator() {
        this.currenValue = 0.0;
    }

    // getter & setter
    public double getCurrenValue() {
        return  currenValue;
    }
    public void setCurrenValue() {
        this.currenValue = currenValue;
    }

    // 메서드: 더하기
    public void add(double value) {
        this.currenValue += value;
    }

    // 메서드: 빼기
    public void subtract(double value) {
        this.currenValue -= value;
    }

}
