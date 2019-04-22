import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        //request user input for a number
        System.out.println("Please enter a number to reverse: ");
        //scan and store that number in variable num
        Scanner scanner=new Scanner(System.in);
        int num =scanner.nextInt();
        //initialize variable reversed
        int reversed = 0;

        while(num != 0) //while user-entered number is NOT equal to O
        {
            int digit = num % 10; //variable digit = remainder of the number divided by 10
            reversed = reversed * 10 + digit; //last digit of num becomes first digit of reversed
            num = num/10; //reduce num 10 times for the next iteration
        }
        System.out.println("Reversed Number: " + reversed);//print reversed
    }
}
