import java.util.Scanner;

public class SingleMultiplicationTable {
    public static void main(String[] args) {
        //declare variable result and num, initialize count to 1
        int result, num, count=1;
        //request user input for a number to perform multiplication with for a table
        System.out.println("Please enter a number for a single multiplication table: ");
        //scan the number and store as num
        Scanner scanner=new Scanner(System.in);
        num=scanner.nextInt();

        do {
            result=num*count; ////calculate result of multiplication of num and count
            System.out.println(num+"*"+count+"="+result);//print result
            count++; //increase the counter for next iteration
        }while (count<=10); //until counter exceeds 10
    }
}
