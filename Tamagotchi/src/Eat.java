public class Eat {

    private int Hp=3;
    private int hungry=3;
    private int exercise=3;

    public int getHp() {return Hp;}
    public void setHp(int hp) {
        this.Hp = hp;
    }

    public int getExercise() {return exercise;}
    public void setExercise(int exercise) {
        this.exercise = exercise;}

    public int getHungry() {return hungry;}
    public void setHungry(int hungry) {
        this.hungry = hungry;
    }

    public Eat(int Hp,int exercise,int hungry){
        this.Hp = Hp;
        this.exercise = exercise;
        this.hungry = hungry;
    }

    public void eeat() {
        Hp++;
        exercise--;
        hungry++;
        System.out.println("체력"+Hp+" 운동량"+exercise+" 배고픔"+hungry);
    }

}