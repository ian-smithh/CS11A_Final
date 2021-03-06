/**
 * Returns a Thanksgiving-themed Madlib based on user input.
 * 
 * @author Sarah Fielman
 */
public class Thanksgiving {
  /**
  * Stores the Madlib as a single string. Calls the method for each part of
  * speech. For each call of a method (Noun, Adjective, etc.), the string result
  * becomes the result of the call of the previous method and is passed to the
  * next method.
  *
  * @param args Main method does not accept input from args.
  */
  public static void main(String[] args) {
    System.out.println("This is a Madlib about Thanksgiving.");
    String tg = "The first Thanksgiving was held in [year] when the pilgrims and \nIndians came together for [adjective] meal to celebrate their first \n[nouns] in America. It was [adjective]! The Indians \nbrought [food] to the festivities, and the pilgrims \n[verb, past tense] [Plural] for everyone. The feast lasted for [number] days! \nIn [year], President [famous person] declared the 4th Thursday of \n[month] as a day of [Plural] and [Plural] and called it Thanksgiving. \nModern Thanksgiving celebrating usually include cooking a large \n[nouns] with stuffing and [nouns] sauce, eating [nouns] \npie, and watching [nouns] games on television. My favorite thing \nabout Thanksgiving is the [adjective] [food] -- what about you?\n";
    String result = Noun(tg); // 5
    result = Adjective(result); // 3
    result = Plural(result); // 3
    result = Year(result); // 2
    result = Famous(result); // 1
    result = PastTenseVerb(result); // 1
    result = Food(result); // 2
    result = Number(result); // 1
    result = Month(result); // 1
    System.out.println(result);
  }
  /**
  * Returns the inputted string with the [noun] placeholders replaced with
  * the inputted part of speech.
  *
  * @param tg The entire Madlib.
  * @return String tg with all instances of [noun] placeholders
  *         replaced with the user input.
  */
  public static String Noun(String tg) {
    int count = 0;
    count = tg.split("\\[nouns\\]").length - 1;
    String output = "";
    String[] tgnouns = new String[count];
    String[] middle = new String[tg.length()];
    middle = tg.split("\\[nouns\\]");
    for (int i = 0; i < count; i++) {
      System.out.print("Enter a noun: ");
      tgnouns[i] = TextIO.getlnWord();
      output += middle[i] + tgnouns[i];
    }
    output += middle[count];
    return output;
  }
  /**
  * Returns the inputted string with the [adjective] placeholders replaced with
  * the inputted part of speech.
  *
  * @param tg The entire Madlib.
  * @return String tg with all instances of [adjective] placeholders
  *         replaced with the user input.
  */
  public static String Adjective(String tg) {
    int count = 0;
    count = tg.split("\\[adjective\\]").length - 1;
    String output = "";
    String[] tgadjective = new String[count];
    String[] middle = new String[tg.length()];
    middle = tg.split("\\[adjective\\]");
    for (int i = 0; i < count; i++) {
      System.out.print("Enter a adjective: ");
      tgadjective[i] = TextIO.getlnWord();
      output += middle[i] + tgadjective[i];
    }
    output += middle[count]; // This doesn't work
    return output;
  }
  /**
  * Returns the inputted string with the [plural] placeholders replaced with
  * the inputted part of speech.
  *
  * @param tg The entire Madlib.
  * @return String tg with all instances of [plural] placeholders
  *         replaced with the user input.
  */
  public static String Plural(String tg) {
    int count = 0;
    count = tg.split("\\[Plural\\]").length - 1;
    String output = "";
    String[] tgplural = new String[count];
    String[] middle = new String[tg.length()];
    middle = tg.split("\\[Plural\\]");
    for (int i = 0; i < count; i++) {
      System.out.print("Enter a plural noun: ");
      tgplural[i] = TextIO.getlnWord();
      output += middle[i] + tgplural[i];
    }
    output += middle[count];
    return output;
  }
  /**
  * Returns the inputted string with the [year] placeholders replaced with
  * the inputted part of speech.
  *
  * @param tg The entire Madlib.
  * @return String tg with all instances of [year] placeholders
  *         replaced with the user input.
  */
  public static String Year(String tg) {
    int count = 0;
    count = tg.split("\\[year\\]").length - 1;
    String output = "";
    String[] tgyear = new String[count];
    String[] middle = new String[tg.length()];
    middle = tg.split("\\[year\\]");
    for (int i = 0; i < count; i++) {
      System.out.print("Enter a year: ");
      tgyear[i] = TextIO.getlnWord();
      output += middle[i] + tgyear[i];
    }
    output += middle[count];
    return output;
  }
  /**
  * Returns the inputted string with the [famous person] placeholders replaced with
  * the inputted part of speech.
  *
  * @param tg The entire Madlib.
  * @return String tg with all instances of [famous person] placeholders
  *         replaced with the user input.
  */

