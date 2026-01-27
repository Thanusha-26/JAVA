import java.util.*;
class StringSum
{
   public static void main (String[] args) {
    String s="10 20 30 40 50";
    int sum=0;
    StringTokenizer st=new StringTokenizer(s);
    System.out.println(st.countTokens());
    while(st.hasMoreTokens())
    {
      int num=Integer.parseInt(st.nextToken());
      sum=sum+num;
    }
    System.out.println(sum);
  }
}