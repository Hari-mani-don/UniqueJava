package HackerRankProblem;

import java.util.Arrays;

public class StringIntroduction {
    public static void main(String[] args) {
        String name1="hello";
        String name2="java";

        char [] a=name1.toCharArray();
        char [] b=name2.toCharArray();
        System.out.println(name1.length()+name2.length());
        if(name1.charAt(0)>name2.charAt(0)){
            System.out.println("Yes");

        }else  System.out.println("No");

        a[0]= (char) (a[0]-32);
        b[0]= (char) (b[0]-32);
        int j=0;
        for (int i = 0; i <=name1.length()+name2.length(); i++) {
            if(i<name1.length()){
                System.out.print(a[i]);
            }else if(i==name1.length()) System.out.print(" ");
            else System.out.print(b[j++]);
        }
        System.out.println();
    }
}
