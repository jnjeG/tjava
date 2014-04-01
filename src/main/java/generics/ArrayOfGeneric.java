package generics;
//: generics/ArrayOfGeneric.java

public class ArrayOfGeneric {
  static final int SIZE = 100;
  static Generic<Integer>[] gia;
  @SuppressWarnings("unchecked")
  public static void main(String[] args) {
    // Compiles; produces ClassCastException:
//     gia = (Generic<Integer>[])new Object[SIZE];
    // Runtime type is the raw (erased) type:
    gia = (Generic<Integer>[])new Generic[SIZE];
    System.out.println(gia.getClass().getSimpleName());
    gia[0] = new Generic<Integer>();
//     gia[1] = new Object(); // Compile-time error
    // Discovers type mismatch at compile time:
//     gia[2] = new Generic<Double>();
    
    Object objarr[] = new Object[10];
    objarr[0] = new Integer(2);
    System.out.println(objarr[0]);
    Integer inarr[] = (Integer[])objarr;//
  }
} /* Output:
Generic[]
*///:~
