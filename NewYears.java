public class NewYears {
  public static void main(String[] args) {
    String ny = "1. I will [verb] a race to raise [noun] for a charity.\n2. I will learn to [verb] a new language. \n3. I will [adverb] try to improve my [plural] in Math. \n4. I will volunteer to [verb] [plural] in our local [noun]. \n5. After school, I will [verb] for [number] minutes every night to improve my reading. \n6. At home, I will [verb] my parents with [verb] dinner and [verb] the dishes afterwards. \n7. I will limit my computer time to [number] minutes a day. \n8. I will do my best to do what my [plural] ask of me... the [number] time they ask. \n9. I will eat [number] fruits and [plural] every day. \n10. I will follow The [adjective] Rule: Always treat [plural] the way that you want to be [verb].";

    Noun(ny);
    Adjective(ny);
    Verb(ny);
    Adverb(ny);
    Plural(ny);
    Number(ny);
    System.out.print(ny);
  }
  public static void Noun(String ny) {
    int count=0;
    count = ny.split("\\[noun\\]").length-1;
    String output = "";
    String[] nynouns = new String[count];
    String[] middle = new String[ny.length()];
    middle = ny.split("\\[noun\\]");
    for(int i=0; i<count; i++) {
      System.out.print("Enter a noun: ");
      nynouns[i] = TextIO.getlnWord();
      output+= middle[i] + nynouns[i];
    }
     System.out.println(output);
  }
  public static void Adjective(String ny) {
    int count=0;
    count = ny.split("\\[adjective\\]").length-1;
    String output = "";
    String[] nyadjective = new String[count];
    String[] middle = new String[ny.length()];
    middle = ny.split("\\[adjective\\]");
    for(int i=0; i<count; i++) {
      System.out.print("Enter an adjective: ");
      nyadjective[i] = TextIO.getlnWord();
      output+= middle[i] + nyadjective[i];
    }
     System.out.println(output);
  }
  public static void Verb(String ny) {
    int count=0;
    count = ny.split("\\[verb\\]").length-1;
    String output = "";
    String[] nyverb = new String[count];
    String[] middle = new String[ny.length()];
    middle = ny.split("\\[verb\\]");
    for(int i=0; i<count; i++) {
      System.out.print("Enter a verb: ");
      nyverb[i] = TextIO.getlnWord();
      output+= middle[i] + nyverb[i];
    }
     System.out.println(output);
  }
  public static void Adverb(String ny) {
    int count=0;
    count = ny.split("\\[adverb\\]").length-1;
    String output = "";
    String[] nyadverb = new String[count];
    String[] middle = new String[ny.length()];
    middle = ny.split("\\[adverb\\]");
    for(int i=0; i<count; i++) {
      System.out.print("Enter an adverb: ");
      nyadverb[i] = TextIO.getlnWord();
      output+= middle[i] + nyadverb[i];
    }
     System.out.println(output);
  }
  public static void Plural(String ny) {
    int count=0;
    count = ny.split("\\[plural\\]").length-1;
    String output = "";
    String[] nyplural = new String[count];
    String[] middle = new String[ny.length()];
    middle = ny.split("\\[plural\\]");
    for(int i=0; i<count; i++) {
      System.out.print("Enter a plural noun: ");
      nyplural[i] = TextIO.getlnWord();
      output+= middle[i] + nyplural[i];
    }
     System.out.println(output);
  }
  public static void Number(String ny) {
    int count=0;
    count = ny.split("\\[number\\]").length-1;
    String output = "";
    String[] nynumber = new String[count];
    String[] middle = new String[ny.length()];
    middle = ny.split("\\[number\\]");
    for(int i=0; i<count; i++) {
      System.out.print("Enter a number: ");
      nynumber[i] = TextIO.getlnWord();
      output+= middle[i] + nynumber[i];
    }
     System.out.println(output);
  }
}
