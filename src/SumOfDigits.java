import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        //initialize variable sum to 0, declare a and temp
        int sum=0, a, temp;
        //request user input for a 5-digit number
        System.out.println("Please enter a 5-digit number.");
        //scan and store the number as num
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        //initialize temp equal to num
        temp=num;
        //while loop for num bigger than 0
        while (num>0)
        {
            a=num%10;  //remainder of num divided by 10 - last digit
            num=num/10;//reduce num 10 times without remainder
            sum=sum+a; //sum of digits starting from the last one
        }
        //print the sum of digits of the number num (temp)
        System.out.println("The sum of all digits of "+temp+" is equal to "+sum);
    }
}
