package com.company;

// Imports everything
import java.util.*;

public class Game {
                      // Scanner for input
    private final Scanner scan = new Scanner(System.in);

    // My "start" method
    protected void gameStart() {
        // Menu:  start - end
        System.out.println("===== Start Menu =====");
        System.out.println("1. Start a new game" +
                "\n2. Exit");
            // try catch. If you enter words/letters
        // It will throw an error message
        try {
                // String -> int. Because I want only figures here
                String playerInput = scan.next();
                int playerInputInteger = Integer.parseInt(playerInput);
                // If-else statements
                if (playerInputInteger == 1) {

                    setGameRounds(); // Calls setGameRounds-method

                } else if (playerInputInteger == 2) {

                    gameRestart();  // Calls gameRestart-method

                } else {
                    System.out.println("Enter 1 or 2!");
                    gameStart();
                }
              // throwsn an Exception
            } catch (Exception e) {
                System.out.println("No letters / words here!" +
                        "\nEnter 1 or 2!");
                gameStart();
            }
    }

    // Game Rounds
    private void setGameRounds() {
        System.out.println("How many rounds do you want to play? (5-30)");
       while (true) {
            try {
                String gameRounds = scan.next();
                int gameRoundsInt = Integer.parseInt(gameRounds);
                if (gameRoundsInt >= 5 && gameRoundsInt <= 30) {
                    System.out.println("You will play " + gameRoundsInt + " rounds.");

                } else {
                    System.out.println("You need to choose between 5 and 30!");
                    setGameRounds();
                }
                break;

            } catch (Exception e) {
                System.out.println("You cannot type letters/words here!" +
                       " Please, try again. Choose between 5 - 30");

            }
        }
    }

    // Play again
    private void gameRestart() {
        System.out.println("Are you sure that you want to exit? [yes/no]");
        String playerInput2 = scan.next();
       // if-statement
        if (playerInput2.equals("yes")) {
            System.out.println("You closed the game");
            System.exit(0);

        } else if (playerInput2.equals("no")) {
            gameStart();  // Calls gameStart()-method and returns Start Menu

        } else {
            // Throws an error message if you enter wrong text
            // or figures
            System.out.println("Error.... Enter yes or no!");
            gameRestart(); // Calls gameRestart()-method
        }
    }

}







