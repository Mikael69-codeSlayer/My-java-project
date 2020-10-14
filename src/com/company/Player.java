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
    }
    public void myFood() {
        for(var food : ownedFood) {
            System.out.println("Food: " + food.foodName + " " + food.amount + "kg");

        }
    }

    public void giveFood() {

        if(ownedFood.size() > 0) {
            System.out.println("Choose animal you want to feed (enter type) :  ");
            myAnimals();
            String feed = scan.next();
            String feed2 = scan.next();

            if(feed.equalsIgnoreCase("cat")) {
                System.out.println("Your cat can eat: \"CatNoodles\", \"Fish\", \"Bananas\", \"Berries\"");
                System.out.println("You have: ");
                myFood();

                System.out.println("Choose food: ");
                if(feed2.equalsIgnoreCase("catnoodles"))


                System.out.println("How many kg?: ");
                int kgFood = scan.nextInt();


            }

        } else  {
            System.out.println("You have no food!");
            g.mainMenu();
        }

    }



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

   // public void buyAnAnimal() {

        // fråga vilken typ
        // fråga vilket kön

        // kolla om tillräckligt med pengar för djurets pris
        // annars säg "går inte"

        // skapa ett nytt djur av rätt djurklass
        // lägg till djuret i animals-listan

        // ska denna kod ligga här? eller ska store-klassen göra något?
   // }


 //   }






