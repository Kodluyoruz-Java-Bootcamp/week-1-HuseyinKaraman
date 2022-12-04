package com.week1.main.collections.list;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/** 
 * @author hsykrmn
 *
 * @Note
 * List interface'ini implemente eden yapılara göre avantajı :
 * Thread Işlemlerinde Kullanılabilecek Veri Yapısıdir
 * Vectorler --> Bazı metodları "synchronized" anahtar kelimesiyle yazılmıştır.
 */
public class VectorDriver {
	public static void run() {
		 // create an Vector
	    List<Integer> numbers = new Vector<>();

	    /** @Note :  add -> eleman ekler : */
	    numbers.add(5);
	    numbers.add(7);
	    numbers.add(1);
	    numbers.add(10);
	    numbers.add(12);
	    System.out.println("Numbers: " + numbers);
		
	    /** @Note :  add(index, eleman) -> istenilen index'e ekleme yapar : */
	    numbers.add(0,11);
	    System.out.println("Numbers: " + numbers);
	    
	    /** @Note : remove -> verilen indexdeki elemanı siler */
	    numbers.remove(0);
	    System.out.println("Numbers: " + numbers);
	    
	    /** @Note : get -> verilen index'deki elemana ulaşırız. */
	    Integer number = numbers.get(0); 
	    System.out.println(number);
	       
	    /** @Note : iterator -> elemanlara iterator yardımıyla ulaşabilirz */
	    Iterator<Integer> iterator = numbers.iterator();
        System.out.print("Vector: ");
        while(iterator.hasNext()) {
            System.out.print(iterator.next());
            System.out.print(", ");
        }
	    
	    /** @Note : set -> verilen indexdeki elemanı degişmemizi saglar */
	    numbers.set(1, 99);
	    System.out.println("\n"+numbers);
	    
	    /** @Note : isEmpty -> arraylist'in boş olup olmadıgı sorgulanır */
	    System.out.println(numbers.isEmpty());
	    
	    /** @Note : indexOf -> girilen elemanın index'ini sorgular */
	    System.out.println(numbers.indexOf(10));
	    
	    /** @Note : contains -> girilen elemanın olup olmadıgı sorgulanır */
	    System.out.println(numbers.contains(8));
	    
	    /** @Note : size -> arraylist'in boyutu sorgulanır */
	    System.out.println(numbers.size());
	    
	    /** @Note : sort -> elemanları sıralamamızı saglar  */
	    numbers.sort(Comparator.naturalOrder()); /* buyukten kucuge dogru */
	    System.out.println(numbers); 
	    numbers.sort(Comparator.reverseOrder()); /* kucukten buyuge dogru*/
	    System.out.println(numbers);
	    
	    
	    /** @Note :  addAll(Vector) ->  bir vektorun butun elemanlarını farklı bir Vecktore tek işlemde eklememizi saglar */
	    List<Integer> newNumbers = new Vector<>();
	    newNumbers.add(11);
	    newNumbers.add(21);
	    newNumbers.add(31);
	    newNumbers.add(41);
	    
	    numbers.addAll(newNumbers);
	    System.out.println(numbers);
	    
	    /** @Note :  clear ->  butun elemanları siler */
	    numbers.clear();
	    System.out.println(numbers);
	    
	}
}
