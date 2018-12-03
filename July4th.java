/**
 * Returns a Fourth of July-themed Madlib
 * 
 * @author Sarah Fielman
 */
public class July4th {
  /**
   * Stores the Madlib as a single string. Calls the method for each part of
   * speech. For each call of a method (Noun, Adjective, etc.), the string result
   * becomes the result of the call of the previous method and is passed to the
   * next method.
   *
   * @param args Main method does not accept input from args.
   */
  public static void main(String[] args) {
    System.out.println("This is a Madlib about July 4th.");
    String july = "Every July 4th my family and I [verb] with a picnic at the [place]. \nThe [place] is [adverb] [adjective], with the tall, lafy [Plural], [animal] [Ving] and a [Ving] trail. \nWe [verb] lots of [adjective] food and drinks, like [food], [food], and [beverage]. \nMy parents like [verb] [food] over a hot [noun] and we put mustard and [Plural] on top. \nAfter we eat, we [verb] games, like [verb] the [noun], [verb], and [adjective] [noun] [verb].\n";
    String result = Verb(july); // 7
    result = Place(result); // 2
    result = Adverb(result); // 1
    result = Adjective(result);// 3
    result = Plural(result); // 2
    result = Animal(result); // 1
    result = VerbIng(result); // 2
    result = Food(result); // 3
    result = Beverage(result); // 1
    result = Noun(result); // 3
    System.out.println(result);
  }

  /**
   * Returns the inputted string with the [verb] placeholders replaced with the
   * inputted part of speech.
   *
   * @param july The entire Madlib.
   * @return String july with all instances of [verb] placeholders replaced with
   *         the user input.
   */
  public static String Verb(String july) {
    int count = 0;
    count = july.split("\\[verb\\]").length - 1;
    String output = "";
    String[] julyverb = new String[count];
    String[] middle = new String[july.length()];
    middle = july.split("\\[verb\\]");
    for (int i = 0; i < count; i++) {
      System.out.print("Enter a verb: ");
      julyverb[i] = TextIO.getlnWord();
      output += middle[i] + julyverb[i];
    }
    output += middle[count];
    return output;
  }

  /**
   * Returns the inputted string with the [place] placeholders replaced with the
   * inputted part of speech.
   *
   * @param july The entire Madlib.
   * @return String july with all instances of [place] placeholders replaced with
   *         the user input.
   */
  public static String Place(String july) {
    int count = 0;
    count = july.split("\\[place\\]").length - 1;
    String output = "";
    String[] julyplace = new String[count];
    String[] middle = new String[july.length()];
    middle = july.split("\\[place\\]");
    for (int i = 0; i < count; i++) {
      System.out.print("Enter a place: ");
      julyplace[i] = TextIO.getlnWord();
      output += middle[i] + julyplace[i];
    }
    output += middle[count];
    return output;
  }

  /**
   * Returns the inputted string with the [adverb] placeholders replaced with the
   * inputted part of speech.
   *
   * @param july The entire Madlib.
   * @return String july with all instances of [adverb] placeholders replaced with
   *         the user input.
   */
  public static String Adverb(String july) {
    int count = 0;
    count = july.split("\\[adverb\\]").length - 1;
    String output = "";
    String[] julyadverb = new String[count];
    String[] middle = new String[july.length()];
    middle = july.split("\\[adverb\\]");
    for (int i = 0; i < count; i++) {
      System.out.print("Enter an adverb: ");
      julyadverb[i] = TextIO.getlnWord();
      output += middle[i] + julyadverb[i];
    }
    output += middle[count];
    return output;
  }

  /**
   * Returns the inputted string with the [adjective] placeholders replaced with the
   * inputted part of speech.
   *
   * @param july The entire Madlib.
   * @return String july with all instances of [adjective] placeholders replaced with
   *         the user input.
   */
  public static String Adjective(String july) {
    int count = 0;
    count = july.split("\\[adjective\\]").length - 1;
    String output = "";
    String[] julyadjective = new String[count];
    String[] middle = new String[july.length()];
    middle = july.split("\\[adjective\\]");
    for (int i = 0; i < count; i++) {
      System.out.print("Enter an adjective: ");
      julyadjective[i] = TextIO.getlnWord();
      output += middle[i] + julyadjective[i];
    }
    output += middle[count];
    return output;
  }

