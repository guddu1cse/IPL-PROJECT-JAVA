package org;

import org.Entity.Delivery;
import org.Entity.Match;
import org.service.DeliveryService;
import org.service.MatchService;
import java.util.List;
import java.util.Map;

import static org.problems.problem1.findMatchesPlayedByEachYear;
import static org.problems.problem2.findAllWonMatchEachTeam;
import static org.problems.problem3.getExtraRun;
import static org.problems.problem4.getTopEconomicalBowler;

public class Main {

    static MatchService matchService = new MatchService();
    static List<Match> matchList = matchService.getAllMatches();

    static DeliveryService deliveryService = new DeliveryService();
    static List<Delivery> deliveryList = deliveryService.getAllDeliveries();


    public static void main(String[] arg){

         //1. Number of matches played per year of all the years in IPL.
         problem1();

         //2. Number of matches won of all teams over all the years of IPL.
        problem2();

        //3. For the year 2016 get the extra runs conceded per team.
        problem3();

        //4. For the year 2015 get the top economical bowlers.
        problem4();
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

    public static void problem3(){
        System.out.println("3. For the year 2016 get the extra runs conceded per team.");
        Map<String , Integer> map3 = getExtraRun(deliveryList , matchList);
        System.out.println(map3);
    }

    private static void problem4() {
        System.out.println("4. For the year 2015 get the top economical bowlers.");
        String topBowler = getTopEconomicalBowler(2015 , deliveryList , matchList);
        System.out.println(topBowler);
    }
}
