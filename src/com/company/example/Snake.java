package com.company.example;

public class Snake {

    String name;
    double weight;
    char gender;
    double length;

    public Snake(String name, double weight, char gender, double length) {
        this.name = name;
        this.weight = weight;
        this.gender = gender;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
