package amy;

import java.util.HashMap;
import java.util.Map;

public class Main {

	/**
	 * @param args
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Map<String,Integer> maparr[] = (Map<String, Integer>[])new Map[10];
		HashMap<String, Integer> hashMap = new HashMap<String,Integer>();
		hashMap.put("k1", 4);
		maparr[0] = hashMap;
		
		System.out.println(maparr[0]);
	}

}
