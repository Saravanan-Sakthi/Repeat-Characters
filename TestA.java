package pattern;
import java.util.Scanner;
import pattern.AProgram;
class TestA{
  public static void main(String [] abc){
    Scanner S= new Scanner(System.in);
    String in=S.next();
    new AProgram().printout(in);
  }
}