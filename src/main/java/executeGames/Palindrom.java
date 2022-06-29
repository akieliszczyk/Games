package executeGames;

import java.sql.SQLOutput;



public class Palindrom {

    public static void main(String[] args) {

        String text = "Ala";

        String text2 = text.toLowerCase();
        System.out.println(text2);
        String reverse = "";

        for(int i = text2.length() - 1; i>=0; i--) {
            reverse = reverse + text2.charAt(i);
        }

        System.out.println(text2.equals(reverse));





    }
}
