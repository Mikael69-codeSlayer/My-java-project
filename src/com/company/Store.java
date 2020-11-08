package com.company;

import java.util.*;

public class Store {

    static Scanner scan = new Scanner(System.in);

    Game g = new Game();

    public void sellAnimals(Player player) {

        System.out.println("Which animal do you want to buy?");
        animalList();
        playerBuyAnimal(player);

    }

    public void animalList() {

        System.out.println("1. Cat.  Price 200kr" +
                "\n2. Rabbit.  Price 150kr" +
                "\n3. Horse.  Price 4000kr" +
                "\n4. Donkey.  Price 4000" +
                "\n5. Pig.  Price 1000kr" +

                "\n\n6. Exit --> Main Menu");
    }

    public void playerBuyAnimal(Player player) {
        int playerChoice = scan.nextInt();

        if (playerChoice == 1) {

            System.out.println("If you don't have enough money, you'll " +
                    "have to return the animal.");

            var name = askName("Cat");
            var cat = new Cat().createAnimal(name, askGender(name));

            if(player.money < cat.price) {
                System.out.println("You don't have enough money to afford this animal!" +
                        "\nReturning back to Store...");
                animalList();
            }

            else {

                // Subtract the cat.price from player.money
                player.money -= cat.price;

                System.out.println("\nBudget: " + player.money);
                System.out.println("===============");

                // System.out.println(player.money);
                // adds animals to ArrayList
                player.ownedAnimals.add(cat);

              /*  System.out.println(player.name + " purchased: " + "Cat " +
                        player.ownedAnimals.get(0).animalName +
                        ", Health: " + cat.healthPoints); */

                for(var animal : player.ownedAnimals) {
                    System.out.println(player.name + " bought "
                            + animal.type + " "
                            + animal.animalName + ", gender: "
                            + animal.animalGender + ", Health: "
                            + animal.healthPoints);
                    System.out.println("-----------------------------------------------------------");
                }


                buyMoreAnimals(player);

            }
        }

        if (playerChoice == 2) {

            System.out.println("If you don't have enough money, you'll " +
                    "have to return the animal.");

            var name = askName("Rabbit");
            var rabbit = new Rabbit().createAnimal(name, askGender(name));

            if(player.money < rabbit.price) {
                System.out.println("You don't have enough money to afford this animal!" +
                        "\nReturning back to Store...");
                animalList();
            }

            else {
                player.money -= rabbit.price;

                System.out.println("\nBudget: " + player.money);
                System.out.println("===============");
               //
                // System.out.println(player.money);
                // adds animals to ArrayList
                player.ownedAnimals.add(rabbit);


              /*  System.out.println(player.name + " purchased: " + "Rabbit " +
                        player.ownedAnimals.get(0).animalName +
                        ", Health: " + rabbit.healthPoints); */

                for(var animal : player.ownedAnimals) {
                    System.out.println(player.name + " bought "
                            + animal.type + " "
                            + animal.animalName + ", gender: "
                            + animal.animalGender + ", Health: "
                            + animal.healthPoints);
                    System.out.println("--------------------------------------------------------------");
                }


                buyMoreAnimals(player);
            }

        }
        if (playerChoice == 3) {

            System.out.println("If you don't have enough money, you'll " +
                    "have to return the animal.");

            var name = askName("Horse");
            var horse = new Horse().createAnimal(name, askGender(name));

            if(player.money < horse.price) {
                System.out.println("You don't have enough money to afford this animal!" +
                        "\nReturning back to Store...");
                animalList();
            }

            else {
                player.money -= horse.price;

                System.out.println("\nBudget: " + player.money);
                System.out.println("===============");

                //System.out.println(player.money);
                // adds animals to ArrayList
                player.ownedAnimals.add(horse);

               /* System.out.println(player.name + " purchased: " + "Horse " +
                        player.ownedAnimals.get(0).animalName +
                        ", Health: " + horse.healthPoints); */

                for(var animal : player.ownedAnimals) {
                    System.out.println(player.name + " bought "
                            + animal.type + " "
                            + animal.animalName + ", gender: "
                            + animal.animalGender + ", Health: "
                            + animal.healthPoints);
                    System.out.println("--------------------------------------------------------------");
                }


                buyMoreAnimals(player);
            }

        }
        if (playerChoice == 4) {

            System.out.println("If you don't have enough money, you'll " +
                    "have to return the animal.");

            var name = askName("Donkey");
            var donkey = new Donkey().createAnimal(name, askGender(name));

            if(player.money < donkey.price) {
                System.out.println("You don't have enough money to afford this animal!" +
                        "\nReturning back to Store...");
                animalList();
            }

            else {
                player.money -= donkey.price;

                System.out.println("Budget: " + player.money);
                System.out.println("===============");

                //System.out.println(player.money);
                // adds animals to ArrayList
                player.ownedAnimals.add(donkey);


              /*  System.out.println(player.name + " purchased: " + "Donkey " +
                        player.ownedAnimals.get(0).animalName +
                        ", Health: " + donkey.healthPoints); */

                for(var animal : player.ownedAnimals) {
                    System.out.println(player.name + " bought "
                            + animal.type + " "
                            + animal.animalName + ", gender: "
                            + animal.animalGender + ", Health: "
                            + animal.healthPoints);
                    System.out.println("--------------------------------------------------------------");
                }


                buyMoreAnimals(player);
            }

        }

        if (playerChoice == 5) {

            System.out.println("If you don't have enough money, you'll " +
                    "have to return the animal.");

            var name = askName("Pig");
            var pig = new Pig().createAnimal(name, askGender(name));

            if (player.money < pig.price) {
                System.out.println("You don't have enough money to afford this animal!" +
                        "\nReturning back to Store...");
                animalList();
            } else {
                player.money -= pig.price;

                System.out.println("Budget: " + player.money);
                System.out.println("===============");
                // adds animals to ArrayList
                player.ownedAnimals.add(pig);


                /*   System.out.println(player.name + " purchased: " + "Pig " +
                        player.ownedAnimals.get(0).animalName +
                        ", Health: " + pig.healthPoints); */

                for(var animal : player.ownedAnimals) {
                    System.out.println(player.name + " bought "
                            + animal.type + " "
                            + animal.animalName + ", gender: "
                            + animal.animalGender + ", Health: "
                            + animal.healthPoints);
                    System.out.println("--------------------------------------------------------------");
                }

                buyMoreAnimals(player);
            }
        }
        if (playerChoice == 6) {
            g.mainMenu();
        }


    }

