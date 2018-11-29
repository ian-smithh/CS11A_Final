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

    String hw = "My school is pretty [adjective] for most of the year, except in late October, [adjective] cobwebs appear in the hallway, with really [adjective] [animals] hanging from them. The lunch room has orange and black [plural] everywhere, and they serve roasted [noun] for lunch. Someone told me that a giant [adjective] [animal] took over the principal's office. All of the teachers look different; one is a zombie with [color] hair, another is a [adjective] [noun], and I think my [noun] teacher is a [noun] now. Tombstones line the hallways, and one said 'Here lies [name]', who died of [verb].";
    System.out.println(hw);
    Noun(hw);
    Plural(hw);
    Adjective(hw);
    Verb(hw);
    Name(hw);
    Color(hw);
    Animal(hw);
    pluralAnimal(hw);
  }

  public static void Noun(String hw) {
    int count = 0;
    count = hw.split("\\[noun\\]").length - 1;
    String[] hwnouns = new String[count];
    for (int i = 0; i < count; i++) {
      System.out.print("Enter a noun: ");
      hwnouns[i] = TextIO.getlnWord();
    }
    for (int i = 0; i < count; i++) {
      System.out.println(hwnouns[i]);
    }
  }

  public static void Plural(String hw) {
    int count = 0;
    count = hw.split("\\[plural\\]").length - 1;
    String[] hwPlural = new String[count];
    for (int i = 0; i < count; i++) {
      System.out.print("Enter a plural noun: ");
      hwPlural[i] = TextIO.getlnWord();
    }
    for (int i = 0; i < count; i++) {
      System.out.println(hwPlural[i]);
    }
  }

  public static void Adjective(String hw) {
    int count = 0;
    count = hw.split("\\[adjective\\]").length - 1;
    String[] hwadjective = new String[count];
    for (int i = 0; i < count; i++) {
      System.out.print("Enter an adjective: ");
      hwadjective[i] = TextIO.getlnWord();
    }
    for (int i = 0; i < count; i++) {
      System.out.println(hwadjective[i]);
    }
  }

  public static void Verb(String hw) {
    int count = 0;
    count = hw.split("\\[verb\\]").length - 1;
    String[] hwadjective = new String[count];
    for (int i = 0; i < count; i++) {
      System.out.print("Enter a verb: ");
      hwadjective[i] = TextIO.getlnWord();
    }
    for (int i = 0; i < count; i++) {
      System.out.println(hwadjective[i]);
    }
  }

  public static void Name(String hw) {
    int count = 0;
    count = hw.split("\\[name\\]").length - 1;
    String[] hwadjective = new String[count];
    for (int i = 0; i < count; i++) {
      System.out.print("Enter a name: ");
      hwadjective[i] = TextIO.getlnWord();
    }
    for (int i = 0; i < count; i++) {
      System.out.println(hwadjective[i]);
    }
  }

  public static void Color(String hw) {
    int count = 0;
    count = hw.split("\\[color\\]").length - 1;
    String[] hwPlural = new String[count];
    for (int i = 0; i < count; i++) {
      System.out.print("Enter a color: ");
      hwPlural[i] = TextIO.getlnWord();
    }
    for (int i = 0; i < count; i++) {
      System.out.println(hwPlural[i]);
    }
  }

  public static void Animal(String hw) {
    int count = 0;
    count = hw.split("\\[animal\\]").length - 1;
    String[] hwNumber = new String[count];
    for (int i = 0; i < count; i++) {
      System.out.print("Enter an animal: ");
      hwNumber[i] = TextIO.getlnWord();
    }
    for (int i = 0; i < count; i++) {
      System.out.println(hwNumber[i]);
    }
  }

  public static void pluralAnimal(String hw) {
    int count = 0;
    count = hw.split("\\[animals\\]").length - 1;
    String[] hwNumber = new String[count];
    for (int i = 0; i < count; i++) {
      System.out.print("Enter a plural form of an animal: ");
      hwNumber[i] = TextIO.getlnWord();
    }
    for (int i = 0; i < count; i++) {
      System.out.println(hwNumber[i]);
    }
  }
}
