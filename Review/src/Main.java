import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        /*
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
        */





                Scanner sc = new Scanner(System.in);
                String str = sc.next();
                int n = sc.nextInt();

                for (int i = 1 ; (i <= 5) ; ++i) {
                    System.out.println(str);
                }


    }
}