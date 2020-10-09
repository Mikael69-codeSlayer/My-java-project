package com.company;

import java.util.*;

public class Store {

    static Scanner scan = new Scanner(System.in);
    Player p = new Player();

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
                         "\n5. Pig.  Price 1000kr");
    }

    public void playerBuyAnimal(Player player) {
        int playerChoice = scan.nextInt();

        if(playerChoice == 1) {

            var name = askName("Cat");
            var cat = new Cat().createAnimal(name, askGender(name));

                System.out.println("Budget: ");
                System.out.println(p.money - cat.price);
                // adds animals to ArrayList
                player.ownedAnimals.add(cat);
                System.out.println("You purchased: " + player.ownedAnimals.get(0).animalName);

        } if(playerChoice == 2) {
            var name = askName("Rabbit");
            var rabbit = new Rabbit().createAnimal(name, askGender(name));
            System.out.println("Budget: ");
            System.out.println(p.money - rabbit.price);
            // adds animals to ArrayList
            player.ownedAnimals.add(rabbit);
            System.out.println("You purchased: " + player.ownedAnimals.get(0).animalName);

        } if (playerChoice == 3) {
            var name = askName("Horse");
            var horse = new Horse().createAnimal(name, askGender(name));
            System.out.println("Budget: ");
            System.out.println(p.money - horse.price);
            // adds animals to ArrayList
            player.ownedAnimals.add(horse);
            System.out.println("You purchased: " + player.ownedAnimals.get(0).animalName);

        } if (playerChoice == 4) {
            var name = askName("Donkey");
            var donkey = new Rabbit().createAnimal(name, askGender(name));
            System.out.println("Budget: ");
            System.out.println(p.money - donkey.price);
            // adds animals to ArrayList
            player.ownedAnimals.add(donkey);
            System.out.println("You purchased: " + player.ownedAnimals.get(0).animalName);

        } if (playerChoice == 5) {
            var name = askName("Pig");
            var pig = new Rabbit().createAnimal(name, askGender(name));
            System.out.println("Budget: ");
            System.out.println(p.money - pig.price);
            // adds animals to ArrayList
            player.ownedAnimals.add(pig);
            System.out.println("You purchased: " + player.ownedAnimals.get(0).animalName);
        }



        // How do we know which player is bying the animal?
        // We need to add the knewly created animal to that players list of animals!

    }


    public static String askName(String animalType) {
        System.out.println("Name your " + animalType + ": ");
        return scan.next();
    }

    public static String  askGender(String name) {
        System.out.println("What gender is " + name + " (male/female): ");
       return scan.next();

    }
    public static void askFood(String foodType) {
        System.out.println("How many " + foodType + " " +
                "you want to buy? (kg):" );
        //return scan.nextInt();
    }


    // Food List
    public void foodList(Player player) {
        System.out.println("Hi! What do you want to buy?" +
                "\n1. Buy cat food" +
                "\n2. Buy rabbit food" +
                "\n3. Buy horse food" +
                "\n4. Buy donkey food" +
                "\n5. Buy pig food");
        foodListChoose(player);

    }
       // Choose food
    public void foodListChoose(Player player) {
        int foodChoose = scan.nextInt();

        if(foodChoose == 1) {
            System.out.println("========== CAT FOOD ==========");
            System.out.println(  "1. Cat noodles. Price: 50kr/kg" +
                               "\n2. Fish. Price: 100kr/kg" +
                               "\n3. Bananas. Price: 20kr/kg" +
                               "\n4. Berries. Price: 150kr/kg");
        }
        else if(foodChoose == 2) {
            System.out.println("======== RABBIT FOOD ========");
            System.out.println("1. Carrot. Price: 20kr/kg" +
                             "\n2. Cucumber. Price: 20kr/kg" +
                             "\n3. Zucchini. Price: 45kr/kg");
        }
        else if(foodChoose == 3) {
            System.out.println("======== HORSE FOOD ========");
            System.out.println("1. Melons. Price: 35kr/kg " +
                               "\n2. Pumpkin. Price: 40kr/kg" +
                               "\n3. Grass. Price: 20kr/kg");
        }
        else if (foodChoose == 4) {
            System.out.println("======== DONKEY FOOD ========");
            System.out.println("1. Carrots. Price: 20kr/kg" +
                             "\n2. Apples. Price: 35kr/kg" +
                             "\n3. SugarBeet. Price: 10kr/kg");
        }
        else if (foodChoose == 5) {
            System.out.println("======== PIG FOOD ========");
            System.out.println("1. Corn. Price: 15kr/kg" +
                             "\n2. Soybeans. Price: 20kr/kg");
        }

        playerBuyFood(player);

    }

    public void playerBuyFood(Player player) {
        int playerChoise2 = scan.nextInt();

        if(playerChoise2 == 1) {

            askFood("Cat Noodles");
          int nood = scan.nextInt();
          var catNood = new CatNoodles().createFood("Cat Noodles");
          int price = nood * catNood.aFoodPrice;

            System.out.println("Price: " + price);
            System.out.println("Budget: " );

            System.out.println(p.money - price);
            player.ownedFood.add(catNood);
            System.out.println(player.name + " bought " + nood + "kg " + player.ownedFood.get(0).foodName);

        }

        }

}



