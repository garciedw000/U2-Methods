import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class SplitPs {

    /*
    Assuming a String has a P, return a String containing the first p and the next 3 letters.

    "Hippopotamus" -> ppop
     */


    /*
    1. GET INPUT - HOPEFULLY A WORD WITH A "P"
    2. ISOLATE THE "P"
    3. GET THE 3 LETTER AFTER THE "P"
    4. OUTPUT
     */
    public static void main(String[] args) {

        String word = JOptionPane.showInputDialog("Enter a word that has a P and 3 letters after the P.");

        JOptionPane.showMessageDialog(null, "Your new word is: " + splitP(word));

        System.exit(0);

    }

    public static String splitP(String word){

        int pIndex = word.indexOf('p');

        String split = word.substring(pIndex, pIndex + 4);

        return split;

    }
}
