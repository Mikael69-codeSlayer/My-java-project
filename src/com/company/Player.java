package com.company;

import java.util.*;

public class Player {


    public String name;
    public int money = 10000;
    // Own Animals
     public ArrayList<Animal> ownedAnimals = new ArrayList<>();



    public Player(String name) {
        this.name = name;
    }

    public Player() {
        // Empty, because I want to call Player class
        // in other classes
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






