package com.jantatham;

/**
 * Created by jan on 08/03/17.
 */
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1,20, "long silky");
        dog.eat();
        //dog.walk();
        dog.run();

        Fish fishy = new Fish("Fishy", 1, 1, 6, 2, 1);
        fishy.swim(2);
    }
}
