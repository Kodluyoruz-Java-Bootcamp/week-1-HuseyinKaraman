package com.week1.main.collections.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/**
 * @author hsykrmn
 *
 *  @Note
 *  Elemanların Sırası Önemli Değilse ve Sorgulama İşlemlerinin Hızlı Olması İsteniyorsa
 *  HashSet ---> Elemanları ekleme sırasına göre depolamaz ve bir elemanın olup olmadığını sorgulama
 *  hash fonksiyonuyla yapıldığı için her zaman hızlı ve sabit zamanda çalışır.
  
	kullanılan methodlar -> 
 *  add, remove, contains, isEmpty, size, toArray, iterator, addAll, remove, clear, retainAll, removeAll
 */
public class HashSetDriver {
	
	public static void run() {
		
		Set<String> languages = new HashSet<>();
		
		/** add -> eleman ekler */
		languages.add("C");
		languages.add("C++");
		languages.add("C#");
		languages.add("Java");
		languages.add("JavaScript");
		languages.add("Php");
		System.out.println(languages);
		
		/* contains -> istenilen elemanın sette olup olmadıgı sorgulanır*/
		System.out.println(languages.contains("Java"));
		
		/** @Note : isEmpty -> set'in boş olup olmadıgı sorgulanır */
	    System.out.println(languages.isEmpty());
	    
	    /** @Note : size -> set'in boyutu sorgulanır */
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
		Set<String> framework = new HashSet<>();
		framework.add("Node");
		framework.add("React");
		framework.add("Angular");
		languages.addAll(framework);
		System.out.println(languages);
		
		/* retainAll, removeAll, containsAll */
		/* RetainAll ->  işlem sonucu kesisen elemanların kalmasını saglar */
		languages.retainAll(framework);
		System.out.println("Kesisim kumesi : "+languages);

		/* removeAll -> işlem sonucu fark kumesi kalmasını saglar */
//		languages.removeAll(framework);
//		System.out.println("Fark kumesi : "+languages);
		
		/* containsAll -> verilen parametrenin alt kume olup olmadıgı sorgulanır */
//		System.out.println(languages.containsAll(framework));
		
		
		/** remove -> istenilen elemanı siler */
		languages.remove("React");
		System.out.println(languages);
		
		/* clear -> butun elemanları siler*/
		languages.clear();
		System.out.println(languages);
		
		
	}
	
}
