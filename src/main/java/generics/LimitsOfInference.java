package generics;
//: generics/LimitsOfInference.java
import typeinfo.pets.*;
import java.util.*;

import net.mindview.util.New;

public class LimitsOfInference {
  static void
  f(Map<Person, List<? extends Pet>> petPeople) {}
  public static void main(String[] args) {
//     f(New.map()); // Does not compile
  }
} ///:~
