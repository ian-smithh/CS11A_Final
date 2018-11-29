public class ValentinesDay {
  public static void main(String[] args) {
    String val = "I woke up on February 14th feeling vey [adjective].\nI was going to [name]'s Valentine's Day party at school!\nI was excited to pass out my Valentines to my [noun].\nWhen I got to my classroom, I couldn't help but notice the [adjective] decorations.\nI especially liked the [adjective] and [adjective] colors everywhere.\nI walked to my desk and saw that my favorite candy, [noun] was waiting for me!\nI opened up the card and discovered it was from [noun].\nOn Valentine's Day people like to show each other how much they care by getting them [plural].\nValentine's Day is special because it gives me the chance to tell people in my life that I [verb] them.\nBut this isn't something you only say on Valentine's Day, you can say it all year round!\nAt the end of the day, Valentine's Day is a day where you can eat lots of [food], celebrate love, and maybe tell someone how you feel.\nValentine's day is a [adjective] holiday.";
    String result = Noun(val);
    result = Adjective(result);
    result = Verb(result);
    result = Plural(result);
    result = Name(result);
    result = Food(result);
    System.out.println(result);
  }

  public static String Noun(String val) {
    int count = 0;
    count = val.split("\\[noun\\]").length - 1;
    String output = "";
    String[] valNouns = new String[count];
    String[] middle = new String[val.length()];
    middle = val.split("\\[noun\\]");
    for (int i = 0; i < count; i++) {
      System.out.print("Enter a noun: ");
      valNouns[i] = TextIO.getlnWord();
      output += middle[i] + valNouns[i];
    }
    output += middle[count];
    return output;
  }

  public static String Adjective(String val) {
    int count = 0;
    count = val.split("\\[adjective\\]").length - 1;
    String output = "";
    String[] valAdjective = new String[count];
    String[] middle = new String[val.length()];
    middle = val.split("\\[adjective\\]");
    for (int i = 0; i < count; i++) {
      System.out.print("Enter an adjective: ");
      valAdjective[i] = TextIO.getlnWord();
      output += middle[i] + valAdjective[i];
    }
    output += middle[count];
    return output;
  }

  public static String Verb(String val) {
    int count = 0;
    count = val.split("\\[verb\\]").length - 1;
    String output = "";
    String[] valVerb = new String[count];
    String[] middle = new String[val.length()];
    middle = val.split("\\[verb\\]");
    for (int i = 0; i < count; i++) {
      System.out.print("Enter a verb: ");
      valVerb[i] = TextIO.getlnWord();
      output += middle[i] + valVerb[i];
    }
    output += middle[count];
    return output;
  }

  public static String Plural(String val) {
    int count = 0;
    count = val.split("\\[plural\\]").length - 1;
    String output = "";
    String[] valPlural = new String[count];
    String[] middle = new String[val.length()];
    middle = val.split("\\[plural\\]");
    for (int i = 0; i < count; i++) {
      System.out.print("Enter a plural noun: ");
      valPlural[i] = TextIO.getlnWord();
      output += middle[i] + valPlural[i];
    }
    output += middle[count];
    return output;
  }

  public static String Name(String val) {
    int count = 0;
    count = val.split("\\[name\\]").length - 1;
    String output = "";
    String[] valName = new String[count];
    String[] middle = new String[val.length()];
    middle = val.split("\\[name\\]");
    for (int i = 0; i < count; i++) {
      System.out.print("Enter a name: ");
      valName[i] = TextIO.getlnWord();
      output += middle[i] + valName[i];
    }
    output += middle[count];
    return output;
  }

  public static String Food(String val) {
    int count = 0;
    count = val.split("\\[food\\]").length - 1;
    String output = "";
    String[] valFood = new String[count];
    String[] middle = new String[val.length()];
    middle = val.split("\\[food\\]");
    for (int i = 0; i < count; i++) {
      System.out.print("Enter a food: ");
      valFood[i] = TextIO.getlnWord();
      output += middle[i] + valFood[i];
    }
    output += middle[count];
    return output;
  }
}