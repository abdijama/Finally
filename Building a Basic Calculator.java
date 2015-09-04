import java.util.Scanner;

class apples {
   public static void main(String args[]) {
      Scanner Jama = new Scanner(System.in);
      double fnum, snum, answer;
      System.out.println("Enter first number: ");
      fnum = Jama.nextDouble();
      System.out.println("Enter second number: ");
      snum = Jama.nextDouble();
      answer = fnum + snum;
      System.out.println(answer);
   }
}