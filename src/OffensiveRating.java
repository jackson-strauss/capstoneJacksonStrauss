public class OffensiveRating {
    public static double calculate(Player player) {
        //Formula for effective FG%
        double eFG = (player.getFgMade() + 0.5 * player.getThreePMade()) / (double) player.getFgAttempted();


        double ftr = (player.getFtAttempted() > 0) ? (double) player.getFtMade() / player.getFtAttempted() : 0;

        double astTov = (player.getTov() > 0) ? (double) player.getAst() / player.getTov() : player.getAst();

        double rawScore = (0.85 * player.getPts()) + (0.5 * astTov) + (0.2 * player.getOrb()) + (30 * eFG) + (5 * ftr) + (0.40 * player.getUsageRate()); //+ (0.75 * player.getPlayerEfficiencyRating()) + (2.5 * player.getOffensiveBPM());


        double minScore = 1.5;
        double maxScore = 105.7;
        double normalizeRating = 1 + 9 * ((rawScore - minScore) / (maxScore - minScore));

        return Math.max(1, Math.min(10, normalizeRating));

    }

}
