import java.util.Scanner;

public class PositiveNegativeZeroCount {
    public static void main(String[] args) {
        //initialize scanner
        Scanner scanner=new Scanner(System.in);
        //declare character chooseToContinue
        char chooseToContinue;

        int num,                    //declare integer num
                countPositives=0,   //initialize positives count to 0
                countNegatives=0,   //initialize negatives count to 0
                countZeros=0;       //initialize zeros count to 0

        do {
            //request user input for a number and store it as num
            System.out.println("Please enter a number: ");
            num=scanner.nextInt();
            //check if num is > 0, then increase positives count by 1
            if (num>0){countPositives++; }
            else if (num<0){countNegatives++; }//if num<0, then increase negatives count by 1
            else{countZeros++; }//if num=0, then increase zeros count by 1

            //ask user if they want to continue entering the numbers
            System.out.println("Would you like to continue? Y or N");
            //store user response in character chooseToContinue
            chooseToContinue=scanner.next().charAt(0);
        }
        //continue taking user inputs and counting positives, negatives and zeros
        //as long as user chooses to to do so
        while (chooseToContinue=='y' || chooseToContinue=='Y');

        System.out.println("Total count of positive numbers is "+countPositives);
        System.out.println("Total count of negative numbers is "+countNegatives);
        System.out.println("Total count of zeros is "+countZeros);
    }
}
