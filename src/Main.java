import java.util.HashMap;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void mainMenu(int winCount, int loseCount){
        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("MAIN MENU: CHOOSE PLAY OR QUIT OR HISTORY");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next().toLowerCase();
        if(userInput.equals("history")){
            System.out.println("You've won "+winCount+" games and lost "+loseCount+" games.");
        }
        if(userInput.equals("play")) gameplay(winCount, loseCount);
        if(userInput.equals("quit")){
            System.out.println("You've won "+winCount+" games and lost "+loseCount+" games.");
            System.out.println("Thanks for playing!");
        }
    }

    public static void gameplay(int winCount, int loseCount){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Make your move! Choose rock, paper, or scissors. If you'd like to quit, enter 'quit'.");
        String user = scanner.next().toLowerCase();

        int computer = new Random().nextInt(3);
        HashMap<Integer, String> comMap = new HashMap<>();
        comMap.put(0,"rock");
        comMap.put(1,"paper");
        comMap.put(2,"scissors");

        String com = comMap.get(computer);

        String human = user;
        System.out.println("You chose "+human+" and computer chose "+com);
        if(human.equals("rock") && com.equals("paper")){
            System.out.println("Computer wins!");
            loseCount++;
        }
        if(human.equals("paper") && com.equals("rock")){
            System.out.println("You win!");
            winCount++;
        }
        if(human.equals("scissors") && com.equals("paper")){
            System.out.println("You win!");
            winCount++;
        }
        if(human.equals("paper") && com.equals("scissors")){
            System.out.println("Computer wins!");
            loseCount++;
        }
        if(human.equals("rock") && com.equals("scissors")){
            System.out.println("You win!");
            winCount++;
        }
        if(human.equals("scissors") && com.equals("scissors")){
            System.out.println("It's a tie!");
        }
        if(human.equals("rock") && com.equals("rock")){
            System.out.println("It's a tie!");
        }
        if(human.equals("paper") && com.equals("paper")){
            System.out.println("It's a tie!");
        }
        mainMenu(winCount, loseCount);
    }


    public static void main(String[] args) {
        int winCount = 0;
        int loseCount = 0;
        mainMenu(winCount,loseCount);





    }
}
