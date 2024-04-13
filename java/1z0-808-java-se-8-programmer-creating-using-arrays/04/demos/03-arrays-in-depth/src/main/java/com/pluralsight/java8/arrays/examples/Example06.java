package com.pluralsight.java8.arrays.examples;

/**
 * Example 6: Understanding covariance of arrays.
 */
public class Example06 {

    public static void main(String[] args) {
        Dog[] dogs = {new Dog(), new Dog()};

        // Arrays are covariant, which means that the type Dog[] is a subtype of the type Animal[], and we can assign
        // an object of type Dog[] to a variable of type Animal[].
        Animal[] animals = dogs;

        // This is a useful feature, it makes it possible to pass a Dog[] as an Animal[].
        makeSounds(dogs);

        // Since "animals" is an array of animals, we should be able to store a Cat in it.
        // However, the actual object that "animals" refers to is a Dog[].
        // The compiler lets us do this, but it leads to an ArrayStoreException at runtime.
//        animals[0] = new Cat();

        // If we could assign a Cat to animals[0], then we would get a very strange Dog here.
        Dog firstDog = dogs[0];
        firstDog.makeSound();
    }

    static void makeSounds(Animal[] animals) {
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }

    interface Animal {
        void makeSound();
    }

    static class Dog implements Animal {
        @Override
        public void makeSound() {
            System.out.println("Woof!");
        }
    }

    static class Cat implements Animal {
        @Override
        public void makeSound() {
            System.out.println("Meow!");
        }
    }
}
