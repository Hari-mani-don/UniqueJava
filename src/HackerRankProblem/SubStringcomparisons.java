package HackerRankProblem;

import java.util.Arrays;

public class SubStringcomparisons {
    public static void main(String[] args) {
        String s ="fsdfsDLJFSJGIHEKHIPEINNNFIGHKkjgksfgjrotyotoyjtkjkLJOIOEHEKHKKDJGKFGJkfjhglfhjtrhkjfkhjnfglhkjflgjhtrljhfljhfgljhfgljhfgljhtrklyjhtrkjhfgkljhfgjhfljhtrljlfjhfgljhfglkjhflyjtljtrlyjhtryjtrtykhrktherktjhtrkyjhkujhtykhtryhrthHKLJHLHRLHTLRHLKHTRLKHLHRLHLKHLKHKLHLKHLHKLHKHJKHKJHKJHJKHKHJKHKHHLHLHLHKHKJHKJKKHKHKHKHKHHKHKHKHKHkhktryhtlhtklhtrkyhtrkyhtrkjyhtrkyhrekthtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkhtrkyhtrkrtkyhtrklyhjrOEOHKDHFksdhfklHLHKHLHKKJHJHKGKLHLHJLJHLHLHLHLHHLHLHLHH"; //13  10+2 12
       int k=100;
        String[] comapareValue= new String[1000];
        int plus=0;
        //caps
        for (int i = 'A'; i <= 'Z'; i++) {
            for (int j = 0; j < s.length(); j++) {

                if(s.charAt(j)==i){
                    if(j+k-1<s.length()){
                        comapareValue[plus]=  s.substring(j,j+k);
                        plus++;
                    }
                }
            }

        }
        //small
        for (int i = 'a'; i <= 'z'; i++) {
            for (int j = 0; j < s.length(); j++) {

                if(s.charAt(j)==i){
                    if(j+k-1<s.length()){
                    comapareValue[plus] =  s.substring(j,j+k);
                        plus++;
                    }
                }
            }

        }
        int j=0;
        for (int i = 0; i <1; i++) {
            for (int l = i+1; l < comapareValue.length; l++) {
                if(comapareValue[i].compareTo(comapareValue[j])<0){
                    j=l;
                }
            }

        }
        System.out.println(comapareValue[j]);


        System.out.println(comapareValue[0]);
        System.out.println();
        for (int i =1000-1; i >=0; i--) {
           if(comapareValue[i]!=null){
               System.out.println(comapareValue[i]);
//               System.out.println(i+1);
               break;
           }

        }

    }
}
