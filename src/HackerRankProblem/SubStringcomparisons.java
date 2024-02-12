package HackerRankProblem;

public class SubStringcomparisons {
    public static void main(String[] args) {
        String name ="welcomAetojava"; //13  10+2 12

        String[] comapareValue= new String[1000];
        int plus=0;
        for (int i = 'a'; i <= 'z'; i++) {
            for (int j = 0; j < name.length(); j++) {

                if(name.charAt(j)==i){
                    if(j+2<name.length()){
                    comapareValue[plus++]=  name.substring(j,j+3);
                    }
                }
            }

        }

        //caps
        for (int i = 'A'; i <= 'Z'; i++) {
            for (int j = 0; j < name.length(); j++) {

                if(name.charAt(j)==i){
                    if(j+2<name.length()){
                        comapareValue[plus++]=  name.substring(j,j+3);
                    }
                }
            }

        }
        System.out.println(comapareValue[0]);
        for (int i = 0; i <comapareValue.length; i++) {
            if(comapareValue[i]==null){
                System.out.println(comapareValue[i-1]);
                break;
            }

        }
    }
}
