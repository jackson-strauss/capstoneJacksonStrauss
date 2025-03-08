import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SofaScore {
    public static void main(String[] args) {
        java.lang.String filePath = "src/CapstoneStats.csv"; // Path to your CSV file
        File file = new File(filePath);
        List<Player> players = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line;
            boolean firstLine = true;

            while ((line = br.readLine()) != null){
                if(firstLine){
                    firstLine = false;
                    continue;
                }
                String[] data = line.split(","); // Split CSV by comma, and some values are missing so this presents an error

                // Parse values
                Player player = new Player(data[0].trim(), data[1].trim(), parseInteger(data[2]), parseInteger(data[3]), parseDouble(data[4]), parseInteger(data[5]), parseInteger(data[6]), parseDouble(data[7]), parseInteger(data[8]), parseInteger(data[9]), parseDouble(data[10]), parseInteger(data[11]), parseInteger(data[12]), parseInteger(data[13]), parseInteger(data[14]), parseInteger(data[15]), parseInteger(data[16]), parseInteger(data[17]), parseInteger(data[18]), parseInteger(data[19]), parseDouble(data[20]), parseInteger(data[21]), parseDouble(data[22]), parseDouble(data[23]));

                players.add(player);
            }
        } catch (IOException e){
            System.out.println("Error");
        }

        double avgGmSc = getAverageGmSc(players);
        double stdDevGmSc = getStandardDeviationGmSc(players, avgGmSc);

        for (Player player : players){
//            double offRating = OffensiveRating.calculate(player);
//            double defRating = DefensiveRating.calculate(player);
            System.out.println("Offensive and Defensive Game Rating of:");
            System.out.println(player.getName() + "| Off: " + offRating + "| Def: " + defRating + "|");
        }
        Team team = new Team(players);
        team.printBestandWorst();
    }

    public static double getAverageGmSc(List<Player> players){
        double sum = 0;
        for (Player player : players) sum += player.getGameScore();
        return players.isEmpty() ? 0 : sum/players.size();
    }

    public static double getStandardDeviationGmSc(List<Player> players, double mean){
        double sumSquaredDiffs = 0;
        for (Player player : players) sumSquaredDiffs == Math.pow(player.getGameScore() - mean, 2);
        return players.isEmpty() ? 1 : Math.sqrt(sumSquaredDiffs / players.size());
    }

    // My code could not work with the parseing as it normal is done because some players may not record certain stats so I had to do a work around to plug in for those stats a 0 if they did not show up.
    private static int parseInteger(String value){
        try{
            return Integer.parseInt(value.trim());
        } catch (NumberFormatException e){
            return 0;
        }
    }

    private static double parseDouble(String value){
        try{
            return Double.parseDouble(value.trim());
        } catch (NumberFormatException e){
            return 0.0;
        }
    }

}




