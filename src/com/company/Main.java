package com.company;

public class Main {

    public static void main(String[] args) {
        Steam steam = new Steam();

        steam.addGame("The Forest");

        User newGamer = new User("dan7e");
        steam.signUpUser(newGamer);

        steam.addGame("CS:GO");

    }
}
