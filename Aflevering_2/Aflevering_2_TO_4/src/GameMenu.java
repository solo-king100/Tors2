import java.util.ArrayList;
import java.util.Scanner;

public class GameMenu {

    private ArrayList<String> actions;

    public GameMenu(ArrayList<String> actions){
        this.actions=actions;

    }
    public void displayMenu(){
        System.out.println(actions);
    }

    public String getAction(){
        System.out.println("Type a number to choose an action");
        displayMenu();

        Scanner scanner=new Scanner(System.in);
        String Choice=scanner.nextLine();

        return Choice;
    }
}
