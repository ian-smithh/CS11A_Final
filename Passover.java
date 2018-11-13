public class Passover{
  public static void main(String[] args){
  String passover = "Every year we celebrate Passover to remeber when our ancesters were \n[occupation] and how they [verb, past tense] to freedom. \nMoses came to Pharaoh and said, 'Let me people [verb]!' but the Pharaoh refused. \nThis made G-d [adjective], so he unleased [number] plauges to change the Pharaoh's [noun]. \nFirst, he turned all the water into [liquid]. That did not work. So G-d tried other plauges like [Plural], \nstorms, and darkness. [number] plagues later, the Pharaoh still wouldn't let the [Plural] go. \nThen came the [adjective] plague: one morning all the [adjective] Egyptian children suddenly died. \nThe Pharaoh finally gave up and agreed to [verb] the Jews.\n";
  System.out.print(passover);
  Occupation(passover); //1
  PastTenseVerb(passover); //1
  Verb(passover); //2
  Adjective(passover); //3
  Number(passover); //2
  Noun(passover); //1
  Plural(passover); //2
  Liquid(passover); //1
  }
  public static void Occupation(String ml) {
    int count=0;
    count = ml.split("\\[occupation\\]").length-1;
    String[] mlOccupation = new String[count];
    for(int i=0; i<count; i++) {
      System.out.print("Enter a occupation (plural): ");
      mlOccupation[i] = TextIO2.getlnWord();
    }
    for(int i=0; i<count; i++) {
      System.out.println (mlOccupation[i]);
    }
   }
   public static void PastTenseVerb(String ml) {
     int count=0;
     count = ml.split("\\[verb, past tense\\]").length-1;
     String[] mlPastTenseVerb = new String[count];
     for(int i=0; i<count; i++) {
       System.out.print("Enter a past tense verb: ");
       mlPastTenseVerb[i] = TextIO2.getlnWord();
     }
     for(int i=0; i<count; i++) {
       System.out.println (mlPastTenseVerb[i]);
     }
   }
   public static void Verb(String ml) {
     int count=0;
     count = ml.split("\\[verb\\]").length-1;
     String[] mlVerb = new String[count];
     for(int i=0; i<count; i++) {
       System.out.print("Enter a verb: ");
       mlVerb[i] = TextIO2.getlnWord();
     }
     for(int i=0; i<count; i++) {
       System.out.println (mlVerb[i]);
     }
    }
    public static void Adjective(String ml) {
      int count=0;
      count = ml.split("\\[adjective\\]").length-1;
      String[] mladjective = new String[count];
      for(int i=0; i<count; i++) {
        System.out.print("Enter an adjective: ");
        mladjective[i] = TextIO2.getlnWord();
      }
      for(int i=0; i<count; i++) {
        System.out.println (mladjective[i]);
      }
    }
    public static void Number(String ml) {
      int count=0;
      count = ml.split("\\[number\\]").length-1;
      String[] mlNumber = new String[count];
      for(int i=0; i<count; i++) {
        System.out.print("Enter a number: ");
        mlNumber[i] = TextIO2.getlnWord();
      }
      for(int i=0; i<count; i++) {
        System.out.println (mlNumber[i]);
      }
    }
    public static void Noun(String ml) {
      int count=0;
      count = ml.split("\\[noun\\]").length-1;
      String[] mlnouns = new String[count];
      for(int i=0; i<count; i++) {
        System.out.print("Enter a noun: ");
        mlnouns[i] = TextIO2.getlnWord();
      }
      for(int i=0; i<count; i++) {
        System.out.println (mlnouns[i]);
      }
    }
    public static void Plural(String ml) {
      int count=0;
      count = ml.split("\\[Plural\\]").length-1;
      String[] mlPlural = new String[count];
      for(int i=0; i<count; i++) {
        System.out.print("Enter a plural noun: ");
        mlPlural[i] = TextIO2.getlnWord();
      }
      for(int i=0; i<count; i++) {
        System.out.println (mlPlural[i]);
      }
    }
    public static void Liquid(String ml) {
      int count=0;
      count = ml.split("\\[liquid\\]").length-1;
      String[] mlLiquid = new String[count];
      for(int i=0; i<count; i++) {
        System.out.print("Enter a liquid: ");
        mlLiquid [i] = TextIO2.getlnWord();
      }
      for(int i=0; i<count; i++) {
        System.out.println (mlLiquid [i]);
      }
    }
  }
