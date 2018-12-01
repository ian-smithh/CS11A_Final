/**
 * Returns a Halloween-themed Madlib based on user input.
 */
public class Halloween {
  /**
   * Stores the Madlib as a single string. Calls the method for each part of
   * speech. For each call of a method (Noun, Adjective, etc.), the string result
   * becomes the result of the call of the previous method and is passed to the
   * next method.
   *
   * @param args Main method does not accept input from args.
   */

  public static void main(String[] args) {
    System.out.println("This is a Madlib about Halloween");
    String hw = "My school is pretty [adjective] for most of the year, except in late October, [adjective] cobwebs appear in the hallway, with really [adjective] [animals] hanging from them. The lunch room has orange and black [plural] everywhere, and they serve roasted [noun] for lunch. Someone told me that a giant [adjective] [animal] took over the principal's office. All of the teachers look different; one is a zombie with [color] hair, another is a [adjective] [noun], and I think my [noun] teacher is a [noun] now. Tombstones line the hallways, and one said 'Here lies [name]', who died of [verb].";
    String result = Noun(hw);
    result = Plural(result);
    result = Adjective(result);
    result = Verb(result);
    result = Name(result);
    result = Color(result);
    result = Animal(result);
    result = pluralAnimal(result);
    System.out.println(result);
  }

  public static String Noun(String hw) {
    int count = 0;
    count = hw.split("\\[noun\\]").length - 1;
    String output = "";
    String[] hwnouns = new String[count];
    String[] middle = new String[hw.length()];
    middle = hw.split("\\[noun\\]");
    for (int i = 0; i < count; i++) {
      System.out.print("Enter a noun: ");
      hwnouns[i] = TextIO.getlnWord();
      output += middle[i] + hwnouns[i];
    }
    output += middle[count];
    return output;
  }

  public static String Plural(String hw) {
    int count = 0;
    count = hw.split("\\[plural\\]").length - 1;
    String output = "";
    String[] hwplural = new String[count];
    String[] middle = new String[hw.length()];
    middle = hw.split("\\[plural\\]");
    for (int i = 0; i < count; i++) {
      System.out.print("Enter a plural noun: ");
      hwplural[i] = TextIO.getlnWord();
      output += middle[i] + hwplural[i];
    }
    output += middle[count];
    return output;
  }

  public static String Adjective(String hw) {
    int count = 0;
    count = hw.split("\\[adjective\\]").length - 1;
    String output = "";
    String[] hwadjectives = new String[count];
    String[] middle = new String[hw.length()];
    middle = hw.split("\\[adjective\\]");
    for (int i = 0; i < count; i++) {
      System.out.print("Enter an adjective: ");
      hwadjectives[i] = TextIO.getlnWord();
      output += middle[i] + hwadjectives[i];
    }
    output += middle[count];
    return output;
  }

  public static String Verb(String hw) {
    int count = 0;
    count = hw.split("\\[verb\\]").length - 1;
    String output = "";
    String[] hwverbs = new String[count];
    String[] middle = new String[hw.length()];
    middle = hw.split("\\[verb\\]");
    for (int i = 0; i < count; i++) {
      System.out.print("Enter a verb: ");
      hwverbs[i] = TextIO.getlnWord();
      output += middle[i] + hwverbs[i];
    }
    output += middle[count];
    return output;
  }

  public static String Name(String hw) {
    int count = 0;
    count = hw.split("\\[name\\]").length - 1;
    String output = "";
    String[] hwnames = new String[count];
    String[] middle = new String[hw.length()];
    middle = hw.split("\\[name\\]");
    for (int i = 0; i < count; i++) {
      System.out.print("Enter a name: ");
      hwnames[i] = TextIO.getlnWord();
      output += middle[i] + hwnames[i];
    }
    output += middle[count];
    return output;
  }

  public static String Color(String hw) {
    int count = 0;
    count = hw.split("\\[color\\]").length - 1;
    String output = "";
    String[] hwcolors = new String[count];
    String[] middle = new String[hw.length()];
    middle = hw.split("\\[color\\]");
    for (int i = 0; i < count; i++) {
      System.out.print("Enter a color: ");
      hwcolors[i] = TextIO.getlnWord();
      output += middle[i] + hwcolors[i];
    }
    output += middle[count];
    return output;
  }

  public static String Animal(String hw) {
    int count = 0;
    count = hw.split("\\[animal\\]").length - 1;
    String output = "";
    String[] hwanimal = new String[count];
    String[] middle = new String[hw.length()];
    middle = hw.split("\\[animal\\]");
    for (int i = 0; i < count; i++) {
      System.out.print("Enter an animal: ");
      hwanimal[i] = TextIO.getlnWord();
      output += middle[i] + hwanimal[i];
    }
    output += middle[count];
    return output;
  }

  public static String pluralAnimal(String hw) {
    int count = 0;
    count = hw.split("\\[animals\\]").length - 1;
    String output = "";
    String[] hwanimals = new String[count];
    String[] middle = new String[hw.length()];
    middle = hw.split("\\[animals\\]");
    for (int i = 0; i < count; i++) {
      System.out.print("Enter a plural of an animal: ");
      hwanimals[i] = TextIO.getlnWord();
      output += middle[i] + hwanimals[i];
    }
    output += middle[count];
    return output;
  }
}
