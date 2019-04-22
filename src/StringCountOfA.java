import java.util.Scanner;

public class StringCountOfA {
    public static void main(String[] args) {
        //request user input for a string
        System.out.println("Please enter a string.");
        //scan user input and store it in newString
        Scanner scanner=new Scanner(System.in);
        String newString = scanner.nextLine();
        //initialize variable count to 0
        int count = 0;

        //Counts characters a and A only from
        //0 to the number of characters in the string
        for(int i = 0; i < newString.length(); i++)
        {
            if(newString.charAt(i)=='a' || newString.charAt(i)=='A')
                count++;
        }

        //prints the total number of characters a and A present in the given string
        System.out.println("Total number of characters 'a' and 'A' in this string: " + count);
    }
}
