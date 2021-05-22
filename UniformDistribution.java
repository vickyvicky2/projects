import java.util.Random;
import java.util.Scanner;
/* 
Victoria Aguilar
5/3/2021
Uniform Distribution project
*/
public class UniformDistribution {

    public static void main(String[] args) {
        
        //instantiates scanner object to get input from user
        Scanner scanner = new Scanner(System.in);

        //asks user for seed
        System.out.println("Enter seed:");
        int seedy = scanner.nextInt();
        
        System.out.println();

        System.out.println("How many values would you like to test?");
        int trials = scanner.nextInt();

        //array with size 10
        String[] numContainer = new String[10];

        //method to initialize empty array
        initializeArray(numContainer);

        //method to pass array and run trials
        runTrials(numContainer, trials, seedy);

        //method to display array
        displayMetrics(numContainer);
    } //endMain

    public static void initializeArray(String[] numContainer) {

        //loop to initialize empty array
        for (int i = 0; i < numContainer.length; i++) {
            numContainer[i] = "";
        }

    } //end initializeArray

    public static void runTrials(String[] numContainer, int trials, int seedy) {

        //instantiates random object from seed
        Random rand = new Random(seedy);

        //loop from 0 to # of trials that user enters
        for (int i = 0; i < trials; i++) {
            
            //stores random generated value
            int index = rand.nextInt(10);

            numContainer[index] = numContainer[index] + "-";
        }

    } //end runTrials

    public static void displayMetrics(String[] numContainer) {

        for (int i = 0; i < numContainer.length; i++) {

            System.out.println(i + ": " + numContainer[i]
                    + " " + numContainer[i].length());
        }

    } //end displayMetrics

} //end class
