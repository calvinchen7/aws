package com.pluralsight.java8.arrays.exercises;

/**
 * Exercise 3: Understanding arrays and covariance.
 * <p>
 * Note: There is no unit test for this exercise. The exercise is to answer the questions below to yourself.
 */
public class Exercise03 {

    public static void main(String[] args) {
        Animal[] animals1 = new Dog[2];
        Animal[] animals2 = new Animal[2];

        // TODO: The arrays 'animals1' and 'animals2' are both arrays of Animals. What is the difference between them?

        // TODO: What happens when we store a Dog and a Cat in animals1?
        animals1[0] = new Dog();
        animals1[1] = new Cat();

        // TODO: What happens when we store a Dog and a Cat in animals2?
        animals2[0] = new Dog();
        animals2[1] = new Cat();
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
