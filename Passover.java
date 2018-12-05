/**
* Returns a Passover-themed Madlib based on user input.
*
* @author Sarah Fielman
*/
public class Passover {
  /**
  * Stores the Madlib as a single string. Calls the method for each part of
  * speech. For each call of a method (Noun, Adjective, etc.), the string result
  * becomes the result of the call of the previous method and is passed to the
  * next method.
  *
  * @param args Main method does not accept input from args.
  */
  public static void main(String[] args) {
    System.out.println("This is a Madlib about Passover.");
    String passover = "Every year we celebrate Passover to remeber when our ancesters were \n[occupation] and how they [verb, past tense] for freedom. \nMoses came to Pharaoh and said, 'Let my people [verb]!' but the Pharaoh refused. \nThis made G-d [adjective], so he unleased [number] plauges to change the Pharaoh's [noun]. \nFirst, he turned all the water into [liquid]. That did not work. So G-d tried other plauges like [Plural], \nstorms, and darkness. [number] plagues later, the Pharaoh still wouldn't let the [Plural] go. \nThen came the [adjective] plague: one morning all the [adjective] Egyptian children suddenly died. \nThe Pharaoh finally gave up and agreed to [verb] the Jews.\n";
    String result = Occupation(passover); // 1
    result = PastTenseVerb(result); // 1
    result = Verb(result); // 2
    result = Adjective(result); // 3
    result = Number(result); // 2
    result = Noun(result); // 1
    result = Plural(result); // 2
    result = Liquid(result); // 1
    System.out.print(result);
  }

  /**
  * Returns the inputted string with the [occupation] placeholders replaced with
  * the inputted part of speech.
  *
  * @param passover The entire Madlib.
  * @return String passover with all instances of [occupation] placeholders
  *         replaced with the user input.
  */
  public static String Occupation(String passover) {
    int count = 0;
    count = passover.split("\\[occupation\\]").length - 1;
    String output = "";
    String[] passoveroccupation = new String[count];
    String[] middle = new String[passover.length()];
    middle = passover.split("\\[occupation\\]");
    for (int i = 0; i < count; i++) {
      System.out.print("Enter an occupation: ");
      passoveroccupation[i] = TextIO.getlnWord();
      output += middle[i] + passoveroccupation[i];
    }
    output += middle[count];
    return output;
  }

  /**
  * Returns the inputted string with the [verb, past tense] placeholders replaced
  * with the inputted part of speech.
  *
  * @param passover The entire Madlib.
  * @return String passover with all instances of [verb, past tense] placeholders
  *         replaced with the user input.
  */
  public static String PastTenseVerb(String passover) {
    int count = 0;
    count = passover.split("\\[verb, past tense\\]").length - 1;
    String output = "";
    String[] passoverPastTenseVerb = new String[count];
    String[] middle = new String[passover.length()];
    middle = passover.split("\\[verb, past tense\\]");
    for (int i = 0; i < count; i++) {
      System.out.print("Enter a Past Tense Verb: ");
      passoverPastTenseVerb[i] = TextIO.getlnWord();
      output += middle[i] + passoverPastTenseVerb[i];
    }
    output += middle[count];
    return output;
  }

  /**
  * Returns the inputted string with the [verb] placeholders replaced with the
  * inputted part of speech.
  *
  * @param passover The entire Madlib.
  * @return String passover with all instances of [verb] placeholders replaced
  *         with the user input.
  */
  public static String Verb(String passover) {
    int count = 0;
    count = passover.split("\\[verb\\]").length - 1;
    String output = "";
    String[] passoververb = new String[count];
    String[] middle = new String[passover.length()];
    middle = passover.split("\\[verb\\]");
    for (int i = 0; i < count; i++) {
      System.out.print("Enter a verb: ");
      passoververb[i] = TextIO.getlnWord();
      output += middle[i] + passoververb[i];
    }
    output += middle[count];
    return output;
  }

  /**
  * Returns the inputted string with the [adjective] placeholders replaced with
  * the inputted part of speech.
  *
  * @param passover The entire Madlib.
  * @return String passover with all instances of [adjective] placeholders
  *         replaced with the user input.
  */
  public static String Adjective(String passover) {
    int count = 0;
    count = passover.split("\\[adjective\\]").length - 1;
    String output = "";
    String[] passoveradjective = new String[count];
    String[] middle = new String[passover.length()];
    middle = passover.split("\\[adjective\\]");
    for (int i = 0; i < count; i++) {
      System.out.print("Enter an adjective: ");
      passoveradjective[i] = TextIO.getlnWord();
      output += middle[i] + passoveradjective[i];
    }
    output += middle[count];
    return output;
  }

  /**
  * Returns the inputted string with the [number] placeholders replaced with the
  * inputted part of speech.
  *
  * @param passover The entire Madlib.
  * @return String passover with all instances of [number] placeholders replaced
  *         with the user input.
  */
  public static String Number(String passover) {
    int count = 0;
    count = passover.split("\\[number\\]").length - 1;
    String output = "";
    String[] passovernumber = new String[count];
    String[] middle = new String[passover.length()];
    middle = passover.split("\\[number\\]");
    for (int i = 0; i < count; i++) {
      System.out.print("Enter a number: ");
      passovernumber[i] = TextIO.getlnWord();
      output += middle[i] + passovernumber[i];
    }
    output += middle[count];
    return output;
  }

  /**
  * Returns the inputted string with the [noun] placeholders replaced with the
  * inputted part of speech.
  *
  * @param passover The entire Madlib.
  * @return String passover with all instances of [noun] placeholders replaced
  *         with the user input.
  */
  public static String Noun(String passover) {
    int count = 0;
    count = passover.split("\\[noun\\]").length - 1;
    String output = "";
    String[] passovernouns = new String[count];
    String[] middle = new String[passover.length()];
    middle = passover.split("\\[noun\\]");
    for (int i = 0; i < count; i++) {
      System.out.print("Enter a noun: ");
      passovernouns[i] = TextIO.getlnWord();
      output += middle[i] + passovernouns[i];
    }
    output += middle[count];
    return output;
  }

  /**
  * Returns the inputted string with the [plural] placeholders replaced with
  * the inputted part of speech.
  *
  * @param passover The entire Madlib.
  * @return String passover with all instances of [plural] placeholders
  *         replaced with the user input.
  */
  public static String Plural(String passover) {
    int count = 0;
    count = passover.split("\\[Plural\\]").length - 1;
    String output = "";
    String[] passoverplural = new String[count];
    String[] middle = new String[passover.length()];
    middle = passover.split("\\[Plural\\]");
    for (int i = 0; i < count; i++) {
      System.out.print("Enter a plural noun: ");
      passoverplural[i] = TextIO.getlnWord();
      output += middle[i] + passoverplural[i];
    }
    output += middle[count];
    return output;
  }
  /**
  * Returns the inputted string with the [liquid] placeholders replaced with the
  * inputted part of speech.
  *
  * @param passover The entire Madlib.
  * @return String passover with all instances of [liquid] placeholders replaced with the
  *         user input.
  */
  public static String Liquid(String passover) {
    int count = 0;
    count = passover.split("\\[liquid\\]").length - 1;
    String output = "";
    String[] passoverliquid = new String[count];
    String[] middle = new String[passover.length()];
    middle = passover.split("\\[liquid\\]");
    for (int i = 0; i < count; i++) {
      System.out.print("Enter a liquid: ");
      passoverliquid[i] = TextIO.getlnWord();
      output += middle[i] + passoverliquid[i];
    }
    output += middle[count];
    return output;
  }
}
