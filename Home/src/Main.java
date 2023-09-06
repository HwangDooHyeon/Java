public class Main {
    public static void main(String[] args) {

        int value = 30;
        int result = value + 10;

        System.out.println(value);



        int hour = 3;
        int minute = 5;

        System.out.println(hour + "시간 " + minute + "분");



        int totalTime = (hour*60) + minute;

        System.out.println("총 " + totalTime + "분");



        int x = 3;
        int y = 5;
        int temp = 0;
        
        System.out.println("| X : " + x + " | Y : " + y + " | temp : " + temp + " |");

        temp = x;

        System.out.println("| X : " + x + " | Y : " + y + " | temp : " + temp + " |");

        x = y;

        System.out.println("| X : " + x + " | Y : " + y + " | temp : " + temp + " |");

        y = temp;

        System.out.println("| X : " + x + " | Y : " + y + " | temp : " + temp + " |");











    }
}