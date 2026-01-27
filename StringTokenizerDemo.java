import java.util.*;
class StringTokenizerDemo
{
   public static void main (String[] args) {
    StringTokenizer st=new StringTokenizer("Hello Java Programming");
    System.out.println(st.countTokens());
    while(st.hasMoreTokens())
    {
      System.out.println(st.nextToken());
    }
    System.out.println(st.countTokens());
    
  }
}