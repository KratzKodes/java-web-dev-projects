import java.util.HashMap;
import java.util.Arrays;
import java.util.Scanner;

public interface CountingCharacters {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Gather User Input
        System.out.println("Enter a phrase");

        //Convert user input to lowercase and store as an array
        String userStatement = input.nextLine().toLowerCase();
        char[] userStatementCharArray = userStatement.toCharArray();

        //Initialize a hashmap to store each character and its value
        HashMap<String,Integer> charCount = new HashMap<>();

        //Loop through each character in the array
        for(int i = 0; i<userStatementCharArray.length;i++){
            //Determine if the character is alphabetic
            if(Character.isAlphabetic(userStatementCharArray[i])){
                //Convert the char to a String
                String quoteCharacter = Character.toString(userStatementCharArray[i]);
                //Check to see if the hashmap contains that key and update appropriately
                if(charCount.containsKey(quoteCharacter)){
                    charCount.put(quoteCharacter,charCount.get(quoteCharacter)+1);
                }else{
                    charCount.put(Character.toString(userStatementCharArray[i]),1);
                }
            }
        }
        input.close();
        System.out.println(charCount);

    }
}