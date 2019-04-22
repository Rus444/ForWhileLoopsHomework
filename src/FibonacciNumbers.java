import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        //declare integer n and initialize integers a, b and c
        int n, a = 0, b = 0, c = 1;
        //request user input for how many numbers in Fibonacci series
        System.out.print("Enter a value for how many numbers you want in Fibonacci series: ");
        //scan and store that number
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        //Print Fibonacci series
        System.out.print("Your Fibonacci series is: ");

        for(int i = 1; i <= n; i++)//until iterations from 1 to n
        {
            a = b;                 //number a in Fibonacci series takes value of b
            b = c;                 //number b in Fibonacci series takes value of c
            c = a + b;             //number c in Fibonacci series is a sum of a and b
                                    //c is also the next number in the series
            System.out.print(a+" "); //print every Fibonacci number in sequence from 0
        }
    }
}
