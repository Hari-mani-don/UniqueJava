package Java.InterviewQuestion;

import java.util.Scanner;

public class divAndMultiple {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter array value: ");
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }

        System.out.print("div3: ");
        for (int i = 0; i < a.length; i++) {
            if(a[i]%3==0){
                if(a[i]>0){
                    System.out.print(-a[i]+" ");
                }

            }
        }
        System.out.println();
        System.out.println("div2: ");
        for (int i = 0; i < a.length; i++) {
            if(a[i]%2==0){
                System.out.print(a[i]*a[i]+" ");
            }
        }
    }
}
