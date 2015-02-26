package bucketsort;
import java.util.Random;
/**
 *
 * @author Kieran Bingham
 */
public class BucketSort {

//    static int[] sort(int[] sequence, int maxValue) {
//        // Bucket Sort
//        int[] Bucket = new int[maxValue + 1];
//        int[] sorted_sequence = new int[sequence.length];
//
//        for (int i = 0; i < sequence.length; i++) {
//            Bucket[sequence[i]]++;
//        }
//
//        int outPos = 0; 
//        for (int i = 0; i < Bucket.length; i++) {
//            for (int j = 0; j < Bucket[i]; j++) {
//                sorted_sequence[outPos++] = i; //
//            }
//        }
//        return sorted_sequence;
//    }

    //A function that prints the sequence when called 
    static void printSequence(int[] sorted_sequence) { 
        for (int i = 0; i < sorted_sequence.length; i++) {
            System.out.print(sorted_sequence[i] + " ");
        }
    }

    //A function that finds the maximum value of an array when called 
    static int maxValue(int[] sequence) {
        int maxValue = 0;
        for (int i = 0; i < sequence.length; i++) {
            if (sequence[i] > maxValue) {
                maxValue = sequence[i];
            }
        }
        return maxValue;
    }

    public static void main(String args[]) {
        System.out.println("Sorting of randomly generated numbers using BUCKET SORT");
        Random random = new Random(); 
        int N = 10; //Set # of items in sequence 
        int[] sequence = new int[N]; //Makes an array filled with N number of int

        for (int i = 0; i < N; i++) {
            sequence[i] = Math.abs(random.nextInt(10)); //Fills the array with random ints < 100
        }

        int maxValue = maxValue(sequence); //Calls the maxValue function, whitch loops through the array and finds the maximum value 

        
         //Bucket Sort
        int[] Bucket = new int[maxValue + 1];
        int[] sorted_sequence = new int[sequence.length];

        for (int i = 0; i < sequence.length; i++) {
            Bucket[sequence[i]]++;
        }

        int outPos = 0; 
        for (int i = 0; i < Bucket.length; i++) {
            for (int j = 0; j < Bucket[i]; j++) {
                sorted_sequence[outPos++] = i; //
            }
        }
        
        
        System.out.println("\nOriginal Sequence: ");
        printSequence(sequence);

        System.out.println("\nBucket: ");
        printSequence(Bucket);
        
        System.out.println("\nSorted Sequence: ");
        printSequence(sorted_sequence);
    }
}
