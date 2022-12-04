package com.week1.main.collections.queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author hsykrmn
 *
 * PriorityQueque Sınıfı Normal Queque mantıgı gibi davranmaz! Elamanlar öncelik siralarina göre
 * yüksek öncelik kazanıp
 * ( Intergerlarda en yüksek öncelik en küçük sayida ,en düsüş öncelik en büyük sayidadir!
 * Stringlarda  en yüksek öncelik alfabetik olarak en önce gelen stringde ,
 * en düsüş öncelik alfabetik olarak en son gelen stringdedir! )
 * kuyrukta önlere geçer(Tıpkı hasatane acil servisleri gibi....)
 *
 * kullanılan metodlar : add, offer, remove, poll, element, peek, iterator, contains
 */
public class PriorityQueueDriver {
	public static void run() {
		
		Queue<Integer> numbers = new PriorityQueue<>();
		
		
//      add(Elemen) -> Elemanı kuyruga ekler.Ekleyemezse hata fırlatır. 
		numbers.add(1);
		numbers.add(3);
		numbers.add(2);
		numbers.add(5);
		numbers.add(9);
		System.out.println(numbers);
				
//      offer(Eleman) -> Elemanı kuyruga ekler.Eklerse true,Ekleyemezse false döner.
		numbers.offer(12);
		System.out.println(numbers);		
		
//      remove() -> Kuyrugun başındaki elemanı kuyruktan çıkarır.Kuyruk boşsa hata fırlatır.
		numbers.remove();
		System.out.println(numbers);

//      poll() -> Kuyrugun başındaki elemanı kuyruktan çıkarır.Kuyruk boşsa null referans döner.
		numbers.poll();
		System.out.println(numbers);
		
//      element() -> Kuyrugun başındaki elemanı döner.Kuyruk boşsa hata fırlatır.
		Integer element = numbers.element();
		System.out.println("element() : "+ element);
		System.out.println(numbers);
		
//      peek() -> Kuyrugun başındaki elemanı döner.Kuyruk boşsa null referans döner.
		Integer peek = numbers.peek();
		System.out.println("peek() : "+ peek);
		System.out.println(numbers);
		
		
// 		iterator -> queue içinde gezinmemize olanak saglar 
        Iterator<Integer> iterator = numbers.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next());
            System.out.print(", ");
        }
		
//      contains -> eleman sorgusu yapmamızı saglar
        System.out.println("\ncontains(5): "+numbers.contains(5));
		
// 		size -> set'in boyutu sorgulanır 
        System.out.println("size: " + numbers.size());
        
// 		isEmpty -> boş olup olmadıgı sorgulanır
		System.out.println("isEmpty: " + numbers.isEmpty());

// 		clear -> butun elmanlar silinir
		numbers.clear();
		System.out.println(numbers);

        
	}
}
