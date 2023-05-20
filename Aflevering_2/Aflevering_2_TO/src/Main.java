public class Main {
    public static void main(String[] args) {

//1.g From the main method in the Main class, create an instance of the Team class (instantiate the Team class).
        Team team1= new Team("Milwaukee Bucks");

//1.i From the main method, call the method setRank on the instance of Team you created in step 1.g with a number of your choice
        team1.setRank(3);

        //1.k From the main method, create 5 more Team instances and print them.
        Team team2=new Team("Cleveland Cavaliers");
        Team team3=new Team("Los Angeles Lakers");
        Team team4=new Team("Detroit Pistons");
        Team team5=new Team("Miami Heat");
        Team team6=new Team("Golden State Warriors");

        team2.setRank(4);
        team3.setRank(2);
        team4.setRank(5);
        team5.setRank(6);
        team6.setRank(1);

        System.out.println(team1.toString());
        System.out.println(team2.toString());
        System.out.println(team3.toString());
        System.out.println(team4.toString());
        System.out.println(team5.toString());
        System.out.println(team6.toString());


    }
}