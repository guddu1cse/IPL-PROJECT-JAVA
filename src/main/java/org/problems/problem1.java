package org.problems;

import org.Entity.Match;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class problem1 {

    //Number of matches played per year of all the years in IPL
    public static Map<Integer , Integer> findMatchesPlayedByEachYear(List<Match> matchList){
        Map<Integer , Integer> map = new HashMap<>();

        for(Match match : matchList){
            map.put(match.getSeason() , map.getOrDefault(match.getSeason() , 0)+1);
        }

        return map;
    }

}
