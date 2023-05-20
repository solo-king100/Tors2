import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> actions = new ArrayList<>();
        actions.add("1) Start Game");
        actions.add("2) Resume Game");
        actions.add("3) Pause Game");
        actions.add("4) End Game");

        GameMenu gameMenu = new GameMenu(actions);

        gameMenu.getAction();

        String userChoice = gameMenu.getAction();
        doAction(Integer.parseInt(userChoice));
    }


    public static void doAction(int action) {
        switch (action) {
            case 1:
                System.out.println("Starting the game now");
                break;
            case 2:
                System.out.println("Fetching previously saved game data");
                break;
            case 3:
                System.out.println("Game Paused");
                break;
            case 4:
                System.out.println("Ending Game");
                break;
            default:
                System.out.println("Invalid action");
        }
    }
}
