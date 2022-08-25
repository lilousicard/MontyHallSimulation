public class Main {

    public static void main(String[] args) {
        Game game = new Game();
        for (int i =0; i<10; i++){
            game.shuffle();
            game.setChoice(0);
            System.out.println(game.getTaken1());
            game.reset();
            System.out.println(game.toString());
        }


    }
}
