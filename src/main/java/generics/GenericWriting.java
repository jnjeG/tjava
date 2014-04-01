package generics;

//: generics/GenericWriting.java
import java.util.*;

public class GenericWriting {
	static <T> void writeExact(List<T> list, T item) {
		list.add(item);
	}

	static List<Apple> apples = new ArrayList<Apple>();
	static List<Fruit> fruit = new ArrayList<Fruit>();

	static void f1() {
		writeExact(apples, new Apple());
		// writeExact(fruit, new Apple()); // Error:
		// Incompatible types: found Fruit, required Apple
	}

	static <T> void writeWithWildcard(List<? super T> list, T item) {
		list.add(item);
	}

	static void f2() {
		writeWithWildcard(apples, new Apple());
		writeWithWildcard(fruit, new Apple());//因为Apple类型是Fruit的子类型,所以可以写入
	}

	public static void main(String[] args) {
		f1();
		f2();
	}
} // /:~
