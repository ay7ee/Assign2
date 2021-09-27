package com.company;

import java.util.ArrayList;
import java.util.List;

public class Steam implements Observable{

    private List<String> games = new ArrayList<>();
    private List<Observer> gamers = new ArrayList<>();

    public void addGame(String game){
        this.games.add(game);
        notifyAllUsers();
    }

    public void deleteGame(String game){
        this.games.remove(game);
        notifyAllUsers();
    }



    @Override
    public void signUpUser(Observer observer) {
      this.gamers.add(observer);
    }

    @Override
    public void deleteUser(Observer observer) {
        this.gamers.remove(observer);
    }

    @Override
    public void notifyAllUsers() {
      for(Observer observer: gamers){
          observer.update(this.games);
      }
    }
}
