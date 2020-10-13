package com.company;

import java.util.*;

public class Store {

    static Scanner scan = new Scanner(System.in);

    Game g = new Game();

    public void sellAnimals(Player player) {

        System.out.println("Which animal do you want to buy?");
        animalList();
        playerBuyAnimal(player);

    }

    public void animalList() {

        System.out.println("1. Cat.  Price 200kr" +
                "\n2. Rabbit.  Price 150kr" +
                "\n3. Horse.  Price 9500kr" +
                "\n4. Donkey.  Price 9000kr" +
                "\n5. Pig.  Price 1000kr" +

                "\n\n6. Exit --> Main Menu");
    }

    public void playerBuyAnimal(Player player) {
        int playerChoice = scan.nextInt();

        if (playerChoice == 1) {

            System.out.println("If you don't have enough money, you'll " +
                    "have to return the animal.");

            var name = askName("Cat");
            var cat = new Cat().createAnimal(name, askGender(name));

            if(player.money < cat.price) {
                System.out.println("You don't have enough money to afford this animal!" +
                        "\nReturning back to Store...");
                animalList();
            }

            else {

                // Subtract the cat.price from player.money
                player.money -= cat.price;

                System.out.println("Budget: ");
                System.out.println(player.money);
                // adds animals to ArrayList
                player.ownedAnimals.add(cat);

                System.out.println(player.name + " purchased: " + "Cat " +
                        player.ownedAnimals.get(0).animalName +
                        ", Health: " + cat.healthPoints);
                buyMoreAnimals(player);

            }
        }

        if (playerChoice == 2) {

            System.out.println("If you don't have enough money, you'll " +
                    "have to return the animal.");

            var name = askName("Rabbit");
            var rabbit = new Rabbit().createAnimal(name, askGender(name));

            if(player.money < rabbit.price) {
                System.out.println("You don't have enough money to afford this animal!" +
                        "\nReturning back to Store...");
                animalList();
            }

            else {
                player.money -= rabbit.price;

                System.out.println("Budget: ");
                System.out.println(player.money);
                // adds animals to ArrayList
                player.ownedAnimals.add(rabbit);
                System.out.println(player.name + " purchased: " + "Rabbit " +
                        player.ownedAnimals.get(0).animalName +
                        ", Health: " + rabbit.healthPoints);
                buyMoreAnimals(player);
            }

        }
        if (playerChoice == 3) {

            System.out.println("If you don't have enough money, you'll " +
                    "have to return the animal.");

            var name = askName("Horse");
            var horse = new Horse().createAnimal(name, askGender(name));

            if(player.money < horse.price) {
                System.out.println("You don't have enough money to afford this animal!" +
                        "\nReturning back to Store...");
                animalList();
            }

            else {
                player.money -= horse.price;

                System.out.println("Budget: ");
                System.out.println(player.money);
                // adds animals to ArrayList
                player.ownedAnimals.add(horse);
                System.out.println(player.name + " purchased: " + "Horse " +
                        player.ownedAnimals.get(0).animalName +
                        ", Health: " + horse.healthPoints);
                buyMoreAnimals(player);
            }

        }
        if (playerChoice == 4) {

            System.out.println("If you don't have enough money, you'll " +
                    "have to return the animal.");

            var name = askName("Donkey");
            var donkey = new Donkey().createAnimal(name, askGender(name));

            if(player.money < donkey.price) {
                System.out.println("You don't have enough money to afford this animal!" +
                        "\nReturning back to Store...");
                animalList();
            }

            else {
                player.money -= donkey.price;

                System.out.println("Budget: ");
                System.out.println(player.money);
                // adds animals to ArrayList
                player.ownedAnimals.add(donkey);
                System.out.println(player.name + " purchased: " + "Donkey " +
                        player.ownedAnimals.get(0).animalName +
                        ", Health: " + donkey.healthPoints);
                buyMoreAnimals(player);
            }

        }

        if (playerChoice == 5) {

            System.out.println("If you don't have enough money, you'll " +
                    "have to return the animal.");

            var name = askName("Pig");
            var pig = new Pig().createAnimal(name, askGender(name));

            if (player.money < pig.price) {
                System.out.println("You don't have enough money to afford this animal!" +
                        "\nReturning back to Store...");
                animalList();
            } else {
                player.money -= pig.price;

                System.out.println("Budget: ");
                System.out.println(player.money);
                // adds animals to ArrayList
                player.ownedAnimals.add(pig);
                System.out.println(player.name + " purchased: " + "Pig " +
                        player.ownedAnimals.get(0).animalName +
                        ", Health: " + pig.healthPoints);
                buyMoreAnimals(player);
            }
        }
        if (playerChoice == 6) {
            g.mainMenu();
        }


    }

