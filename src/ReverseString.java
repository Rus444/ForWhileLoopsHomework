import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        //request user input for a string
        System.out.println("Please enter a string to reverse.");
        //scan and store the string in str
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        //initialize reverse string
        String reverseStr="";

        for (int i = str.length()-1; i >= 0 ; i--) //Repeat actions below for
            // a number of times equal to the number of characters in the string
        {
            reverseStr=reverseStr+str.charAt(i);//take the last character and put
            // it first and continue up to the first character
        }
        //Print reversed string
        System.out.println("Reverse of string "+str+" is a string "+reverseStr);
    }
}
