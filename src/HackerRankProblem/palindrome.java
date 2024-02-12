package HackerRankProblem;

public class palindrome {
    public static void main(String[] args) {
        String name ="hari";
        StringBuffer b = new StringBuffer(name);
        String word = String.valueOf(b.reverse());
        if(word.equals(name))
            System.out.println("Yes");
        else System.out.println("No");
        System.out.println(word);

    }
}
