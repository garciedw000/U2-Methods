import javax.swing.*;

public class LastLetterWord {

    /*
    Create a program that takes the last 3 letters of each String
    and outputs them as one string.

    Use a method to find and return the last three letters and a string parameter.

    Ex:  Goodbye, Hello, Morning -> byelloing
    */


    /*
    1. GET INPUT, 3 WORDS AS INPUT.
    2. ISOLATE THE LAST 3 LETTERS OF ANY WORD.
    3/ COMBINE LAST 3 LETTERS OF ALL 3 WORDS.

     */

    public static void main(String[] args) {

       String word1 = JOptionPane.showInputDialog("Enter 1st word: ");
       String word2= JOptionPane.showInputDialog("Enter 2nd word: ");
       String word3 = JOptionPane.showInputDialog("Enter 3rd word: ");

       String output = lastThree(word1) + lastThree(word2) + lastThree(word3);

       JOptionPane.showMessageDialog(null, "Your new word is: " + output);
    }

    public static String lastThree(String word){

        String newWord;
        if (word.length() <=3){
            newWord = word;
        } else {
            newWord = word.substring(word.length()-3);
        }

        return newWord;

    }

}
