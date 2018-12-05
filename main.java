/**
 * Introduces the user to the program and calls the MadLibs method.
 */
public class main{
    /**
     * Main introduces the program to the user and runs a loop to continue running the MadLibs class until the user stops giving consent
     * @param args Main does not accept input from args
     */
    public static void main(String[] args) {
        System.out.println("Welcome to Mad Libs!");
        System.out.println("A mad lib will be generated, and you will be prompted to enter the appropriate parts of speech.");
        System.out.println("After completing all of it, the entire mad lib with your inputs will be shown.");
        MadLibs.main(args);
        boolean consent = true;
        while(consent){
            System.out.print("Another? (Yes or no)");
            consent = TextIO.getBoolean();
            MadLibs.main(args);
        }
    }
}
