package com.company.example;

public class Main {

    public static void main(String[] args) {

        Cat myCat = new Cat("adam", "ben",1,'m', "shepherdsville",true, 10.5);

        System.out.println("The name of my cat is: " + myCat.getPetName());

        myCat.setWhiskers(true);
        System.out.println("Does this cat have whiskers? " + myCat.isWhiskers());

        System.out.println(myCat.makeSound());

        System.out.println(myCat.catYears());

        }


}

