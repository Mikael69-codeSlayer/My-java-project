package com.company;

import java.util.*;

public class Player {


    public String name;
    public int money = 1000;
    // Own Animals and Food
     public ArrayList<Animal> ownedAnimals = new ArrayList<>();
     public ArrayList<Food> ownedFood = new ArrayList<>();


    public Player(String name) {
        this.name = name;
    }

    public Player() {
        // Empty, because I want to call Player class
        // in other classes
    }

    public void myAnimals() {
        for(var animal : ownedAnimals) {
            System.out.println("Animal: " + animal.type
                    + ", Name: " + animal.animalName + ", Gender: " + animal.animalGender);

        }
    }
    public void myFood() {
        for(var food : ownedFood) {
            System.out.println("Food: " + food.foodName);

        }
    }

    public void decreaseHealth() {
        if(ownedAnimals.size() > 0) {
            for(var animal : ownedAnimals) {
                System.out.println(animal);
                var randomNumber = (int)((Math.random() * (31 - 10)) + 10);
                animal.healthPoints -= randomNumber;
            }

        }
    }
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






