import java.util.*;
class GCDemo
{
   public static void main (String[] args) {
    Runtime runtime=Runtime.getRuntime();
    System.out.println("Before creating objects:");
    System.out.println("Free Memory:"+runtime.freeMemory());
    //creating objects
    for(int i=0;i<1000;i++)
    {
      String s=new String("Object:"+i);
    }
    System.out.println("After creating objects:");
    System.out.println("Free Memory is :"+runtime.freeMemory());
    
    //Request garbage collection
    System.gc();
    System.out.println("After calling System.gc():");
    System.out.println("Free Memory is :"+runtime.freeMemory());
  }
}