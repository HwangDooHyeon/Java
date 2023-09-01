public class Main {
    public static void main(String[] args) {

        ScanManager.Initialize();

        MainUpdate Main = new MainUpdate();
        Main.Initialzie();

        double delayTime = 1500; // 1000 분의 1초
        long deltaTime = System.currentTimeMillis();

        while(true){
            if(deltaTime + delayTime < System.currentTimeMillis())
            {
                deltaTime = System.currentTimeMillis();

                // ** 루프
                //Main.MainMenu();
                int result = Main.Update();

                if(result == 1)
                    return;
            }
        }

    }
}

//    public static void main(String[] args) {
//
//        System.out.println("1. 강아지");
//        System.out.println("2. 고양이");
//        System.out.print("캐릭터를 선택하세요: ");
//
////        TestPet testPet = new TestPet();
////        TestDog testDog = new TestDog();
////
////        testPet.makeSound();
////        testDog.makeSound();
//
//        ScanManager.Initialize();
//
//        MainUpdate Main = new MainUpdate();
//
//        double delayTime = 2000; // 1000 분의 1초
//        long deltaTime = System.currentTimeMillis();
//
//        while(true){
//            if(deltaTime + delayTime < System.currentTimeMillis())
//            {
//                deltaTime = System.currentTimeMillis();
//
////                Main.MainMenu();
////                Main.Update();
//
//                int result = Main.Update();
//
//                if (result == 0){
//                    return;}
//                }
//            }
//        }
//    }