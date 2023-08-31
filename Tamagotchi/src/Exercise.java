public class Exercise {

        private int exercise = 3;
        private static int hungry;
        private static int hp;

        public Exercise() { this.exercise = exercise; }
        public Exercise(int exercise) { this.exercise = exercise; }

        public int getExercise() { return exercise; }

        public void setExercise(int exercise) { this.exercise = exercise; }

        public void outPutExercise() { System.out.println(exercise); }

        public void add(int value) {
                this.exercise += value;
        }

        public void sub(int value) {
                this.exercise -= value;
        }

}