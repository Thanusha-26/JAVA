import java.util.*; 
class NameComparator implements Comparator<String> 
{ 
public int compare(String a, String b) 
{ 
return a.compareTo(b); 
} 
} 
public class ComparatorExample 
{ 
public static void main(String[] args) 
{ 
ArrayList<String> names = new ArrayList<>(); 
names.add("Ravi"); 
names.add("Anil"); 
names.add("Kiran"); 
Collections.sort(names, new NameComparator()); 
System.out.println(names); 
} 
}