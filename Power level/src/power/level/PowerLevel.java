package power.level;

/**
 * @author Kieran Bingham
 */
import java.util.Scanner;
public class PowerLevel {
    public static void main(String[] args) {
        Scanner user_input = new Scanner( System.in );
        int powerLevel = 9001;
        int backup = 2; 
        
        System.out.println("Vegeta what does the scanner say about his power level?");
        powerLevel = user_input.nextInt();
        
        int i = 0; 
            i++; 
        
        if (powerLevel > 9000){
            System.out.println("IT'S OVER 9000!!!!!! \n THERE IS NO WAY THAT COULD BE RIGHT!");
        } else if (powerLevel <= 0){
            System.out.println("You have a negative power level... \nYou are too weak to exist....");
        } else {
            System.out.println("Power level under 9000. \nPrepare to be abliterated puny human!\n");
        }
        
        System.out.println("How many did he bring for backup?");
        backup = user_input.nextInt();
        switch (backup){
            case 1: System.out.println("1 on 1, a fair fight"); 
                break; 
            case 2: System.out.println("Hmmm, I am outnumbered..."); 
                break; 
            case 3: System.out.println("3 on one, not very confident are you?");
                break;
            default: System.out.println("Coward! You need that many to defent me!?!");
        } 
    }
    
}
