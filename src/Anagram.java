import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    // Function to return the value for Anagram Checks

    static Boolean isAnagram(String w1 , String w2) {

        // This will be used to return the result of checks related to Anagram
        Boolean status = false ;

        // Removing all the white spaces from both the strings

        w1= w1.replaceAll("\\s","");
        w2= w2.replaceAll("\\s","");

        // First check is to compare the length of both the strings

        if (w1.length()==w2.length()) {

        // Converting the string into lower case array so that we can ignore case sensitive issues
            char[] word1=w1.toLowerCase().toCharArray();
            char[] word2=w2.toLowerCase().toCharArray();

        // Sorting the word character arrays

        Arrays.sort(word1);
        Arrays.sort(word2);

        //Checking if the sorted arrays are equal or no

        status = Arrays.equals(word1,word2);

        }

        return status ;
    }

    public static void main(String[] args) {

        // Taking Inputs from User

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first word");
        String word1 = sc.nextLine();
        System.out.println("Enter the second word");
        String word2 = sc.nextLine();
        // Calling the function with with entered inputs
        Boolean status = isAnagram(word1,word2);
        System.out.println(status);
        //Printing Final Status
        if (status) {
            System.out.println(word1+" and "+word2+" are anagrams");
        }
        else{
            System.out.println(word1+" and "+word2+" are not anagrams");
        }
    }
}
