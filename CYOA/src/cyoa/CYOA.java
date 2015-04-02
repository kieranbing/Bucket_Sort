package cyoa;

import java.util.Scanner;

/**
 *
 * @author Kieran Bingham
 */

class decision{
    String question;
    String[] options; 
    int[] destination; 
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
        for (int x = 0; x < options.length; x++){
            System.out.println(x + 1 + " - " + options[x]);
        }
    }
    
    void getChoice(){
        Scanner user_input = new Scanner( System.in );
        chosen = user_input.nextInt() - 1; 
    }
    
    int nextDecision(){
        return chosen; 
    }
}

public class CYOA {

    public static void main(String[] args) {
        decision[] decisions = new decision[5]; 
        for (decision x : decisions){
            x = new decision(); 
        }
        
        do {
            
        }
    }
    
}
