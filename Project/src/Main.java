import java.util.Scanner;
 
class Main
{
   public static void main(String args[])
   {
      String str, rev = "";
      Scanner a = new Scanner(System.in);
 
      System.out.println("Digite uma palavra:");
      str = a.nextLine();
 
      int length = str.length();
 
      for ( int i = length - 1; i >= 0; i--)
         rev = rev + str.charAt(i);
 
      if (str.equals(rev))
         System.out.println(str+" é um palindromo");
      else
         System.out.println(str+" não é um palindromo");
 
   }
}