    // Buy more animals
    public void buyMoreAnimals(Player player) {
        System.out.println("Wish to buy more animals? [yes/no]");
        String playerChoiceStr = scan.next();
        if (playerChoiceStr.equalsIgnoreCase("yes")) {
            sellAnimals(player);
        } else {
            g.mainMenu(); // player
        }
    }

    // Buy more food
    public void buyMoreFood(Player player) {
        System.out.println("Wish to buy more food? [yes/no]");
        String playerChoiceStr = scan.next();
        if (playerChoiceStr.equalsIgnoreCase("yes")) {
            foodList(player);
        } else {
            g.mainMenu(); // player

        }
    }

    // How do we know which player is bying the animal?
    // We need to add the knewly created animal to that players list of animals!


    public static String askName(String animalType) {

        System.out.println("Name your " + animalType + ": ");

        return scan.next();

        // deleted static ------!!!
    }

    public static String askGender(String name) {
        System.out.println("What gender is " + name + " (male/female): ");

        return scan.next();

        // deleted static -----!!!

    }

    public void askFood(String foodType) {
        System.out.println("How many " + foodType + " " +
                "you want to buy? (kg):");

    }


    // Food List
    public void foodList(Player player) {

        System.out.println("Hi! What do you want to buy?");

        System.out.println("========== CAT FOOD ==========");
        System.out.println("1. Cat noodles. Price: 50kr/kg" +
                "\n2. Fish. Price: 100kr/kg" +
                "\n3. Bananas. Price: 20kr/kg" +
                "\n4. Berries. Price: 150kr/kg");

        System.out.println("\n======== RABBIT FOOD ========");
        System.out.println("5. Carrot. Price: 20kr/kg" +
                "\n6. Cucumber. Price: 20kr/kg" +
                "\n7. Zucchini. Price: 45kr/kg");

        System.out.println("\n======== HORSE FOOD ========");
        System.out.println("8. Melons. Price: 35kr/kg " +
                "\n9. Pumpkin. Price: 40kr/kg" +
                "\n10. Grass. Price: 20kr/kg");

        System.out.println("\n======== DONKEY FOOD ========");
        System.out.println("11. Pears. Price: 20kr/kg" +
                "\n12. Apples. Price: 35kr/kg" +
                "\n13. SugarBeet. Price: 10kr/kg");

        System.out.println("\n======== PIG FOOD ========");
        System.out.println("14. Corn. Price: 15kr/kg" +
                "\n15. Soybeans. Price: 20kr/kg");

        System.out.println("\n16. EXIT --> Main menu");

        playerBuyFood(player);

    }

