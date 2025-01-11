package org.problems;

import org.Entity.Delivery;
import org.Entity.Match;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class problem3 {

    //3. For the year 2016 get the extra runs conceded per team.
    public static Map<String , Integer> getExtraRun(List<Delivery> deliveryList , List<Match> matchList){
        Map<String , Integer> mapOfExtraRun = new HashMap<>();
        for(Delivery delivery: deliveryList){
            int season = matchList.get(delivery.getMatchId()-1).getSeason();
            if(season != 2016) continue; //skipping if season is not 2016
            mapOfExtraRun.put(delivery.getBattingTeam() , mapOfExtraRun.getOrDefault(delivery.getBattingTeam() ,0)+delivery.getExtraRuns());
        }

        return mapOfExtraRun;
    }

}
