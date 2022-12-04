package com.week1.main.collections.list;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;



/**
 * @author hsykrmn
 * 
 *         kullanılan metodlar : add, offer, remove, poll, element, peek,
 *         iterator, contains addFirst, addLast, getFirst, getLast, removeFirst,
 *         removeLast
 */
public class LinkedListDriver {
	public static void run() {
		
		
		List<Integer> numbers = new LinkedList<>();

//      add(Elemen) -> Elemanı kuyruga ekler.
		numbers.add(1);
		numbers.add(3);
		numbers.add(12);
		numbers.add(5);
		numbers.add(9);
		numbers.add(12);
		System.out.println(numbers);

// 		get -> verilen index'deki elemana ulaşırız. 
	    Integer number = numbers.get(0); 
	    System.out.println(number);
		
//      contains -> eleman sorgusu yapmamızı saglar
		System.out.println("contains(5): " + numbers.contains(5));

// 		size -> set'in boyutu sorgulanır 
		System.out.println("size: " + numbers.size());
		
// 		set() -> girilen indexdeki elemanı degiştirir.
		numbers.set(1, 12);
		System.out.println(numbers);

// 		indexOf() -> elementin en baştan arama ile bulunan index'ini verir  
		int indexOf = numbers.indexOf(12);
		System.out.println("indexOf : "+ indexOf);
		
// 		lastIndexOf() -> elementin en sondan arama ile bulunan index'ini verir  
		int lastIndexOf = numbers.lastIndexOf(12);
		System.out.println("lastIndexOf : "+ lastIndexOf);
				
// 		isEmpty -> arraylist'in boş olup olmadıgı sorgulanır 
	    System.out.println(numbers.isEmpty());
		
//  	addAll(List) ->  bir list'in butun elemanlarını farklı bir list'e tek işlemde eklememizi saglar */
	    List<Integer> newNumbers = new LinkedList<>();
	    newNumbers.add(11);
	    newNumbers.add(21);
	    newNumbers.add(31);
	    newNumbers.add(41);
	    
	    numbers.addAll(newNumbers);
	    System.out.println(numbers);
	    
// 		sort -> elemanları sıralamamızı saglar  */
		numbers.sort(Comparator.naturalOrder()); /* buyukten kucuge dogru */
		System.out.println(numbers); 
		numbers.sort(Comparator.reverseOrder()); /* kucukten buyuge dogru*/
		System.out.println(numbers);
	    
// 		iterator -> list içinde gezinmemize olanak saglar 
	    Iterator<Integer> iterator = numbers.iterator();
	    while (iterator.hasNext()) {
	    	System.out.print(iterator.next());
	    	System.out.print(", ");
	    }
	    
//		remove -> list'de verilen indexdeki elemanı siler */
	    numbers.remove(0);
	    System.out.println(numbers);
		
// 		 clear ->  butun elemanları siler */
	    numbers.clear();
	    System.out.println("\n"+numbers);
		
	}
}
