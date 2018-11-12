public class Thanksgiving{
  public static void main(String[] args){

    String tg = "The first Thanksgiving was held in [year] when the pilgrims and \nIndians came together for [adjective] meal to celebrate their first \n[nouns] in America. It was [adjective]! The Indians \nbrought [food] to the festivities, and the pilgrims \n[verb, past tense] [pluraln] for everyone. The feast lasted for [number] days! \nIn [year], President [famous person] declared the 4th Thursday of \n[month] as a day of [pluraln] and [pluraln] and called it Thanksgiving. \nModern Thanksgiving celebrating usually include cooking a large \n[nouns] with stuffing and [nouns] sauce, eating [nouns] \npie, and watching [nouns] games on television. My favorite thing \nabout Thanksgiving is the [adjective] [food] -- what about you?\n";
    System.out.print(tg);
    int num_noun = Noun(tg);
    String[] mlnouns = new String[num_noun];
    System.out.println(num_noun);
    for(int i=0; i<num_noun; i++) {
      System.out.print("Enter a noun: ");
      mlnouns[i] = TextIO2.getlnWord();
    }
    for(int i=0; i<num_noun; i++) {
      System.out.println (mlnouns[i]);

    }


  }

  public static int Noun(String ml) {
    int count=0;
    count = ml.split("\\[nouns\\]").length-1;
    return count;
  }
}

/*System.out.println("Enter 2 years, i.e 1987");
String year = TextIO.getlnWord()
System.out.println("Enter 3 adjectives");
String adjective = TextIO.getlnWord()
System.out.println("Enter 4 nouns");
String noun = TextIO.getlnWord()
System.out.println("Enter 3 plural nouns");
String pnoun = TextIO.getlnWord()
System.out.println("Enter a past tense verb");
String ptverb = TextIO.getlnWord()
System.out.println("Enter 2 foods");
String food = TextIO.getlnWord()
System.out.println("Enter a number");
String number = TextIO.getlnWord()
System.out.println("Enter a month");
String month = TextIO.getlnWord()
System.out.println("Enter the name of a famous person");
String person = TextIO.getlnWord()
*/
