package com.dhuelin.f1.fantasy.backend.services;

import com.dhuelin.f1.fantasy.backend.Driver;
import com.dhuelin.f1.fantasy.backend.pojos.RacePrediction;
import com.dhuelin.f1.fantasy.backend.pojos.RaceResult;

import java.util.List;

public class ScoringService {

    public int calculateRaceScore(RacePrediction prediction, RaceResult actualResult) {
        int score = 0;
        // Calculate points for top 10 predictions
        score += calculateTop10Score(prediction.getTop10Drivers(), actualResult.getTop10Drivers());
        // Points for fastest lap
        if (prediction.getFastestLapDriver().equals(actualResult.getFastestLapDriver())) {
            score += 5; // Example points
        }
        // Points for driver of the day
        if (prediction.getDriverOfTheDay().equals(actualResult.getDriverOfTheDay())) {
            score += 3; // Example points
        }
        // Deduct points for incorrect DNF predictions
        score -= calculateDnfPenalty(prediction.getDnfs(), actualResult.getDnfs());
        // Apply boost if used
        if (prediction.isBoostUsed()) {
            score *= 2;
        }
        return score;
    }

    private int calculateTop10Score(List<Driver> predicted, List<Driver> actual) {
        int score = 0;
        for (int i = 0; i < predicted.size(); i++) {
            if (predicted.get(i).equals(actual.get(i))) {
                if (i == 0) {
                    score += 25; // Points for correct race winner
                } else if (i < 3) {
                    score += 18; // Points for correct top 3
                } else {
                    score += 10; // Points for correct top 10
                }
            }
        }
        return score;
    }

    private int calculateDnfPenalty(List<Driver> predictedDnfs, List<Driver> actualDnfs) {
        int penalty = 0;
        for (Driver predicted : predictedDnfs) {
            if (!actualDnfs.contains(predicted)) {
                penalty += 5; // Penalty points for incorrect DNF prediction
            }
        }
        return penalty;
    }
}
