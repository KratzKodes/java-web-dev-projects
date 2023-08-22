package org.launchcode;

import java.util.Scanner;

public class StringsII {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String aliceInWonderLandPhrase = "\n Alice was beginning to get very tired of sitting by her " +
                "sister on the bank,\n and of having nothing to do: once or twice she had peeped into the " +
                "book her\n sister was reading, but it had no pictures or conversations in it, ‘and\n what is " +
                "the use of a book,’ thought Alice ‘without pictures or conversation?’\n ";

        System.out.println(aliceInWonderLandPhrase);

        System.out.println("Check to see if a word is listed:");
        String userCheckedWord = input.nextLine();

        if(aliceInWonderLandPhrase.toLowerCase().contains(userCheckedWord.toLowerCase())){

            int indexOfWord = aliceInWonderLandPhrase.indexOf(userCheckedWord);
            int lengthOfWord = userCheckedWord.length();

            String updatedPhrase = aliceInWonderLandPhrase.replace(userCheckedWord,"");

            String isValidWordPhrase = String.format("The phrase does contain [%s]\nIndex: %d" +
                    "\nLength: %d characters long", userCheckedWord, indexOfWord,lengthOfWord);
            System.out.println(updatedPhrase + "\n" + isValidWordPhrase);
        }else{
            String isNotValidWordPhrase = String.format("The phrase does not contain "+ userCheckedWord);
            System.out.println(isNotValidWordPhrase);
        }
    }

}
