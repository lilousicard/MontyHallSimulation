import java.util.Random;

public class Game {
    private Door[] doors = { new Door(true), new Door(false), new Door(false)};
    private int choice;
    private int [] taken = new int[2];

    public Game(){

    }

    public void shuffle(){
        Random rand = new Random();

        for (int i = 0; i < doors.length; i++) {
            int randomIndexToSwap = rand.nextInt(doors.length);
            Door temp = doors[randomIndexToSwap];
            doors[randomIndexToSwap] = doors[i];
            doors[i] = temp;
        }
    }

    public String toString(){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i< doors.length; i++){
            builder.append(doors[i].isWinner());
            builder.append("; ");
        }
        return builder.toString();
    }

    public int getChoice() {
        return choice;
    }

    public void setChoice(int choice) {
        this.choice = choice;
        taken[0] = this.choice;
        revealDoor(choice);
    }

    private void revealDoor(int choice) {
        Random rand = new Random();
        int door = 0;
        do {
            door = rand.nextInt(3);
        } while (door == choice);
        taken[1]=door;
    }

    public void reset() {
        taken = new int[2];
    }

    public String getTaken1(){
        return String.valueOf(taken[1]);
    }
}
