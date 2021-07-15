package Lesson6;

import Lesson6.Animals;
import Lesson6.Cat;
import Lesson6.Dog;

public class Main {
    public static void main(String[] args) {
        Lesson6.Animals animal = new Lesson6.Animals("CatsCategory");
        Lesson6.Cat cat = new Lesson6.Cat("Barsik", 200, false);
        animal.animalInfo();
        cat.animalInfo();
        cat.catInfo();

        Lesson6.Animals danimal = new Animals("Dogs");
        Lesson6.Dog dog = new Lesson6.Dog("Sharik", 500, 10);
        danimal.animalInfo();
        dog.animalInfo();
        dog.dogInfo();

    }
}
