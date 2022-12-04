package com.week1.main.collections.list;

import java.util.Comparator;
import java.util.List;
import java.util.Stack;

/** 
 * @author hsykrmn
 *
 * @Note
 * Vector Classından Extend Eden Stackler
 * LIFO (Last in First Out Mantığıyla Çalışır.) 
 * Bilgisayarlarda Recursif Fonksiyonlar çalıştırılırken kullanılır.
 */
public class StackDriver {
	
	public static void run() {
		 // create an Stack
	    Stack<Integer> stack = new Stack<>();
	    
	    /** @Note : Stackîn kendi metodları :*/
	    
	    /** @Note :  push -> elemanı stack'in en üstüne elemanı ekler (en sonu) : */
	    stack.push(2);
	    stack.push(1);
	    stack.push(7);
	    System.out.println("stack: " + stack);
	    
	    /** @Note :  pop -> elemanı stack'in en üstünden elemanı siler (en sonu) : 
	     * ve geriye o elemanı dondurur */
	    Integer pop = stack.pop();
	    System.out.println("silinen eleman : "+pop);
	    System.out.println("stack: " + stack);
	    
	    /** @Note :  peek -> stack'in en üst kısmındaki elemanı bize silmeden dondurur */
	    System.out.println("en üsteki eleman : "+stack.peek());
	    System.out.println("stack: " + stack);
	    
	    /** @Note :  seacrh -> istenilen elemanı aramamızı saglar ve pozisyonunu verir */
	    int search = stack.search(2);
	    System.out.println("search result : "+ search);
	    
	    /** @Note : empty -> boş olup olmadıgı sorgulanır */
	    System.out.println(stack.empty());
	    
	    
	    /**
	     * List sınıfının implementasyonu ile gelen metodlar
	     */    
	    /** @Note :  add -> eleman ekler : */
	    stack.add(6);
	    stack.add(8);
	    stack.add(2);
	    System.out.println("stack: " + stack);
		
	    /** @Note :  add(index, eleman) -> istenilen index'e ekleme yapar : */
	    stack.add(4, 17);
	    System.out.println("stack: " + stack);
	    
	    /** @Note : remove -> verilen indexdeki elemanı siler */
	    stack.remove(0);
	    System.out.println("stack: " + stack);
	    
	    /** @Note :get -> verilen index^deki elemana ulaşırız. */
	    Integer number = stack.get(0); 
	    System.out.println(number);
	    
	    /** @Note : set -> verilen indexdeki elemanı degişmemizi saglar */
	    stack.set(0, 99);
	    System.out.println(stack);
	    
	    /** @Note : isEmpty -> boş olup olmadıgı sorgulanır */
	    System.out.println(stack.isEmpty());
	    
	    /** @Note : indexOf -> girilen elemanın index'ini sorgular */
	    System.out.println(stack.indexOf(1));
	    
	    /** @Note : contains -> girilen elemanın olup olmadıgı sorgulanır */
	    System.out.println(stack.contains(21));
	    
	    /** @Note : size -> boyut sorgulanır */
	    System.out.println(stack.size());
	    
	    /** @Note : sort -> elemanları sıralamamızı saglar  */
	    stack.sort(Comparator.naturalOrder()); /* buyukten kucuge dogru */
	    System.out.println(stack); 
	    /* */
	    stack.sort(Comparator.reverseOrder()); /* kucukten buyuge dogru*/
	    System.out.println(stack);
	    
	    /** @Note :  addAll(Stack) ->  bir Stack'in butun elemanlarını farklı bir Stack'e tek işlemde eklememizi saglar */
	    List<Integer> newNumbers = new Stack<>();
	    newNumbers.add(1);
	    newNumbers.add(2);
	    newNumbers.add(3);
	    newNumbers.add(4);
	    
	    stack.addAll(newNumbers);
	    System.out.println(stack);
	    
	    /** @Note :  clear ->  butun elemanları siler */
	    stack.clear();
	    System.out.println(stack);
	    
	}
}
