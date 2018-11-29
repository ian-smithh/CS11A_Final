package MadLibs;
/**
 * Returns a Christmas-themed Madlib based on user input
 * @author Ian Smith
 */
public class Christmas {
    /**
     * Stores the Madlib as a single string. Calls the method for each part of
     * speech. For each call of a method (Noun, Adjective, etc.), the string result
     * becomes the result of the call of the previous method and is passed to the
     * next method.
     * 
     * @param args Main method does not accept input from args.
     */
    public static void main(String[] args) {
        System.out.println("This is a Madlib about Christmas.");
        String xmas = "It's time to [verb] some Christmas [plural]! Some popular Christmas treats include [plural], [adjective] [plural], and [color] [plural]. First, get a big [noun] to [verb] the batter.  Next, add the ingredients and [verb] everything [adverb], and then put it in the [noun] to bake at [number] degrees for [number] minutes. Don't forget to decorate the [adjective] cookies and cupcakes with [color] [plural] and [color] [plural]!";
        String result = Noun(xmas);
        result = Adjective(result);
        result = Verb(result);
        result = Adverb(result);
        result = Plural(result);
        result = Number(result);
        result = Color(result);
        System.out.println(result);
    }

    /**
     * Returns the inputted string with the [noun] placeholders replaced with the
     * inputted part of speech.
     * 
     * @param xmas The entire Madlib.
     * @return String xmas with all instances of [noun] placeholders replaced with
     *         the user input.
     */

    public static String Noun(String xmas) {
        int count = 0;
        count = xmas.split("\\[noun\\]").length - 1;
        String output = "";
        String[] xmasNouns = new String[count];
        String[] middle = new String[xmas.length()];
        middle = xmas.split("\\[noun\\]");
        for (int i = 0; i < count; i++) {
            System.out.print("Enter a noun: ");
            xmasNouns[i] = TextIO.getlnWord();
            output += middle[i] + xmasNouns[i];
        }
        output += middle[count];
        return output;
    }

    /**
     * Returns the inputted string with the [adjective] placeholders replaced with
     * the inputted part of speech.
     * 
     * @param xmas The entire Madlib.
     * @return String xmas with all instances of [adjective] placeholders replaced
     *         with the user input.
     */
    public static String Adjective(String xmas) {
        int count = 0;
        count = xmas.split("\\[adjective\\]").length - 1;
        String output = "";
        String[] xmasAdjective = new String[count];
        String[] middle = new String[xmas.length()];
        middle = xmas.split("\\[adjective\\]");
        for (int i = 0; i < count; i++) {
            System.out.print("Enter an adjective: ");
            xmasAdjective[i] = TextIO.getlnWord();
            output += middle[i] + xmasAdjective[i];
        }
        output += middle[count];
        return output;
    }

    /**
     * Returns the inputted string with the [verb] placeholders replaced with the
     * inputted part of speech.
     * 
     * @param xmas The entire Madlib.
     * @return String xmas with all instances of [verb] placeholders replaced with
     *         the user input.
     */

    public static String Verb(String xmas) {
        int count = 0;
        count = xmas.split("\\[verb\\]").length - 1;
        String output = "";
        String[] xmasVerb = new String[count];
        String[] middle = new String[xmas.length()];
        middle = xmas.split("\\[verb\\]");
        for (int i = 0; i < count; i++) {
            System.out.print("Enter a verb: ");
            xmasVerb[i] = TextIO.getlnWord();
            output += middle[i] + xmasVerb[i];
        }
        output += middle[count];
        return output;
    }

    /**
     * Returns the inputted string with the [adverb] placeholders replaced with the
     * inputted part of speech.
     * 
     * @param xmas The entire Madlib.
     * @return String xmas with all instances of [adverb] placeholders replaced with
     *         the user input.
     */

    public static String Adverb(String xmas) {
        int count = 0;
        count = xmas.split("\\[adverb\\]").length - 1;
        String output = "";
        String[] xmasAdverb = new String[count];
        String[] middle = new String[xmas.length()];
        middle = xmas.split("\\[adverb\\]");
        for (int i = 0; i < count; i++) {
            System.out.print("Enter an adverb: ");
            xmasAdverb[i] = TextIO.getlnWord();
            output += middle[i] + xmasAdverb[i];
        }
        output += middle[count];
        return output;
    }

    /**
     * Returns the inputted string with the [plural] placeholders replaced with the
     * inputted part of speech.
     * 
     * @param xmas The entire Madlib.
     * @return String xmas with all instances of [plural] placeholders replaced with
     *         the user input.
     */

    public static String Plural(String xmas) {
        int count = 0;
        count = xmas.split("\\[plural\\]").length - 1;
        String output = "";
        String[] xmasPlural = new String[count];
        String[] middle = new String[xmas.length()];
        middle = xmas.split("\\[plural\\]");
        for (int i = 0; i < count; i++) {
            System.out.print("Enter a plural noun: ");
            xmasPlural[i] = TextIO.getlnWord();
            output += middle[i] + xmasPlural[i];
        }
        output += middle[count];
        return output;
    }

    /**
     * Returns the inputted string with the [number] placeholders replaced with the
     * inputted part of speech.
     * 
     * @param xmas The entire Madlib.
     * @return String xmas with all instances of [number] placeholders replaced with
     *         the user input.
     */

    public static String Number(String xmas) {
        int count = 0;
        count = xmas.split("\\[number\\]").length - 1;
        String output = "";
        String[] xmasNumber = new String[count];
        String[] middle = new String[xmas.length()];
        middle = xmas.split("\\[number\\]");
        for (int i = 0; i < count; i++) {
            System.out.print("Enter a number: ");
            xmasNumber[i] = TextIO.getlnWord();
            output += middle[i] + xmasNumber[i];
        }
        output += middle[count];
        return output;
    }

    /**
     * Returns the inputted string with the [color] placeholders replaced with the
     * inputted part of speech.
     * 
     * @param xmas The entire Madlib.
     * @return String xmas with all instances of [color] placeholders replaced with
     *         the user input.
     */

    public static String Color(String xmas) {
        int count = 0;
        count = xmas.split("\\[color\\]").length - 1;
        String output = "";
        String[] xmasColor = new String[count];
        String[] middle = new String[xmas.length()];
        middle = xmas.split("\\[color\\]");
        for (int i = 0; i < count; i++) {
            System.out.print("Enter a color: ");
            xmasColor[i] = TextIO.getlnWord();
            output += middle[i] + xmasColor[i];
        }
        output += middle[count];
        return output;
    }
}