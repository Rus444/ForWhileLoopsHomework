import java.util.Scanner;

public class SingleMultiplicationForLoop {
    public static void main(String[] args) {
        //declare variable result and num
        int result, num;
        //request user input for a number to perform multiplication with for a table
        System.out.println("Please enter a number for multiplication table: ");
        //scan the number and store as num
        Scanner scanner=new Scanner(System.in);
        num=scanner.nextInt();

        for (int i = 1; i <=10 ; i++)//for num repeat actions 10 times
        {
            result=num*i;   //calculate result of multiplication of num and counter i
            System.out.println(num+"*"+i+"="+result); //print result
        }
    }
}
