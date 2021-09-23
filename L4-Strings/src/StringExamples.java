import java.util.Locale;

public class StringExamples {

    public static void main(String[] args) {

        String name = "hephaestus";
        String greeting = "Hello";

        int stringSize = name.length();


        //STYLE 1
        System.out.println(name + " has " + stringSize + " letters");

        //STYLE 2
        System.out.println(name + " has " + name.length() + " letters");


        System.out.println(greeting + " has " + greeting.length() + " letters");


        //CREATE A PROGRAM THAT CAPITALIZES THE FIRST LETTER OF A NAME.

        //ATTEMPT 1
        //PLAN
        // 1. GET INPUT
        // 2. ISOLATE THE FIRST LETTER
        // 3. CAPITALIZE THE FIRST LETTER
        // 4. ISOLATE THE REST OF THE LETTERS
        // 5. PUT THEM TOGETHER(3-4)
        // 6. DISPLAY RESULTS

        System.out.println(capFirst(name));

    }

    public static String capFirst(String name){

        String letter = name.substring(0, 1);
        letter = letter.toUpperCase();

        return letter + name.substring(1);

    }


}
