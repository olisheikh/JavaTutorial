import java.util.Scanner;

public class ScoreCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int score = sc.nextInt();

        int position = calculatetingScore(score);
        displayHighScorePosition("Tim", position);

    }

    public static int calculatetingScore(int score) {
        if (score >= 1000)
            return 1;
        else if (score >= 500)
            return 2;
        else if (score >= 100)
            return 3;
        else
            return 4;
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " manage to get into position " + position + " on the high score list");
    }
}
