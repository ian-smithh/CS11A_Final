/**
 * Returns a Passover-themed Madlib based on user input.
 *
 * @author Nick Simonetti
 */
public class Hanukkah {
  /**
   * Stores the Madlib as a single string. Calls the method for each part of
   * speech. For each call of a method (Noun, Adjective, etc.), the string result
   * becomes the result of the call of the previous method and is passed to the
   * next method.
   *
   * @param args Main method does not accept input from args.
   */
  public static void main(String[] args) {
    System.out.println("This is a madlib about Hanukkah.");
    String hk = "What is the secret to making [adjective] latkes?\nFollow this [adjective] recipe to find out!\nPeel and [adverb] grate the potatoes.\nTransfer them into cold water, then allow them to [verb] until they are [adjective].\nIn a medium-sized [noun], stir the potatoes, onions, [plural], and [noun] together.\nPour some [liquid] into a large skillet over high heat.\nMake sure it's good and [adjective] before you add the potatoes because you don't want them to [verb] while cooking.\nPress down on them to form a/an [noun] about 1/2 an inch thick. Cook them until one side is [color] and then flip them over. Finally, let them drain on paper [plural] until and serve [adjective]!";
    String result = adjective(hk);
    result = adverb(result);
    result = verb(result);
    result = noun(result);
    result = plural(result);
    result = liquid(result);
    result = color(result);
    System.out.println(result);
  }

  /**
   * Returns the inputted string with the [noun] placeholders replaced with the
   * inputted part of speech.
   *
   * @param hk The entire Madlib.
   * @return String hk with all instances of [noun] placeholders replaced with the
   *         user input.
   */
  public static String noun(String hk) {
    int count = 0;
    count = hk.split("\\[noun\\]").length - 1;
    String output = "";
    String[] hknouns = new String[count];
    String[] middle = new String[hk.length()];
    middle = hk.split("\\[noun\\]");
    for (int i = 0; i < count; i++) {
      System.out.print("Enter a noun: ");
      hknouns[i] = TextIO.getlnWord();
      output += middle[i] + hknouns[i];
    }
    output += middle[count];
    return output;
  }

  /**
   * Returns the inputted string with the [adjective] placeholders replaced with
   * the inputted part of speech.
   *
   * @param hk The entire Madlib.
   * @return String hk with all instances of [adjective] placeholders replaced
   *         with the user input.
   */
  public static String adjective(String hk) {
    int count = 0;
    count = hk.split("\\[adjective\\]").length - 1;
    String output = "";
    String[] hkadjectives = new String[count];
    String[] middle = new String[hk.length()];
    middle = hk.split("\\[adjective\\]");
    for (int i = 0; i < count; i++) {
      System.out.print("Enter an adjective: ");
      hkadjectives[i] = TextIO.getlnWord();
      output += middle[i] + hkadjectives[i];
    }
    output += middle[count];
    return output;
  }

  /**
   * Returns the inputted string with the [adverb] placeholders replaced with the
   * inputted part of speech.
   *
   * @param hk The entire Madlib.
   * @return String hk with all instances of [adverb] placeholders replaced with
   *         the user input.
   */
  public static String adverb(String hk) {
    int count = 0;
    count = hk.split("\\[adverb\\]").length - 1;
    String output = "";
    String[] hkadverbs = new String[count];
    String[] middle = new String[hk.length()];
    middle = hk.split("\\[adverb\\]");
    for (int i = 0; i < count; i++) {
      System.out.print("Enter an adverb: ");
      hkadverbs[i] = TextIO.getlnWord();
      output += middle[i] + hkadverbs[i];
    }
    output += middle[count];
    return output;
  }

  /**
   * Returns the inputted string with the [verb] placeholders replaced with the
   * inputted part of speech.
   *
   * @param hk The entire Madlib.
   * @return String hk with all instances of [verb] placeholders replaced with the
   *         user input.
   */
  public static String verb(String hk) {
    int count = 0;
    count = hk.split("\\[verb\\]").length - 1;
    String output = "";
    String[] hkverbs = new String[count];
    String[] middle = new String[hk.length()];
    middle = hk.split("\\[verb\\]");
    for (int i = 0; i < count; i++) {
      System.out.print("Enter a verb: ");
      hkverbs[i] = TextIO.getlnWord();
      output += middle[i] + hkverbs[i];
    }
    output += middle[count];
    return output;
  }

  /**
   * Returns the inputted string with the [plural] placeholders replaced with the
   * inputted part of speech.
   *
   * @param hk The entire Madlib.
   * @return String hk with all instances of [plural] placeholders replaced with
   *         the user input.
   */
  public static String plural(String hk) {
    int count = 0;
    count = hk.split("\\[plural\\]").length - 1;
    String output = "";
    String[] hkplurals = new String[count];
    String[] middle = new String[hk.length()];
    middle = hk.split("\\[plural\\]");
    for (int i = 0; i < count; i++) {
      System.out.print("Enter a plural noun: ");
      hkplurals[i] = TextIO.getlnWord();
      output += middle[i] + hkplurals[i];
    }
    output += middle[count];
    return output;
  }

  /**
   * Returns the inputted string with the [liquid] placeholders replaced with the
   * inputted part of speech.
   *
   * @param hk The entire Madlib.
   * @return String hk with all instances of [liquid] placeholders replaced with
   *         the user input.
   */
  public static String liquid(String hk) {
    int count = 0;
    count = hk.split("\\[liquid\\]").length - 1;
    String output = "";
    String[] hkliquids = new String[count];
    String[] middle = new String[hk.length()];
    middle = hk.split("\\[liquid\\]");
    for (int i = 0; i < count; i++) {
      System.out.print("Enter a type of liquid: ");
      hkliquids[i] = TextIO.getlnWord();
      output += middle[i] + hkliquids[i];
    }
    output += middle[count];
    return output;
  }

  /**
   * Returns the inputted string with the [color] placeholders replaced with the
   * inputted part of speech.
   *
   * @param hk The entire Madlib.
   * @return String hk with all instances of [color] placeholders replaced with
   *         the user input.
   */
  public static String color(String hk) {
    int count = 0;
    count = hk.split("\\[color\\]").length - 1;
    String output = "";
    String[] hkcolors = new String[count];
    String[] middle = new String[hk.length()];
    middle = hk.split("\\[color\\]");
    for (int i = 0; i < count; i++) {
      System.out.print("Enter a color: ");
      hkcolors[i] = TextIO.getlnWord();
      output += middle[i] + hkcolors[i];
    }
    output += middle[count];
    return output;
  }
}
