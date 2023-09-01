public class Main {

    public static void main(String[] args) {

//        TestPet testPet = new TestPet();
//        TestDog testDog = new TestDog();
//
//        testPet.makeSound();
//        testDog.makeSound();

        ScanManager.Initialize();

        MainUpdate Main = new MainUpdate();

        double delayTime = 3000; // 1000 분의 1초
        long deltaTime = System.currentTimeMillis();

        while(true){
            if(deltaTime + delayTime < System.currentTimeMillis())
            {
                deltaTime = System.currentTimeMillis();

                Main.MainMenu();
                Main.Update();
            }
        }
    }
}