    // Buy more animals
    public void buyMoreAnimals(Player player) {
        System.out.println("Wish to buy more animals? [yes/no]");
        String playerChoiceStr = scan.next();
        if (playerChoiceStr.equalsIgnoreCase("yes")) {
            sellAnimals(player);
        } else {
            g.mainMenu(); // player
        }
    }

    // Buy more food
    public void buyMoreFood(Player player) {
        System.out.println("Wish to buy more food? [yes/no]");
        String playerChoiceStr = scan.next();
        if (playerChoiceStr.equalsIgnoreCase("yes")) {
            foodList(player);
        } else {
            g.mainMenu(); // player
        }
    }

    // How do we know which player is bying the animal?
    // We need to add the knewly created animal to that players list of animals!


    public static String askName(String animalType) {
        System.out.println("Name your " + animalType + ": ");
        return scan.next();
    }

    public static String askGender(String name) {
        System.out.println("What gender is " + name + " (male/female): ");

        return scan.next();

    }

    public void askFood(String foodType) {
        System.out.println("How many " + foodType + " " +
                "you want to buy? (kg):");

    }


    // Food List
    public void foodList(Player player) {

        System.out.println("Hi! What do you want to buy?");

        System.out.println("========== CAT FOOD ==========");
        System.out.println("1. Cat noodles. Price: 50kr/kg" +
                "\n2. Fish. Price: 100kr/kg" +
                "\n3. Bananas. Price: 20kr/kg" +
                "\n4. Berries. Price: 150kr/kg");

        System.out.println("\n======== RABBIT FOOD ========");
        System.out.println("5. Carrot. Price: 20kr/kg" +
                "\n6. Cucumber. Price: 20kr/kg" +
                "\n7. Zucchini. Price: 45kr/kg");

        System.out.println("\n======== HORSE FOOD ========");
        System.out.println("8. Melons. Price: 35kr/kg " +
                "\n9. Pumpkin. Price: 40kr/kg" +
                "\n10. Grass. Price: 20kr/kg");

        System.out.println("\n======== DONKEY FOOD ========");
        System.out.println("11. Carrots. Price: 20kr/kg" +
                "\n12. Apples. Price: 35kr/kg" +
                "\n13. SugarBeet. Price: 10kr/kg");

        System.out.println("\n======== PIG FOOD ========");
        System.out.println("14. Corn. Price: 15kr/kg" +
                "\n15. Soybeans. Price: 20kr/kg");

        System.out.println("\n16. EXIT --> Main menu");

        playerBuyFood(player);

    }