  public static String Famous(String tg) {
    int count = 0;
    count = tg.split("\\[famous person\\]").length - 1;
    String output = "";
    String[] tgfamous = new String[count];
    String[] middle = new String[tg.length()];
    middle = tg.split("\\[famous person\\]");
    for (int i = 0; i < count; i++) {
      System.out.print("Enter a famous person: ");
      tgfamous[i] = TextIO.getlnWord();
      output += middle[i] + tgfamous[i];
    }
    output += middle[count];
    return output;
  }
  /**
  * Returns the inputted string with the [verb, past tense] placeholders replaced with
  * the inputted part of speech.
  *
  * @param tg The entire Madlib.
  * @return String tg with all instances of [verb, past tense] placeholders
  *         replaced with the user input.
  */

  public static String PastTenseVerb(String tg) {
    int count = 0;
    count = tg.split("\\[verb, past tense\\]").length - 1;
    String output = "";
    String[] tgPastTenseVerb = new String[count];
    String[] middle = new String[tg.length()];
    middle = tg.split("\\[verb, past tense\\]");
    for (int i = 0; i < count; i++) {
      System.out.print("Enter a Past Tense Verb: ");
      tgPastTenseVerb[i] = TextIO.getlnWord();
      output += middle[i] + tgPastTenseVerb[i];
    }
    output += middle[count];
    return output;
  }
  /**
  * Returns the inputted string with the [food] placeholders replaced with
  * the inputted part of speech.
  *
  * @param tg The entire Madlib.
  * @return String tg with all instances of [food] placeholders
  *         replaced with the user input.
  */

  public static String Food(String tg) {
    int count = 0;
    count = tg.split("\\[food\\]").length - 1;
    String output = "";
    String[] tgfood = new String[count];
    String[] middle = new String[tg.length()];
    middle = tg.split("\\[food\\]");
    for (int i = 0; i < count; i++) {
      System.out.print("Enter a food: ");
      tgfood[i] = TextIO.getlnWord();
      output += middle[i] + tgfood[i];
    }
    output += middle[count];
    return output;
  }
  /**
  * Returns the inputted string with the [number] placeholders replaced with
  * the inputted part of speech.
  *
  * @param tg The entire Madlib.
  * @return String tg with all instances of [number] placeholders
  *         replaced with the user input.
  */

  public static String Number(String tg) {
    int count = 0;
    count = tg.split("\\[number\\]").length - 1;
    String output = "";
    String[] tgnumber = new String[count];
    String[] middle = new String[tg.length()];
    middle = tg.split("\\[number\\]");
    for (int i = 0; i < count; i++) {
      System.out.print("Enter a number: ");
      tgnumber[i] = TextIO.getlnWord();
      output += middle[i] + tgnumber[i];
    }
    output += middle[count];
    return output;
  }
  /**
  * Returns the inputted string with the [month] placeholders replaced with
  * the inputted part of speech.
  *
  * @param tg The entire Madlib.
  * @return String tg with all instances of [month] placeholders
  *         replaced with the user input.
  */

  public static String Month(String tg) {
    int count = 0;
    count = tg.split("\\[month\\]").length - 1;
    String output = "";
    String[] tgmonth = new String[count];
    String[] middle = new String[tg.length()];
    middle = tg.split("\\[month\\]");
    for (int i = 0; i < count; i++) {
      System.out.print("Enter a month: ");
      tgmonth[i] = TextIO.getlnWord();
      output += middle[i] + tgmonth[i];
    }
    output += middle[count];
    return output;
  }
}