package generics;

import java.util.LinkedList;
import java.util.List;

//: generics/ReturnGenericType.java

class ReturnGenericType<T extends HasF> {
  private T obj;
  public ReturnGenericType(T x) { obj = x; }
  public List<T> getList() { 
	  List<T> ret = new LinkedList<T>();
	  ret.add(obj);
	  return ret; 
  }
  
  public T get(){
	  return obj;
  }
} ///:~
