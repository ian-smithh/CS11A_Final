/**
 * Introduces the user to the program and calls the MadLibs method.
 */
public class main {
    /**
     * Main introduces the program to the user and runs a loop to continue running
     * the MadLibs class until the user stops giving consent
     * 
     * @param args Main does not accept input from args
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Mad Libs!");
        System.out.println(
                "A mad lib will be randomly generated, and you will be prompted to enter the appropriate parts of speech.");
        System.out.println("After completing all of it, the entire mad lib with your inputs will be shown.");
        System.out.println(
                "The possible Mad Lib themes are: Christmas, Halloween, Hanukkah, July 4th, New Years, Passover, Thanksgiving, and Valentine's Day.");
        MadLibs.main(args);
        boolean consent = true;
        while (consent) {
            System.out.print("Another? (Yes or no)");
            consent = TextIO.getBoolean();
            if (consent == false) {
                break;
            }
            MadLibs.main(args);
        }
    }
}
