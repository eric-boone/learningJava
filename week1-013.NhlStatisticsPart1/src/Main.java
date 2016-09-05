
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        
//Print the top ten players based on goals
        System.out.println("Top 10 players based on goals:");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        
//Print the top 25 players based on penalty amounts
        System.out.println("Top 25 players based on penalty amounts:");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        
//Print the statistics for Sidney Crosby
        System.out.println("Sidney Crosby Statistics:");
        NHLStatistics.searchByPlayer("Sidney Crosby");
        
//Print the statistics for Philadelphia Flyers
        System.out.println("Philadelphia Flyers Statistics:");
        NHLStatistics.teamStatistics("PHI");
        NHLStatistics.sortByPoints();
        
//Print the players in Anaheim Ducks (abbreviation: ANA) ordered by points
        System.out.println("Anaheim Ducks players ordered by points:");
        NHLStatistics.teamStatistics("ANA");
        NHLStatistics.sortByPoints();
    }
}
