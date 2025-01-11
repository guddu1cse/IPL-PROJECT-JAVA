package org.problems;

import org.Entity.Match;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class problem2 {

    public static Map<String , Integer> findAllWonMatchEachTeam(List<Match> matchList){
        Map<String , Integer> map = new HashMap<>();
        for(Match match : matchList){
            if(match.getWinner().trim().isEmpty()) continue;
            map.put(match.getWinner() , map.getOrDefault(match.getWinner() , 0)+1);
        }

        return map;
    }
}
