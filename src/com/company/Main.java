package com.company;

public class Main {

    public static void main(String[] args) {

        var a = new Horse().createAnimal("Brunte", "male");
        System.out.println(a.getClass().getSimpleName() + " "  + a.animalName + " " + a.animalGender + " " + a.price + " " + a.healthPoints);

        var b = new Pig().createAnimal("Mrs Piggy", "female");
        System.out.println(b.getClass().getSimpleName() + " "  + b.animalName + " " + b.animalGender + " " + b.price + " " + b.healthPoints);



        //Game g = new Game();
        //g.gameStart();

    }
}
