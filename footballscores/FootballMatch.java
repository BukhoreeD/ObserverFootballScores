package footballscores;

import java.util.Scanner;

public class FootballMatch {
    public static void main(String[] args) {
        ScoreSource scoreSource = new ScoreSubject();

        FootballFan fan1 = new FootballFan();
        FootballFan fan2 = new FootballFan();

        scoreSource.registerObserver(fan1);
        scoreSource.registerObserver(fan2);

        Scanner scanner = new Scanner(System.in);
        String input;
        
        while (true) {
            System.out.print("Enter Score ");
            input = scanner.nextLine();
            
            if (input.isEmpty()) {
                break;
            }
            
            scoreSource.setLiveScore("live result: " + input);
        }

        scanner.close();
    }
}
