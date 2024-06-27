package com.pluralsight;
import java.util.Scanner;
import java.util.StringTokenizer;

public class GameScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a score: ");
        String input = scanner.nextLine();

        StringTokenizer st = new StringTokenizer(input, "|:");
        String team1 = st.nextToken().trim();
        int score1 = Integer.parseInt(st.nextToken());
        String team2 = st.nextToken().trim();
        int score2 = Integer.parseInt(st.nextToken());

        if (score1 > score2) {
            System.out.println("Winner: " + team1);
        } else if (score1 < score2) {
            System.out.println("Winner: " + team2);
        } else {
            System.out.println("It's a tie!");
        }
    }
}