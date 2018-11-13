public class July4th{
 public static void main(String[] args){
 String july = "Every July 4th my family and I [verb] with a picnic at the [place]. \nThe [place] is [adverb] [adjective], with the tall, lafy [Plural], [animal] [Ving] and a [Ving] trail. \nWe [verb] lots of [adjective] food and drinks, like [food], [food], and [beverage]. \nMy parents like [verb] [food] over a hot [noun] and we put mustard and [Plural] on top. \nAfter we eat, we [verb] games, like [verb] the [noun], [verb], and [adjective] [noun][verb].\n";
 System.out.print(july);
 Verb(july); //7
 Place(july); //2
 Adverb(july); //1
 Adjective (july);//3
 Plural(july); //2
 Animal(july); //1
 VerbIng(july); //2
 Food(july); //3
 Beverage(july); //1
 Noun(july); //3

 }

 public static void Verb(String ml) {
   int count=0;
   count = ml.split("\\[verb\\]").length-1;
   String[] mlVerb = new String[count];
   for(int i=0; i<count; i++) {
     System.out.print("Enter a verb: ");
     mlVerb[i] = TextIO.getlnWord();
   }
   for(int i=0; i<count; i++) {
     System.out.println (mlVerb[i]);
   }
  }
  public static void Place(String ml) {
    int count=0;
    count = ml.split("\\[place\\]").length-1;
    String[] mlPlace = new String[count];
    for(int i=0; i<count; i++) {
      System.out.print("Enter a place: ");
      mlPlace[i] = TextIO.getlnWord();
    }
    for(int i=0; i<count; i++) {
      System.out.println (mlPlace[i]);
    }
   }
   public static void Adverb(String ml) {
     int count=0;
     count = ml.split("\\[adverb\\]").length-1;
     String[] mlAdverb = new String[count];
     for(int i=0; i<count; i++) {
       System.out.print("Enter an adverb: ");
       mlAdverb[i] = TextIO.getlnWord();
     }
     for(int i=0; i<count; i++) {
       System.out.println (mlAdverb[i]);
     }
    }
    public static void Adjective(String ml) {
      int count=0;
      count = ml.split("\\[adjective\\]").length-1;
      String[] mlAdjective = new String[count];
      for(int i=0; i<count; i++) {
        System.out.print("Enter an adjective: ");
        mlAdjective[i] = TextIO.getlnWord();
      }
      for(int i=0; i<count; i++) {
        System.out.println (mlAdjective[i]);
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
    public static void Animal(String ml) {
      int count=0;
      count = ml.split("\\[animal\\]").length-1;
      String[] mlAnimal = new String[count];
      for(int i=0; i<count; i++) {
        System.out.print("Enter an animal: ");
        mlAnimal[i] = TextIO.getlnWord();
      }
      for(int i=0; i<count; i++) {
        System.out.println (mlAnimal[i]);
      }
    }
    public static void VerbIng(String ml) {
      int count=0;
      count = ml.split("\\[Ving\\]").length-1;
      String[] mlVerbIng = new String[count];
      for(int i=0; i<count; i++) {
        System.out.print("Enter a verb ending in ing: ");
        mlVerbIng[i] = TextIO.getlnWord();
      }
      for(int i=0; i<count; i++) {
        System.out.println (mlVerbIng[i]);
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
     public static void Beverage(String ml) {
       int count=0;
       count = ml.split("\\[beverage\\]").length-1;
       String[] mlBeverage = new String[count];
       for(int i=0; i<count; i++) {
         System.out.print("Enter a Beverage: ");
         mlBeverage[i] = TextIO.getlnWord();
       }
       for(int i=0; i<count; i++) {
         System.out.println (mlBeverage[i]);
       }
     }
     public static void Noun(String ml) {
       int count=0;
       count = ml.split("\\[noun\\]").length-1;
       String[] mlnouns = new String[count];
       for(int i=0; i<count; i++) {
         System.out.print("Enter a noun: ");
         mlnouns[i] = TextIO.getlnWord();
       }
       for(int i=0; i<count; i++) {
         System.out.println (mlnouns[i]);
       }
     }
   }
