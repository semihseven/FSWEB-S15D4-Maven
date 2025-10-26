package org.example;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        System.out.println(Main.checkForPalindrome("I did, did I?"));
//        System.out.println(Main.checkForPalindrome("hello"));
//        System.out.println(Main.checkForPalindrome("Was it a car or a cat I saw ?"));

        System.out.println(Main.convertDecimalToBinary(5));
        System.out.println("*******************");
        System.out.println(Main.convertDecimalToBinary(6));
        System.out.println("*******************");
        System.out.println(Main.convertDecimalToBinary(13));
        System.out.println("*******************");

    }

    public static boolean checkForPalindrome (String sentence) {
        String trimmedSentence = sentence.replaceAll("[\\p{Punct}\\s]+","").toLowerCase();
        String englishSentence = trimmedSentence.replaceAll("ı","i");

        List<Character> characterList = new ArrayList<>();
        for(char chr:englishSentence.toCharArray()) {
            characterList.add(chr);
        }
        System.out.println(characterList);
        for(int i=0;i<characterList.size();i++) {
            if(characterList.get(i) != characterList.get(characterList.size()-1-i)) {
                return false;
            }
        }
        return true;
    }

    public static String convertDecimalToBinary(int num) {
        String result="";

        ArrayList<Integer> numberList = new ArrayList<>();

        while(num>0) {
            numberList.add(num%2);
            num /= 2;
            System.out.println(numberList);
        }
        Collections.reverse(numberList);
        System.out.println(numberList);

        for(int numChar : numberList) {
            result += Integer.toString(numChar);
        }

        System.out.println(result);


        return result;
    }

//    public String toString(ArrayList<Integer> numbers){
//        String word;
//
//        for(int)
//    }

}