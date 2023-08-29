package com.cozentus.JavaTask;

class Animal {
    public void eat() {
        System.out.println("The animal is eating.");
    }

    public void sound() {
        System.out.println("The animal is making a sound.");
    }
}

class Lion extends Animal {

    public void eat() {
        System.out.println("The lion is eating meat.");
    }

    public void sound() {
        System.out.println("The lion roars loudly.");
    }
}

class Tiger extends Animal {

    public void eat() {
        System.out.println("The tiger is eating meat and sometimes prey.");
    }

    public void sound() {
        System.out.println("The tiger growls.");
    }
}

class Panther extends Animal {

    public void eat() {
        System.out.println("The panther is eating various types of prey.");
    }

    public void sound() {
        System.out.println("The panther makes a mysterious sound.");
    }
}

public class Question19 {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        genericAnimal.eat();
        genericAnimal.sound();

        Lion lion = new Lion();
        lion.eat();
        lion.sound();

        Tiger tiger = new Tiger();
        tiger.eat();
        tiger.sound();

        Panther panther = new Panther();
        panther.eat();
        panther.sound();
    }
}

