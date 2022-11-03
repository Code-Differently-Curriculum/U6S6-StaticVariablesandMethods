package partA.ex01;

public class PlayerTest {
    public static void main(String[] args){
        Team Lakers = new Team("A1", false, 1234);
        Team Celtics = new Team("B1", false, 1234);
        Team Warriors = new Team("C1", false, 1234);
        Team Sixers = new Team("D1", false, 1234);

        Player LeBron = new Player("LeBron", 2.08, 4, Lakers);


    }
}
