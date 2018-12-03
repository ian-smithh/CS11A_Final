/**
 * Introduces the user to the program and calls the MadLibs method.
 */
public class main{
    /**
     * Main introduces the program to the user and runs a loop to continue running the MadLibs class until the user stops giving consent
     * @param args Main does not accept input from args
     */
    public static void main(String[] args) {
        System.out.println("Pray to RNJesus for a good roll!");
        MadLibs.main(args);
        boolean consent = true;
        while(consent){
            System.out.println("Another?");
            consent = TextIO.getBoolean();
            MadLibs.main(args);
        }
    }
}