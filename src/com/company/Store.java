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














  /*  public void availableAnimals() {
        // Cats
        // Male cat

        var cat = new Cat().createAnimal("Gustav", "male");
        System.out.println(cat.getClass().getSimpleName()
                + "\n Name: " + cat.animalName
                + "\n Gender: " + cat.animalGender
                + "\n Price: " + cat.price
                + "\n Health Points: " + cat.healthPoints);




        // Female cat
        var cat2 = new Cat().createAnimal("Linnea", "female");
        System.out.println(cat2.getClass().getSimpleName()
                + "\n Name: " + cat2.animalName
                + "\n Gender: " + cat2.animalGender
                + "\n Price: " + cat2.price
                + "\n Health Points: " + cat2.healthPoints);

        // Rabbits
        // Male Rabbit
        var rabbit = new Rabbit().createAnimal("Albin", "male");
        System.out.println(rabbit.getClass().getSimpleName()
                + "\n Name: " + rabbit.animalName
                + "\n Gender: " + rabbit.animalGender
                + "\n Price: " + rabbit.price
                + "\n Health Points: " + rabbit.healthPoints);

        // Female rabbit
        var rabbit2 = new Rabbit().createAnimal("Josephine", "female");
        System.out.println(rabbit2.getClass().getSimpleName()
                + "\n Name: " + rabbit2.animalName
                + "\n Gender: " + rabbit2.animalGender
                + "\n Price: " + rabbit2.price
                + "\n Health Points: " + rabbit2.healthPoints);

        // Horses
        // Male horse
        var horse = new Horse().createAnimal("Johnny", "male");
        System.out.println(horse.getClass().getSimpleName()
                + "\n Name: " + horse.animalName
                + "\n Gender: " + horse.animalGender
                + "\n Price: " + horse.price
                + "\n Health Points: " + horse.healthPoints);

        //Female horse
        var horse2 = new Horse().createAnimal("Johanna", "female");
        System.out.println(horse2.getClass().getSimpleName()
                + "\n Name: " + horse2.animalName
                + "\n Gender: " + horse2.animalGender
                + "\n Price: " + horse2.price
                + "\n Health Points: " + horse2.healthPoints);

        // Donkeys
        // Male donkey
        var donkey = new Donkey().createAnimal("Bertil", "male");
        System.out.println(donkey.getClass().getSimpleName()
                + "\n Name: " + donkey.animalName
                + "\n Gender: " + donkey.animalGender
                + "\n Price: " + donkey.price + "\n Health Points: " + donkey.healthPoints);

       // Female donkey
        var donkey2 = new Donkey().createAnimal("Bonnie", "female");
        System.out.println(donkey2.getClass().getSimpleName()
                + "\n Name: " + donkey2.animalName
                + "\n Gender: " + donkey2.animalGender
                + "\n Price: " + donkey2.price
                + "\n Health Points: " + donkey2.healthPoints);

        // Pigs
        // Male pig
        var pig = new Pig().createAnimal("Bruce", "male");
        System.out.println(pig.getClass().getSimpleName()
                + "\n Name: " + pig.animalName
                + "\n Gender: " + pig.animalGender
                + "\n Price: " + pig.price
                + "\n Health Points: " + pig.healthPoints);

        // Female pig
        // Female donkey
        var pig2 = new Pig().createAnimal("Sakura", "female");
        System.out.println(pig2.getClass().getSimpleName()
                + "\n Name: " + pig2.animalName
                + "\n Gender: " + pig2.animalGender
                + "\n Price: " + pig2.price
                + "\n Health Points: " + pig2.healthPoints);
    } */
}

// array list i player
// mappa ut djur