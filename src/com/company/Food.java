package com.company;

import java.util.Arrays;

public abstract class Food {

    static String[] foodTypes = {"CatNoodles", "Fish", "Bananas", "Berries", "Carrot", "Cucumber", "Zucchini",
            "Melons", "Pumpkin", "Grass", "Pear", "Apples", "SugarBeet",
            "Corn", "Soybeans"};
    static int[] foodPrices = {50, 100, 20, 150, 20, 20, 45,
            35, 40, 20, 20, 35, 10, 15, 20};
    public int amount = 1; // amount

    public String foodName;
    public int aFoodPrice;

    public Food createFood(String foodName, int amount) {
        var animalFoodNumber = Arrays.asList(foodTypes).indexOf(this.getClass().getSimpleName());

        this.aFoodPrice = foodPrices[animalFoodNumber];
        this.foodName = foodName;
        this.amount = amount;
        return this;
    }

}
//Food classes that extends Food abstract class
class CatNoodles extends Food {
}

class Fish extends Food {
}

class Bananas extends Food {
}

class Berries extends Food {
}

class Carrot extends Food {
}

class Cucumber extends Food {
}

class Zucchini extends Food {
}

class Melons extends Food {

}

class Pumpkin extends Food {
}

class Grass extends Food {
}

class Pear extends Food {
}

class Apples extends Food {

}

class SugarBeet extends Food {

}

class Corn extends Food {

}

class Soybeans extends Food {

}





