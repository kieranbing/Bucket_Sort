package array;

/**
 * @author Kieran m. Bingham
 */
public class Array {
    public static void main(String[] args) {
        int [] myMarks = {91, 66, 64, 75};
        int numMarks=0, finalMark, markTotal=0; 
        for (int x: myMarks){
            markTotal += x; 
            numMarks++; 
        }
        finalMark = markTotal / numMarks; 
        System.out.print(finalMark);
    }
}
