package generics.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		Map<Key, String> map = new HashMap<>();
		
		Key key = new Key("111");
		map.put(new Key("111"), "Code111");
		map.put(new Key("222"), "Code222");
		map.put(new Key("111"), "Code333");
//		map.put(null, "aadad");
//		map.put(null, "aadad");
		
		
		System.out.println(map.size());
		Integer k = 3;
//		System.out.println(new HashMapTest().new inner().kk);
		
		for (Map.Entry<Key, String> entry : map.entrySet()) {
			System.out.println("Key: "+entry.getKey()+" / Value: "+entry.getValue());
		}
	}
}

class Key{
	String key;
	public Key(String k) {
		key = k;
	}
	
	@Override
	public boolean equals(Object obj) {
		return this.key.equals(((Key)obj).key);
	}
	
	@Override
	public int hashCode() {
		return 1;
	}
}

