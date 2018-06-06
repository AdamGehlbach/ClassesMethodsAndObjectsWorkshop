package com.company.example;

public class Pet {

    String ownerName;
    String petName;
    int age;
    char gender;
    String homeaddress;

    public Pet(String ownerName, String petName, int age, char gender, String homeaddress) {
        this.ownerName = ownerName;
        this.petName = petName;
        this.age = age;
        this.gender = gender;
        this.homeaddress = homeaddress;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getHomeaddress() {
        return homeaddress;
    }

    public void setHomeaddress(String homeaddress) {
        this.homeaddress = homeaddress;
    }

    protected String makeSound(){

        return "Pets have no sound";
    }

}
