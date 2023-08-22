import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class Main {
    public static void main(String[] args) {

        int num1 = -20;
        int num2 = -20;

        if(num1 >= num2) {
            if(num1 > 0) {
                System.out.println("양수");
            }
            else if (num1 == 0) {
                System.out.println("양수");
            }
            else {
                System.out.println("음수");
            }
        }
    }
}