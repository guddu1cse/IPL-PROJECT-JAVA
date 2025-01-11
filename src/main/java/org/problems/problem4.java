package org.problems;

import org.Entity.Delivery;
import org.Entity.Match;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class problem4 {

    //4. For the year 2015 get the top economical bowlers.
    public static String getTopEconomicalBowler(int year , List<Delivery> deliveryList , List<Match> matchList){
        Map<String , int[]> bowlerRecords = new HashMap<>();
        for(Delivery delivery : deliveryList){
            int season = matchList.get(delivery.getMatchId()-1).getSeason();
            if(season != year) continue; //skipping the years
            String bowler = delivery.getBowler();
            int run = delivery.getTotalRuns();
            int bowl = delivery.getWideRuns() != 0 || delivery.getNoballRuns() != 0 ? 0 : 1;

            if(!bowlerRecords.containsKey(bowler)){
                bowlerRecords.put(bowler , new int[]{0,0});
            }
            int a[] = bowlerRecords.get(bowler);
            a[0]+=run;
            a[1]+=bowl;
            bowlerRecords.put(bowler , a);
        }

        float economyRate = Float.MAX_VALUE;
        String topBowlerName = "";

        for(Map.Entry<String , int[]> entry : bowlerRecords.entrySet()){
            float currEconomyRate = ((float) entry.getValue()[0] / (float) (entry.getValue()[1]) )*(float)(6) ;
            if(currEconomyRate < economyRate){
                topBowlerName = entry.getKey();
                economyRate = currEconomyRate;
            }
        }

        return "Bowler: " + topBowlerName + ", Economy Rate: "+economyRate;
    }
}
