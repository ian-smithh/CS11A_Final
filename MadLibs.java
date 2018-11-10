public class MadLibs {

  public static void main(String[] args) {

    int rand = (int)(8*Math.random());
    System.out.println(rand);
    switch(rand) {

      case 0: Hanukkah(); break;
      case 1: Christmas(); break;
      case 2: Thanksgiving(); break;
      case 3: NewYears(); break;
      case 4: ValentinesDay(); break;
      case 5: Halloween(); break;
      case 6: July4th(); break;
      case 7: Graduation(); break;
      default : "There is no MadLib"; break;
    }

  }
}
