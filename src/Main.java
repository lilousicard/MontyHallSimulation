import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //One game with three door is created
        Game game = new Game();
        for (int i =0; i<10; i++){
            game.shuffle();
            System.out.println("Door is winner?: " + game.toString());
            Random rand = new Random();
            int choice = rand.nextInt(3);
            System.out.println("choice = "+choice);
            game.setChoice(choice);
            //System.out.println(game.getTaken1());
            System.out.println("door closed?: "+ game.doorIsClose());
            System.out.println(" ");
            game.reset();
        }
    }
}
