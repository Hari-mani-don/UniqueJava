package HackerRankProblem;
import java.util.Scanner;

public class Anagram {

    static boolean isAnagram(String a, String b) {
        char[] c =a.toCharArray();
        char[] d =b.toCharArray();

        // Complete the function
        for(int i=0;i<a.length();i++){
            int first=0;
            int second=0;
            for(int j=0;j<a.length();j++){
                if(c[i]==c[j] ){
                    c[j]=0;
                    System.out.print(c[j]);
                    first++;
                }
            }
            for (int k = 0; k < b.length(); k++) {

                if(c[i]==d[k] ){
                    d[k]=0;
                    System.out.print(d[k]);
                    second++;
                }
            }
            if(first!=second){
                System.out.println("hai hari");
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
