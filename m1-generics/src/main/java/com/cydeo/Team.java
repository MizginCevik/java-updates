package com.cydeo;

import java.util.ArrayList;
import java.util.List;

public class Team<T> { // T stands for type, -SoccerPlayer, FootballPlayer, BaseballPlayer...

    private String name;

    private List<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player){
        if(members.contains(player)){
            //             getName from class
            System.out.println(((Player)player).getName() + " is already on the team");
            return false;
        }else{
            members.add(player);
            System.out.println(((Player)player).getName() + " is picked for the team" + this.name);
            return true;
        }
    }
}
