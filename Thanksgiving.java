package MadLibs;
public class Thanksgiving{
  public static void main(String[] args){

    String tg = "The first Thanksgiving was held in [year] when the pilgrims and \nIndians came together for [adjective] meal to celebrate their first \n[nouns] in America. It was [adjective]! The Indians \nbrought [food] to the festivities, and the pilgrims \n[verb, past tense] [Plural] for everyone. The feast lasted for [number] days! \nIn [year], President [famous person] declared the 4th Thursday of \n[month] as a day of [Plural] and [Plural] and called it Thanksgiving. \nModern Thanksgiving celebrating usually include cooking a large \n[nouns] with stuffing and [nouns] sauce, eating [nouns] \npie, and watching [nouns] games on television. My favorite thing \nabout Thanksgiving is the [adjective] [food] -- what about you?\n";
    System.out.print(tg);
    Noun(tg); //5
    Adjective(tg); //3
    Plural(tg); //3
    Year(tg); //2
    Famous(tg); //1
    PastTenseVerb(tg); //1
    Food(tg); //2
    Number(tg); //1
    Month(tg); //1

  }


  public static void Noun(String ml) {
    int count=0;
    count = ml.split("\\[nouns\\]").length-1;
    String[] mlnouns = new String[count];
    for(int i=0; i<count; i++) {
      System.out.print("Enter a noun: ");
      mlnouns[i] = TextIO.getlnWord();
    }
    for(int i=0; i<count; i++) {
      System.out.println (mlnouns[i]);
    }
  }

  public static void Adjective(String ml) {
    int count=0;
    count = ml.split("\\[adjective\\]").length-1;
    String[] mladjective = new String[count];
    for(int i=0; i<count; i++) {
      System.out.print("Enter a adjective: ");
      mladjective[i] = TextIO.getlnWord();
    }
    for(int i=0; i<count; i++) {
      System.out.println (mladjective[i]);
    }
  }

  public static void Plural(String ml) {
    int count=0;
    count = ml.split("\\[Plural\\]").length-1;
    String[] mlPlural = new String[count];
    for(int i=0; i<count; i++) {
      System.out.print("Enter a plural noun: ");
      mlPlural[i] = TextIO.getlnWord();
    }
    for(int i=0; i<count; i++) {
      System.out.println (mlPlural[i]);
    }
  }
  public static void Year(String ml) {
    int count=0;
    count = ml.split("\\[year\\]").length-1;
    String[] mlyear = new String[count];
    for(int i=0; i<count; i++) {
      System.out.print("Enter a year: ");
      mlyear[i] = TextIO.getlnWord();
    }
    for(int i=0; i<count; i++) {
      System.out.println (mlyear[i]);
    }
  }
  public static void Famous(String ml) {
    int count=0;
    count = ml.split("\\[famous person\\]").length-1;
    String[] mlFamous = new String[count];
    for(int i=0; i<count; i++) {
      System.out.print("Enter a famous persons name: ");
      mlFamous[i] = TextIO.getlnWord();
    }
    for(int i=0; i<count; i++) {
      System.out.println (mlFamous[i]);
    }
  }
  public static void PastTenseVerb(String ml) {
    int count=0;
    count = ml.split("\\[verb, past tense\\]").length-1;
    String[] mlPastTenseVerb = new String[count];
    for(int i=0; i<count; i++) {
      System.out.print("Enter a past tense verb: ");
      mlPastTenseVerb[i] = TextIO.getlnWord();
    }
    for(int i=0; i<count; i++) {
      System.out.println (mlPastTenseVerb[i]);
    }
  }
  public static void Food(String ml) {
    int count=0;
    count = ml.split("\\[food\\]").length-1;
    String[] mlFood = new String[count];
    for(int i=0; i<count; i++) {
      System.out.print("Enter a Food: ");
      mlFood[i] = TextIO.getlnWord();
    }
    for(int i=0; i<count; i++) {
      System.out.println (mlFood[i]);
    }
  }
  public static void Number(String ml) {
    int count=0;
    count = ml.split("\\[number\\]").length-1;
    String[] mlNumber = new String[count];
    for(int i=0; i<count; i++) {
      System.out.print("Enter a number: ");
      mlNumber[i] = TextIO.getlnWord();
    }
    for(int i=0; i<count; i++) {
      System.out.println (mlNumber[i]);
    }
  }
  public static void Month(String ml) {
    int count=0;
    count = ml.split("\\[month\\]").length-1;
    String[] mlMonth = new String[count];
    for(int i=0; i<count; i++) {
      System.out.print("Enter a month: ");
      mlMonth[i] = TextIO.getlnWord();
    }
    for(int i=0; i<count; i++) {
      System.out.println (mlMonth[i]);
    }
  }
}