  /**
   * Returns the inputted string with the [plural] placeholders replaced with the
   * inputted part of speech.
   *
   * @param july The entire Madlib.
   * @return String july with all instances of [plural] placeholders replaced with
   *         the user input.
   */
  public static String Plural(String july) {
    int count = 0;
    count = july.split("\\[Plural\\]").length - 1;
    String output = "";
    String[] julyplural = new String[count];
    String[] middle = new String[july.length()];
    middle = july.split("\\[Plural\\]");
    for (int i = 0; i < count; i++) {
      System.out.print("Enter a plural noun: ");
      julyplural[i] = TextIO.getlnWord();
      output += middle[i] + julyplural[i];
    }
    output += middle[count];
    return output;
  }

  /**
   * Returns the inputted string with the [animal] placeholders replaced with the
   * inputted part of speech.
   *
   * @param july The entire Madlib.
   * @return String july with all instances of [animal] placeholders replaced with
   *         the user input.
   */
  public static String Animal(String july) {
    int count = 0;
    count = july.split("\\[animal\\]").length - 1;
    String output = "";
    String[] julyanimal = new String[count];
    String[] middle = new String[july.length()];
    middle = july.split("\\[animal\\]");
    for (int i = 0; i < count; i++) {
      System.out.print("Enter an animal: ");
      julyanimal[i] = TextIO.getlnWord();
      output += middle[i] + julyanimal[i];
    }
    output += middle[count];
    return output;
  }

  /**
   * Returns the inputted string with the [Ving] placeholders replaced with the
   * inputted part of speech.
   *
   * @param july The entire Madlib.
   * @return String july with all instances of [Ving] placeholders replaced with
   *         the user input.
   */
  public static String VerbIng(String july) {
    int count = 0;
    count = july.split("\\[Ving\\]").length - 1;
    String output = "";
    String[] julyVerbIng = new String[count];
    String[] middle = new String[july.length()];
    middle = july.split("\\[Ving\\]");
    for (int i = 0; i < count; i++) {
      System.out.print("Enter a verb ending in ing: ");
      julyVerbIng[i] = TextIO.getlnWord();
      output += middle[i] + julyVerbIng[i];
    }
    output += middle[count];
    return output;
  }

  /**
   * Returns the inputted string with the [food] placeholders replaced with the
   * inputted part of speech.
   *
   * @param july The entire Madlib.
   * @return String july with all instances of [food] placeholders replaced with
   *         the user input.
   */
  public static String Food(String july) {
    int count = 0;
    count = july.split("\\[food\\]").length - 1;
    String output = "";
    String[] julyfood = new String[count];
    String[] middle = new String[july.length()];
    middle = july.split("\\[food\\]");
    for (int i = 0; i < count; i++) {
      System.out.print("Enter a food: ");
      julyfood[i] = TextIO.getlnWord();
      output += middle[i] + julyfood[i];
    }
    output += middle[count];
    return output;
  }

  /**
   * Returns the inputted string with the [beverage] placeholders replaced with
   * the inputted part of speech.
   *
   * @param july The entire Madlib.
   * @return String july with all instances of [beverage] placeholders replaced
   *         with the user input.
   */
  public static String Beverage(String july) {
    int count = 0;
    count = july.split("\\[beverage\\]").length - 1;
    String output = "";
    String[] julybeverage = new String[count];
    String[] middle = new String[july.length()];
    middle = july.split("\\[beverage\\]");
    for (int i = 0; i < count; i++) {
      System.out.print("Enter a beverage: ");
      julybeverage[i] = TextIO.getlnWord();
      output += middle[i] + julybeverage[i];
    }
    output += middle[count];
    return output;
  }

  /**
   * Returns the inputted string with the [noun] placeholders replaced with the
   * inputted part of speech.
   *
   * @param july The entire Madlib.
   * @return String july with all instances of [noun] placeholders replaced with
   *         the user input.
   */
  public static String Noun(String july) {
    int count = 0;
    count = july.split("\\[noun\\]").length - 1;
    String output = "";
    String[] julynouns = new String[count];
    String[] middle = new String[july.length()];
    middle = july.split("\\[noun\\]");
    for (int i = 0; i < count; i++) {
      System.out.print("Enter a noun: ");
      julynouns[i] = TextIO.getlnWord();
      output += middle[i] + julynouns[i];
    }
    output += middle[count];
    return output;
  }
}
