package org;

import org.Entity.Match;
import org.service.MatchService;
import java.util.List;
import java.util.Map;

import static org.problems.problem1.findMatchesPlayedByEachYear;
import static org.problems.problem2.findAllWonMatchEachTeam;

public class Main {

    static MatchService matchService = new MatchService();
    static List<Match> matchList = matchService.getAllMatches();


    public static void main(String[] arg){

         //1. Number of matches played per year of all the years in IPL.
         problem1();

         //2. Number of matches won of all teams over all the years of IPL.
        problem2();
    }

    public static void problem1(){
        System.out.println("1. Number of matches played per year of all the years in IPL.");
        Map<Integer , Integer> matchPlayed = findMatchesPlayedByEachYear(matchList);
        System.out.println(matchPlayed);
        System.out.println();
    }

    public static void problem2(){
        System.out.println("2. Number of matches won of all teams over all the years of IPL.");
        Map<String , Integer> map2 = findAllWonMatchEachTeam(matchList);
        System.out.println(map2);
    }
}
