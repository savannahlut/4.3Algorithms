import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Algorithms {
    private static File f;
    private static Scanner s;
    public static void main(String[] args) throws FileNotFoundException {
        f = new File("words.txt");
        int twoLetters = twoLetters();
        String longest = longest();
        int palindromes = palindromes(); 
        System.out.println("Words with two letters: " + twoLetters);
        System.out.println("Longest Word: " + longest);
        System.out.println("Number of Palindromes: " + palindromes);
        s.close();
    }

    public static int twoLetters() throws FileNotFoundException{
        s = new Scanner(f);
        int twoLetter = 0;
        while (s.hasNext()) {
            if (s.nextLine().length() == 2)
                twoLetter++;
        }
        return twoLetter;
    }

    public static String longest() throws FileNotFoundException{
        s = new Scanner(f);
        String longest = "" ;
        while (s.hasNext()) {
            if (s.nextLine().length() >= longest.length())
            longest = s.nextLine();
        }
        return longest;
    }

    public static int palindromes() throws FileNotFoundException{
        s = new Scanner(f);
        int palindromes = 0;
        while (s.hasNext()) {
            String backwards = "" ;
            if (s.nextLine().equals(backwards))
            palindromes++ ;
        }
        return palindromes;
    }
}