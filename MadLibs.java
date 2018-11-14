public class MadLibs {

  public static void main(String[] args) {

    int rand = (int)(8*Math.random());

    switch(rand) {

      case 0: Hanukkah.main(args); break; //Nick
      case 1: Christmas.main(args); break; //Ian
      case 2: Thanksgiving.main(args); break; //Sarah
      case 3: NewYears.main(args); break; //Rafi
      case 4: ValentinesDay.main(args); break; //Nick
      case 5: Halloween.main(args); break; //Rafi
      case 6: July4th.main(args); break; //Sarah
      case 7: Passover.main(args); break; //Sarah
      case 8: callAPI.main(args); break; //Ian
      default : System.out.println("There is no MadLib"); break;
    }

  }
}
