public class DefensiveRating {
    public static double calculate (Player player){
        return (0.5 * player.getDrb()) + (0.75 * player.getStl()) + (1.5 * player.getBlk());  //+ (2 * player.getDefensiveBPM);
    }
}
