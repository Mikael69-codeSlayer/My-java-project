package com.company;

import java.util.*;

public class Player {

    Game g = new Game();

    Scanner scan = new Scanner(System.in);

    public String name;
    public int money = 10000;
    // Own Animals and Food
     public ArrayList<Animal> ownedAnimals = new ArrayList<>();
     public ArrayList<Food> ownedFood = new ArrayList<>();


    public Player(String name) {
        this.name = name;
    }

    public void myAnimals() {
        // animal list
        for(var animal : ownedAnimals) {
            System.out.println("Animal: " + animal.type
                    + ", Name: " + animal.animalName
                    + ", Gender: " + animal.animalGender
                    + ", Health: " + animal.healthPoints);

            // Decreases health
           if(ownedAnimals.size() > 0) {
               var randomNumber = (int) ((Math.random() * (31 - 10)) + 10);
               animal.healthPoints -= randomNumber;
           }
        }
        notAlive();


    }
    public void myFood() {
        for(var food : ownedFood) {
            System.out.println("Food: " + food.foodName + " " + food.amount + "kg");

        }
    }

    public void giveFood() {

        if(ownedFood.size() > 0) {
            myAnimals();

            System.out.println("Choose animal you want to feed (enter type) :  ");


            String feed = scan.next();



            if(feed.equalsIgnoreCase("Cat")) {
                 /*
        Choose between 2 or more animals
        Only chosen animal's hp can increase
        if player choose animal 1 (or type animal's name) --> do this
        else -> ....

         */

                        System.out.println("Your cats can eat: \"1. Cat Noodles\", \"2. Fish\"," +
                                " \"3. Bananas\", \"4. Berries\"");
                        System.out.println("You have: ");
                        myFood();


                        System.out.println("Choose food: ");
                        int feed2 = scan.nextInt();

                        String[] foodTypes = {"Cat Noodles", "Fish", "Bananas", " Berries"};
                        var chosenFood = foodTypes[feed2 - 1];

                        var howMuch = howMuchFood();

                        for (var food : ownedFood) {
                            if (food.foodName.equals(chosenFood)) {
                                food.amount -= howMuch;
                                System.out.println("Food left: " + food.amount + "kg");

                            }


                        }

                        // howMuchFood();





                /*     System.out.println("How many kg?");
                    int kg = scan.nextInt();
                    if(kg == 1) {
                        for(var animal : ownedAnimals) {
                            animal.healthPoints += 10;
                            System.out.println(animal.healthPoints);
                        }
                    } */



            }

           else if(feed.equalsIgnoreCase("Rabbit")) {
                System.out.println("Your rabbit can eat: \"1. Carrot\", \"2. Cucumber\", \"3. Zucchini\"");
                System.out.println("You have:");
                myFood();

                System.out.println("Choose food:");
                int feed2 = scan.nextInt();
                String[] foodTypes = {"Carrot", "Cucumber", "Zucchini"};
                var chosenFood = foodTypes[feed2 - 1];

                var howMuch = howMuchFood();

                for (var food : ownedFood) {
                    if (food.foodName.equals(chosenFood)) {
                        food.amount -= howMuch;
                        System.out.println("Food left: " + food.amount + "kg");

                    }

                }
            }

           else if(feed.equalsIgnoreCase("Horse")) {
                System.out.println("Your horse can eat: \"1. Melons\", \"2. Pumpkin\", \"3. Grass\"");
                System.out.println("You have:");
                myFood();

                System.out.println("Choose food:");
                int feed2 = scan.nextInt();
                String[] foodTypes = {"Melons", "Pumpkin", "Grass"};
                var chosenFood = foodTypes[feed2 - 1];

                var howMuch = howMuchFood();
                for (var food : ownedFood) {
                    if (food.foodName.equals(chosenFood)) {
                        food.amount -= howMuch;
                        System.out.println("Food left: " + food.amount + "kg");

                    }
                }
            }

        } else  {
            System.out.println("You have no food!");
            g.mainMenu();
        }



    }

    public int howMuchFood() {

        System.out.println("How many kg?");
        int giveFood = scan.nextInt();

        for(var food : ownedFood) {

            if(food.amount < giveFood) {
                System.out.println("try again");
                howMuchFood();

            } else {

                int healthIncrease = 10;
                int hp = giveFood + healthIncrease;

                // 1kg food -> +10 hp
                for(var animal : ownedAnimals) {

                    animal.healthPoints += hp;
                    System.out.println(animal.type
                                       + " "
                                       + animal.animalName
                                       + ", "
                                       + "Health: "
                                       + animal.healthPoints);
                }


            }
        }


        return giveFood;
      /*  int healthIncrease = 10;
        int hp = giveFood + healthIncrease;

        // 1kg food -> +10 hp
        for(var animal : ownedAnimals) {

                animal.healthPoints += hp;
                System.out.println(animal.type
                        + " "
                        + animal.animalName
                        + ", "
                        + "Health: "
                        + animal.healthPoints);
        } */

    }



    public void notAlive() {
        for(var animal : ownedAnimals) {
            if(animal.healthPoints <= 0) {
                ownedAnimals.remove(animal);
                System.out.println("The " + animal.type + " " + animal.animalName + " died");

            }

        }
    }



    // Fix it later

   /* public void tooMuch() {
        for(var animal : ownedAnimals) {
            if(animal.healthPoints <= 100) {
                System.out.println("Your " + animal.type + " " + animal.animalName
                + " have already 100 hp ");
            }
        }
    } */




  /*  public void decreaseHealth() {
          if(ownedAnimals.size() > 0) {
            for(var animal : ownedAnimals) {
                System.out.println(animal);
                var randomNumber = (int)((Math.random() * (31 - 10)) + 10);
                animal.healthPoints -= randomNumber;
            }

        }
    } */
}








