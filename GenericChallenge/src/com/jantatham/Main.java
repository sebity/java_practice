package com.jantatham;

/**
 * Created by jan on 20/03/17.
 */
public class Main {
    public static void main(String[] args) {
        // Create a generic class to implement a league table for a sport.
        // The class should allow teams to be added to the list, and store
        // a list of teams that belong to the league.
        //
        // Your class should have a method to print out the teams in order,
        // with the team at the top of the league printed first.
        //
        // Only teams of the same type should be added to any particular
        // instance of the league class - the program should fail to compile
        // if an attempt is made to add an incompatible team.

        League<Team<FootballPlayer>> footballLeague = new League<>("NFL");

        Team<FootballPlayer> detroitLions = new Team<>("Detroit Lions");
        Team<FootballPlayer> dallasCowboys = new Team<>("Dallas Cowboys");
        Team<FootballPlayer> nyjets = new Team<>("NY Jets");
        Team<FootballPlayer> chicagoBears = new Team<>("Chicago Bears");

        dallasCowboys.matchResult(nyjets, 8, 0);
        dallasCowboys.matchResult(detroitLions, 12, 8);
        dallasCowboys.matchResult(chicagoBears, 4, 12);
        chicagoBears.matchResult(detroitLions, 8, 8);

        footballLeague.add(detroitLions);
        footballLeague.add(dallasCowboys);
        footballLeague.add(nyjets);
        footballLeague.add(chicagoBears);

        footballLeague.showLeagueTable();
    }
}
