package com.jantatham;

/**
 * Created by jan on 20/03/17.
 */
public class Main {
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> chicagoBears = new Team<>("Chicago Bears");
        chicagoBears.addPlayer(joe);

        System.out.println(chicagoBears.numPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

        Team<SoccerPlayer> brokenTeam = new Team<>("this won't work");
        brokenTeam.addPlayer(beckham);

        Team<FootballPlayer> detroitLions = new Team<>("Detroit Lions");
        FootballPlayer jack = new FootballPlayer("Jack");
        detroitLions.addPlayer(jack);

        Team<FootballPlayer> dallasCowboys = new Team<>("Dallas Cowboys");
        Team<FootballPlayer> nyjets = new Team<>("NY Jets");

        dallasCowboys.matchResult(nyjets, 8, 0);
        dallasCowboys.matchResult(detroitLions, 12, 8);
        dallasCowboys.matchResult(chicagoBears, 4, 12);

        System.out.println("Rankings");
        System.out.println(dallasCowboys.getName() + ": " + dallasCowboys.ranking());
        System.out.println(nyjets.getName() + ": " + nyjets.ranking());
        System.out.println(detroitLions.getName() + ": " + detroitLions.ranking());
        System.out.println(chicagoBears.getName() + ": " + chicagoBears.ranking());

        System.out.println(dallasCowboys.compareTo(nyjets));
        System.out.println(dallasCowboys.compareTo(detroitLions));
        System.out.println(detroitLions.compareTo(chicagoBears));
    }
}
