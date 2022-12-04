package com.week1.main.collections.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayListDriver {
	
	public static void run() {
		 // create an ArrayList
	    List<String> languages = new ArrayList<>();

	    /** @Note :  add -> arraylist'e eleman ekler : */
	    languages.add("C");
	    languages.add("Java");
	    languages.add("Python");
	    languages.add("JavaScript");
	    languages.add("Php");
	    System.out.println("ArrayList: " + languages);
		
	    /** @Note :  add(index, eleman) -> istenilen index'e ekleme yapar : */
	    languages.add(0,"C#");
	    System.out.println("Numbers: " + languages);
	    
	    /** @Note : remove -> arraylist'den verilen indexdeki elemanı siler */
	    languages.remove(0);
	    System.out.println("ArrayList: " + languages);
	    
	    /** @Note :get -> verilen index^deki elemana ulaşırız. */
	    String language = languages.get(0); 
	    System.out.println(language);
	    
	    /** @Note : set -> verilen indexdeki elemanı degişmemizi saglar */
	    languages.set(0, "C++");
	    System.out.println(languages);
	    
	    /** @Note : isEmpty -> arraylist'in boş olup olmadıgı sorgulanır */
	    System.out.println(languages.isEmpty());
	    
	    /** @Note : indexOf -> girilen elemanın index'ini sorgular */
	    System.out.println(languages.indexOf("Python"));
	    
	    /** @Note : contains -> girilen elemanın arraylistde olup olmadıgı sorgulanır */
	    System.out.println(languages.contains("C++"));
	    
	    /** @Note : size -> arraylist'in boyutu sorgulanır */
	    System.out.println(languages.size());
	    
	    /** @Note : sort -> elemanları sıralamamızı saglar */
	    languages.sort(Comparator.naturalOrder()); /* a'dan z' ye dogru */
	    System.out.println(languages); 
	    /* */
	    languages.sort(Comparator.reverseOrder()); /* z'den a'ya dogru*/
	    System.out.println(languages);
	    
	    /** @Note :  addAll(Arraylist) ->  bir Arraylistin butun elemanlarını farklı bir Arraylist tek işlemde eklememizi saglar */
	    List<String> framework = new ArrayList();
	    framework.add("spring");
	    framework.add("node");
	    framework.add("django");
	    framework.add("react");
	    
	    languages.addAll(framework);
	    System.out.println(languages);
	    
	    
	    /** @Note :  clear ->  butun elemanları siler */
	    languages.clear();
	    System.out.println(languages);
	}
	
}
