import java.util.Scanner;

public class MultipleMultiplicationTable {
    public static void main(String[] args) {
        //declare variable result and num, initialize count to 1
        int result, num;
        //request user input for a number to perform multiplication with for a table
        System.out.println("Please enter a number for a multiple multiplication table: ");
        //scan the number and store as num
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        //setting up loop for multiplication of num by numbers from 1 to 10
        for (int i = 1; i <=10; i++) {
            //setting up internal loop to only do the multiplication from 1 to entered num
            for (int j = 1; j <=num; j++) {
                //multiplication
                result = j * i;
                //use System.out.print (not println) to stay on the same line
                //use \t\t for spacing to print results
                System.out.print("\t\t"+j+"*"+i+"="+result);}
            //move to the next line once all numbers from 1 to num multiplied by i
            System.out.println("");
        }
    }
}