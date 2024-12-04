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
        int fourteen = numOfLetters(14);
        int fifteen = numOfLetters(15);
        int palindromes = palindromes(); 
        System.out.println("Words with two letters: " + twoLetters);
        System.out.println("Longest Word: " + longest);
        System.out.println("Number of 14 letter words: " + fourteen);
        System.out.println("Number of 15 letter words: " + fifteen);
        System.out.println("Number of Palindromes: " + palindromes);
        s.close();
    }

    public static int twoLetters() throws FileNotFoundException{
        s = new Scanner(f);
        int twoLetter = 0;
        while (s.hasNext()) {
            String word = s.nextLine();
            if (word.length() == 2)
                {
                    twoLetter++;
                    // Test: System.out.println(word);
                }
        }
        return twoLetter;
    }

    public static String longest() throws FileNotFoundException{
        s = new Scanner(f);
        String longest = "" ;
        while (s.hasNext()) {
            String word = s.nextLine();
            if (word.length() >= longest.length())
            longest = word;
        }
        return longest;
    }

    public static int numOfLetters(int length) throws FileNotFoundException{
        s = new Scanner(f);
        int num = 0;
        while (s.hasNext()) {
            String word = s.nextLine();
            if (word.length() == length)
            {
             num++;
             // Test: System.out.println(word);
            }
        }
        return num;
    }

    public static int palindromes() throws FileNotFoundException{
        s = new Scanner(f);
        int palindromes = 0;
        while (s.hasNext()) {
            String og = s.nextLine() ;
            String backwards = "" ;
            for (int i = og.length() - 1; i >= 0; i--) {
                backwards += og.substring(i, i + 1);
            }
            if (og.equals(backwards))
            {
                palindromes++ ;
                // Test: System.out.println(og);
            }
        }
        return palindromes;
    }
}