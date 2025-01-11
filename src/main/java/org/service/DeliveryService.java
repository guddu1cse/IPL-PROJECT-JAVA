package org.service;
import org.Entity.Delivery;
import org.utils.ReadCSV;

import java.util.ArrayList;
import java.util.List;

public class DeliveryService {
    static List<List<String>> csvList = new ReadCSV().readCSV("deliveries.csv");

    public List<Delivery> getAllDeliveries() {
        List<Delivery> deliveryList = new ArrayList<>();
        for (List<String> values : csvList) {
            int matchId = number(values.get(0));
            int inning = number(values.get(1));
            String battingTeam = values.get(2);
            String bowlingTeam = values.get(3);
            int over = number(values.get(4));
            int ball = number(values.get(5));
            String batsman = values.get(6);
            String nonStriker = values.get(7);
            String bowler = values.get(8);
            int isSuperOver = number(values.get(9));
            int wideRuns = number(values.get(10));
            int byeRuns = number(values.get(11));
            int legbyeRuns = number(values.get(12));
            int noballRuns = number(values.get(13));
            int penaltyRuns = number(values.get(14));
            int batsmanRuns = number(values.get(15));
            int extraRuns = number(values.get(16));
            int totalRuns = number(values.get(17));
            String playerDismissed = values.get(18);
            String dismissalKind = values.get(19);
            String fielder = values.get(20);

            // Creating the Delivery object with the extracted values
            Delivery delivery = new Delivery(
                    matchId, inning, battingTeam, bowlingTeam, over, ball,
                    batsman, nonStriker, bowler, isSuperOver, wideRuns, byeRuns,
                    legbyeRuns, noballRuns, penaltyRuns, batsmanRuns, extraRuns,
                    totalRuns, playerDismissed, dismissalKind, fielder
            );
            deliveryList.add(delivery);
        }

        return deliveryList;
    }

    static int number(String str) {
        return str.isEmpty() ? 0 : Integer.parseInt(str);
    }
}
