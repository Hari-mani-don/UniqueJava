package HackerRankProblem;

import java.util.Arrays;

public class StringIntroduction {
    public static void main(String[] args) {
        String A="hello";
        String B="aello";

        char [] a=A.toCharArray();
        char [] b=B.toCharArray();
        System.out.println(A.length()+B.length());
//        System.out.println("output"+A.compareTo(B));
//        System.out.println(
//                A.substring(0,1).toUpperCase()+A.substring(1)+" "+
//                        B.substring(0,1).toUpperCase()+B.substring(1)

//        A.substring(0,1).toUpperCase().concat(A.substring(1));
//        );
        if(A.charAt(0)>B.charAt(0)){
            System.out.println("Yes");

        }else  System.out.println("No");

        a[0]= (char) (a[0]-32);
        b[0]= (char) (b[0]-32);
        int j=0;
        for (int i = 0; i <=A.length()+B.length(); i++) {
            if(i<A.length()){
                System.out.print(a[i]);
            }else if(i==A.length()) System.out.print(" ");
            else System.out.print(b[j++]);
        }
        System.out.println();
    }
}
