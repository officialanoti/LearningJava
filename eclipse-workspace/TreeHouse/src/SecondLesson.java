import java.io.*;
import java.util.Scanner;

class SecondLesson {
    public static void main(String[] args){
        /**int count = 1;
        while (count < 11) {
            System.out.println("Count is: " + count);
            count++;
        }*/
    	
    	/**int[] arrayOfInts = 
            { 32, 87, 3, 589,
              12, 1076, 2000,
              8, 622, 127 };
        int searchfor = 12;

        int i;
        boolean foundIt = false;

        for (i = 0; i < arrayOfInts.length; i++) {
            if (arrayOfInts[i] == searchfor) {
                foundIt = true;
                break;
            }
        }

        if (foundIt) {
            System.out.println("Found " + searchfor + " at index " + i);
        } else {
            System.out.println(searchfor + " not in the array");
        }*/
    	
    	/**
    	Scanner reader = new Scanner(System.in);  // Reading from System.in
    	System.out.println("Enter a number: ");
    	int n = reader.nextInt(); // Scans the next token of the input as an int.
    	//once finished
    	reader.close();
    	System.out.println("Your number is " + n); */
    	
    	Scanner input = new Scanner(System.in);

        final int MAX = 10;

        String[] list = new String[MAX];
        int choice = 0;
        int count = 0;

        while (choice != 3) {

            System.out.println();
            System.out.println("Type 1 to add a new thing to your to do list.");
            System.out.println("Type 2 to print the to do list.");
            System.out.println("Type 3 to exit the program.");
            System.out.print("Select an option: ");
            choice = input.nextInt();
            

            if (choice == 1) {
                System.out.println("Keep hitting enter after to do's, if you want to stop, type 'stop'.");
                for (int i=count;i<MAX;i++) {
                    list[i] = input.nextLine();
                    if (list[i].equals("stop")) break;
                    count++;
                }
            }

            if (choice == 2) {
                for (int index = 0;index < count; index++) {
                    System.out.println(list[index]);                    
                }               
            }

        }
    	
    }
}