    public void playerBuyFood(Player player) {
        int playerChoise2 = scan.nextInt();

        if (playerChoise2 == 1) {

            askFood("Cat Noodles");
            int nood = scan.nextInt();
            var catNood = new CatNoodles().createFood("Cat Noodles", nood);
            int price = nood * catNood.aFoodPrice;

        /*    for(Food food : player.ownedFood) {
                if(food.getClass().getSimpleName().equals("CatNoodles")) {
                    food.amount += 1;   // AMOUNT
                }
            } */

            if(player.money < price) {
                System.out.println("Not enough money!" +
                        "\nReturning back to Store.....");
                foodList(player);
            } else {
                player.money -= price;
                System.out.println("Price: " + price);
                System.out.println("Budget: ");
                System.out.println(player.money);

                var foundInList = false;
                for(var food : player.ownedFood){
                    if(food.foodName.equals("Cat Noodles")){
                        // There are already  cat noodles in the list of food
                        // so just add to the amount
                        food.amount += catNood.amount;
                        foundInList = true;

                        // delete later

                    }
                }
                if(!foundInList) {

                    // There was no cat noodles in the list
                    // and cat noodles
                    player.ownedFood.add(catNood);
                }


               /* for(var x : player.ownedFood) {
                    System.out.println(player.name + " bought " + x.foodName + " " + nood + "kg");
                    buyMoreFood(player);
                } */

              //  System.out.println(player.name + " bought " + nood + "kg " + player.ownedFood.get(0).foodName);

                for(var food : player.ownedFood) {
                    System.out.println(food.foodName + " " + food.amount + "kg");
                    //+ " " + food.amount + "kg");

                }
                    buyMoreFood(player);




            }


        }

        if (playerChoise2 == 2) {

            askFood("Fish");
            int fishFish = scan.nextInt();
            var fish = new Fish().createFood("Fish", fishFish);
            int price = fishFish * fish.aFoodPrice;

            if(player.money < price) {
                System.out.println("Not enough money!" +
                        "\nReturning back to Store.....");
                foodList(player);

            } else {

                player.money -= price;
                System.out.println("Price: " + price);
                System.out.println("Budget: ");
                System.out.println(player.money);

                var foundInList = false;
                for(var food : player.ownedFood) {
                    if(food.foodName.equals("Fish")) {
                        food.amount += fish.amount;
                        foundInList = true;
                    }
                } if(!foundInList) {
                    player.ownedFood.add(fish);
                }

               /* for(var x : player.ownedFood) {
                    System.out.println(player.name + " bought " + x.foodName + " " + fishFish + "kg");

                } */

                for(var food : player.ownedFood) {
                    System.out.println(food.foodName + " " + food.amount + "kg");
                            //+ " " + food.amount + "kg");

                }
                buyMoreFood(player);




               /* System.out.println(player.name + " bought " + fishFish + "kg " + player.ownedFood.get(0).foodName);
                buyMoreFood(player); */
            }

        }

        if (playerChoise2 == 3) {

            askFood("Bananas");
            int banana = scan.nextInt();
            var bananas = new Bananas().createFood("Bananas", banana);
            int price = banana * bananas.aFoodPrice;

            if(player.money < price) {

                System.out.println("Not enough money!" +
                        "\nReturning back to Store.....");
                foodList(player);

            } else {

                player.money -= price;
                System.out.println("Price: " + price);
                System.out.println("Budget: ");
                System.out.println(player.money);

                var foundInList = false;
                for(var food : player.ownedFood) {
                    if(food.foodName.equals("Bananas")) {
                        food.amount += bananas.amount;
                        foundInList = true;
                    }
                } if(!foundInList) {
                    player.ownedFood.add(bananas);
                }


              //  System.out.println(player.name + " bought " + banana + "kg " + player.ownedFood.get(0).foodName);
               // buyMoreFood(player);

                for(var food : player.ownedFood) {
                    System.out.println(food.foodName + " " + food.amount + "kg");

                }
                buyMoreFood(player);

            }

        }

        if (playerChoise2 == 4) {

            askFood("Berries");
            int berry = scan.nextInt();
            var berries = new Berries().createFood("Berries", berry);
            int price = berry * berries.aFoodPrice;

            if(player.money < price) {
                System.out.println("Not enough money!" +
                        "\nReturning back to Store.....");
                foodList(player);

            } else {

                player.money -= price;
                System.out.println("Price: " + price);
                System.out.println("Budget: ");
                System.out.println(player.money);

                var foundInList = false;
                for(var food : player.ownedFood) {
                    if(food.foodName.equals("Berries")) {
                        food.amount += berries.amount;
                        foundInList = true;
                    }
                } if(!foundInList) {
                    player.ownedFood.add(berries);
                }


               // System.out.println(player.name + " bought " + berry + "kg " + player.ownedFood.get(0).foodName);
               // buyMoreFood(player);

                for(var food : player.ownedFood) {
                    System.out.println(food.foodName + " " + food.amount + "kg");

                }
                buyMoreFood(player);

            }

        }

        if (playerChoise2 == 5) {

            askFood("Carrot");
            int carrot = scan.nextInt();
            var carrots = new Carrot().createFood("Carrot", carrot);
            int price = carrot * carrots.aFoodPrice;

            if(player.money < price) {
                System.out.println("Not enough money!" +
                        "\nReturning back to Store.....");
                foodList(player);

            } else {
                player.money -= price;
                System.out.println("Price: " + price);
                System.out.println("Budget: ");
                System.out.println(player.money);

                var foundInList = false;
                for(var food : player.ownedFood) {
                    if(food.foodName.equals("Carrot")) {
                        food.amount += carrots.amount;
                        foundInList = true;
                    }
                } if(!foundInList) {
                    player.ownedFood.add(carrots);
                }


               // System.out.println(player.name + " bought " + carrot + "kg " + player.ownedFood.get(0).foodName);
               // buyMoreFood(player);


                for(var food : player.ownedFood) {
                    System.out.println(food.foodName + " " + food.amount + "kg");

                }
                buyMoreFood(player);
            }

        }

        if (playerChoise2 == 6) {

            askFood("Cucumber");
            int cucumber = scan.nextInt();
            var cucumbers = new Cucumber().createFood("Cucumber", cucumber);
            int price = cucumber * cucumbers.aFoodPrice;

            if(player.money < price) {
                System.out.println("Not enough money!" +
                        "\nReturning back to Store.....");
                foodList(player);

            } else {

                player.money -= price;
                System.out.println("Price: " + price);
                System.out.println("Budget: ");
                System.out.println(player.money);

                var foundInList = false;
                for(var food : player.ownedFood) {
                    if(food.foodName.equals("Cucumber")) {
                        food.amount += cucumbers.amount;
                        foundInList = true;
                    }
                } if(!foundInList) {
                    player.ownedFood.add(cucumbers);
                }

               // System.out.println(player.name + " bought " + cucumber + "kg " + player.ownedFood.get(0).foodName);
               // buyMoreFood(player);

                for(var food : player.ownedFood) {
                    System.out.println(food.foodName + " " + food.amount + "kg");

                }
                buyMoreFood(player);
            }

        }

        if (playerChoise2 == 7) {

            askFood("Zucchini");
            int zucchini = scan.nextInt();
            var zucchinis = new Zucchini().createFood("Zucchini", zucchini);
            int price = zucchini * zucchinis.aFoodPrice;

            if(player.money < price) {
                System.out.println("Not enough money!" +
                        "\nReturning back to Store.....");
                foodList(player);
            } else {
                player.money -= price;
                System.out.println("Price: " + price);
                System.out.println("Budget: ");
                System.out.println(player.money);

                var foundInList = false;
                for(var food : player.ownedFood) {
                    if(food.foodName.equals("Zucchini")) {
                        food.amount += zucchinis.amount;
                        foundInList = true;
                    }
                } if(!foundInList) {
                    player.ownedFood.add(zucchinis);
                }

              //  System.out.println(player.name + " bought " + zucchini + "kg " + player.ownedFood.get(0).foodName);
             //   buyMoreFood(player);

                for(var food : player.ownedFood) {
                    System.out.println(food.foodName + " " + food.amount + "kg");

                }
                buyMoreFood(player);
            }

        }

        if (playerChoise2 == 8) {

            askFood("Melons");
            int melon = scan.nextInt();
            var melons = new Melons().createFood("Melons", melon);
            int price = melon * melons.aFoodPrice;

            if(player.money < price) {
                System.out.println("Not enough money!" +
                        "\nReturning back to Store.....");
                foodList(player);
            } else {
                player.money -= price;

                System.out.println("Price: " + price);
                System.out.println("Budget: ");
                System.out.println(player.money);

                var foundInList = false;
                for(var food : player.ownedFood) {
                    if(food.foodName.equals("Melons")) {
                        food.amount += melons.amount;
                        foundInList = true;
                    }
                } if(!foundInList) {
                    player.ownedFood.add(melons);
                }

               // System.out.println(player.name + " bought " + melon + "kg " + player.ownedFood.get(0).foodName);
               // buyMoreFood(player);

                for(var food : player.ownedFood) {
                    System.out.println(food.foodName + " " + food.amount + "kg");

                }
                buyMoreFood(player);
            }

        }

        if (playerChoise2 == 9) {

            askFood("Pumpkin");
            int pumpkin = scan.nextInt();
            var pumpkins = new Pumpkin().createFood("Pumpkin", pumpkin);
            int price = pumpkin * pumpkins.aFoodPrice;

            if(player.money < price) {
                System.out.println("Not enough money!" +
                        "\nReturning back to Store.....");
                foodList(player);
            } else {

                player.money -= price;
                System.out.println("Price: " + price);
                System.out.println("Budget: ");
                System.out.println(player.money);

                var foundInList = false;
                for(var food : player.ownedFood) {
                    if(food.foodName.equals("Pumpkin")) {
                        food.amount += pumpkins.amount;
                        foundInList = true;
                    }
                } if(!foundInList) {
                    player.ownedFood.add(pumpkins);
                }

           //     System.out.println(player.name + " bought " + pumpkin + "kg " + player.ownedFood.get(0).foodName);
             //   buyMoreFood(player);


                for(var food : player.ownedFood) {
                    System.out.println(food.foodName + " " + food.amount + "kg");

                }
                buyMoreFood(player);

            }

        }

        if (playerChoise2 == 10) {

            askFood("Grass");
            int grass = scan.nextInt();
            var grasses = new Grass().createFood("Grass", grass);
            int price = grass * grasses.aFoodPrice;

            if(player.money < price) {
                System.out.println("Not enough money!" +
                        "\nReturning back to Store.....");
                foodList(player);
            } else {

                player.money -= price;
                System.out.println("Price: " + price);
                System.out.println("Budget: ");
                System.out.println(player.money);

                var foundInList = false;
                for(var food : player.ownedFood) {
                    if(food.foodName.equals("Grass")) {
                        food.amount += grasses.amount;
                        foundInList = true;
                    }
                } if(!foundInList) {
                    player.ownedFood.add(grasses);
                }

               // System.out.println(player.name + " bought " + grass + "kg " + player.ownedFood.get(0).foodName);
               // buyMoreFood(player);

                for(var food : player.ownedFood) {
                    System.out.println(food.foodName + " " + food.amount + "kg");

                }
                buyMoreFood(player);
            }

        }

        if (playerChoise2 == 11) {

            askFood("Pear");
            int pear = scan.nextInt();
            var pears = new Pear().createFood("Pears", pear);
            int price = pear * pears.aFoodPrice;

            if(player.money < price) {
                System.out.println("Not enough money!" +
                        "\nReturning back to Store.....");
                foodList(player);
            } else {

                player.money -= price;
                System.out.println("Price: " + price);
                System.out.println("Budget: ");
                System.out.println(player.money);

                var foundInList = false;
                for(var food : player.ownedFood) {
                    if(food.foodName.equals("Pears")) {
                        food.amount += pears.amount;
                        foundInList = true;
                    }
                } if(!foundInList) {
                    player.ownedFood.add(pears);
                }


              //  System.out.println(player.name + " bought " + pear + "kg " + player.ownedFood.get(0).foodName);
               // buyMoreFood(player);

                for(var food : player.ownedFood) {
                    System.out.println(food.foodName + " " + food.amount + "kg");

                }
                buyMoreFood(player);

            }

        }

        if (playerChoise2 == 12) {

            askFood("Apples");
            int apple = scan.nextInt();
            var apples = new Apples().createFood("Apples", apple);
            int price = apple * apples.aFoodPrice;

            if(player.money < price) {
                System.out.println("Not enough money!" +
                        "\nReturning back to Store.....");
                foodList(player);
            } else {

                player.money -= price;

                System.out.println("Price: " + price);
                System.out.println("Budget: ");
                System.out.println(player.money);

                var foundInList = false;
                for(var food : player.ownedFood) {
                    if(food.foodName.equals("Apples")) {
                        food.amount += apples.amount;
                        foundInList = true;
                    }
                } if(!foundInList) {
                    player.ownedFood.add(apples);
                }

              //  System.out.println(player.name + " bought " + apple + "kg " + player.ownedFood.get(0).foodName);
              //  buyMoreFood(player);

                for(var food : player.ownedFood) {
                    System.out.println(food.foodName + " " + food.amount + "kg");

                }
                buyMoreFood(player);
            }

        }

        if (playerChoise2 == 13) {

            askFood("SugarBeet");
            int sugarBeet = scan.nextInt();
            var sugarBeets = new SugarBeet().createFood("SugarBeet", sugarBeet);
            int price = sugarBeet * sugarBeets.aFoodPrice;

            if(player.money < price) {
                System.out.println("Not enough money!" +
                        "\nReturning back to Store.....");
                foodList(player);
            } else {

                player.money -= price;
                System.out.println("Price: " + price);
                System.out.println("Budget: ");
                System.out.println(player.money);

                var foundInList = false;
                for(var food : player.ownedFood) {
                    if(food.foodName.equals("SugarBeet")) {
                        food.amount += sugarBeets.amount;
                        foundInList = true;
                    }
                } if(!foundInList) {
                    player.ownedFood.add(sugarBeets);
                }

             //   System.out.println(player.name + " bought " + sugarBeet + "kg " + player.ownedFood.get(0).foodName);
             //   buyMoreFood(player);

                for(var food : player.ownedFood) {
                    System.out.println(food.foodName + " " + food.amount + "kg");

                }
                buyMoreFood(player);
            }

        }

        if (playerChoise2 == 14) {

            askFood("Corn");
            int corn = scan.nextInt();
            var corns = new Corn().createFood("Corn", corn);
            int price = corn * corns.aFoodPrice;

            if(player.money < price) {
                System.out.println("Not enough money!" +
                        "\nReturning back to Store.....");
                foodList(player);
            } else {

                player.money -= price;
                System.out.println("Price: " + price);
                System.out.println("Budget: ");
                System.out.println(player.money);

                var foundInList = false;
                for(var food : player.ownedFood) {
                    if(food.foodName.equals("Corn")) {
                        food.amount += corns.amount;
                        foundInList = true;
                    }
                } if(!foundInList) {
                    player.ownedFood.add(corns);
                }

               // System.out.println(player.name + " bought " + corn + "kg " + player.ownedFood.get(0).foodName);
               // buyMoreFood(player);

                for(var food : player.ownedFood) {
                    System.out.println(food.foodName + " " + food.amount + "kg");

                }
                buyMoreFood(player);
            }

        }

        if (playerChoise2 == 15) {

            askFood("Soybeans");
            int soybean = scan.nextInt();
            var soybeans = new Soybeans().createFood("Soybeans", soybean);
            int price = soybean * soybeans.aFoodPrice;

            if(player.money < price) {
                System.out.println("Not enough money!" +
                        "\nReturning back to Store.....");
                foodList(player);
            } else {
                player.money -= price;
                System.out.println("Price: " + price);
                System.out.println("Budget: ");
                System.out.println(player.money);

                var foundInList = false;
                for(var food : player.ownedFood) {
                    if(food.foodName.equals("Soybeans")) {
                        food.amount += soybeans.amount;
                        foundInList = true;
                    }
                } if(!foundInList) {
                    player.ownedFood.add(soybeans);
                }

             //   System.out.println(player.name + " bought " + soybean + "kg " + player.ownedFood.get(0).foodName);
             //   buyMoreFood(player);

                for(var food : player.ownedFood) {
                    System.out.println(food.foodName + " " + food.amount + "kg");

                }
                buyMoreFood(player);
            }

        }

        if(playerChoise2 == 16) {
            System.out.println("Returning to MAIN MENU....");
            g.mainMenu(); // player
        }



    }


    }




