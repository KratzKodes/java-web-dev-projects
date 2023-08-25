import java.util.HashMap;
import java.util.Arrays;
import java.util.Scanner;

public interface CountingCharacters {
<<<<<<< HEAD
=======

    String hiddenFiguresQuote = "If the product of two terms is zero then common sense says " +
            "at least one of the two terms has to be zero to start with. So if you move all " +
            "the terms over to one side, you can put the quadratics into a form that can be " +
            "factored allowing that side of the equation to equal zero. Once you’ve done that, " +
            "it’s pretty straightforward from there.";

    char[] hiddenFiguresQuoteCharArray = hiddenFiguresQuote.toLowerCase().toCharArray();
>>>>>>> origin/main
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

<<<<<<< HEAD
        //Gather User Input
        System.out.println("Enter a phrase");

        //Convert user input to lowercase and store as an array
        String userStatement = input.nextLine().toLowerCase();
        char[] userStatementCharArray = userStatement.toCharArray();

        //Initialize a hashmap to store each character and its value
        HashMap<String,Integer> charCount = new HashMap<>();

        //Loop through each character in the array
        for (char character : userStatementCharArray) {
            //Determine if the character is alphabetic
            if (Character.isAlphabetic(character)) {
                //Convert the char to a String
                String quoteCharacter = Character.toString(character);
                //Check to see if the hashmap contains that key and update appropriately
                if (charCount.containsKey(quoteCharacter)) {
                    charCount.put(quoteCharacter, charCount.get(quoteCharacter) + 1);
                } else {
                    charCount.put(Character.toString(character), 1);
=======
        System.out.println("Enter a phrase");
        String userStatement = input.nextLine().toLowerCase();
        char[] userStatementCharArray = userStatement.toCharArray();

        HashMap<String,Integer> charCount = new HashMap<>();

        for(int i = 0; i<userStatementCharArray.length;i++){
            if(Character.isAlphabetic(userStatementCharArray[i])){
                String quoteCharacter = Character.toString(userStatementCharArray[i]);
                if(charCount.containsKey(quoteCharacter)){
                    charCount.get(quoteCharacter);
                    charCount.put(quoteCharacter,charCount.get(quoteCharacter)+1);
                }else{
                    charCount.put(Character.toString(userStatementCharArray[i]),1);
>>>>>>> origin/main
                }
            }
        }
        input.close();
        System.out.println(charCount);

    }
}
