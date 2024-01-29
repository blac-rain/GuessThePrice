import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class GuessThePrice {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>(); // list of player names
        int maxRounds; // num of rounds to play
        Double price; // price to guess
        ArrayList<Double> guesses = new ArrayList<Double>(); // guesses of player
        ArrayList<Integer> points = new ArrayList<Integer>(); // points of players (lowest points == highest place)
        String gameTitle = "Guess The Price!";

        Integer startWindow = JOptionPane.showConfirmDialog(null, "Welcome to Guess The Price!\nDo you want to start the game now?", gameTitle, JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
        // when canceled or choose no --> show msg window
        if(startWindow != JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "Goodbye and have a beautiful day!", "Goodbye", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        // when pressed yes, game starts
        String inputNames = JOptionPane.showInputDialog(null,"Please enter all player names, seperated by a comma:", gameTitle,JOptionPane.INFORMATION_MESSAGE);
        names.addAll(Arrays.asList(inputNames.split(",")));
        maxRounds = Integer.parseInt(JOptionPane.showInputDialog(null,"How many rounds do you want to play?", gameTitle, JOptionPane.QUESTION_MESSAGE));

        //round starts
        for(int i = 1;  i == maxRounds; i++)
        {
            price = Double.parseDouble(JOptionPane.showInputDialog(null, "What is the price everyone should guess?", gameTitle + " - Round " + i, JOptionPane.QUESTION_MESSAGE));
            
        }
    }
}