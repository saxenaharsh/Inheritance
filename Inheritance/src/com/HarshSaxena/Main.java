package com.HarshSaxena;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal animal = new Animal("Animal", 1, 1, 5,5);
        Dog dog = new Dog("Yorkie", 8, 8, 2, 4, 1, 20, "long silky");

        //dog.eat();
        dog.walk();
       // dog.run();
        Fish fish = new Fish("Pirana", 6, 8, 6, 2, 4);
        fish.swim(5);

    }
}
