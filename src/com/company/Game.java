package com.company;

// Imports everything
import java.util.*;

public class Game {

    protected int gameRounds;
                      // Scanner for input
    private final Scanner scan = new Scanner(System.in);

    private final ArrayList<Player> players = new ArrayList<>();

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
                    setGamePlayers(); // Calls setGamePlayers-method

                    mainMenu();



                } else if (playerInputInteger == 2) {

                    gameRestart();  // Calls gameRestart-method

                } else {
                    System.out.println("Enter 1 or 2!");
                    gameStart();
                }
              // throws an Exception
            } catch (Exception e) {
                System.out.println("No letters / words here!" +
                        "\nEnter 1 or 2!");
                gameStart();
            }
    }

    // Game Rounds

    private void setGameRounds() {
            System.out.println("How many rounds do you want to play? (5-30)");

                try {
                    gameRounds = Integer.parseInt(scan.next());
                    //String gameRounds = scan.next();
                    //int gameRoundsInt = Integer.parseInt(gameRounds);
                    if (gameRounds >= 5 && gameRounds <= 30
                        //  gameRoundsInt >= 5 && gameRoundsInt <= 30
                    ) {
                        // for loop runs rounds
                        System.out.println("You will play " + gameRounds + " rounds.");

                    } else {
                        System.out.println("You need to choose between 5 and 30!");
                        setGameRounds();
                    }

                } catch (Exception e) {
                    System.out.println("You cannot type letters/words here!" +
                            " Please, try again. Choose between 5 - 30");
                    setGameRounds();

                }
            }



    // How many players?
    private void setGamePlayers() {
        System.out.println("How many players will play the game?");
            try {
                String setGamePlayersInput = scan.next();
                int setGamePlayerInteger = Integer.parseInt(setGamePlayersInput);
                if(setGamePlayerInteger >= 1 && setGamePlayerInteger <= 4) {
                    System.out.println(setGamePlayerInteger + " players will play the game");
                    setPlayerNames(setGamePlayerInteger);
                }
                else if(setGamePlayerInteger == 0){
                    System.out.println("You need to enter at least 1 player!");
                    setGamePlayers();
                } else {
                    System.out.println("Max 4 players!");
                    setGamePlayers();
                }

            } catch (Exception e) {
                System.out.println("You cannot type letters/words here!");
                setGamePlayers();
            }

    }

    // Play again
    private void gameRestart() {
        System.out.println("Are you sure that you want to exit? [yes/no]");
        String playerInput2 = scan.next();
       // if-statement
        if (playerInput2.equalsIgnoreCase("yes")) {
            System.out.println("You closed the game");
            System.exit(0);

        } else if (playerInput2.equalsIgnoreCase("no")) {
            gameStart();  // Calls gameStart()-method and returns Start Menu

        } else {
            // Throws an error message if you enter wrong text
            // or figures
            System.out.println("Error.... Enter yes or no!");
            gameRestart(); // Calls gameRestart()-method
        }
    }

    // Name players
    private void setPlayerNames(int numberOfPlayers) {

        for(var i = 1; i <= numberOfPlayers; i++){
            System.out.println("Enter the name of player " + i);
                players.add(new Player(scan.next()));

            // Another variant
            /*var name = scan.next();
            var aNewPlayer = new Player(name);
            players.add(aNewPlayer);*/
        }

        // foreach loop genom players
        System.out.println("List of players: ");
        for(var player : players){
            System.out.println(player.name);
        }

    }

    protected void mainMenu() {
        for (var i = 1; i <= gameRounds; i++) {

            for (var player : players) {

                System.out.println("===== MAIN MENU =====");
                System.out.println("Current round " + i + ", Total rounds: " + gameRounds);

                //System.out.println("First player's turn: " + player.name +
                //      "\n Budget: " + player.money + "kr");

                System.out.println("It's " + player.name +"'s turn now!" +
                        " Your budget is: " + player.money);

                System.out.println("1. Buy animal" +
                        "\n2. Buy food" +
                        "\n3. Feed animal" +
                        "\n4. Birth new animal" +
                        "\n5. Sell animal" +
                        "\n6. Show animals" +
                        "\n7. Show food" +


                        "\n\n8. Exit to Start Menu");

                playerChoice(player);

            }

        }

    }

    private void playerChoice(Player player) {
        Store s = new Store();
        int pChoice = scan.nextInt();

        // Buy animal
        if(pChoice == 1) {
            s.sellAnimals(player);
        } else if (pChoice == 2) {
            s.foodList(player);
        }
         else if(pChoice == 6) {
            System.out.println("Your animals:");
            player.myAnimals();
        }
         else if(pChoice == 7) {
             player.myFood();
        }

        else if (pChoice == 8) {
            System.out.println("----> back to Start Menu");
            gameStart();
        }

        else {
            System.out.println("Wrong input. Try again.");
            mainMenu();
        }
    }


}







