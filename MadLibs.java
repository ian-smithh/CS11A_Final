public class MadLibs {

  public static void main(String[] args) {

    int rand = (int)(8*Math.random());
    System.out.println(rand);
    switch(rand) {

      case 0: Hanukkah.main(args); break;
      case 1: Christmas.main(args); break;
      case 2: Thanksgiving.main(args); break;
      case 3: NewYears.main(args); break;
      case 4: ValentinesDay.main(args); break;
      case 5: Halloween.main(args); break;
      case 6: July4th.main(args); break;
      case 7: Passover.main(args); break;
      default : System.out.println("There is no MadLib"); break;
    }

  }
}
