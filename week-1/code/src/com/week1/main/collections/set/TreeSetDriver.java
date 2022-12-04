package com.week1.main.collections.set;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author hsykrmn
 * 
 * @Note: 
 *  Elemanların Sıralanması Önemliyse
 *  TreeSet ---> Verileri ağaç yapısında depoladığı için veriler her zaman sıralıdır. Ancak bir elemanın
 *  var olup olmadığını sorgulama zamanı içindeki eleman sayısıyla doğru orantılıdır. (O(logn))

 *	kullanılan methodlar -> 
 *  add, remove, contains, isEmpty, size, first, last, pollFirst, pollLast headSet, tailSet, subSet, 
 *  toArray, iterator, addAll, remove, clear, retainAll, removeAll
 */
public class TreeSetDriver {
	
	public static void run() {
		
		TreeSet<String> languages = new TreeSet<>();
		
		/** add -> eleman ekler */
		languages.add("C");
		languages.add("C++");
		languages.add("Java");
		languages.add("JavaScript");
		languages.add("Php");
		System.out.println(languages);
		
		/* contains -> istenilen elemanın sette olup olmadıgı sorgulanır*/
		System.out.println(languages.contains("JavaScript"));
		
		/** isEmpty -> set'in boş olup olmadıgı sorgulanır */
	    System.out.println(languages.isEmpty());
	    
	    /** size -> set'in boyutu sorgulanır */
	    System.out.println(languages.size());
		
	    /* headSet -> Belirlenen elemandan once olan elemanları verir verilen eleman dahil degil ,
	     * opsiyonel olarak yanına parametreyi true yazarsak verilen elemanda dahil edilir.
	     */
	    SortedSet<String> headSet = languages.headSet("Java");
	    System.out.println("headSet: "+headSet);
	    
	    /* tailSet -> Belirlenen elemandan sonra olan elemanları verir verilen eleman dahil , 
	     * opsiyonel olarak yanına parametreyi false yazarsak verilen elemanda dahil edilmez.
	     */
	    SortedSet<String> tailSet = languages.tailSet("Java");
	    System.out.println("tailSet: "+tailSet);
	    
	    /* subSet(e1, e2,) -> e1 e2 arasındaki elemanları verir [e1,e2)*/
	    SortedSet<String> subSet = languages.subSet("C", "Java");
	    System.out.println("subset: "+subSet);
	    
	    /* first -> TreeSet'in ilk elemanını verir*/
	    String first = languages.first();
	    System.out.println("İlk eleman: "+ first);
	    
	    /* last -> TreeSet'in son elemanını verir*/
	    String last = languages.last();
	    System.out.println("son eleman: "+ last);
	    
	    /* pollFirst -> ilk elemanı siler: */
        System.out.println("silinen eleman : "+languages.pollFirst());

        /* pollLast -> ilk elemanı siler: */
        System.out.println("silinen eleman : "+languages.pollLast());
	    System.out.println("kalan elemanlar : "+languages);
        
            
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
		Set<String> intersect = new TreeSet<>();
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
		
		
		/** remove -> istenilen elemanı siler */
		languages.remove("React");
		System.out.println(languages);
		
		/* clear -> butun elemanları siler*/
		languages.clear();
		System.out.println(languages);
		

	}
}
