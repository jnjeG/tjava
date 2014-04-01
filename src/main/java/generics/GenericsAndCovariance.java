package generics;
//: generics/GenericsAndCovariance.java
import java.util.*;

public class GenericsAndCovariance {
  public static void main(String[] args) {
    // Wildcards allow covariance:
    ArrayList<Apple> applist = new ArrayList<Apple>();
    applist.add(new Apple());
	List<? extends Fruit> flist = applist;
    // Compile Error: can't add any type of object:
//     flist.add(new Apple());
//     flist.add(new Fruit());
//     flist.add(new Object());
    flist.add(null); // Legal but uninteresting
    // We know that it returns at least Fruit:
    Fruit f = flist.get(0);
    if(f instanceof Apple){
    	System.out.println("it's apple");
    }
  }
} ///:~
