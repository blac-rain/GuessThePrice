import java.util.ArrayList;
import java.util.Arrays; 

import javax.swing.JOptionPane;

public class GuessThePrice {
    static ArrayList<String> names = new ArrayList<String>(); // list of player names
    static int maxRounds; // num of rounds to play
    static Double price; // price to guess
    static ArrayList<Double> guesses = new ArrayList<Double>(); // guesses of player
    static ArrayList<Integer> points = new ArrayList<Integer>(); // points of players (lowest points == highest place)
        
    public static void main(String[] args) {
        String gameTitle = "Guess The Price!";

        Integer startWindow = JOptionPane.showConfirmDialog(null, "Welcome to Guess The Price!\nDo you want to start the game now?", gameTitle, JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
        // when canceled or choose no --> show msg window
        if(startWindow != JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "Goodbye and have a beautiful day!", "Goodbye", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        // when pressed yes, game starts
        String inputNames = JOptionPane.showInputDialog(null,"Please enter all player names, seperated by a comma:", gameTitle,JOptionPane.INFORMATION_MESSAGE);
        names.addAll(Arrays.asList(inputNames.split(","))); //TODO trim() names
        maxRounds = Integer.parseInt(JOptionPane.showInputDialog(null,"How many rounds do you want to play?", gameTitle, JOptionPane.QUESTION_MESSAGE));

        //round starts
        for(int i = 0;  i <= maxRounds; i++)
        {
            price = Double.parseDouble(JOptionPane.showInputDialog(null, "What is the price everyone should guess?", gameTitle + " - Round " + (i + 1), JOptionPane.QUESTION_MESSAGE));
            for(int n = 0; n < names.size(); n++){
                String inputGuesses = JOptionPane.showInputDialog(null,"Please enter the guess from " + names.get(n) + ":", gameTitle,JOptionPane.INFORMATION_MESSAGE);
                guesses.add(n, Double.parseDouble(inputGuesses));
            }            
            // show nearest guess            
            JOptionPane.showMessageDialog(null, "All guesses saved. Press OK for round result!", gameTitle + " - Round " + (i + 1), JOptionPane.PLAIN_MESSAGE);
            //TODO show all guesses ordered closest to furthest
            JOptionPane.showMessageDialog(null, "The closest guess was " + closest(price) + " from " + , gameTitle + " - End of Round " + (i + 1), JOptionPane.INFORMATION_MESSAGE);
        }
    }

public static double closest(double of) {
    double min = Double.MAX_VALUE;
    double closest = of;

    for (double v : guesses) {
        final double diff = Math.abs(v - of);

        if (diff < min) {
            min = diff;
            closest = v;
        }
    }

    return closest;
}
}