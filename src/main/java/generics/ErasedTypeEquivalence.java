package generics;
//: generics/ErasedTypeEquivalence.java
import java.util.*;

public class ErasedTypeEquivalence {
  public static void main(String[] args) {
    Class c1 = new ArrayList<String>().getClass();
    Class c2 = new ArrayList<Integer>().getClass();
    System.out.println(c1 == c2);
    
    String s1 = "ss";
    String s2 = "ss";
    System.out.println(s1 == s2);
  }
} /* Output:
true
*///:~
