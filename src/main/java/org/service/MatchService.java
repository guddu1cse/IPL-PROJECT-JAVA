package org.service;

import org.Entity.Match;
import org.utils.ReadCSV;

import java.util.ArrayList;
import java.util.List;

public class MatchService {
    static List<List<String>> csvlist = new ReadCSV().readCSV("matches.csv");
    public List<Match> getAllMatches(){
        List<Match> matchList = new ArrayList<>();
        for (List<String> values : csvlist) {
            int id = number(values.get(0));
            int season = number(values.get(1));
            String city = values.get(2);
            String date = values.get(3);
            String team1 = values.get(4);
            String team2 = values.get(5);
            String tossWinner = values.get(6);
            String tossDecision = values.get(7);
            String result = values.get(8);
            String dlApplied = values.get(9);
            String winner = values.get(10);
            int winByRuns = number(values.get(11));
            int winByWickets = number(values.get(12));
            String playerOfMatch = values.get(13);
            String venue = values.get(14);
            String umpire1 = values.get(15);
            String umpire2 = values.get(16);
            String umpire3 = values.get(17);

            // Creating the Match object with the extracted values
            Match match = new Match(
                    id, season, city, date, team1, team2, tossWinner,
                    tossDecision, result, dlApplied, winner, winByRuns,
                    winByWickets, playerOfMatch, venue, umpire1, umpire2, umpire3
            );
            matchList.add(match);
        }

        return matchList;
    }

    static int number(String str){
        return Integer.parseInt(str);
    }
}
