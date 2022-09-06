package com.cydeo;

public class TestPlayer {

    public static void main(String[] args) {

        FootballPlayer joe = new FootballPlayer("Joe"); //Joe asks to register
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> jets = new Team("Jets");
        Team<BaseballPlayer> yankees = new Team("Yankees");
        Team<SoccerPlayer> liverpool = new Team("Liverpool"); //admission is creating team based on users

        jets.addPlayer(joe); //add the player by using the method
        yankees.addPlayer(pat);
        liverpool.addPlayer(beckham);

//        Team<String> brokenTeam = new Team<>("What kind of team is this?");
//        Team<Integer> t2 = new Team<>("Very weird");


    }
}
