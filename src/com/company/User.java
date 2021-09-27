package com.company;

import java.util.List;

public class User implements Observer{
    private String nickName;

    public User(String nickName){
        this.nickName = nickName;
    }

    @Override
    public void update (List<String> games){
        System.out.println("Dear " + this.nickName + "\n We have new game in store:\n" + games + "\n");
    }
}
