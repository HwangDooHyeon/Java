public class MainUpdate {
    Pet pet = new Cat();
    // Pet 클래스를 추상화했기 때문에, new (자손 클래스명) 으로 메모리 할당 가능.
    // (자손 클래스의 메서드를 출력한다.)

    public void MainMenu()
    {
        System.out.println("** 매뉴 **");
        System.out.println("1. 산책");
        System.out.println("2. 먹기");
        System.out.println("3. 잠자기");
        System.out.println("0. 게임 종료");
    }

    public void Update()
    {
        switch(ScanManager.Scan())
        {
            case 0:
                System.out.println("게임이 종료됩니다.");
                return;

            case 1:
                pet.Walk();
                break;

            case 2:
                pet.Eat();
                break;

            case 3:
                pet.Sleep();
                break;

            case 4:
                pet.Bark();
                break;

            default:
                System.out.println("잘못 입력 했습니다.");
                System.out.println("다시 입력하세요");
                break;
        }
    }
}