package cyoa;

import java.util.Scanner;

/**
 *
 * @author Kieran Bingham
 */

class decision{
    String question;
    String[] options; 
    int[] destination = {0}; 
    int chosen; 
    
    void setQuestion(String newValue){
        question = newValue; 
    }
    
    void setOptions (String[] newValue){
        options = newValue;
    }
    
    void setDestination (int[] newValue){
        destination = newValue;
    }
    
    void printDecision(){
        System.out.println(question);
        if (options != null){
            for (int x = 0; x < options.length; x++){
                System.out.println(x + 1 + " - " + options[x]);
            }
        }
    }
    
    int getChoice(){
        if (options != null){
            Scanner user_input = new Scanner( System.in );
            chosen = user_input.nextInt() - 1; 
            return destination[chosen]; 
        } else {
            return 0; 
        }
    }
}

public class CYOA {

    public static void main(String[] args) {
        //Declaire variables
        int position = 0; 
        decision[] decisions = new decision[7]; 
        for (int x = 0;x < decisions.length;x++){
            decisions[x] = new decision(); 
        }
        
        //Set up decisions
        //0 - Cabin
        decisions[0].setQuestion("You wake up in an old abandoned cabin. The walls are covered in rusty knives and deer heads. "
                + "\nYou have no memory of how you got there. Do you:");
        String[] options0 = {"Go outside", "Look around the cabin"};
        decisions[0].setOptions(options0);
        int[] destinations = {1,2};
        decisions[0].setDestination(destinations);
        
        //1 - Outside
        decisions[1].setQuestion("You walk outside and see that the cabin is surrounded by a dark forest. "
                + "\nOn the edge you see the body of a man leaning up against a tree. Do you:");
        String[] options1 = {"Head into the forest", "Check out the body"};
        decisions[1].setOptions(options1);
        int[] destinations1 = {3,4};
        decisions[1].setDestination(destinations1);
        
        //2 - Explore cabin
        decisions[2].setQuestion("You find a trap door in the cabin. Do you");
        String[] options2 = {"Go down it", "Leave it alone and head outside"};
        decisions[2].setOptions(options2);
        int[] destinations2 = {5,1};
        decisions[2].setDestination(destinations2);
        
        //3 - Forest
        decisions[3].setQuestion("You have been walking in the forest for 2 hours. All of a sudden you hear a noise behind you."
        +"\nYou spin around and see a honey badger. You scream at it to leave you alone."
        +"\nHoney badger don't care. He kills you. You is dead.");
        decisions[3].setOptions(null);
        
        //4 - Body
        decisions[4].setQuestion("You approch the body. You can see that it is a man, and he appears to still be alive."
        +"\n'Hey, I just woke up in this strange cabin. Do you know how I got here? I want to go home.' You say."
        +"\n'I kidnapped you and put you in there.' He replies."
        +"\nThen he looks up at you, pulls out a spoon, and starts to beat you to death with it."
        +"\n'I should have used a knife, this is going to take a LONG time.' ... \nAnd it does. You dead");
        decisions[4].setOptions(null);
        
        //5 - Trap door tunnel
        decisions[5].setQuestion("You drop down the trap door into a dark tunnel. "
                + "After walking down the tunnel for a while you come to a ladder. "
                + "At the top of the ladder you see sky and trees, must be a forest. Do you:");
        String[] options5 = {"Climb up the ladder to explore the forest", "Keep going down the tunnel"};
        decisions[5].setOptions(options5);
        int[] destinations5 = {3,6};
        decisions[5].setDestination(destinations5);
        
        //6 - Forest
        decisions[6].setQuestion("At the end of the tunnel you find a ladder leading up."
                + "\nAfter a long climb up the ladder you reach a metal hatch at the top. You open it and climb out."
                + "\nYou find yourself in the middle of times square. WTF. Oh well, at least you are safe now. "
                + "\n \n \n \n \n \n \nUntill soemone dressed as Elmo approches you and stabs you in the heart."
                + "\n'HAIL HYDRA' he whispers in your ear. You dead.");
        decisions[6].setOptions(null);
        
        do {
            decisions[position].printDecision(); 
            position = decisions[position].getChoice(); 
            System.out.println("\n \n");
        } while (position > 0); 
        System.exit(0);
    }
}
