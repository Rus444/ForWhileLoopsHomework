import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        //initialize integer c and declare integers a and temp
        int c=0, a, temp;
        //initialize scanner
        Scanner scanner=new Scanner(System.in);
        //request user input
        System.out.println("Please enter a number to check if it's an Armstrong number or not.");
        //store user input
        int n=scanner.nextInt();
        //store user input in temp
        temp=n;
        //while loop to calculate if the sum of all digits of
        //integer n to the 3rd power is equal to n itself
        while (n>0){
            a=n%10; //remainder from dividing n by 10 gives us the last digit of the n itself
            n=n/10; //dividing n by 10 reduces n for the next iteration of the loop
            c=c+(a*a*a); //last digit (remainder) to the power of 3 (cube)
        }
        //check if original user entered integer n (temp) is equal to the sum of
        //its digits' cubes
        if(temp==c){
            System.out.println(temp+" is an Armstrong number.");//if equal, then Armstrong number
        }else{
            System.out.println(temp+" is NOT an Armstrong number.");//else - not Armstrong number
        }
    }
}
