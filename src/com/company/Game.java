package com.company;

// Imports everything
import java.util.*;

public class Game {

    // Variables
    int gameRounds;
    int gamePlayer; // Array
    int currentRound;

    // My "start" method
    public void gameStart() {  // Exception for else statement
        // Scanner
        Scanner scan = new Scanner(System.in);
        // Menu:  start - end
        System.out.println("=== Start Menu ===");
        System.out.println("1. Start a new game" +
                "\n2. Exit");
        int playerAnswer = scan.nextInt();

        // switch-case
        switch (playerAnswer) {
            case 1:
                if (playerAnswer == 1) { // If player starts a new game
                    // Rounds
                    System.out.println("How many rounds do you want to play? (5-30)");
                    // While loop.
                    // You can only choose between 5-30
                    while (true) {
                        gameRounds = scan.nextInt();  //  scanner
                        if (gameRounds >= 5 && gameRounds <= 30) {  // 5 to 30
                            System.out.println("You will play " + gameRounds + " rounds.");
                            break;  // breaks the loop
                        } else {
                            System.out.println("You need to choose between 5 and 30!");
                        }

                    }
                    // Ask about players
                    System.out.println("How many players will play? (1-4): ");
                    // Another while-loop.
                    // Max 4 players
                    while (true) {
                        gamePlayer = scan.nextInt();  // scanner
                        if (gamePlayer >= 1 && gamePlayer <= 4) {   // 1 to 4
                            System.out.println(gamePlayer + " player/s will play the game.");
                            break;   // breaks the loop
                        } else if (gamePlayer == 0) {
                            System.out.println("There can't be 0 players." +
                                    "\nYou need to have at least 1.");
                        } else {
                            System.out.println("Max 4 players!");
                        }

                    }

                    // Ask players names
                    System.out.println("Write player's name: ");

                    // Call getName()-method from class Player
                    Player p = new Player(); // Player class
                    p.getName(); // getName-method with scanner
                    System.out.println("Player list: " + p.name);  // print player list

                    break;

                }
                        case 2:
                            if (playerAnswer == 2) { // exit
                                System.out.println("... exit");
                                System.exit(0);
                                break;
                            }
                            // A message if player press wrong button
                        default:
                            System.out.println("You need to choose 1 or 2!");
                    }
                }
        }





