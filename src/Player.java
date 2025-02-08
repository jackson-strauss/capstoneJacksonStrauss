public class Player {
    private String name, minutesPlayed;
    private String position;
    private int fgMade, fgAttempted, threePMade, threePAttempted, ftMade, ftAttempted;     //Efficiency Counting Stats
    private double  fgPercentage, threePPercentage, ftPercentage;     // Efficiency Stats
    private int orb, drb, trb, ast, stl, blk, tov, pf, pts;     // Counting Stats
    private double gameScore;
    private int plusMinus;
    private double usageRate, playerEfficiencyRating, offensiveBPM, defensiveBPM;     //Advanced Stats

        public Player(String name, String minutesPlayed, int fgMade, int fgAttempted, double fgPercentage, int threePMade, int threePAttempted, double threePPercentage, int ftMade, int ftAttempted, double ftPercentage, int orb, int drb, int trb, int ast, int stl, int blk, int tov, int pf, int pts, double gameScore, int plusMinus){
            this.name = name;
            this.minutesPlayed = minutesPlayed;
            this.fgMade = fgMade;
            this.fgAttempted = fgAttempted;
            this.fgPercentage = fgPercentage;
            this.threePMade = threePMade;
            this.threePAttempted = threePAttempted;
            this.threePPercentage = threePPercentage;
            this.ftMade = ftMade;
            this.ftAttempted = ftAttempted;
            this.ftPercentage = ftPercentage;
            this.orb = orb;
            this.drb = drb;
            this.trb = trb;
            this.ast = ast;
            this.stl = stl;
            this.blk = blk;
            this.tov = tov;
            this.pf = pf;
            this.pts = pts;
            this.gameScore = gameScore;
            this.plusMinus = plusMinus;
        }

        public String getName(){
            return name;
        }
        public int getPts(){
            return pts;
        }
        public int getAst(){
            return ast;
        }
        public int getTov(){
            return tov;
        }
        public int getFgMade() {
            return fgMade;
        }
    public int getFgAttempted() {
        return fgAttempted;
    }
    public double getFgPercentage() {
            return fgPercentage;
        }
        public double getFtPercentage() {
            return ftPercentage;
        }

    public int getThreePMade() {
        return threePMade;
    }

    public int getOrb() {
            return orb;
        }
        public int getDrb() {
            return drb;
     }
        public int getStl() {
            return stl;
        }
        public int getBlk() {
            return blk;
        }
}
