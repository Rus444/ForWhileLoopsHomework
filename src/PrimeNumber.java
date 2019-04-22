import java.util.Scanner;

public class PrimeNumber {
    //method to check if the number is Prime
    public static boolean isPrime(int n){
        //if user-entered number n is negative, 0 or 1 - then false (not Prime)
        if (n<=1){
            return false;
        }
        //for iterations between 2 and square root of user-entered number n
        //check if remainder of n divided by i is equal to 0
        for (int i=2; i<Math.sqrt(n); i++){
            if(n%i==0){
                return false; //if remainder is equal to 0, then false (not Prime)
            }
        }
        return true; //if remainder is not equal to 0, then true (Prime)
    }

    public static void main(String[] args) {
        //initialize Scanner for user input
        Scanner scanner = new Scanner(System.in);
        //request user to enter a number
        System.out.println("Please enter a number to check if it is a Prime number");
        //store user-entered number n
        int n = scanner.nextInt();
        //check if n is Prime by calling isPrime method above
        if(isPrime(n)){
            System.out.println(n+" is a Prime number.");//output if Prime
        }
        else{
            System.out.println(n+" is not a Prime number.");//output if not Prime
        }
        }
    }