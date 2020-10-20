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
        System.out.println("==========================" +
                " Your animals =========================");
        for (var animal : ownedAnimals) {

            System.out.println("  Animal: " + animal.type
                    + ", Name: " + animal.animalName
                    + ", Gender: " + animal.animalGender
                    + ", Health: " + animal.healthPoints);
            System.out.println("|----------------------------------" +
                    "-----------------------------|");


            // Decreases health
            if (ownedAnimals.size() > 0) {
                var randomNumber = (int) ((Math.random() * (31 - 10)) + 10);
                animal.healthPoints -= randomNumber;
            }
        }
        notAlive();


    }

    public void myFood() {
        System.out.println("===== Your food ======");
        for (var food : ownedFood) {
            System.out.println(" " + food.foodName + " " + food.amount + "kg");
            System.out.println("|--------------------|");

        }
    }

    public void giveFood() {

        if (ownedFood.size() > 0) {
            myAnimals();

            System.out.println("Choose animal you want to feed (enter type) :  ");


            String feed = scan.next();


            if (feed.equalsIgnoreCase("Cat")) {
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


            } else if (feed.equalsIgnoreCase("Rabbit")) {
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
            } else if (feed.equalsIgnoreCase("Horse")) {
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
            } else if (feed.equalsIgnoreCase("Donkey")) {
                System.out.println("Your Donkey can eat: \"Pear\", \"Apples\", \"SugarBeet\"");
                System.out.println("You have:");
                myFood();

                System.out.println("Choose food:");
                int feed2 = scan.nextInt();

                String[] foodTypes = {"Pear", "Apples", "SugarBeet"};
                var chosenFood = foodTypes[feed2 - 1];

                var howMuch = howMuchFood();
                for (var food : ownedFood) {
                    if (food.foodName.equals(chosenFood)) {
                        food.amount -= howMuch;
                        System.out.println("Food left: " + food.amount + "kg");

                    }
                }
            }


        } else {
            System.out.println("You have no food!");
            g.mainMenu();
        }


    }

    public int howMuchFood() {

        System.out.println("How many kg?");
        int giveFood = scan.nextInt();

        for (var food : ownedFood) {

            if (food.amount < giveFood) {
                System.out.println("try again");
                howMuchFood();

            } else {

                int healthIncrease = 10;
                int hp = giveFood + healthIncrease;

                // 1kg food -> +10 hp
                for (var animal : ownedAnimals) {

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


    }


    public void notAlive() {
        for (var animal : ownedAnimals) {
            if (animal.healthPoints <= 0) {
                ownedAnimals.remove(animal);
                System.out.println("The " + animal.type + " " + animal.animalName + " died");


            }
            // tried g.mainMenu(); Didn't work :( .....

        }
    }

    public void mateAnimals() {

        if (ownedAnimals.size() < 2) {
            System.out.println("You need to buy 2 animals [male and female]");
        } else {

            myAnimals();
            System.out.println("------------------_______________________---------------------");
            System.out.println("Which animals do you want to mate?" +
                    "\n1. Cats" +
                    "\n2. Rabbits" +
                    "\n3. Horses" +
                    "\n4. Donkeys" +
                    "\n5. Pigs" +

                    "\n\n6. ---> MAIN MENU");

            int mateAnimal = scan.nextInt();
            if (mateAnimal == 1) {
                System.out.println("Let's make some kittens!");


                System.out.println("Choose a male cat [type name]");
                var maleCat = scan.next();

                System.out.println("Choose a female cat [type name]");
                var femaleCat = scan.next();

                for (var animal : ownedAnimals) {

                    if (maleCat.equalsIgnoreCase(animal.animalName) ||
                            femaleCat.equalsIgnoreCase(animal.animalName)) {


                        var random = (int) (Math.random() * (2));

                        if (random == 0) {
                            System.out.println("---> no kittens :( <---");
                            mateAnimals();

                        } else {
                            System.out.println("Nice! You got new kitten!");

                            System.out.println("\nName your newborn kitten: ");
                            var catName = scan.next();

                            var catGender = (int) (Math.random() * (2));
                            if (catGender == 0) {
                                var catSex = "male";
                                var cat = new Cat().createAnimal(catName, catSex);
                                ownedAnimals.add(cat);

                            } else {
                                var catSex = "female";
                                var cat = new Cat().createAnimal(catName, catSex);
                                ownedAnimals.add(cat);
                            }

                            myAnimals();

                        }

                    } else {
                        System.out.println("Wrong name/gender");
                        mateAnimals();
                    }

                }

            }

            if (mateAnimal == 2) {
                System.out.println("Let's make some rabbits!");


                System.out.println("Choose a male rabbit [type name]");
                var maleRabbit = scan.next();

                System.out.println("Choose a female rabbit [type name]");
                var femaleRabbit = scan.next();

                for (var animal : ownedAnimals) {

                    if (maleRabbit.equalsIgnoreCase(animal.animalName) ||
                            femaleRabbit.equalsIgnoreCase(animal.animalName)) {


                        var random = (int) (Math.random() * (2));

                        if (random == 0) {
                            System.out.println("---> no rabbits :( <---");
                            mateAnimals();

                        } else {
                            System.out.println("Nice! You got new rabbit!");

                            System.out.println("\nName your newborn rabbit: ");
                            var rabbitName = scan.next();

                            var rabbitGender = (int) (Math.random() * (2));
                            if (rabbitGender == 0) {
                                var rabbitSex = "male";
                                var rabbit = new Rabbit().createAnimal(rabbitName, rabbitSex);
                                ownedAnimals.add(rabbit);

                            } else {
                                var rabbitSex = "female";
                                var rabbit = new Cat().createAnimal(rabbitName, rabbitSex);
                                ownedAnimals.add(rabbit);
                            }

                            myAnimals();

                        }
                    }
                }
            }

            if (mateAnimal == 3) {
                System.out.println("Let's make some horses!");


                System.out.println("Choose a male horse [type name]");
                var maleHorse = scan.next();

                System.out.println("Choose a female cat [type name]");
                var femaleHorse = scan.next();

                for (var animal : ownedAnimals) {

                    if (maleHorse.equalsIgnoreCase(animal.animalName) ||
                            femaleHorse.equalsIgnoreCase(animal.animalName)) {


                        var random = (int) (Math.random() * (2));

                        if (random == 0) {
                            System.out.println("---> no horses :( <---");
                            mateAnimals();

                        } else {
                            System.out.println("Nice! You got new horse!");

                            System.out.println("\nName your newborn horse: ");
                            var horseName = scan.next();

                            var horseGender = (int) (Math.random() * (2));
                            if (horseGender == 0) {
                                var horseSex = "male";
                                var horse = new Horse().createAnimal(horseName, horseSex);
                                ownedAnimals.add(horse);

                            } else {
                                var horseSex = "female";
                                var horse = new Horse().createAnimal(horseName, horseSex);
                                ownedAnimals.add(horse);
                            }

                            myAnimals();

                        }
                    }
                }
            }


            if (mateAnimal == 4) {
                System.out.println("Let's make some donkeys!");


                System.out.println("Choose a male donkey [type name]");
                var maleDonkey = scan.next();

                System.out.println("Choose a female donkey [type name]");
                var femaleDonkey = scan.next();

                for (var animal : ownedAnimals) {

                    if (maleDonkey.equalsIgnoreCase(animal.animalName) ||
                            femaleDonkey.equalsIgnoreCase(animal.animalName)) {


                        var random = (int) (Math.random() * (2));

                        if (random == 0) {
                            System.out.println("---> no donkeys :( <---");
                            mateAnimals();

                        } else {
                            System.out.println("Nice! You got new doneky!");

                            System.out.println("\nName your newborn donkey: ");
                            var donkeyName = scan.next();

                            var donkeyGender = (int) (Math.random() * (2));
                            if (donkeyGender == 0) {
                                var donkeySex = "male";
                                var donkey = new Donkey().createAnimal(donkeyName, donkeySex);
                                ownedAnimals.add(donkey);

                            } else {
                                var donkeySex = "female";
                                var donkey = new Donkey().createAnimal(donkeyName, donkeySex);
                                ownedAnimals.add(donkey);
                            }

                            myAnimals();

                        }
                    }
                }
            }

            if(mateAnimal == 5)
            System.out.println("Let's make some pigs!");


            System.out.println("Choose a male pig [type name]");
            var malePig = scan.next();

            System.out.println("Choose a female pig [type name]");
            var femalePig = scan.next();

            for (var animal : ownedAnimals) {

                if (malePig.equalsIgnoreCase(animal.animalName) ||
                        femalePig.equalsIgnoreCase(animal.animalName)) {


                    var random = (int) (Math.random() * (2));

                    if (random == 0) {
                        System.out.println("---> no pigs :( <---");
                        mateAnimals();

                    } else {
                        System.out.println("Nice! You got new pig!");

                        System.out.println("\nName your newborn pig: ");
                        var pigName = scan.next();

                        var pigGender = (int) (Math.random() * (2));
                        if (pigGender == 0) {
                            var pigSex = "male";
                            var pig = new Pig().createAnimal(pigName, pigSex);
                            ownedAnimals.add(pig);

                        } else {
                            var pigSex = "female";
                            var pig = new Pig().createAnimal(pigName, pigSex);
                            ownedAnimals.add(pig);
                        }

                        myAnimals();

                    }
                }
            }
        }

    }






    public void sellAnimal() {

       if(ownedAnimals.size() <= 0) {
           System.out.println("You have no animals.");
           g.mainMenu();

       } else {

           myAnimals();
           System.out.println("Which animal you want to sell?");

           System.out.println("-----------------------------------------");

           System.out.println("Type a name: ");
           var sell = scan.next();

           for(var animal : ownedAnimals) {
               if (sell.equalsIgnoreCase(animal.animalName)) {

                   System.out.println("Price for your animal: ");
                   int price = animal.price * animal.healthPoints;
                   System.out.println(price);

                   System.out.println("Are you sure that you want to sell this animal?");
                   var yesNo = scan.next();

                   if(yesNo.equalsIgnoreCase("yes")) {
                       ownedAnimals.remove(animal);

                       int budget = money + price;

                       System.out.println("You sold " + animal.animalName + " " + animal.type
                       + " and got +" + price);

                       System.out.println("---------------------------------------");
                       System.out.println("Your budget now: " + budget);


                   } else if(yesNo.equalsIgnoreCase("no")) {
                       System.out.println("----> back to MAIN MENU");
                       g.mainMenu();
                   }



               }
           }



       }



    }



}






           // (ownedAnimals.size() <= 0) {
             //   System.out.println("You need to buy animals [2]");








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









