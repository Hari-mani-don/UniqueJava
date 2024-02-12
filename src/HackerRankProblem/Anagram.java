package HackerRankProblem;
import java.util.Scanner;

public class Anagram {

    static boolean isAnagram(String a, String b) {
        char[] c = a.toCharArray();
        char[] d = b.toCharArray();

        // Complete the function
        if (a.length() == b.length()) {
            for (int i = 0; i < a.length(); i++) {
                int first = 1;
                int second = 0;
                for (int j = i+1; j < a.length(); j++) {
                    if (c[i] == c[j] && c[i]!=0  && c[j]!=0) {
                        c[j] = 0;
                        first++;
                    }
                }  //for j close
                for (int k = 0; k < b.length(); k++) {

                    if (c[i] == d[k] && c[i]!=0 && d[k]!=0) {
                        d[k] = 0;
                        second++;
                    }
                } //for k close
                if (first != second ) {
                    return false;
                }

            }  // first for i close

        } //if close
        else{
            return false;
        }
        return true;

    } //anagram method close

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