    public void playerBuyFood(Player player) {
        int playerChoise2 = scan.nextInt();

        if (playerChoise2 == 1) {


            askFood("Cat Noodles");
            int nood = scan.nextInt();
            var catNood = new CatNoodles().createFood("Cat Noodles");
            int price = nood * catNood.aFoodPrice;

            if(player.money < price) {
                System.out.println("Not enough money!" +
                        "\nReturning back to Store.....");
                foodList(player);
            } else {

                System.out.println("Price: " + price);
                System.out.println("Budget: ");

                System.out.println(player.money - price);
                player.ownedFood.add(catNood);
                System.out.println(player.name + " bought " + nood + "kg " + player.ownedFood.get(0).foodName);
                buyMoreFood(player);
            }

        }

        if (playerChoise2 == 2) {

            askFood("Fish");
            int fishFish = scan.nextInt();
            var fish = new Fish().createFood("Fish");
            int price = fishFish * fish.aFoodPrice;

            if(player.money < price) {
                System.out.println("Not enough money!" +
                        "\nReturning back to Store.....");
                foodList(player);

            } else {

                System.out.println("Price: " + price);
                System.out.println("Budget: ");

                System.out.println(player.money - price);
                player.ownedFood.add(fish);
                System.out.println(player.name + " bought " + fishFish + "kg " + player.ownedFood.get(0).foodName);
                buyMoreFood(player);
            }

        }

        if (playerChoise2 == 3) {

            askFood("Bananas");
            int banana = scan.nextInt();
            var bananas = new Bananas().createFood("Bananas");
            int price = banana * bananas.aFoodPrice;

            if(player.money < price) {
                System.out.println("Not enough money!" +
                        "\nReturning back to Store.....");
                foodList(player);
            } else {

                System.out.println("Price: " + price);
                System.out.println("Budget: ");

                System.out.println(player.money - price);
                player.ownedFood.add(bananas);
                System.out.println(player.name + " bought " + banana + "kg " + player.ownedFood.get(0).foodName);
                buyMoreFood(player);
            }

        }

        if (playerChoise2 == 4) {

            askFood("Berries");
            int berry = scan.nextInt();
            var berries = new Berries().createFood("Berries");
            int price = berry * berries.aFoodPrice;

            if(player.money < price) {
                System.out.println("Not enough money!" +
                        "\nReturning back to Store.....");
                foodList(player);
            } else {

                System.out.println("Price: " + price);
                System.out.println("Budget: ");

                System.out.println(player.money - price);
                player.ownedFood.add(berries);
                System.out.println(player.name + " bought " + berry + "kg " + player.ownedFood.get(0).foodName);
                buyMoreFood(player);
            }

        }

        if (playerChoise2 == 5) {

            askFood("Carrot");
            int carrot = scan.nextInt();
            var carrots = new Carrot().createFood("Carrot");
            int price = carrot * carrots.aFoodPrice;

            if(player.money < price) {
                System.out.println("Not enough money!" +
                        "\nReturning back to Store.....");
                foodList(player);

            } else {

                System.out.println("Price: " + price);
                System.out.println("Budget: ");

                System.out.println(player.money - price);
                player.ownedFood.add(carrots);
                System.out.println(player.name + " bought " + carrot + "kg " + player.ownedFood.get(0).foodName);
                buyMoreFood(player);
            }

        }

        if (playerChoise2 == 6) {

            askFood("Cucumber");
            int cucumber = scan.nextInt();
            var cucumbers = new Cucumber().createFood("Cucumber");
            int price = cucumber * cucumbers.aFoodPrice;

            if(player.money < price) {
                System.out.println("Not enough money!" +
                        "\nReturning back to Store.....");
                foodList(player);

            } else {

                System.out.println("Price: " + price);
                System.out.println("Budget: ");

                System.out.println(player.money - price);
                player.ownedFood.add(cucumbers);
                System.out.println(player.name + " bought " + cucumber + "kg " + player.ownedFood.get(0).foodName);
                buyMoreFood(player);
            }

        }

        if (playerChoise2 == 7) {

            askFood("Zucchini");
            int zucchini = scan.nextInt();
            var zucchinis = new Zucchini().createFood("Zucchini");
            int price = zucchini * zucchinis.aFoodPrice;

            if(player.money < price) {
                System.out.println("Not enough money!" +
                        "\nReturning back to Store.....");
                foodList(player);
            } else {

                System.out.println("Price: " + price);
                System.out.println("Budget: ");

                System.out.println(player.money - price);
                player.ownedFood.add(zucchinis);
                System.out.println(player.name + " bought " + zucchini + "kg " + player.ownedFood.get(0).foodName);
                buyMoreFood(player);
            }

        }

        if (playerChoise2 == 8) {

            askFood("Melons");
            int melon = scan.nextInt();
            var melons = new Melons().createFood("Melons");
            int price = melon * melons.aFoodPrice;

            if(player.money < price) {
                System.out.println("Not enough money!" +
                        "\nReturning back to Store.....");
                foodList(player);
            } else {

                System.out.println("Price: " + price);
                System.out.println("Budget: ");

                System.out.println(player.money - price);
                player.ownedFood.add(melons);
                System.out.println(player.name + " bought " + melon + "kg " + player.ownedFood.get(0).foodName);
                buyMoreFood(player);
            }

        }

        if (playerChoise2 == 9) {

            askFood("Pumpkin");
            int pumpkin = scan.nextInt();
            var pumpkins = new Pumpkin().createFood("Pumpkin");
            int price = pumpkin * pumpkins.aFoodPrice;

            if(player.money < price) {
                System.out.println("Not enough money!" +
                        "\nReturning back to Store.....");
                foodList(player);
            } else {

                System.out.println("Price: " + price);
                System.out.println("Budget: ");

                System.out.println(player.money - price);
                player.ownedFood.add(pumpkins);
                System.out.println(player.name + " bought " + pumpkin + "kg " + player.ownedFood.get(0).foodName);
                buyMoreFood(player);
            }

        }

        if (playerChoise2 == 10) {

            askFood("Grass");
            int grass = scan.nextInt();
            var grasses = new Grass().createFood("Grass");
            int price = grass * grasses.aFoodPrice;

            if(player.money < price) {
                System.out.println("Not enough money!" +
                        "\nReturning back to Store.....");
                foodList(player);
            } else {

                System.out.println("Price: " + price);
                System.out.println("Budget: ");

                System.out.println(player.money - price);
                player.ownedFood.add(grasses);
                System.out.println(player.name + " bought " + grass + "kg " + player.ownedFood.get(0).foodName);
                buyMoreFood(player);
            }

        }

        if (playerChoise2 == 11) {

            askFood("Pear");
            int pear = scan.nextInt();
            var pears = new Pear().createFood("Pears");
            int price = pear * pears.aFoodPrice;

            if(player.money < price) {
                System.out.println("Not enough money!" +
                        "\nReturning back to Store.....");
                foodList(player);
            } else {

                System.out.println("Price: " + price);
                System.out.println("Budget: ");

                System.out.println(player.money - price);
                player.ownedFood.add(pears);
                System.out.println(player.name + " bought " + pear + "kg " + player.ownedFood.get(0).foodName);
                buyMoreFood(player);
            }

        }

        if (playerChoise2 == 12) {

            askFood("Apples");
            int apple = scan.nextInt();
            var apples = new Apples().createFood("Apples");
            int price = apple * apples.aFoodPrice;

            if(player.money < price) {
                System.out.println("Not enough money!" +
                        "\nReturning back to Store.....");
                foodList(player);
            } else {

                System.out.println("Price: " + price);
                System.out.println("Budget: ");

                System.out.println(player.money - price);
                player.ownedFood.add(apples);
                System.out.println(player.name + " bought " + apple + "kg " + player.ownedFood.get(0).foodName);
                buyMoreFood(player);
            }

        }

        if (playerChoise2 == 13) {

            askFood("SugarBeet");
            int sugarBeet = scan.nextInt();
            var sugarBeets = new SugarBeet().createFood("SugarBeet");
            int price = sugarBeet * sugarBeets.aFoodPrice;

            if(player.money < price) {
                System.out.println("Not enough money!" +
                        "\nReturning back to Store.....");
                foodList(player);
            } else {

                System.out.println("Price: " + price);
                System.out.println("Budget: ");

                System.out.println(player.money - price);
                player.ownedFood.add(sugarBeets);
                System.out.println(player.name + " bought " + sugarBeet + "kg " + player.ownedFood.get(0).foodName);
                buyMoreFood(player);
            }

        }

        if (playerChoise2 == 14) {

            askFood("Corn");
            int corn = scan.nextInt();
            var corns = new Corn().createFood("SugarBeet");
            int price = corn * corns.aFoodPrice;

            if(player.money < price) {
                System.out.println("Not enough money!" +
                        "\nReturning back to Store.....");
                foodList(player);
            } else {

                System.out.println("Price: " + price);
                System.out.println("Budget: ");

                System.out.println(player.money - price);
                player.ownedFood.add(corns);
                System.out.println(player.name + " bought " + corn + "kg " + player.ownedFood.get(0).foodName);
                buyMoreFood(player);
            }

        }

        if (playerChoise2 == 15) {

            askFood("Soybeans");
            int soybean = scan.nextInt();
            var soybeans = new Soybeans().createFood("Soybeans");
            int price = soybean * soybeans.aFoodPrice;

            if(player.money < price) {
                System.out.println("Not enough money!" +
                        "\nReturning back to Store.....");
                foodList(player);
            } else {

                System.out.println("Price: " + price);
                System.out.println("Budget: ");

                System.out.println(player.money - price);
                player.ownedFood.add(soybeans);
                System.out.println(player.name + " bought " + soybean + "kg " + player.ownedFood.get(0).foodName);
                buyMoreFood(player);
            }

        }

        if(playerChoise2 == 16) {
            System.out.println("Returning to MAIN MENU....");
            g.mainMenu(); // player
        }



    }
}



