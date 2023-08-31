public class Sleep {

    private int Hp;
    private int exercise;
    private int hungry;


    public int getHp() {
        return Hp;
    }

    public void setHp(int hp) {
        Hp = hp;
    }

    public int getExercise() {
        return exercise;
    }

    public void setExercise(int exercise) {
        this.exercise = exercise;
    }

    public int getHungry() {
        return hungry;
    }

    public void setHungry(int hungry) {
        this.hungry = hungry;
    }

    public Sleep(int Hp,int exercise,int hungry){
        this.Hp=Hp;
        this.exercise=exercise;
        this.hungry=hungry;
    }

    public void sleep()
    {
        Hp++;
        exercise--;
        hungry--;
        System.out.println("체력"+Hp+"운동량"+exercise+"배고픔"+hungry);
    }
    public void eat() {
        Hp++;
        exercise--;
        hungry++;
        System.out.println("체력"+Hp+" 운동량"+exercise+" 배고픔"+hungry);
    }

    public void exercise()
    {
        Hp--;
        exercise++;
        hungry--;
        System.out.println("체력"+Hp+"운동량"+exercise+"배고픔"+hungry);
    }
}