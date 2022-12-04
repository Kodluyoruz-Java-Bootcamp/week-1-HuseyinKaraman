package com.week1.main.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 * @author hsykrmn
 *
 * @Note Anahtarlar ve Değerler "Anahtarlara Göre" Sıralı depolanır.
 * 
 *       kullanılan methodlar -> put, keySet, values, entrySet, get, replace,
 *       remove, isEmpty, size, containsValue, containsKey clear, putAll,
 *       putIfAbsent, firstKey, lastKey, firstEntry, lastEntry, pollFirstEntry , pollLastEntry
 *       headMap, tailMap, subMap
 */
public class TreeMapDriver {
	public static void run() {

		TreeMap<Integer, String> languages = new TreeMap<>();

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

		// firstKey -> ilk key degerini verir
		System.out.println("\nilk key: "+languages.firstKey());

		// firstKey -> son key degerini verir
		System.out.println("son key: "+languages.lastKey());

		// firstEntry -> ilk key/value degerini verir
		System.out.println("ilk key/value çifti : "+languages.firstEntry());

		// lastEntry -> son key/value degerini verir
		System.out.println("son key/value çifti : "+languages.lastEntry());

		/* replace -> girilen key'e sahip valueyu degiştirir */
		languages.replace(6, "Node");
		System.out.println("replace(): " + languages);

		/* remove -> girilen key'e sahip eleman silinir */
		languages.remove(6);
		System.out.println("remove(): " + languages);

		// pollFirstEntry() -> ilk key/value çifti silinir
        System.out.println("pollFirstEntry(): " + languages.pollFirstEntry());
        // pollLasttEntry() -> son key/value çifti silinir
        System.out.println("pollLastEntry(): " + languages.pollLastEntry());
        System.out.println("Son durum: " + languages);
		
		/** isEmpty -> map 'in boş olup olmadıgı sorgulanır */
		System.out.println("isEmpty ? "+languages.isEmpty());

		/** size -> map'in boyutu sorgulanır */
		System.out.println("size : "+languages.size());

		/** containsKey -> girilen key'in map'de var olup olmadıgı sorgulanır */
		System.out.println("containsKey(1) : "+languages.containsKey(1));
		/** containsValue -> girilen value'nun map'de var olup olmadıgı sorgulanır */
		System.out.println("containsValue('Java'): "+languages.containsValue("Java"));
		
		/* putAll -> butun elemanları map'e eklememizi saglar */
		Map<Integer, String> framework = new HashMap<>();
		framework.put(10, "Node");
		framework.put(99, "React");
		languages.putAll(framework);
		System.out.println(languages);

		
		// headMap() -> girilen key'den onceki degerleri verir , girilen key dahil degil
        System.out.println("headMap " + languages.headMap(15));

        // tailMap() -> girilen key'den sonraki degerleri verir , girilen key dahil
        System.out.println("tailMap " + languages.tailMap(15));

        // subMap() -> ilk key ve son key arasındaki degerleri verir son key hariç
        System.out.println("subMap " + languages.subMap(10,99));

        
		/* putIfAbsent -> girilen key yoksa eklenir */
		languages.putIfAbsent(4, "Java");
		System.out.println(languages);

		/* clear -> butun elemanları siler */
		languages.clear();
		System.out.println(languages);
	}
}
