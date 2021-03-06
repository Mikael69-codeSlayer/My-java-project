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
        System.out.println("\n WARNING! Your animals will loose hp (10-30) every round!" +
                "\nDont forget to buy food!");
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
            //  myAnimals();

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
            System.out.println("You have no food! ---");
            g.mainMenu();
        }


    }

    public int howMuchFood() {


        System.out.println("Which animal do you want to feed? [name]:");
        var name = scan.next();

        System.out.println("How many kg?");
        int giveFood = scan.nextInt();

        for (var i = ownedAnimals.size() - 1; i >= 0; i--) {
            //   System.out.println("How many kg?");
            // int giveFood = scan.nextInt();


            for (var food : ownedFood) {

                if (food.amount < giveFood) {
                    System.out.println("try again");
                    howMuchFood();

                } else {

                    int healthIncrease = 10;
                    int hp = giveFood + healthIncrease;


                    if (name.equalsIgnoreCase(ownedAnimals.get(i).animalName)) {

                        ownedAnimals.get(i).healthPoints += hp;

                        System.out.println(ownedAnimals.get(i).type
                                + " "
                                + ownedAnimals.get(i).animalName
                                + ", "
                                + "Health: "
                                + ownedAnimals.get(i).healthPoints);
                    }

                }


         /*   System.out.println("How many kg?");
            int giveFood = scan.nextInt();


            for (var food : ownedFood) {

                if (food.amount < giveFood) {
                    System.out.println("try again");
                    howMuchFood();

                } else {

                    int healthIncrease = 10;
                    int hp = giveFood + healthIncrease; */

                // 1kg food -> +10 hp
                //  for (var animal : ownedAnimals) {


                   /* System.out.println("Which animal do you want to feed? [name]:");
                    var name = scan.next();
                    for (var i = ownedAnimals.size() - 1; i >= 0; i--) {

                        if (name.equalsIgnoreCase(ownedAnimals.get(i).animalName)) {

                            ownedAnimals.get(i).healthPoints += hp;

                            System.out.println(ownedAnimals.get(i).type
                                    + " "
                                    + ownedAnimals.get(i).animalName
                                    + ", "
                                    + "Health: "
                                    + ownedAnimals.get(i).healthPoints);
                        }
                    } */


            }
        }

        return giveFood;
    }


    public void notAlive() {

        //  for(var i = ownedAnimals.size() - 1; i >= 0; i--)
        // if (sell.equalsIgnoreCase(ownedAnimals.get(i).animalName))

        for (var i = ownedAnimals.size() - 1; i >= 0; i--) {
            if (ownedAnimals.get(i).healthPoints <= 0) {
                System.out.println("The "
                        + ownedAnimals.get(i).type
                        + " " + ownedAnimals.get(i).animalName
                        + " died");
                ownedAnimals.remove(i);


            }


        }
    }

    public void mateAnimals() {

        if (ownedAnimals.size() < 2) {
            System.out.println("You need to buy 2 animals [male and female]");


        } else {



            System.out.println("Which animals do you want to mate?" +
                    "\n1. Cats" +
                    "\n2. Rabbits" +
                    "\n3. Horses" +
                    "\n4. Donkeys" +
                    "\n5. Pigs" +

                    "\n\n6. ---> MAIN MENU");


            int mateAnimal = scan.nextInt();


            // FIX
            if (mateAnimal == 1) {
                System.out.println("Let's make some kittens!");

                System.out.println("Choose a male cat [type name]");
                var maleCat = scan.next();

                System.out.println("Choose a female cat [type name]");
                var femaleCat = scan.next();




                for (var i = ownedAnimals.size() - 1; i >= 0; i--) {

                    if (maleCat.equalsIgnoreCase(ownedAnimals.get(i).animalName) ||
                            femaleCat.equalsIgnoreCase(ownedAnimals.get(i).animalName)) {

                            var random = (int) (Math.random() * (2));

                            if (random == 0) {

                                System.out.println("---> no kittens :( <---");
                                g.mainMenu();


                            } else {
                                System.out.println("Nice! You got new kitten!");
                                System.out.println("Name your newborn kitten: ");
                                String catName = scan.next();
                                catName+=scan.nextLine();
                               // System.out.println("Name your newborn kitten: " + catName);




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
                                break;


                            }
                        }

                }



                   g.mainMenu();


                }

                /*else {
                    System.out.println("Wrong name/gender");
                    mateAnimals();
                } */






            if (mateAnimal == 2) {
                System.out.println("Let's make some rabbits!");

                System.out.println("Choose a male rabbit [type name]");
                var maleRabbit = scan.next();

                System.out.println("Choose a female rabbit [type name]");
                var femaleRabbit = scan.next();



                for (var i = ownedAnimals.size() - 1; i >= 0; i--) {

                    if (maleRabbit.equalsIgnoreCase(ownedAnimals.get(i).animalName) ||
                            femaleRabbit.equalsIgnoreCase(ownedAnimals.get(i).animalName)) {


                        var random = (int) (Math.random() * (2));

                        if (random == 0) {
                            System.out.println("---> no rabbits :( <---");
                          //  mateAnimals()

                            g.mainMenu();

                        } else {
                            System.out.println("Nice! You got new rabbit!");
                            System.out.println("Name your newborn rabbit: ");
                            String rabbitName = scan.next();
                            rabbitName+=scan.nextLine();

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

                            System.out.println("Want to mate more animals?[yes/no]");
                            var answer = scan.next();
                            if(answer.equalsIgnoreCase("yes")) {
                                mateAnimals();
                            } else if(answer.equalsIgnoreCase("no")) {
                                g.mainMenu();
                            }

                        }
                        break;

                        }
                    }
                }


            if (mateAnimal == 3) {
                System.out.println("Let's make some horses!");


                System.out.println("Choose a male horse [type name]");
                var maleHorse = scan.next();

                System.out.println("Choose a female horse [type name]");
                var femaleHorse = scan.next();



                for (var i = ownedAnimals.size() - 1; i >= 0; i--) {

                    if (maleHorse.equalsIgnoreCase(ownedAnimals.get(i).animalName) ||
                            femaleHorse.equalsIgnoreCase(ownedAnimals.get(i).animalName)) {

                        var random = (int) (Math.random() * (2));

                        if (random == 0) {
                            System.out.println("---> no horses :( <---");
                            g.mainMenu();

                        } else {
                            System.out.println("Nice! You got new horse!");
                            System.out.println("Name your newborn horse: ");
                            String horseName = scan.next();
                            horseName+=scan.nextLine();

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

                            System.out.println("Want to mate more animals?[yes/no]");
                            var answer = scan.next();
                            if(answer.equalsIgnoreCase("yes")) {
                                mateAnimals();
                            } else if(answer.equalsIgnoreCase("no")) {
                                g.mainMenu();
                            }

                        }
                        break;

                        }
                    }
                }



            if (mateAnimal == 4) {
                System.out.println("Let's make some donkeys!");


                System.out.println("Choose a male donkey [type name]");
                var maleDonkey = scan.next();

                System.out.println("Choose a female donkey [type name]");
                var femaleDonkey = scan.next();



                for (var i = ownedAnimals.size() - 1; i >= 0; i--) {

                    if (maleDonkey.equalsIgnoreCase(ownedAnimals.get(i).animalName) ||
                            femaleDonkey.equalsIgnoreCase(ownedAnimals.get(i).animalName)) {


                        var random = (int) (Math.random() * (2));

                        if (random == 0) {
                            System.out.println("---> no donkeys :( <---");
                            g.mainMenu();

                        } else {
                            System.out.println("Nice! You got new donkeys!");
                            System.out.println("Name your newborn donkeys: ");
                            String donkeyName = scan.next();
                            donkeyName+=scan.nextLine();

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

                            System.out.println("Want to mate more animals?[yes/no]");
                            var answer = scan.next();
                            if(answer.equalsIgnoreCase("yes")) {
                                mateAnimals();
                            } else if(answer.equalsIgnoreCase("no")) {
                                g.mainMenu();
                            }

                        }
                        break;

                        }
                    }
                }


            if (mateAnimal == 5) {


                System.out.println("Let's make some pigs!");


                System.out.println("Choose a male pig [type name]");
                var malePig = scan.next();

                System.out.println("Choose a female pig [type name]");
                var femalePig = scan.next();



                for (var i = ownedAnimals.size() - 1; i >= 0; i--) {

                    if (malePig.equalsIgnoreCase(ownedAnimals.get(i).animalName) ||
                            femalePig.equalsIgnoreCase(ownedAnimals.get(i).animalName)) {


                        var random = (int) (Math.random() * (2));

                        if (random == 0) {
                            System.out.println("---> no pigs :( <---");
                            g.mainMenu();

                        } else {
                            System.out.println("Nice! You got new pig!");
                            System.out.println("Name your newborn pig: ");
                            String pigName = scan.next();
                            pigName+=scan.nextLine();

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

                            System.out.println("Want to mate more animals?[yes/no]");
                            var answer = scan.next();
                            if (answer.equalsIgnoreCase("yes")) {
                                mateAnimals();
                            } else if (answer.equalsIgnoreCase("no")) {
                                g.mainMenu();
                            }

                        }
                        break;
                    }
                }
            }


            if(mateAnimal == 6) {
                System.out.println("--------> BACK TO MAIN MENU");
                g.mainMenu();
            }

        }

    }






    public void sellAnimal() {

       if(ownedAnimals.size() <= 0) {
           System.out.println("You have no animals.");
           g.mainMenu();

       } else {

           myAnimals();
           System.out.println("Which animal do you want to sell?");

           System.out.println("-----------------------------------------");

           System.out.println("Type a name: ");
           var sell = scan.next();

           for(var i = ownedAnimals.size() - 1; i >= 0; i--) {

               System.out.println(ownedAnimals.get(i).animalName);

               if (sell.equalsIgnoreCase(ownedAnimals.get(i).animalName)) {

                   System.out.println("Price for your animal: ");
                   int price = ownedAnimals.get(i).price * ownedAnimals.get(i).healthPoints;
                   System.out.println(price);

                   System.out.println("Are you sure that you want to sell this animal? [yes/no]");
                   var yesNo = scan.next();

                   if(yesNo.equalsIgnoreCase("yes")) {

                       int budget = money + price;

                       System.out.println("You sold "
                               + ownedAnimals.get(i).animalName
                               + " " + ownedAnimals.get(i).type
                               + " and got +"
                               + price);

                       System.out.println("---------------------------------------");
                       System.out.println("Your budget now: " + budget);
                       ownedAnimals.remove(ownedAnimals.get(i));

                       System.out.println("Want to sell more animals?[yes/no]");
                       var answer = scan.next();
                       if(answer.equalsIgnoreCase("yes")) {
                           sellAnimal();
                       } else {
                           g.mainMenu();
                       }
                       break;

                   } else if(yesNo.equalsIgnoreCase("no")) {
                       System.out.println("----> back to MAIN MENU");
                       g.mainMenu();
                   }



               }
           }



       }


    }


   /* public void mateCat(Cat maleCat, Cat femaleCat) {
        if(!femaleCat.getClass().equals(maleCat.getClass())) {
            System.out.println("Please, don't try to mate cat with other animals!");
            mateAnimals();
        } else if(!femaleCat.animalGender.equalsIgnoreCase(maleCat.animalGender)) {
            System.out.println("NICE!!!!");
        }
    }  */

}










