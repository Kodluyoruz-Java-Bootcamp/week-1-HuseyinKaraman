package com.week1.main.collections.queue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author hsykrmn
 *
 *	ArrayDeque -> Deque ve Queue deki metodlarının implemantasyonunu sunan class'dır
 *	
 *  kullanılan metodlar : add, addFirst, addLast, offer, offerFirst, offerLast, 
 *  remove, poll, pollFirst, pollLast, element, peek, peekLast, peekFirst, iterator, contains, 
 *  addFirst, addLast, getFirst, getLast, removeFirst, removeLast
 */
public class ArrayDequeDriver {
	public static void run() {
		
		// Creating String type ArrayDeque
		ArrayDeque<String> languages = new ArrayDeque<>();
		
/** @Note: add, addLast, addFirst ekleme yapar eger deque full ise IllegalStateException hatası fırlatır*/
		/** add -> eleman ekler */
		languages.add("C");
		languages.add("Java");
		System.out.println(languages);
		// addFirst -> ilk başa ekleme yapar		
		languages.addFirst("React");
		// addLast -> en sona ekleme yapar
		languages.addLast("Angular");
		System.out.println(languages);

/** @Note: offer, offerFirst, offerLast ekleme yapar ve ekleme başarılı ise true 
 * 		   eger deque full ise false döner
*/		
		//  offer(Eleman) -> Elemanı kuyruga ekler.Eklerse true,Ekleyemezse false döner.
		languages.offer("C++");
		System.out.println(languages);
		//  offerFirst -> en başa ekleme yapar 
		languages.offerFirst("JavaScript");
		// 	offerLast -> en sona ekleme yapar 
		System.out.println(languages);
		languages.offerLast("Php");
		
		// getFirst -> ilk elemanı verir 
		String first = languages.getFirst();
		System.out.println("first :" + first);
		// getLast -> son elemanı verir 
		String last = languages.getLast();
		System.out.println("last :" + last);
		
/**  @Note eger arrayDeque boşşsa , peek(), peekFirst() ve getLast() -> NoSuchElementException hatası fırlatır */
//      peek() -> Kuyrugun başındaki elemanı döner. 
		System.out.println(languages);
		String peek = languages.peek();
		System.out.println("peek() : " + peek);

//      peekFirst() -> Kuyrugun başındaki elemanı döner. 
		String peekFirst = languages.peekFirst();
		System.out.println("peekFirst() : " + peekFirst);
		
//      peekLast() -> Kuyrugun sonundaki elemanı döner. 
		String peekLast = languages.peekLast();
		System.out.println("peekLast() : " + peekLast);
		
		/* contains -> istenilen elemanın sette olup olmadıgı sorgulanır*/
		System.out.println(languages.contains("JavaScript"));
		
		/** isEmpty -> set'in boş olup olmadıgı sorgulanır */
	    System.out.println(languages.isEmpty());
	    
	    /** size -> set'in boyutu sorgulanır */
	    System.out.println(languages.size());
            
	    /* toArray -> settin elemanlarını içeren array dondurur */
	    Object[] array = languages.toArray();
	    System.out.println(Arrays.toString(array));
	    
	    /* iterator -> iterator dondurur ve elemanlara sırayla erişmemize olanak saglar */
	    Iterator<String> iterator = languages.iterator();
	    while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.print(string+" ");
	     }System.out.println();
	     
		/* addAll -> bir setin butun elemanlarını farklı bir sete eklememizi saglar */
	    Set<String> framework = new TreeSet<>();
		framework.add("Node");
		framework.add("React");
		framework.add("Angular");
		languages.addAll(framework);
		System.out.println(languages);
		
		
		/* retainAll, removeAll, containsAll */
		ArrayDeque<String> intersect = new ArrayDeque<>();
		intersect.add("Node");
		intersect.add("Ruby");
		intersect.add("Java");
		/* RetainAll ->  işlem sonucu kesisen elemanların kalmasını saglar */
//		languages.retainAll(intersect);
//		System.out.println("Kesisim kumesi : "+languages);

		/* removeAll -> işlem sonucu fark kumesi kalmasını saglar */
//		languages.removeAll(intersect);
//		System.out.println("Fark kumesi : "+languages);
		
		/* containsAll -> verilen parametrenin alt kume olup olmadıgı sorgulanır */
		System.out.println(languages.containsAll(intersect));

/** @Note eger arrayDeque boşşsa , poll(), poll() ve poll() -> null döner */
		// poll() -> ilk elemanı siler
        String element = languages.poll();
        System.out.println("Removed Element: " + element);
		
		/* pollFirst -> ilk elemanı siler: */
		System.out.println("silinen eleman : "+languages.pollFirst());
		
		/* pollLast -> ilk elemanı siler: */
		System.out.println("silinen eleman : "+languages.pollLast());
		System.out.println("kalan elemanlar : "+languages);
		
/** @Note eger arrayDeque boşşsa , remove(), removeFirst() ve removeLast() -> hata fırlatır */
		/** remove -> istenilen elemanı siler */
		languages.remove("React");
		System.out.println(languages);
        // removeFirst -> ilk elemanı siler
        String firstElement = languages.removeFirst();
        System.out.println("Silinen ilk eleman: " + firstElement);
        // removeLast -> son elemanı siler
        String lastElement = languages.removeLast();
        System.out.println("Silinen son eleman: " + lastElement);
        System.out.println("Son durum : "+languages);
		
		/* clear -> butun elemanları siler*/
        languages.clear();
		System.out.println(languages);
		
		
	}
}
