package com.company;

import java.util.*;

public abstract class Animal {


    static String[] animalTypes = {"Cat", "Rabbit", "Horse", "Donkey", "Pig"};
    static int[] animalPrices = {200, 150, 4000, 4000, 1000};

    /*
    static int[] maxAge = {2, 3, 4, 3, 3};

     */



   public String animalName;
   public String animalGender;
   public int price;
   public int healthPoints = 100;
   public String type; // change

   //  public int initialAge;




   public Animal createAnimal (String animalName, String animalGender) {

       var animalClassNumber = Arrays.asList(animalTypes).indexOf(this.getClass().getSimpleName());
       if(!animalGender.equalsIgnoreCase("male") &&
               !animalGender.equalsIgnoreCase("female--")) {
           throw new RuntimeException("Gender must be male or female");
       }
       this.animalName = animalName;
       this.animalGender = animalGender;
       this.price = animalPrices[animalClassNumber];
       this.type = animalTypes[animalClassNumber]; //change

       // this.initialAge = 1;

       return this;
   }


}



