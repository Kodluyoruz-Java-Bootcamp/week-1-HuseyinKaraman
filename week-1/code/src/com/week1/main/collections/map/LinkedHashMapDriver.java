package com.week1.main.collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author hsykrmn
 *
 * @Note Anahtarlar ve Değerler eklenme sırasına göre depolanır.
 * 
 *       kullanılan methodlar -> put, keySet, values, entrySet, get, replace,
 *       remove, isEmpty, size, containsValue, containsKey clear, putAll, putIfAbsent
 */
public class LinkedHashMapDriver {
	public static void run() {

		Map<Integer, String> languages = new LinkedHashMap<>();

		/** put -> eleman ekler */
		languages.put(1, "C");
		languages.put(6, "Php");
		languages.put(21, "C++");
		languages.put(15, "JavaScript");
		languages.put(8, "Java");
		languages.put(5, "C#");
		System.out.println(languages);

		/* get -> verilen key'in degerini bize verir */
		String language = languages.get(1);
		System.out.println(language);

		/* keySet -> key'leri verir */
		System.out.println("Keys : " + languages.keySet());

		/* values -> value'leri verir */
		System.out.println("Values : " + languages.values());

		/* entrySet -> key value ikilisinin set gorunumunu verir */
		System.out.println("Key/Value mappings: " + languages.entrySet());

		/**
		 * entrySet -> map'in her entry'si aracılıgıyla elemanlarnda sırayla
		 * gezinebilriz
		 */
		System.out.print("Entries: ");
		for (Entry<Integer, String> entry : languages.entrySet()) {
			System.out.print(entry);
			System.out.print(", ");
		}

		/* replace -> girilen key'e sahip valueyu degiştirir */
		languages.replace(6, "Node");
		System.out.println("\nreplace(): " + languages);

		/* remove -> girilen key'e sahip eleman silinir */
		languages.remove(6);
		System.out.println("remove(): " + languages);

		/** isEmpty -> map 'in boş olup olmadıgı sorgulanır */
		System.out.println(languages.isEmpty());

		/** size -> map'in boyutu sorgulanır */
		System.out.println(languages.size());

		/** containsKey -> girilen key'in map'de var olup olmadıgı sorgulanır */
		System.out.println(languages.containsKey(1));
		/** containsValue -> girilen value'nun map'de var olup olmadıgı sorgulanır */
		System.out.println(languages.containsValue("Java"));

		/* putAll -> butun elemanları map'e eklememizi saglar */
		Map<Integer, String> framework = new HashMap<>();
		framework.put(10, "Node");
		framework.put(99, "React");
		languages.putAll(framework);
		System.out.println(languages);

		/* putIfAbsent -> girilen key yoksa eklenir */
		languages.putIfAbsent(4, "Java");
		System.out.println(languages);
		
		/* clear -> butun elemanları siler */
		languages.clear();
		System.out.println(languages);
	}
}
