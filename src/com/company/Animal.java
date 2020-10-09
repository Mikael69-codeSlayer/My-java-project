package com.company;

import java.util.*;

public abstract class Animal {

    static String[] animalTypes = {"Cat", "Rabbit", "Horse", "Donkey", "Pig"};
    static int[] animalPrices = {200, 150, 9500, 9000, 1000};

    /* static String[] food = {"CatFood, Fish, Bananas, Berries", "Carrot, Cucumber, Zucchini",
                  "Melons, Pumpkin, Grass", "Carrots, Apples, SugarBeet",
                   "Corn, Soybeans"}; */

   public String animalName;
   public String animalGender;
   public int price;
   public int healthPoints = 100;


   public Animal createAnimal (String animalName, String animalGender) {

       var animalClassNumber = Arrays.asList(animalTypes).indexOf(this.getClass().getSimpleName());
       if(!animalGender.equalsIgnoreCase("male") &&
               !animalGender.equalsIgnoreCase("female")) {
           throw new RuntimeException("Gender must be male or female");
       }
       this.animalName = animalName;
       this.animalGender = animalGender;
       this.price = animalPrices[animalClassNumber];
       return this;
   }
}



