package org.andersen.lab.lesson_4;

public class AnimalRunner {
    public static void main(String[] args) {

        Cat catMyrka = new Cat("Vasilisa", 10, false);
        Animal dogBobik = new Dog("Bobik", "Black");
        catMyrka.run(200);
        catMyrka.swim(150);
        dogBobik.run(100);
        dogBobik.swim(520);

        System.out.println(Animal.getCount());
        System.out.println(Dog.getCount());
        System.out.println(Cat.getCount());

        Cat[] catsArray = new Cat[4];
        catsArray[0] = new Cat("Myrka", 5, false);
        catsArray[1] = new Cat("Ryzhik", 30, false);
        catsArray[2] = new Cat("Barsik", 10, false);
        catsArray[3] = new Cat("Chernysh", 45, false);

        Plate plate = new Plate(50);
        plate.info();
        for (int i = 0; i < catsArray.length; i++) {
            if (catsArray[i].getSatiety() == false && catsArray[i].getAppetite() < plate.getFood()){
                catsArray[i].eat(plate);
                catsArray[i].setSatiety(true);
                System.out.println("Cat " + catsArray[i].name + " has ate! Satiety is: " + catsArray[i].getSatiety());
            } else {
                System.out.println("Cat " + catsArray[i].name + " has not ate! Satiety is: " + catsArray[i].getSatiety());
            }
        }
        plate.info();
        plate.increaseFood(5);
        plate.info();
    }
}
