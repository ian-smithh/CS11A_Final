public class NewYears {
  public static void main(String[] args) {
    String ny = "1. I will [verb] a race to raise [noun] for a charity.\n2. I will learn to [verb] a new language. \n3. I will [adverb] try to improve my [plural] in Math. \n4. I will volunteer to [verb] [plural] in our local [noun]. \n5. After school, I will [verb] for [number] minutes every night to improve my reading. \n6. At home, I will [verb] my parents with [verb] dinner and [verb] the dishes afterwards. \n7. I will limit my computer time to [number] minutes a day. \n8. I will do my best to do what my [plural] ask of me... the [number] time they ask. \n9. I will eat [number] fruits and [plural] every day. \n10. I will follow The [adjective] Rule: Always treat [plural] the way that you want to be [verb].";
    System.out.print(ny);
    Noun(ny);
    Adjective(ny);
    Verb(ny);
    Adverb(ny);
    Plural(ny);
    Number(ny);
  }
  public static void Noun(String ny) {
    int count=0;
    count = ny.split("\\[noun\\]").length-1;
    String[] nynouns = new String[count];
    for(int i=0; i<count; i++) {
      System.out.print("Enter a noun: ");
      nynouns[i] = TextIO.getlnWord();
    }
    for(int i=0; i<count; i++) {
      System.out.println (nynouns[i]);
    }
  }
  public static void Adjective(String ny) {
    int count=0;
    count = ny.split("\\[adjective\\]").length-1;
    String[] nyadjective = new String[count];
    for(int i=0; i<count; i++) {
      System.out.print("Enter an adjective: ");
      nyadjective[i] = TextIO.getlnWord();
    }
    for(int i=0; i<count; i++) {
      System.out.println (nyadjective[i]);
    }
  }
  public static void Verb(String ny) {
    int count=0;
    count = ny.split("\\[verb\\]").length-1;
    String[] nyadjective = new String[count];
    for(int i=0; i<count; i++) {
      System.out.print("Enter a verb: ");
      nyadjective[i] = TextIO.getlnWord();
    }
    for(int i=0; i<count; i++) {
      System.out.println (nyadjective[i]);
    }
  }
  public static void Adverb(String ny) {
    int count=0;
    count = ny.split("\\[adverb\\]").length-1;
    String[] nyadjective = new String[count];
    for(int i=0; i<count; i++) {
      System.out.print("Enter an adverb: ");
      nyadjective[i] = TextIO.getlnWord();
    }
    for(int i=0; i<count; i++) {
      System.out.println (nyadjective[i]);
    }
  }
  public static void Plural(String ny) {
    int count=0;
    count = ny.split("\\[plural\\]").length-1;
    String[] nyPlural = new String[count];
    for(int i=0; i<count; i++) {
      System.out.print("Enter a plural noun: ");
      nyPlural[i] = TextIO.getlnWord();
    }
    for(int i=0; i<count; i++) {
      System.out.println (nyPlural[i]);
    }
  }
  public static void Number(String ny) {
    int count=0;
    count = ny.split("\\[number\\]").length-1;
    String[] nyNumber = new String[count];
    for(int i=0; i<count; i++) {
      System.out.print("Enter a number: ");
      nyNumber[i] = TextIO.getlnWord();
    }
    for(int i=0; i<count; i++) {
      System.out.println (nyNumber[i]);
    }
  }
}
