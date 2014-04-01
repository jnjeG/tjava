package generics;
//: generics/SuperTypeWildcards.java
import java.util.*;

public class SuperTypeWildcards {
  static void writeTo(List<? super Apple> apples) {
    apples.add(new Apple());
    apples.add(new Jonathan()); 
    System.out.println(apples);
    // apples.add(new Fruit()); // Error
  }
  
  public static void main(String[] args) {
	  List<? super Apple> apples  = new LinkedList<Apple>();
	  writeTo(apples);
	  
	  List<? super Apple> fruit  = new LinkedList<Fruit>();
	  writeTo(fruit);
  }
} ///:~
