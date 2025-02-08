public class OffensiveRating {
    public static double calculate(Player player){
        //Formula for effective FG%
        double eFG = (player.getFgMade() + 0.5 * player.getThreePMade()) / (double) player.getFgAttempted();

        return (0.4 * player.getPts()) + (0.3 * player.getAst()) + (0.25 * player.getOrb()) - (0.3 * player.getTov()) + (25 * eFG); //+ (0.4 * player.getUsageRate()) + (0.75 * player.getPlayerEfficiencyRating()) + (2 * player.getOffensiveBPM());
    }




}
